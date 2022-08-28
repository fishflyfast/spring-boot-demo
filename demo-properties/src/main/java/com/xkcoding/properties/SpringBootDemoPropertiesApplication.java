/**
 * 读取配置文件。
 * 
 * 2022.8.28测试
 * 有问题，读取到的DeveloperProperty中的属性为空，且用URL访问后，返回值为：
 * {"applicationProperty":{},"developerProperty":{}}
 */
package com.xkcoding.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:48
 */
@SpringBootApplication
public class SpringBootDemoPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoPropertiesApplication.class, args);
    }
}
