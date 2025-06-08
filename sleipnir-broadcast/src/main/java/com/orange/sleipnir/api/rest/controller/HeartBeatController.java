package com.orange.sleipnir.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boardcast/heartbeat")
public class HeartBeatController {

    @RequestMapping("")
    public Long heartbeat() {
        return System.currentTimeMillis();
    }

    @RequestMapping("/status")
    public String status() {
        return "OK";
    }

}
