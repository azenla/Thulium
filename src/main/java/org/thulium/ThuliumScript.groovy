package org.thulium

abstract class ThuliumScript extends Script {

    def Power(def input, def times)
    {
        Math.pow(input, times)
    }

    def Factorial(def input)
    {
        input == 0 ? 1 : input * Factorial(input - 1)
    }

    def StrLen(String input)
    {
        input.length()
    }
}
