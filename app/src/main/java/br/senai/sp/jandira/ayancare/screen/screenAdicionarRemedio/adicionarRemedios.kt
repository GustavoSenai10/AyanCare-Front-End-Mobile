package br.senai.sp.jandira.ayancare.componentes.screen.screenAdicionarRemedio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.ayancare.R
import br.senai.sp.jandira.ayancare.componentes.ButtonPadrao
import br.senai.sp.jandira.ayancare.componentes.CaixaDeTexto


@Composable
fun TelaAdicionarRemedio(){

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),

            ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(40.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top
            ) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(30.dp)
                        .padding(1.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_24) ,
                        contentDescription =""
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.remedios),
                    contentDescription = "",
                    modifier = Modifier
                        .size(width = 150.dp, height = 90.dp),
                )
            }
            Spacer(modifier = Modifier.height(30.dp))

            Column(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                horizontalAlignment =Alignment.CenterHorizontally

            ) {

                Text(
                    text = stringResource(id = R.string.nome_remedio)
                )
                Spacer(modifier = Modifier.height(20.dp))

                CaixaDeTexto(valor = "", label = "") {

                }

            }



        }


    }

}


@Preview
@Composable
fun ScreenAdicionarRemedioPreview(){
    TelaAdicionarRemedio()

}