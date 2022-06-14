
fun fibonacci(n: Int): Sequence<Int> {
    return generateSequence(arrayOf(0, 1))
    { t -> arrayOf(t[1], t[0] + t[1]) }
        .take(n)
        .map { it[0] }
}

fun main() {
    println(fibonacci(13).toList())
}