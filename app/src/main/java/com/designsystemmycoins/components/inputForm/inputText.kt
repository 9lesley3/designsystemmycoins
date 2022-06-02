package com.designsystemmycoins.components.inputForm

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InputText(label: String) {
    val conservationState = remember { mutableStateOf("") }

    OutlinedTextField(
        value = conservationState.value,
        onValueChange = { conservationState.value = it },
        label = { Text(text = label) },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(50)
    )
}

@Preview(showBackground = true)
@Composable
fun InputTextPreview(){
    InputText("state")
}