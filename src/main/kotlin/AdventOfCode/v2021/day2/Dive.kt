package adventOfCode.v2021.day2

enum class Direction {
    FORWARD,
    UP,
    DOWN
}

class Dive {
    companion object {
        fun partOne(movements: List<Pair<Direction, Int>>): Int {
            var x = 0
            var y = 0

            movements.forEach { (direction, distance) ->
                when (direction) {
                    Direction.FORWARD -> x += distance
                    Direction.UP -> y -= distance
                    Direction.DOWN -> y += distance
                }
            }

            return x * y
        }
    }
}