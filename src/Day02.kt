fun main() {
    fun part1(input: List<String>): Int {
        var horizontalPos = 0
        var depth = 0
        for (line in input) {
            var lineArray =  line.split(" ")
            if (lineArray[0] == "forward") horizontalPos += lineArray[1].toInt()
            else if (lineArray[0] == "up") depth -= lineArray[1].toInt()
            else if (lineArray[0] == "down") depth += lineArray[1].toInt()
        }
        return (depth * horizontalPos)
    }

    fun part2(input: List<String>): Int {
        var horizontalPos = 0
        var depth = 0
        var aim = 0
        for (line in input) {
            var lineArray =  line.split(" ")
            if (lineArray[0] == "forward") {
                horizontalPos += lineArray[1].toInt()
                depth += (aim * lineArray[1].toInt())
            }
            else if (lineArray[0] == "up") aim -= lineArray[1].toInt()
            else if (lineArray[0] == "down") aim += lineArray[1].toInt()
        }
        return (depth * horizontalPos)
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
