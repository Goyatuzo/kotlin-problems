package codeForces.v158

class CdAndPwd {
    companion object {
        fun solve(command: String, cwd: String, args: String): String = when (command) {
            "pwd" -> cwd
            "cd" -> {
                if (args.startsWith("/")) {
                    args
                } else {
                    val cwdStack = cwd.split("/")
                    args.split("/").fold(cwdStack) {acc, curr ->
                        if (curr == "..") {
                            cwdStack.dropLast(1)
                        } else {
                            cwdStack + listOf(curr)
                        }
                    }.joinToString("/")
                }
            }
            else -> throw Exception("Bad command")
        }
    }
}