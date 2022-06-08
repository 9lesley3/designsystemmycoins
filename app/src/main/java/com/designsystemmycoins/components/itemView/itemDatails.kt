package com.designsystemmycoins.components.itemView

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.designsystemmycoins.data.DetailsData
import com.designsystemmycoins.ui.theme.backgroundGreen
import com.designsystemmycoins.ui.theme.backgroundGrey
import com.designsystemmycoins.ui.theme.textColorGrey
import com.example.designsystemmycoins.R

@Composable
fun Details(titleRes: Int, description: DetailsData){

    Column (
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(backgroundGrey)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
                .background(backgroundGreen)
                .padding(0.dp, 0.dp, 0.dp, 4.dp)

        ) {
            Text(
                text = stringResource(id = titleRes),
                modifier = Modifier.align(Alignment.Center),
                color = Color.White,
                maxLines = 1,
            )
        }

        description.getDetail().forEach { description ->
            Text(
                text = description.key + " : " + description.value.toString(),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .padding(4.dp, 0.dp, 0.dp, 4.dp),
                color = textColorGrey,
                maxLines = 1,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsPreview(){
    val detailsData = DetailsData()

    Details(
        titleRes = R.string.item_details_title,
        description = detailsData
    )
}