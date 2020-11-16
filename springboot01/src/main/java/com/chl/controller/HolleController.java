package com.chl.controller;

import com.chl.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title HolleController
 * @Author: u
 * @Date: 2020/11/16
 */
@RestController
public class HolleController {

    @RequestMapping("/hello")
    public User hello(){
        User user = new User();
        user.setId("1");
        user.setName("zhangsang");

        return user;
    }
}
