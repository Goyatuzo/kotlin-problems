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

        fun partTwo(movements: List<Pair<Direction, Int>>): Int {
            var x = 0
            var aim = 0
            var horizontal = 0

            movements.forEach { (direction, distance) ->
                when (direction) {
                    Direction.FORWARD -> {
                        horizontal += distance
                        x += distance * aim
                    }

                    Direction.UP -> aim -= distance
                    Direction.DOWN -> aim += distance
                }
            }

            return x * horizontal
        }

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2021/day2.txt")?.readText(Charsets.UTF_8)

            val movements = text!!.lines().filter { it.isNotEmpty() }.map {
                val comps = it.split(' ')
                Pair(Direction.valueOf(comps[0].uppercase()), comps[1].toInt())
            }

            println(partOne(movements))
            println(partTwo(movements))
        }
    }
}

fun main() {
    Dive.solve()
}