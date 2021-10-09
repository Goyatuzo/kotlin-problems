package adventOfCode.v2018.day2

class InventoryManagementSystem {
    companion object {
        fun partOne(ids: List<String>): Int {
            var pair = Pair(0, 0)

            ids.forEach { id ->
                val count = hashMapOf<Char, Int>()

                id.forEach { ch ->
                    count[ch] = count.getOrPut(ch) { 0 } + 1
                }

                if (count.containsValue(2)) {
                    pair = Pair(pair.first + 1, pair.second)
                }

                if (count.containsValue(3)) {
                    pair = Pair(pair.first, pair.second + 1)
                }
            }

            return pair.first * pair.second
        }

        fun partTwo(ids: List<String>): String {
            return ""
        }

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2018/day2.txt")?.readText(Charsets.UTF_8)

            println(partOne(text!!.lines().filter { it.isNotEmpty() }))
        }
    }
}

fun main() {
    InventoryManagementSystem.solve()
}