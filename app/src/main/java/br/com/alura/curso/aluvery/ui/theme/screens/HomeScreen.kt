package br.com.alura.curso.aluvery.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.alura.curso.aluvery.R
import br.com.alura.curso.aluvery.model.Product
import br.com.alura.curso.aluvery.sampledata.sampleProducts
import br.com.alura.curso.aluvery.ui.theme.components.ProductsSection
import java.math.BigDecimal

@Preview
@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        ProductsSection(
            title = "Promoções",
            products = sampleProducts
        )
        ProductsSection(
            title = "Doces",
            products = sampleProducts
        )
        ProductsSection(
            title = "Bebidas",
            products = sampleProducts
        )
        Spacer(Modifier)
    }
}
