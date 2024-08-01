package random

import kotlin.system.measureNanoTime

// Multiples of 3 or 5 (6 kyu)
// https://www.codewars.com/kata/514b92a657cdc65150000006

fun solution1(number: Int): Int {
    if (number < 3)
        return 0

    var sum = 0
    for (i in 3 until number) {
        if (i == 50000){
            sum
        }
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }

    return sum
}

fun solution2(number: Int): Int {
    if (number < 3)
        return 0

    return (3 until number)
        .filter { it % 3 == 0 || it % 5 == 0 }
        .sum()
}

fun solution3(number: Int): Int {
    if (number < 3)
        return 0

    val countMultiplesOf3 = (number - 1) / 3
    val countMultiplesOf5 = (number - 1) / 5
    val countMultiplesOf15 = (number - 1) / 15

//    Сумма всех чисел в арифметической прогрессии, где a1 = 3, an = количество элементов * 3
//    (3 + countMultiplesOf3 * 3) / 2 * countMultiplesOf3
//    или же если упростить
//    3 * (1 + countMultiplesOf3) / 2 * countMultiplesOf3

    return ((3 * countMultiplesOf3 * (1 + countMultiplesOf3)) +
            (5 * countMultiplesOf5 * (1 + countMultiplesOf5)) -
            (15 * countMultiplesOf15 * (1 + countMultiplesOf15))) / 2
}

fun main() {
    // У всех решений на больших числах начинаются проблемы из-за размера Int
    val value = 60000

    val delay1 = measureNanoTime {
        solution1(value)
    }
    val delay2 = measureNanoTime {
        solution1(value)
    }
    val delay3 = measureNanoTime {
        solution1(value)
    }

    println("1: $delay1")
    println("2: $delay2")
    println("3: $delay3")

    println(solution1(value))
    println(solution2(value))
    println(solution3(value))
}