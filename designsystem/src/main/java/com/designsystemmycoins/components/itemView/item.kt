package com.designsystemmycoins.components.itemView

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.designsystemmycoins.data.ItemData

@Composable
fun Item(
    item: ItemData
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = item.imageRes
                ),
                contentDescription = "item - image cell",
                modifier = Modifier
                    .padding(4.dp, 4.dp, 0.dp, 4.dp)
                    .clip(CircleShape)
                    .size(50.dp)

            )
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = item.title,
                    maxLines = 1,
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = item.value.toString(),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light,
                         maxLines = 1,
                    )
                    Text(
                        text = item.year.toString(),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light,
                         maxLines = 1,
                    )
                    Text(
                        text = item.conservationState,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(0.dp, 0.dp, 4.dp, 0.dp),
                         maxLines = 1,
                    )
                }
            }
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "item - menu icon",
                modifier = Modifier.padding(0.dp, 0.dp, 4.dp, 0.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemPreview() {
    val itemData = ItemData()
    Item(itemData)
}