package com.designsystemmycoins.components.toolbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.designsystemmycoins.ui.theme.backgroundGreen

@Composable
fun ToolBarOnlyTitle(toolBarTitle: String) {
    Scaffold(
        content = {
            TopAppBar(
                content = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = toolBarTitle,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.h6,
                    )
                },
                backgroundColor = backgroundGreen,
                contentColor = Color.White
            )
        }
    )
}


@Preview(showBackground = true)
@Composable
fun ToolBarOnlyTitlePreview(){
    ToolBarOnlyTitle(
        toolBarTitle = "My Coins",
    )
}