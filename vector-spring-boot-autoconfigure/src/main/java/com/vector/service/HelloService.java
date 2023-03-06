package com.vector.service;

import com.vector.bean.HelloProperties;

import javax.annotation.Resource;

/**
 * @author yuanjie
 * @date 2020/12/29
 * @time 10:39
 * @description 默认不要放在容器中.通过自动装配
 */
public class HelloService {

    @Resource
    private HelloProperties helloProperties;

    public String sayHello(String username) {
        return helloProperties.getPrefix() + ": " + username + " " + helloProperties.getSuffix();
    }
}
