import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {

    
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 97, 7919};

        for (int i : primeNumbers) {
          assertEquals("Test prime number " + i, true, PrimeCheck.isPrime(i));
        }
    // assertEquals("this will fail", true, false);
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] nonPrimeNumbers = {-5, 0, 1, 4, 6, 8, 9, 10, 12, 15, 20, 100};

    for(int i : nonPrimeNumbers){
      assertEquals("Test non prime number " + i, false, PrimeCheck.isPrime(i));
    }
  }
}
