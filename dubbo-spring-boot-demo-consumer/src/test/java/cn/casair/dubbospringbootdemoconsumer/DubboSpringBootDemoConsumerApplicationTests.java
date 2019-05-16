package cn.casair.dubbospringbootdemoconsumer;

import cn.casair.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboSpringBootDemoConsumerApplicationTests {

//    @Reference
//    private DemoService demoService;

    @Test
    public void contextLoads() {
    }

//    @Test
//    public void dubboTest(){
//        System.out.println(demoService.welcome("springboot with dubbo and zookeeper"));
//    }

}
