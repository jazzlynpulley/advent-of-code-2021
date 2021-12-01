fun main() {
    fun part1(input: List<String>): Int {
        var increaseCount = 0
        var previousNumber = 0
        for ((index, value) in input.withIndex()) {
            if (index == 0) {
                previousNumber = value.toInt()
            } else {
                if (previousNumber < value.toInt()) {
                    increaseCount ++
                }
                previousNumber = value.toInt()
            }
        }
        return increaseCount
    }

    fun part2(input: List<String>): Int {
        var increaseCount = 0
        var current = 0
        var next = 0
        for ((index, value) in input.withIndex()) {
            current = input[index].toInt() + input[index + 1].toInt() + input[index + 2].toInt()
            next = input[index + 1].toInt() + input[index + 2].toInt() + input[index + 3].toInt()
            println("current: " + current)
            println("next: " + next)
            if (current < next) {
                increaseCount ++
                println(increaseCount)
            }
        }
        return increaseCount
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
