package br.senai.sp.jandira.ayancare.screen.screenEstoque

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.ayancare.R
import br.senai.sp.jandira.ayancare.componentes.ButtonPadrao


@Composable
fun Estoque(){

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(

        ) {
            Row(

            ) {
                Button(
                    onClick = {/*TODO*/ },
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24),
                        contentDescription =""
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    modifier = Modifier.height(20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.medicamento) ,
                        contentDescription = ""
                    )
                }
            }
        }

    }
}


@Preview
@Composable
fun ScreenAdicionarRemedioPreview(){
    Estoque()

}