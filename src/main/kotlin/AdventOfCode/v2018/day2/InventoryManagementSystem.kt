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

        private fun commonCharacters(first: String, second: String) = (first.indices).fold("") { acc, curr ->
            acc + if (first[curr] == second[curr]) first[curr] else ""
        }

        fun partTwo(ids: List<String>): String {
            (0 until ids.count()).forEach { firstIdx ->
                (firstIdx+1 until ids.count()).forEach { secondIdx ->
                    val common = commonCharacters(ids[firstIdx], ids[secondIdx])
                    if (common.length == ids[firstIdx].length - 1) {
                        return common
                    }
                }
            }

            return String()
        }

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2018/day2.txt")?.readText(Charsets.UTF_8)

            println(partOne(text!!.lines().filter { it.isNotEmpty() }))
            println(partTwo(text.lines().filter { it.isNotEmpty() }))
        }
    }
}

fun main() {
    InventoryManagementSystem.solve()
}