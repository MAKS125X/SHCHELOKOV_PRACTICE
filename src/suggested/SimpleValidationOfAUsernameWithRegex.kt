package suggested

import java.util.regex.Pattern

// Simple validation of a username with regex (8 kyu)
// https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023

fun validateUsr(s: String?): Boolean {
    return Pattern.matches("[a-z\\d_]{4,16}", s)
}

fun main() {
    println(validateUsr("maks125x_"))
    println(validateUsr("__maks125x__"))
    println(validateUsr("____"))
    println(!validateUsr("_m1"))
    println(!validateUsr("_AAAA"))
    println(!validateUsr("БВГДЕ"))
    println((validateUsr("regex")))
    println((!validateUsr("a")))
    println((!validateUsr("Hass")))
    println((!validateUsr("Hasd_12assssssasasasasasaasasasasas")))
    println((!validateUsr("")))
    println((validateUsr("____")))
    println((!validateUsr("012")))
    println((validateUsr("p1pp1")))
    println((!validateUsr("asd43 34")))
    println((validateUsr("asd43_34")))
}