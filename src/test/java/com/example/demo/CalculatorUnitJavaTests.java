package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorUnitJavaTests {

  private final Calculator calculator = new Calculator();
  
  @Test  
  void shouldAdd23() {
		assertEquals(5, calculator.add(2, 3));
  }

}