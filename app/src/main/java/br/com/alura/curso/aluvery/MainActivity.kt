package br.com.alura.curso.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.alura.curso.aluvery.sampledata.sampleSections
import br.com.alura.curso.aluvery.ui.theme.AluveryTheme
import br.com.alura.curso.aluvery.ui.theme.screens.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
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
        HomeScreen(sampleSections)
    }
}
