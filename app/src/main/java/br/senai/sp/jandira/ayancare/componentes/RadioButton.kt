package br.senai.sp.jandira.ayancare.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.ayancare.R


@Composable
fun CustomRadioButton(
    text: String,
    isSelected: Boolean,
    onSelected: (Boolean) -> Unit
) {
    val colors = RadioButtonDefaults.colors(
        selectedColor = colorResource(id = R.color.primary_color),
        unselectedColor =  colorResource(id = R.color.second_color),
    )

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable { onSelected(!isSelected) }
            .fillMaxWidth()
    ) {


        Text(text = text)
        RadioButton(
            colors = colors,
            selected = isSelected,
            onClick = { onSelected(!isSelected) }
        )

    }
}


