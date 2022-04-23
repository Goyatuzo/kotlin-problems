package codeForces.v158

class CdAndPwd {
    companion object {
        private fun resolve(base: String, args: String): String {
            val baseStack = base.split("/").filter { it.isNotEmpty() }
            return args.split("/")
                .filter { it.isNotEmpty() }
                .fold(baseStack) { acc, curr ->
                    if (curr == "..") {
                        acc.dropLast(1)
                    } else {
                        acc + listOf(curr)
                    }
                }
                .joinToString("/", "/", "/")
        }

        fun solve(command: String, cwd: String, args: String): String =
            when (command) {
                "pwd" -> if (cwd == "//") "/" else cwd
                "cd" -> {
                    if (args.startsWith("/")) {
                        resolve("/", args)
                    } else {
                        resolve(cwd, args)
                    }
                }
                else -> throw Exception("Bad command")
            }
    }
}

fun main() {
    readLine()
    var current = "/"

    do {
        val line = readLine()

        if (line != null) {
            val args = line.split(" ")
            current = CdAndPwd.solve(args[0], current, if (args.size > 1) args[1] else "")

            if (args[0] == "pwd") {
                println(current)
            }
        }
    } while (line != null)
}
