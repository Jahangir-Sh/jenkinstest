package com.mycompany.jenkins.test;



import junit.framework.TestCase;
import org.junit.Test;

public class Test1 extends TestCase {

    @Test
    public void test1() {
        fail("I'm failed");
    }

    @Test
    public void test2() {
        assertTrue(true);
    }
    
}
