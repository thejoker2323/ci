package io.github.oliviercailloux.y2018.thejoker2323;



import java.io.IOException;
import org.junit.jupiter.api.Test;

import io.github.oliviercailloux.y2018.thejoker2323.HelloServlet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestHelloWorld {
	
	@Test
	void test() throws Exception, IOException  {       
        HelloServlet serv = new HelloServlet();
        assertEquals("Hello world",serv.sayHello());
	}

}
