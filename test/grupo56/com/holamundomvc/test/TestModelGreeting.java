/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.test;

import grupo56.com.holamundomvc.model.StringModel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author matteo
 */
public class TestModelGreeting {

    private StringModel model;

    public TestModelGreeting() {

    }

    @Before
    public void setUp() {
        model = new StringModel();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGreeting() {
        String greeting = "Hello World";
        Assert.assertEquals("Greeting different from expected", greeting, model.getGreeting());
    }
}
