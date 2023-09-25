package com.vdit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean {

	public Motor() {
		System.out.println("Motor-const");
	}

	public void destroy() throws Exception {

		System.out.println("destroy called");

	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("after set property called");
	}

}
