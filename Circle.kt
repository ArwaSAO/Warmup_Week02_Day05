package com.kotlin.wormuoweek2day5

class Circle(var radios: Double ) : Shape(){

    override fun calculateArea(): Double {
     var circleArea= 3.14 * radios * radios
        return circleArea

    }

    override fun calculateCirumference(): Double {
    var Cirumference= 2 *3.14* radios
        return  Cirumference

    }


}