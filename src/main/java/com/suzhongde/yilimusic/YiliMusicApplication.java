package com.suzhongde.yilimusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class YiliMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiliMusicApplication.class, args);
    }

}
