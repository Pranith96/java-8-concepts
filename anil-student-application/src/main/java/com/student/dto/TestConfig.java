package com.student.dto;

import javax.annotation.PostConstruct;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	
	@Bean
	public WebServerFactoryCustomizer<TomcatServletWebServerFactory> servletContainerCustomizer() {
//	    TomcatServletWebServerFactory TomcatServletWebServerFactory = new TomcatServletWebServerFactory();
//	    TomcatServletWebServerFactory.addConnectorCustomizers();
//	    Connector connector1 = new Connector();
//	    AbstractHttp11Protocol<?> abstractProtocol1 = (AbstractHttp11Protocol<?>) connector1.getProtocolHandler();
//        abstractProtocol1.setRelaxedQueryChars("");
	    return factory -> factory.addConnectorCustomizers(connector -> {
	        AbstractHttp11Protocol<?> abstractProtocol = (AbstractHttp11Protocol<?>) connector.getProtocolHandler();
	        abstractProtocol.setRelaxedQueryChars("");
	    });
	    
	    
	}
	
	@Autowired
	Testing test;
	
	@PostConstruct
	public void init() {
		test.setData("Test");
	}
}
