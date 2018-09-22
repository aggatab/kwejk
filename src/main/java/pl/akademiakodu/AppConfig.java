package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan // przeskanowanie wszystkich komponentów, które mu damy
@EnableAutoConfiguration
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
        //argumenty trafiają do metody Main i trafiają do args
        //można zastąpić konfiguracje xml adnotacją
    }
}