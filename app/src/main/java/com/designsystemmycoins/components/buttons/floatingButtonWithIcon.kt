package com.designsystemmycoins.components.buttons

import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.designsystemmycoins.ui.theme.backgroundGreen

@Composable
fun FloatingButtonWithIcon(
    label: String,
    icon: ImageVector,
    onClick: () -> Unit,
) {
    ExtendedFloatingActionButton(
        text = {
            Text(text = label)
        },
        onClick = onClick,
        icon = {
            Icon(icon,"floating button - add icon")
        },
        backgroundColor = backgroundGreen,
        contentColor = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun FloatingButtonWithIconPreview(){
    FloatingButtonWithIcon(
        label = "Button",
        icon = Icons.Filled.Add,
        onClick = {},
    )
}