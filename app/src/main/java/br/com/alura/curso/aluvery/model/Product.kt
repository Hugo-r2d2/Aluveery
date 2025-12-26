package br.com.alura.curso.aluvery.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

data class Product(
    val nome: String,
    val preco: BigDecimal,
    @DrawableRes val image: Int
)