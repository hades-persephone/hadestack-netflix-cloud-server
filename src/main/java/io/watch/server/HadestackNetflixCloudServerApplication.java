package io.watch.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HadestackNetflixCloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HadestackNetflixCloudServerApplication.class, args);
    }

}
