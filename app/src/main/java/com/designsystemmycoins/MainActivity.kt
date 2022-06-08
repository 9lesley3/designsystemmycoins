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
import com.designsystemmycoins.activities.DialogActivity
import com.designsystemmycoins.activities.DropDownListActivity
import com.designsystemmycoins.activities.InputFormActivity
import com.designsystemmycoins.activities.ItemViewActivity
import com.designsystemmycoins.activities.ToolBarActivity
import com.designsystemmycoins.components.buttons.GenericButton
import com.designsystemmycoins.components.toolbar.ToolBarOnlyTitle
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

fun openDialog(context: Context) {
    val intent = Intent(context, DialogActivity::class.java)
    startActivity(context, intent, null)
}

fun openDropDownList(context: Context) {
    val intent = Intent(context, DropDownListActivity::class.java)
    startActivity(context, intent, null)
}

fun openInputForm(context: Context) {
    val intent = Intent(context, InputFormActivity::class.java)
    startActivity(context, intent, null)
}

fun openItemView(context: Context) {
    val intent = Intent(context, ItemViewActivity::class.java)
    startActivity(context, intent, null)
}

fun openToolBar(context: Context) {
    val intent = Intent(context, ToolBarActivity::class.java)
    startActivity(context, intent, null)
}

@Composable
fun HandleButton(context: Context) {
    ToolBarOnlyTitle(toolBarTitle = "Design System")
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GetButton("Buttons") { openButtons(context) }
            GetButton("Dialog") { openDialog(context) }
            GetButton("DropDownList") { openDropDownList(context) }
            GetButton("InputsForm") { openInputForm(context) }
            GetButton("ItemView") { openItemView(context) }
            GetButton("ToolBar") { openToolBar(context) }
        }
    }
}

@Composable
fun GetButton(text: String, onClick: () -> Unit) {
    return GenericButton(
        buttonName = text,
        backgroundColor = backgroundCancelButton,
        textColor = Color.White,
        onClick = onClick
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