package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DockerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DockerApplication.class).run(args);
    }
}
