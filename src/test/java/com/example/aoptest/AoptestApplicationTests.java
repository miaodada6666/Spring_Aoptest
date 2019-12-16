package com.example.aoptest;

import com.example.aoptest.impl.Performance;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = PerformanceConfig.class)
@SpringBootTest(classes = AoptestApplication.class)
public class AoptestApplicationTests {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public  void setOut(){
        System.setOut(new PrintStream(outContent));//输出重定向，输出的东西要写入outContent了
    }
    @Autowired
    Performance performance;

    @Test
    public void contextLoads() {
        
       performance.perform(100);

        assertEquals("101\r\n" +
                "前置通知：Sillencing cell phones\r\n" +
                "99\r\n" +
                "前置通知：Taking Seats\r\n" +
                "连接点函数：被通知监控的函数\r\n" +
                "100\r\n" +
                "99\r\n" +
                "后置通知：clap cl clap\r\n", outContent.toString());
    }

    @Test
    public void contextLoads2() {
        performance.perform(100);
        assertEquals("101\r\n" +
                "前置通知：Sillencing cell phones\r\n" +
                "99\r\n" +
                "前置通知：Taking Seats\r\n" +
                "连接点函数：被通知监控的函数\r\n" +
                "100\r\n" +
                "99\r\n" +
                "后置通知：clap clap clap\r\n", outContent.toString());

    }

}
