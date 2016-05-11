package cz.gopas.service;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class HelloServiceTest {

    private HelloService helloService;

    @Before
    public void setUp() throws Exception {
        helloService = new HelloService();
    }

    @Test
    public void testGetFileSucces() throws Exception {
        assertNotNull(helloService.getFile("pom.xml"));
    }

    @Test(expected = IOException.class)
    public void testGetFileUnknownFile() throws Exception {
        assertNotNull(helloService.getFile("*****.xml"));
    }
}