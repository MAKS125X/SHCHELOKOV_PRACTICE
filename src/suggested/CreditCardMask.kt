package suggested

// Credit Card Mask (7 kyu)
// https://www.codewars.com/kata/5412509bd436bd33920011bc

//Решение на python:
//def maskify(cc):
//  if len(cc) - 4 < 0:
//      return cc
//  else:
//      return '#' * (len(cc) - 4) + cc[len(cc) - 4:]

fun maskify(text: String): String {
    return if (text.length <= 4) text
    else "#".repeat(text.length - 4) + text.takeLast(4)
}

fun main() {
    println(maskify(""))
    println(maskify("1"))
    println(maskify("12"))
    println(maskify("123"))
    println(maskify("1234"))
    println(maskify("12345"))
    println(maskify("4556364607935616"))
}