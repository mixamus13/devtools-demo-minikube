package com.example.devtoolsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DevtoolsDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DevtoolsDemoApplication.class, args);
  }

  @RestController
  static final class MyController {

    @GetMapping("/universe")
    String universe() {
      return "Hello new Universe!\n";
    }

    @GetMapping("/word")
    String world() {
      return "Hello new World!\n";
    }
  }
}
