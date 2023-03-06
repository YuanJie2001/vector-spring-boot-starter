package com.vector.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 供配置文件配置属性
 */
@ConfigurationProperties(prefix = "com.vector")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
