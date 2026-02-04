fun main() {
    fibonacciSeries(10)
}

@Suppress("SameParameterValue")
private fun fibonacciSeries(num: Int) {
    var first = 0
    var second = 1
    print("$first, $second")
    for (i in 0 until num) {
        val sum = first + second
        first = second
        second = sum
        print(", $sum")
    }
}