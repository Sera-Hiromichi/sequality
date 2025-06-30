package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage_TwoAndThree_ReturnsTwoPointFive() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    double delta = 1e-10; // double型でassertEqualsする場合、誤差の指定が必要
    assertEquals(expected, calculate.average(calculate.sum(2, 3), 2), delta);
  }

  @Test
  public void testSumBetween_FromOneToTen_ReturnsFiftyFive() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumBetween(1, 10));
  }

  @Test
  public void testAverage_FromOneToTen_ReturnsFivePointFive() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    double delta = 1e-10;
    assertEquals(expected, calculate.average(calculate.sumBetween(1, 10), 10), delta);
  }

  @Test
  public void testSumOnlyOdd_FromOneToTen_ReturnsTwentyFive() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumBetweenOnlyOdd(1, 10));
  }

  @Test
  public void testSumOnlyEven_FromOneToTen_ReturnsThirty() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumBetweenOnlyEven(1, 10));
  }
}
