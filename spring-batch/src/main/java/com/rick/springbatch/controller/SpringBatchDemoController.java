package com.rick.springbatch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author fengrui
 * @date 2024/3/26
 */
@Slf4j
@RestController
@RequestMapping("/batch")
public class SpringBatchDemoController {

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();

        log.info("hello spring batch");
        return "hello spring batch";
    }
}
