package br.senai.sp.jandira.ayancare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.senai.sp.jandira.ayancare.componentes.screen.screenAdicionarRemedio.TelaAdicionarRemedio
import br.senai.sp.jandira.ayancare.componentes.screen.screenProcurarRemedio.TelaProcurarRemedio
import br.senai.sp.jandira.ayancare.ui.theme.AyanCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AyanCareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaProcurarRemedio()

                }
            }
        }
    }
}

