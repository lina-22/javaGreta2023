package com.example.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class HelloCommandLineRunnerBis implements CommandLineRunner{
	
	private HelloService helloService;
@Override
public void run(String... arg0) throws Exception {
// TODO Auto-generated method stub
 helloService.sayHello("Runner");
}

  public HelloCommandLineRunnerBis(HelloService helloService) {
	  this.helloService = helloService;
  }
}
