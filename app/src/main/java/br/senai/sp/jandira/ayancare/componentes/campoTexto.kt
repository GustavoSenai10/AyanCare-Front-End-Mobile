package br.senai.sp.jandira.ayancare.componentes

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixaDeTexto(
    valor: String,
    label: String,
    aoMudar:() -> Unit
){

    OutlinedTextField(
        value = valor,
        onValueChange ={
            aoMudar()
        },
        label = {
            Text(text = label)
        },
    )
}

@Preview(showBackground = true)
@Composable
fun CaixaDeTextoPreview(){
    CaixaDeTexto(valor = "", label = "") {

    }
}