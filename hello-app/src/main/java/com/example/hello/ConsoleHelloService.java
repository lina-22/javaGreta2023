package com.example.hello;

public class ConsoleHelloService implements HelloService {
private String prefix ;
private String suffix ;
public ConsoleHelloService(String prefix, String suffix) {
super();
this.prefix = (prefix!=null? prefix : "Bonjour");
this.suffix = (suffix!=null? suffix : "!");
}
public ConsoleHelloService() {
prefix = "Bonjour";
suffix = "!";
}
@Override
public void sayHello(String name) {
String msg = String.format("%s %s%s", prefix, name, suffix);
System.out.println(msg);
}
}
