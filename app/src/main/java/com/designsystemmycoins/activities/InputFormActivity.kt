package com.designsystemmycoins.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.components.inputForm.InputImage
import com.designsystemmycoins.components.inputForm.InputSelection
import com.designsystemmycoins.components.inputForm.InputText
import com.designsystemmycoins.ui.theme.DesignsystemmycoinsTheme
import com.example.designsystemmycoins.R

class InputFormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemmycoinsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowInputForm { finish() }
                }
            }
        }
    }
}


@Composable
fun ShowInputForm(onFinish: () -> Unit) {
    val conservationStateList = listOf(
        "FLOR DE CUNHO (FC)",
        "SOBERBA (S)",
        "MUITO BEM CONSERVADA (MBC)",
        "BEM CONSERVADA (BC)",
        "REGULAR (R)",
        "GASTA",
    )

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            InputImage(
                R.string.image_coin_title,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
            )

            InputSelection(
                label = "state",
                list = conservationStateList
            )

            InputText("state")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowInputFormPreview(){
    ShowInputForm {}
}