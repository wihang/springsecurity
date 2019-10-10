package com.xiaoyingjie.security;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by EalenXie on 2018/7/11 15:13
 */
public class TestEncoder {

    @Test
    public void encoder() {
        String password = "root";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
        String enPassword = encoder.encode(password);
        System.out.println(enPassword);
    }
}