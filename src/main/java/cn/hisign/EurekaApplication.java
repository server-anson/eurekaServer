package cn.hisign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zhouyi1 on 2017/9/28 0005.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] strs){
        new SpringApplicationBuilder(EurekaApplication.class).web(true).run(strs);
    }
}
