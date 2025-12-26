package br.com.alura.curso.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alura.curso.aluvery.extensions.toBrazzilianCurrency
import br.com.alura.curso.aluvery.ui.theme.AluveryTheme
import br.com.alura.curso.aluvery.model.Product
import br.com.alura.curso.aluvery.ui.theme.Purple500
import br.com.alura.curso.aluvery.ui.theme.Teal200
import br.com.alura.curso.aluvery.ui.theme.components.ProductItem
import br.com.alura.curso.aluvery.ui.theme.components.ProductsSection
import br.com.alura.curso.aluvery.ui.theme.screens.HomeScreen
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun App() {
    AluveryTheme {
        Surface {
            HomeScreen()
        }
    }
}



