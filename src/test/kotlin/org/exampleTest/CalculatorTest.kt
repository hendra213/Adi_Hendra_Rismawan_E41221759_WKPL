package org.exampleTest

import org.example.Calculator
import org.junit.jupiter.api.Test

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(10, 10)
    }
}