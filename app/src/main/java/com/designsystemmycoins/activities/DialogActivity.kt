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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.components.dialog.DialogDeleteItem
import com.designsystemmycoins.ui.theme.DesignsystemmycoinsTheme
import com.example.designsystemmycoins.R

class DialogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemmycoinsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowDialog { finish() }
                }
            }
        }
    }
}

@Composable
fun ShowDialog(onFinish: () -> Unit) {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            DialogDeleteItem(
                R.string.dialog_title,
                R.string.dialog_primary_sub_title,
                R.string.dialog_secondary_sub_title,
                R.string.dialog_primary_button_text,
                R.string.dialog_secondary_button_text,
                onPrimaryButton = onFinish,
                onSecondaryButton = onFinish,
                showDialog = true,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowDialogActivityPreview(){
    ShowDialog {}
}