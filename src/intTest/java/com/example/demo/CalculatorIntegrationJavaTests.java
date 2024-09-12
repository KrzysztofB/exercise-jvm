package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.demo.Calculator;


class CalculatorIntegrationJavaTests {

  private final Calculator calculator = new Calculator();

  @Test  
  void shouldAdd12() {
		assertEquals(3, calculator.add(1, 2));
  }

}