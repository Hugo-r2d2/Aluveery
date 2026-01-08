package br.com.alura.curso.aluvery.ui.theme.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AllProductsButton(onClick: () -> Unit) {
    SmallFloatingActionButton(
        onClick = { onClick() },
        containerColor = Color.Cyan,
        contentColor = MaterialTheme.colorScheme.secondary
    )  {
        Icon(
            Icons.Filled.Info,
            contentDescription = null
        )
    }
}

@Preview
@Composable
private fun AllProductsButtonPreview() {
    AllProductsButton(onClick = {})
}