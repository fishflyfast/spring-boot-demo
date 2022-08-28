package com.xkcoding.helloworld.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.hutool.core.util.StrUtil;

@RestController
public class HelloWorldController {

	/**
     * Hello，World
     *
     * @param who 参数，非必须
     * @return Hello, ${who}
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}!", who);
    }
    /**
     *  返回map
     * @return
     */
    @GetMapping("/hello1")
    public Map<String, String> helloMap() {
    	Map<String, String> result = new HashMap();
    	result.put("result", "this is a map");
    	return result;
    }
}
