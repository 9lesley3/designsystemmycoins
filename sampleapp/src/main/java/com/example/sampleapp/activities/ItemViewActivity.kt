package com.example.sampleapp.activities

import android.content.ClipData
import android.os.Bundle
import android.telecom.Call
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
import com.designsystemmycoins.components.itemView.Details
import com.designsystemmycoins.components.itemView.Item
import com.designsystemmycoins.components.toolbar.ToolBarOnlyTitle
import com.designsystemmycoins.data.DetailsData
import com.designsystemmycoins.data.ItemData
import com.example.sampleapp.R
import com.example.sampleapp.ui.theme.DesignsystemmycoinsTheme

class ItemViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignsystemmycoinsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ToolBarOnlyTitle(toolBarTitle = "Show Items")
                    ShowItemView()
                }
            }
        }
    }
}


@Composable
fun ShowItemView() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.padding(16.dp).fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val itemData = ItemData()
            val detailsData = DetailsData()

            Item(itemData)

            Details(
                titleRes = R.string.item_details_title,
                description = detailsData
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemViewPreview() {
    ShowItemView()
}