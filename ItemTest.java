import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testItemCreated() {
    Sale a = new Sale(.12);
    
    assertEquals(.12, a.salePercentage);
  }
  
  public void testNoDiscount() {
    Sale a = new Sale(.15);
    
    assertEquals(500.0, a.price(500));
  }
  
  public void testDiscount2() {
    Sale a = new Sale(.15);
    
    assertEquals(850.85, a.price(1001));
    assertEquals(1275.0, a.price(1500));
  }
  
  public void testNoDiscount1() {
    Sale a = new Sale(.15);
    
    assertEquals(999.0, a.price(999));
    assertEquals(1000.0, a.price(1000));
  }
  
}
