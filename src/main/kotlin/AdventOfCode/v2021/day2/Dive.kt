package adventOfCode.v2021.day2

import java.util.*


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

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2021/day2.txt")?.readText(Charsets.UTF_8)

            val movements = text!!.lines().filter { it.isNotEmpty() }.map {
                val comps = it.split(' ')
                Pair(Direction.valueOf(comps[0].uppercase()), comps[1].toInt())
            }

            println(partOne(movements))
        }
    }
}

fun main() {
    Dive.solve()
}