package com.carlfx.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MainTest {

	
   @Before
   public void setUp() throws Exception 
   {
   }

   @Test
   public void testMultiply() 
   {
      assertEquals(25, Main.multiply(5,5));
   }
	
   @Test
   public void testHelloWorld() 
   {
      Main.main(null);
   }
}
