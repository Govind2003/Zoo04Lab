/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04lab;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Pandiri Govinda Reddy
 */
public class YukonMooseGroupTest {
    public YukonMooseGroupTest() {
    }
    /**
     * Test of create method, of class YukonMooseGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = YukonMooseGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class YukonMooseGroup.
     */
    @Test
    public void testGroupRun() {
        YukonMooseGroup.create();
        YukonMooseGroup.run();
        assertTrue(true);
    }


    
}
