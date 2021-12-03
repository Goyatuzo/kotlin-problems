package adventOfCode.v2021.day2

enum class Direction {
    FORWARD,
    UP,
    DOWN
}

class Dive {
    companion object {
        fun solveOne(movements: List<Pair<Direction, Int>>): Int {
            var x = 0
            var y = 0

            for ((direction, distance) in movements) {
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