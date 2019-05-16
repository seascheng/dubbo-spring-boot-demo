package cn.casair.dubbospringbootdemoprovider.impl;

import cn.casair.DemoService;
import org.apache.dubbo.config.annotation.Service;

import java.time.LocalDateTime;

@Service
public class DemoServiceImpl implements DemoService {

    public String welcome(String name) {
        String msg = "Welcome " + name + " at " + LocalDateTime.now();
        System.out.println(msg);
        return msg;
    }
}
