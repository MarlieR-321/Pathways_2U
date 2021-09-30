fun main() {
    val entrees: MutableList<String> = mutableListOf()
    println("Entrees: $entrees/n") // Es una lista es de solo lectura

    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees/n")

    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees/n")

    val moreItems = listOf("ravioli", "lasagna", "fettuccine")

    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees/n")

    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees/n")

    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees/n")

    entrees.clear()
    println("Entrees: $entrees/n")

    println("Empty? ${entrees.isEmpty()}")
}
