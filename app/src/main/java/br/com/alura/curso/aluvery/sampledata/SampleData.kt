package br.com.alura.curso.aluvery.sampledata

import br.com.alura.curso.aluvery.R
import br.com.alura.curso.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(

    Product(
        nome = "Hamburguer",
        preco = BigDecimal("12.12"),
        R.drawable.hamburguer
    ),
    Product(
        nome =  "Pizza",
        preco = BigDecimal("15.12"),
        R.drawable.pizza
    ),
    Product(
        nome =  "Batata Frita",
        preco = BigDecimal("7.99"),
        R.drawable._batata
    )
)