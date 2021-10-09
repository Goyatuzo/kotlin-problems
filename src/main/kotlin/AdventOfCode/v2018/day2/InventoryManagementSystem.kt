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
    }
}