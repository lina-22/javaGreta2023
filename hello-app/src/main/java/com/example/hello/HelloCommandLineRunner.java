package com.example.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HelloCommandLineRunner implements CommandLineRunner, Ordered{
public static void main(String[] args) {
SpringApplication.run(HelloCommandLineRunner.class, args);
System.out.println("Fin du main");
}
@Override
public void run(String... args) throws Exception {
// TODO Auto-generated method stub
System.out.println("Début du run");
Thread.sleep(5000); //attente de 5s
System.out.println("Fin du run");
}
@Override
public int getOrder() {
	// TODO Auto-generated method stub
	return 0;
}
}
