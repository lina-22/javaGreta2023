package com.example.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;

@SpringBootApplication
public class HelloAppApplication implements CommandLineRunner, Ordered{
public static void main(String[] args) {
SpringApplication.run(HelloAppApplication.class, args);
System.out.println("Fin du main");
}
@Override
public void run(String... args) throws Exception {
// TODO Auto-generated method stub
System.out.println("Début du run");
Thread.sleep(5000); //attente de 5s
System.out.println("Fin du run");
}
@Bean
public HelloService genereHelloService() {
	return new ConsoleHelloService("Ca marche", ",à demain");
}

@Override
public int getOrder() {
	// TODO Auto-generated method stub
	return 0;
}
}
