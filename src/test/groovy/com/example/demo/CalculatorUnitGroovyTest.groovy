package com.example.demo

import spock.lang.Specification
import spock.lang.Subject

class CalculatorUnitGroovyTest extends Specification {

    @Subject
    private final Calculator calculator = new Calculator()

    def "should Add 4 + 5" () {
        expect:
        calculator.add(4, 5) == 9
    }

}
