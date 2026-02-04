fun main() {
    println("factorial: ${factorial(5)}")
    println("factorial through recursion: ${factorialWithRecursion(5)}")
}

fun factorial(num: Int): Int {
    var newNum = num
    var result = num
    while (newNum > 1) {
        result *= (newNum - 1)
        newNum -= 1
    }
    return result
}

fun factorialWithRecursion(num: Int): Int {
    return if (num == 0 || num == 1) {
        1
    } else {
        num * factorial(num - 1)
    }
}