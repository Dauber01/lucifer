package com.example.lucifer.business.sync.web;

import com.example.lucifer.dto.User;
import com.example.lucifer.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * the test
 *
 * @author Lucifer
 * @date 2019/01/24 17:07
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    private final UserMapper userMapper;

    public TestController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * the test of sync interface controller
     *
     * @return result to web
     */
    @GetMapping
    public String test(){
        log.info("the process ...");
        User user = userMapper.query("1360060313@qq.com");
        log.info(user.toString());
        return "SUCCESS";
    }

}
