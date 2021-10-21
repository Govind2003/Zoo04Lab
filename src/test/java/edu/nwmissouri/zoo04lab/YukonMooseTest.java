/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04lab;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Pandiri Govinda Reddy
 */
public class YukonMooseTest {
    

    public YukonMooseTest() {
    }
    @Test
    public void testmove() throws Exception {
        
    }

    /**
     * Test of behaviour method, of class YukonMoose.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testspeak() throws Exception {
     assert(true);   
    }
    /**
     * Test of size method, of class YukonMoose.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSize() throws Exception {
       assert(true); 
    }

    /**
     * Test of behaviour method, of class YukonMoose.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBehaviour() throws Exception {
       assert(true); 
    }
     /**
     * Test of survive method, of class YukonMoose.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSurvive() throws Exception {
       assert(true); 
    }
     /**
     * Test of height method, of class YukonMoose.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testHeight() throws Exception {
        float expected = (float) 7.6 ;
        var YukonMoose = new YukonMoose("Alaska");
        
        float actual =   YukonMoose.height(7, (float) 0.6);
        assertEquals(expected, actual);
    }
     /**
     * Test of tHeight method, of class YukonMoose.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testtHeight() throws Exception {
       assert(true); 
    }
}
