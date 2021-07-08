package XIIIColecoes

/**
 * Map
 *
 * Maps podem ser mutáveis ou imutáveis.
 * Mapa são listas de dados entrada-valor. Significa que para uma chave, existe um valor associado.
 *
 * Assim como Set, map também não permite elementos duplicados.
 * */
fun main() {

    val map1 = mapOf(Pair("França", "Paris"), Pair("França", "Paris"))
    val map2 = mutableMapOf(Pair("França", "Paris"), Pair("França", "Paris"))

    // Todas as entradas, ou seja, chaves
    println(map1.keys)

    // Todas os valores, ou seja, quais são os valores associados as chaves
    println(map1.values)

    // Como adicionar novos valores
    map2["Alemanha"] = "Berlim"
    println(map2)

    // Como remover valores - Sempre informar a chave
    map2.remove("Alemanha")
    println(map2)

}