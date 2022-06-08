package com.designsystemmycoins.components.toolbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import com.designsystemmycoins.ui.theme.Typography
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.designsystemmycoins.ui.theme.backgroundGreen

@Composable
fun ToolBarWithButtonCallback(
    toolBarTitle: String,
    onCallBackClick: () -> Unit,
) {
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
                navigationIcon = {
                    IconButton(onClick = onCallBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "toolbar - back arrow icon"
                        )
                    }
                },
                backgroundColor = backgroundGreen,
                contentColor = Color.White
            )
        }
    )
}


@Preview(showBackground = true)
@Composable
fun ToolBarWithButtonCallbackPreview() {
    ToolBarWithButtonCallback(
        toolBarTitle = "My Coins",
        onCallBackClick = {},
    )
}