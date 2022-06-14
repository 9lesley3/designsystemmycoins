package com.designsystemmycoins.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.designsystemmycoins.components.buttons.GenericButton
import com.designsystemmycoins.ui.theme.Typography
import com.designsystemmycoins.ui.theme.backgroundCancelButton
import com.designsystemmycoins.ui.theme.backgroundDeleteButton
import com.example.designsystem.R

@Composable
fun DialogDeleteItem(
    titleRes: Int,
    primarySubTitleRes: Int,
    secondarySubTitleRes: Int,
    primaryButtonTextRes: Int,
    secondaryButtonTextRes: Int,
    onPrimaryButton: () -> Unit,
    onSecondaryButton: () -> Unit,
    showDialog: Boolean = true
) {

    val openDialog = remember { mutableStateOf(showDialog) }

    if (openDialog.value) {
        Dialog(
            onDismissRequest = {
                onSecondaryButton()
                openDialog.value = false
            }
        ) {

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                shape = RoundedCornerShape(size = 12.dp)
            ) {

                Column(
                    modifier = Modifier.padding(all = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = stringResource(id = titleRes),
                        style = Typography.h1,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        modifier = Modifier
                            .padding(top = 16.dp),
                        text = stringResource(id = primarySubTitleRes),
                        style = Typography.body1,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        modifier = Modifier
                            .padding(top = 2.dp, bottom = 20.dp),
                        text = stringResource(id = secondarySubTitleRes),
                        style = Typography.body1,
                        textAlign = TextAlign.Center
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                        // Cancel button
                        GenericButton(
                            buttonName = stringResource(id = primaryButtonTextRes),
                            backgroundColor = backgroundCancelButton,
                            textColor = Color.White,
                            onClick = {
                                onPrimaryButton()
                                openDialog.value = false
                            }
                        )

                        // Delete button
                        GenericButton(
                            buttonName = stringResource(id = secondaryButtonTextRes),
                            backgroundColor = backgroundDeleteButton,
                            textColor = Color.White,
                            onClick = {
                                onSecondaryButton()
                                openDialog.value = false
                            }
                        )

                    }
                }

            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DialogDeleteItemPreview(){
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DialogDeleteItem(
                R.string.dialog_title,
                R.string.dialog_primary_sub_title,
                R.string.dialog_secondary_sub_title,
                R.string.dialog_primary_button_text,
                R.string.dialog_secondary_button_text,
                onPrimaryButton = {  },
                onSecondaryButton = {  },
                showDialog = true)
        }
    }
}
