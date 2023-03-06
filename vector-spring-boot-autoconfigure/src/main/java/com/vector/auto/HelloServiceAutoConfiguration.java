package com.vector.auto;


import com.vector.bean.HelloProperties;
import com.vector.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 配置类
@ConditionalOnMissingBean(HelloService.class) // 当容器中没有这个Bean的情况下,自动配置HelloService
@EnableConfigurationProperties(HelloProperties.class) // 使配置文件生效,绑定配置
public class HelloServiceAutoConfiguration {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
