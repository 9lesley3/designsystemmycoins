package com.designsystemmycoins.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.components.buttons.FloatingButtonWithIcon
import com.designsystemmycoins.components.buttons.FloatingButtonWithIconPreview
import com.designsystemmycoins.components.buttons.GenericButton
import com.designsystemmycoins.components.buttons.GenericButtonPreview
import com.designsystemmycoins.ui.theme.DesignsystemmycoinsTheme
import com.designsystemmycoins.ui.theme.backgroundCancelButton

class ButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemmycoinsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowButton { finish() }
                }
            }
        }
    }
}

@Composable
fun ShowButton(onFinish: () -> Unit) {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            FloatingButtonWithIcon(
                label = "Button",
                icon = Icons.Filled.Add,
                onClick = onFinish,
            )

            GenericButton(
                buttonName = "Cancel",
                backgroundColor = backgroundCancelButton,
                textColor = Color.White,
                onClick = onFinish
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowButtonPreview(){
    ShowButton {}
}