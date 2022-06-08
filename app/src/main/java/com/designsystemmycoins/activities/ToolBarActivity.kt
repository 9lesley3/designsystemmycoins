package com.designsystemmycoins.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.components.toolbar.ToolBar
import com.designsystemmycoins.components.toolbar.ToolBarOnlyTitle
import com.designsystemmycoins.components.toolbar.ToolBarWithButtonCallback
import com.designsystemmycoins.ui.theme.DesignsystemmycoinsTheme

class ToolBarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemmycoinsTheme {
                ToolBarOnlyTitle(toolBarTitle = "Show ToolBars")
                ShowToolBarActivity()
            }
        }
    }
}


@Composable
fun ShowToolBarActivity() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(modifier = Modifier.height(50.dp)) {
                ToolBar(
                    toolBarTitle = "ToolBar",
                    onCallBackClick = {},
                    onIconClick = {},
                )
            }

            Box(modifier = Modifier.height(50.dp)) {
                ToolBarOnlyTitle(toolBarTitle = "ToolBar Only Title")
            }

            Box(modifier = Modifier.height(50.dp)) {
                ToolBarWithButtonCallback(
                    toolBarTitle = "ToolBar With Button Callback",
                    onCallBackClick = {},
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ToolBarActivityPreview() {
    ShowToolBarActivity()
}