package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {
    @Test
    fun calculate_20_percent_tip_no_round_up() {
        val amountConstant = 10.00
        val tipPercentConstant = 20.00
        val expectedTips = NumberFormat.getCurrencyInstance().format(2)
        val actualTips = calculateTip(amountConstant, tipPercentConstant, false)
        assertEquals(expectedTips, actualTips)
    }
}