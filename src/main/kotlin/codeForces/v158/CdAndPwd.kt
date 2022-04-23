package codeForces.v158

class CdAndPwd {
    companion object {
        fun solve(command: String, cwd: String, args: String): String = when (command) {
            "pwd" -> cwd
            "cd" -> {
                if (args.startsWith("/")) {
                    if (args.endsWith("/")) args else "$args/"
                } else {
                    val cwdStack = cwd.split("/").filter { it.isNotEmpty() }
                    args.split("/").filter { it.isNotEmpty() }.fold(cwdStack) { acc, curr ->
                        if (curr == "..") {
                            acc.dropLast(1)
                        } else {
                            acc + listOf(curr)
                        }
                    }.joinToString("/", "/", "/")
                }
            }
            else -> throw Exception("Bad command")
        }
    }
}