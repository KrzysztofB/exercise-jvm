package com.example.demo

import spock.lang.Specification
import spock.lang.Subject

class CalculatorIntegrationGroovyTest extends Specification {

    @Subject
    private final Calculator calculator = new Calculator()

    def "should Add 9 + 10" () {
        expect:
        calculator.add(9, 10) == 19
    }

}
