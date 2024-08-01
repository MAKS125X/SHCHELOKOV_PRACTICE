package suggested

import kotlin.collections.ArrayDeque

// Backspaces in string (6 kyu)
// https://www.codewars.com/kata/5727bb0fe81185ae62000ae3

//Решение на python:
//def clean_string(s):
//  stack = []
//  for c in s:
//      if c == '#':
//          if len(stack) > 0:
//              stack.pop()
//      else:
//          stack.append(c)
//  return ''.join(stack)

fun cleanString(s: String): String {
    val stack = ArrayDeque<Char>()
    for (c in s) {
        if (c == '#') {
            stack.removeLastOrNull()
        } else {
            stack.addLast(c)
        }
    }

    return stack.joinToString("")
}

fun main() {
    println(cleanString("abc#d##c"))
    println(cleanString("abc##d######"))
    println(cleanString("#######"))
    println(cleanString(""))
    println(cleanString("831####jns###s#cas/*####-5##s##6+yqw87e##hfklsd-=-28##fds##"))
}