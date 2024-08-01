package random

// Reversed Words (8 kyu)
// https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/kotlin

fun reverseWords(str: String): String =
    str.split(' ')
        .reversed()
        .joinToString(" ")