package cn.itcast.order.service;

import cn.itcast.order.clients.UserClient;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import cn.itcast.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserClient userClient;

    // @Autowired
    // private RestTemplate restTemplate;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2.获取用户信息url
        // String url = "http://userservice/user/" + order.getUserId();
        // 3.设置用户
        // order.setUser(restTemplate.getForObject(url, User.class));
        // 通过feign远程调用
        order.setUser(userClient.findById(order.getUserId()));
        // 4.返回
        return order;
    }
}
