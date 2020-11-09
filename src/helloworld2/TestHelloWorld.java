// Package
package helloworld2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld extends junit.framework.TestCase 
{
   private helloworld2.HelloWorld2 h;

   @Before
   public void setUp() throws Exception
   {
      h = new helloworld2.HelloWorld2();
   }

   @Test
   public void testHelloEmpty()
   {
      assertEquals(h.getName(),"");
      assertEquals(h.getMessage(),"Hello!");
   }

   @Test
   public void testHelloWorld()
   {
      h.setName("World");
      assertEquals(h.getName(),"World");
      assertEquals(h.getMessage(),"Hello World!");
   }
}