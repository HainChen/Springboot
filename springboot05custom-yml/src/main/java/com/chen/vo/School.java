package com.chen.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName School
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 20:50
 * @Version 1.0
 **/
@Component  //创建此类的对象，加入到ioc容器中
@ConfigurationProperties(prefix = "school")
public class School {
    private String name;
    private String address;
    private String website;

    public School() {
    }

    public School(String name, String address, String website) {
        this.name = name;
        this.address = address;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
