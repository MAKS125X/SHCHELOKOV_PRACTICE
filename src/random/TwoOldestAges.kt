package random

// Two Oldest Ages (7 kyu)
// https://www.codewars.com/kata/511f11d355fe575d2c000001

fun twoOldestAges(ages: List<Int>): List<Int> {
    var age1 = Int.MIN_VALUE
    var age2 = Int.MIN_VALUE

    ages.forEach {
        if (age2 <= it) {
            age1 = age2
            age2 = it
        } else if (age1 < it) {
            age1 = it
        }
    }

    return listOf(age1, age2)
}

fun main() {
    println(twoOldestAges(listOf(1, 5, 87, 45, 8, 8)))
    println(twoOldestAges(listOf(6, 5, 83, 5, 3, 83)))
}