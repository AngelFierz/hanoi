/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.mimi.torresdehanoiasciitest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Propietario
 */
public class TorresDeHanoiASCIITESTTest {
    
    public TorresDeHanoiASCIITESTTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of resolverHanoi method, of class TorresDeHanoiASCIITEST.
     */
    @Test
    public void testResolverHanoi() {
        System.out.println("resolverHanoi");
        int n = 0;
        int origen = 0;
        int destino = 0;
        int auxiliar = 0;
        TorresDeHanoiASCIITEST instance = null;
        instance.resolverHanoi(n, origen, destino, auxiliar);
     
    }

    /**
     * Test of main method, of class TorresDeHanoiASCIITEST.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TorresDeHanoiASCIITEST.main(args);

    }
    
}
