package suggested

// Equal Sides Of An Array (6 kyu)
// https://www.codewars.com/kata/5679aa472b8f57fb8c000047

fun findEvenIndex(arr: IntArray): Int {
    var i = 0
    var leftSum = 0
    var rightSum = arr.sum() - arr[0]
    while (i < arr.size - 1 && rightSum != leftSum) {
        i++
        rightSum -= arr[i]
        leftSum += arr[i - 1]
    }

    return if (rightSum == leftSum) i else -1
}

fun main() {
    println(findEvenIndex(intArrayOf(1, 2, 3, 4, 5, 6)))
    println(findEvenIndex(intArrayOf(20, 10, -80, 10, 10, 15, 35)))
    println(findEvenIndex(intArrayOf(20, 10, -80, 10, 10, 15, 35).reversedArray()))
    println(findEvenIndex(intArrayOf(1, 2)))
    println(findEvenIndex(intArrayOf(-2, 0)))
    println(findEvenIndex(intArrayOf(0, 6)))
    println(findEvenIndex(intArrayOf(1, 2, 3, 4, 5, 6)))
    println(findEvenIndex(intArrayOf(0, 2, -10, 10)))
}