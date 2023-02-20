package com.student;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.student.dto.TestConfig;
import com.student.dto.Testing;

@ExtendWith(SpringExtension.class)
public class TestCalss {

	@InjectMocks
	TestConfig config;
	
	@Mock
	Testing test;
	
	@Mock
	Connector connector1;
	
	@Mock 
	AbstractHttp11Protocol abstractHttp11Protocol;
	
	@Test
	public void testServletContainerCustomizer() {
		TomcatServletWebServerFactory tomcatServletWebServerFactory = mock(TomcatServletWebServerFactory.class);
	    AbstractHttp11Protocol<?> abstractProtocol1 = (AbstractHttp11Protocol<?>) connector1.getProtocolHandler();
	   // abstractProtocol1.setRelaxedQueryChars("");
		Mockito.when(connector1.getProtocolHandler()).thenReturn(abstractProtocol1);
		Mockito.when(null)
		WebServerFactoryCustomizer<TomcatServletWebServerFactory> bean = config.servletContainerCustomizer();
		assertNotNull(bean);
	}
	
	@Test
	public void testInit() {
		doNothing().when(test).setData("");
		config.init();
	}
}
