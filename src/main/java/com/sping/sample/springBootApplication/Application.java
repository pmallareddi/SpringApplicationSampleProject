package com.sping.sample.springBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        BinarySearchImpl bsm = applicationContext.getBean(BinarySearchImpl.class);
        int result = bsm.binarySearch(new int[]{12, 4, 7, 8, 3, 2, 9}, 3);
        System.out.println(result);
    }

}
