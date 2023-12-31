package com.vdit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine-const");
	}
	@PostConstruct 
	public void init() {
		System.out.println("start-engine");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("stop-engine");
	}
}
