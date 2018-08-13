package com.currnecyconversion.microservice.springbootcurrencyconversionmicroservice;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@org.springframework.cloud.openfeign.EnableFeignClients("com.currnecyconversion.microservice.springbootcurrencyconversionmicroservice")
public class SpringbootCurrencyconversionMicroserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootCurrencyconversionMicroserviceApplication.class, args);
  }
}
