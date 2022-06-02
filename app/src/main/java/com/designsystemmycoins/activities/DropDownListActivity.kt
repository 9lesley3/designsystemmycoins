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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.components.dropDownList.DropDownList
import com.designsystemmycoins.ui.theme.DesignsystemmycoinsTheme

class DropDownListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemmycoinsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShowDropDownList { finish() }
                }
            }
        }
    }
}

@Composable
fun ShowDropDownList(onFinish: () -> Unit) {
    val list = listOf(
        "FLOR DE CUNHO (FC)",
        "SOBERBA (S)",
        "MUITO BEM CONSERVADA (MBC)",
        "BEM CONSERVADA (BC)",
        "REGULAR (R)",
        "GASTA",
    )
    val conservationState = remember { mutableStateOf("") }
    val isOpen = remember { mutableStateOf(true) }
    val openCloseOfDropDownList: (Boolean) -> Unit = {
        isOpen.value = it
        onFinish()
    }
    val userSelectedConservationState: (String) -> Unit = {
        conservationState.value = it
    }

    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            DropDownList(
                requestToOpen = isOpen.value,
                list = list,
                request = openCloseOfDropDownList,
                selectedString = userSelectedConservationState
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowDropDownListPreview(){
    ShowDropDownList {}
}