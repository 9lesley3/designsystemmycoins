package com.designsystemmycoins.components.inputForm

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.ui.theme.textColorGrey
import com.example.designsystemmycoins.R


@Composable
fun InputImage(
    titleResId: Int,
    imageFrontResId: Int,
    imageBackResId: Int,

) {
    Column (
    verticalArrangement = Arrangement.spacedBy(8.dp),
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)

        ) {
            Text(
                text = stringResource(id = titleResId),
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                color = textColorGrey,
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(
                    id = imageFrontResId
                ),
                contentDescription = "item - image cell",
                modifier = Modifier
                    .padding(16.dp)
                    .clip(CircleShape)
                    .size(120.dp)

            )

            Image(
                painter = painterResource(
                    id = imageBackResId
                ),
                contentDescription = "item - image cell",
                modifier = Modifier
                    .padding(16.dp)
                    .clip(CircleShape)
                    .size(120.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InputImagePreview(){
    InputImage(
        R.string.image_coin_title,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background
    )
}
