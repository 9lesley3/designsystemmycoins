package com.designsystemmycoins

import android.content.Context
import android.content.Intent
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.designsystemmycoins.activities.ButtonActivity
import com.designsystemmycoins.components.buttons.GenericButton
import com.designsystemmycoins.ui.theme.DesignsystemmycoinsTheme
import com.designsystemmycoins.ui.theme.backgroundCancelButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemmycoinsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val context = LocalContext.current
                    HandleButton(context)
                }
            }
        }
    }
}


internal fun openButtons(context: Context) {
    val intent = Intent(context, ButtonActivity::class.java)
    startActivity(context, intent, null)
}

@Composable
fun OpenDialog() {
    DesignsystemmycoinsTheme {

    }
}

@Composable
fun OpenDropDownList() {
    DesignsystemmycoinsTheme {

    }
}

@Composable
fun OpenInputForm() {
    DesignsystemmycoinsTheme {

    }
}

@Composable
fun OpenItemView() {
    DesignsystemmycoinsTheme {

    }
}

@Composable
fun OpenToolBar() {
    DesignsystemmycoinsTheme {

    }
}

@Composable
fun HandleButton(context: Context) {
    DesignsystemmycoinsTheme {
        Box(modifier = Modifier.padding(16.dp)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ShowButton(context)
            }
        }
    }
}

@Composable
fun ShowButton(context: Context) {
    GenericButton(
        buttonName = "Buttons",
        backgroundColor = backgroundCancelButton,
        textColor = Color.White,
        onClick = { openButtons(context) }
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DesignsystemmycoinsTheme {
        val context = LocalContext.current
        HandleButton(context)
    }
}