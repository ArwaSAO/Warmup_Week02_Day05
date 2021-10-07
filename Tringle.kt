package com.kotlin.wormuoweek2day5

class Triangle (var height: Double, var base:Double): Shape() {

    override fun calculateArea(): Double {
     var triangleArea = 0.5 * base * height
     return triangleArea
    }

    override fun calculateCirumference(): Double {
    var Cirumference = 0.5 * base * height
    return Cirumference
    }
}