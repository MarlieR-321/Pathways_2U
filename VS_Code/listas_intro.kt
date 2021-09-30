fun main() {
    println("---Introduccion a Listas---")
    listas_intro()
    println("\n\n---Listas son de solamente Lectura---")
    lista_read_only()
}

fun listas_intro() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 3)
    println("List ${numbers}")

    // Formas de obtener el primer
    println("First element: ${numbers[0]}")
    println("First: ${numbers.first()}")

    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")

    // Formas de obtener el ultimo
    println("Last element: ${numbers[numbers.size - 1]}")
    println("Last: ${numbers.last()}")

    // Ver si existe dentro de la lista
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")
}

fun lista_read_only() {
    // Es una lista es de solo lectura
    val colors = listOf("green", "orange", "blue")

    println("Reversed list: ${colors.reversed()}")
    println("Sorted list: ${colors.sorted()}") // Orden alfabetico o numeral
    println("List: $colors")
}
