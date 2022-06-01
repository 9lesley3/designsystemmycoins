package com.designsystemmycoins.components.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.ui.theme.backgroundCancelButton

@Composable
fun GenericButton(
    buttonName: String,
    backgroundColor: Color,
    textColor: Color,
    onClick: () -> Unit,

) {
    Button(onClick = onClick,
        shape = RoundedCornerShape(20),
        contentPadding = PaddingValues(2.dp),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = backgroundColor,
            contentColor = textColor
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(buttonName, style = typography.button)
    }
}

@Preview(showBackground = true)
@Composable
fun GenericButtonPreview(){
    GenericButton(
        buttonName = "Cancel",
        backgroundColor = backgroundCancelButton,
        textColor = Color.White,
        onClick = {}
    )
}