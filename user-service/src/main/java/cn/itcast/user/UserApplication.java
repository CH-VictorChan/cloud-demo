package cn.itcast.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("cn.itcast.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        System.out.println("hello world!");
        System.out.println(3.0);
        System.out.println("hot-fix");
        System.out.println("master-test");
        System.out.println("hot-fix2");
        System.out.println("master test 3");
        System.out.println("hot fix 3");
        System.out.println("hot fix 4");
        System.out.println("hot fix 5");
    }
}
