package com.xzha0006.demo;

import com.xzha0006.demo.entity.User;
import com.xzha0006.demo.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * @author James Z
 * @date 23/1/19
 */
@SpringBootApplication
public class ProviderUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }

    @Bean
    ApplicationRunner init(UserRepository repository) {
        return args -> {
            User user1 = new User(1L, "account1", "John", 21, new BigDecimal(100));
            User user2 = new User(2L, "account2", "Sam", 22, new BigDecimal(200));
            User user3 = new User(3L, "account3", "Zoe", 23, new BigDecimal(300));
            Stream.of(user1, user2, user3)
                    .forEach(repository::save);
        };
    }
}
