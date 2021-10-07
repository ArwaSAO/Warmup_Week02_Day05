package com.kotlin.wormuoweek2day5

class Rectangle(var height: Double, var width : Double): Shape() {

    override fun calculateArea(): Double {
    var rectangleArea= height * width
    return rectangleArea
    }


    override fun calculateCirumference(): Double {
    var Cirumference = 2 * height + 2 * width
    return Cirumference

    }
}