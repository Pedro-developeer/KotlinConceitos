package XIIIColecoes

/**
 * Listas
 *
 * Listas podem ser mutáveis ou imutáveis.
 * Listas mutáveis
 * Uma vez criada, não é possível adicionar ou remover valores, somente obter.
 *
 * Listas imutáveis
 * Uma vez criada, podem ser alteradas para adicionar, remover ou atualizar valores.
 * */
fun main() {

    // Lista imutável
    val lista1 = listOf(1, 2, 3, 4, 5, 6, 6)
    var lista2: List<Int> = listOf(1, 2)

    println("Lista, posição 0: ${lista1[0]}")
    println("Tamanho da lista: ${lista1.size}")

    // Lista mutável
    val lista3 = mutableListOf(1, 2, 3, 4, 5, 6, 6)
    var lista4: MutableList<Int> = mutableListOf(1, 2)

    println()
    println("Tamanho da lista 3: ${lista3.size}")

    // Alterando lista mutável
    lista3.add(100)
    lista3.add(100)
    lista3.add(8)
    lista3.remove(2)

    println("Tamanho da lista 3: ${lista3.size}")
    println(lista3)
}