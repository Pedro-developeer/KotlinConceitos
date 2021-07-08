package IIBasicoControleFluxo

fun acontecimentoWhen(ano: Int) {

    when (ano) {
        in 0..1999 -> {
            println("Milênio passado")
        }
        in 2000..2003 -> {
            println("Presidente: Fernando Henrique Cardoso")
        }
        else -> {
            println("Deixemos pro futuro.")
        }
    }

}

fun calculaBonus(cargo: String, salario: Float) {
    when {
        cargo == "Gerente" && salario > 2000 -> println("O bônus é de ${salario * 0.5f}")
        cargo == "Gerente" && salario > 3000 -> println("O bônus é de ${salario * 0.6f}")
        else -> print("Bônus padrão de R$300,00")
    }
}

fun operacao(a: Int, b: Int, operacao: String): Int {
    when (operacao) {
        "Soma" -> {
            return a + b
        }
        "Subtracao" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }
}

fun main() {
    println("Soma de 2 e 2 resulta em: ${operacao(2, 2, "Soma")}")
}

/**
 * -- Anotações --
 * Assim como if/else, when também é uma expressão e pode retornar valores.
 */