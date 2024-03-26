package com.example.facebook.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import compose.icons.FeatherIcons
import compose.icons.feathericons.Image

@Composable
fun PostContainer() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 2.dp)
            .background(color = Color.White),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
               .padding(horizontal = 8.dp, vertical = 8.dp),
        ){
            AvatarComponent(borderNumber = 0, sizeIcon = 45)
            Text(
                text = "What's on your mind?",
                fontSize = 14.sp,
                modifier = Modifier
                    .height(45.dp)
                    .wrapContentHeight()
                    .padding(horizontal = 8.dp)
            )
        }
        IconButton(
            onClick = { /*TODO*/ },
        ) {
            Icon(
                imageVector = FeatherIcons.Image,
                contentDescription = null,
                tint = Color(0xFF44B960)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostContainerPreview() {
    PostContainer()
}