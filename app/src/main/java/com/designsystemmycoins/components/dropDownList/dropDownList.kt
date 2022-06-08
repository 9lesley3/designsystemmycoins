package com.designsystemmycoins.components.dropDownList

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DropDownList(
    requestToOpen: Boolean = false,
    list: List<String>,
    request: (Boolean) -> Unit,
    selectedString: (String) -> Unit
) {
    DropdownMenu(
        expanded = requestToOpen,
        onDismissRequest = {
            request(false)
            request
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        list.forEach {
            DropdownMenuItem(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    request(false)
                    selectedString(it)
                }
            ) {
                Text(
                    text = it,
                    textAlign = TextAlign.Start,
                    maxLines = 1,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DropDownListPreview() {
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
    }
    val userSelectedConservationState: (String) -> Unit = {
        conservationState.value = it
    }

    Surface {
        DropDownList(
            requestToOpen = isOpen.value,
            list = list,
            request = openCloseOfDropDownList,
            selectedString = userSelectedConservationState
        )
    }
}
