package com.p1;

import java.util.concurrent.atomic.AtomicLong;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
private AtomicLong counter = new AtomicLong();

@GetMapping("/hello")
public HelloObject getHelloWorldObject(){
HelloObject hello = new HelloObject();
hello.setMessage("Hi there!you are number"+counter.incrementAndGet());
System.out.println(hello.getMessage());
return hello;
}



}
