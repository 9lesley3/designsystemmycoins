package com.designsystemmycoins.components.toolbar

import androidx.compose.foundation.layout.fillMaxWidth
import com.designsystemmycoins.ui.theme.Typography
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.designsystemmycoins.ui.theme.backgroundGreen

@Composable
fun ToolBarOnlyTitle(toolBarTitle: String) {
    Scaffold(
        content = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = toolBarTitle,
                        style = Typography.h6,
                        maxLines = 1,
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