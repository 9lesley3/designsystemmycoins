package com.designsystemmycoins.components.inputForm

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.components.dropDownList.DropDownList
import com.designsystemmycoins.ui.theme.backgroundGreen


@Composable
fun InputSelection(label: String, list: List<String>) {
    val conservationState = remember { mutableStateOf("") }
    val isOpen = remember { mutableStateOf(false) }
    val openCloseOfDropDownList: (Boolean) -> Unit = {
        isOpen.value = it
    }
    val userSelectedConservationState: (String) -> Unit = {
        conservationState.value = it
    }

    Box {
        Column  {
            OutlinedTextField(
                value = conservationState.value,
                onValueChange = { conservationState.value = it },
                label = { Text(text = label) },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "",
                        tint = backgroundGreen,

                        )
                },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(50)
            )
            DropDownList(
                requestToOpen = isOpen.value,
                list = list,
                request = openCloseOfDropDownList,
                selectedString = userSelectedConservationState
            )
        }
        Spacer(
            modifier = Modifier
                .matchParentSize()
                .background(Color.Transparent)
                .padding(10.dp)
                .clickable(
                    onClick = { isOpen.value = true }
                )
        )
    }
}


@Preview(showBackground = true)
@Composable
fun InputSelectionPreview(){
    val conservationStateList = listOf(
        "FLOR DE CUNHO (FC)",
        "SOBERBA (S)",
        "MUITO BEM CONSERVADA (MBC)",
        "BEM CONSERVADA (BC)",
        "REGULAR (R)",
        "GASTA",
    )

    InputSelection(
        label = "state",
        list = conservationStateList
    )
}

