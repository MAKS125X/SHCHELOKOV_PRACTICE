package random

// Complementary DNA (7 kyu)
// https://www.codewars.com/kata/554e4a2f232cdd87d9000038

fun makeComplement1(dna: String): String {
    val builder = StringBuilder()
    for (nucleobase in dna) {
        builder.append(
            when (nucleobase) {
                'A' -> 'T'
                'T' -> 'A'
                'C' -> 'G'
                'G' -> 'C'
                else -> throw IllegalArgumentException("$nucleobase is not a nucleobase")
            }
        )
    }

    return builder.toString()
}

fun makeComplement2(dna: String): String = dna.map { nucleobase ->
    when (nucleobase) {
        'A' -> 'T'
        'T' -> 'A'
        'C' -> 'G'
        'G' -> 'C'
        else -> throw IllegalArgumentException("$nucleobase is not a nucleobase")
    }
}.joinToString("")


fun main() {
    println(makeComplement1("ATGTCCTAGCTGCTCG"))
    println(makeComplement2("ATGTCCTAGCTGCTCG"))
}