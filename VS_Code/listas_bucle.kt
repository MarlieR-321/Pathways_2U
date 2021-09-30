fun main() {
    println("--While--")
    b_while()
    println("\n--For--")
    b_for()
}

fun b_while() {
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0

    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")
}

fun b_for() {
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")

    for (name in names) {
        println(name)
        println("$name - Number of characters: ${name.length}")
    }
}
