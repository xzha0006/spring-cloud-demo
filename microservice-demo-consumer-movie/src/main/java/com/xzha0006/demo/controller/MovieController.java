package com.xzha0006.demo.controller;

import com.xzha0006.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author James Z
 * @date 28/1/19
 */
@RequestMapping("/movies")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User getById(@PathVariable Long id) {
        User user = this.restTemplate.getForObject("http://localhost:8000/users/{id}", User.class, id);
        return user;
    }

}
