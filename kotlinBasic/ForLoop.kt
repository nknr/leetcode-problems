package kotlinBasic

fun main() {
    10.downTo(1).forEach { i ->
        print("$i, ")
    }

    0.until(10 -1).step(2).forEach {

    }

    println()
    for (i in 0 until 10 - 1 step 2) {
        print("$i, ")
    }
    println()
    repeat(
        times = 10,
        action = {
            println("hello")
        }
    )
}