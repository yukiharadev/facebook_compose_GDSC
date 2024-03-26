package com.example.facebook.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.facebook.R


@Composable
fun AvatarComponent(
    borderNumber: Int,
    sizeIcon: Int
){
    Image(
        painter = painterResource(R.drawable.simple_avatar),
        contentDescription = "avatar",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(size = sizeIcon.dp)
            .clip(CircleShape)
            .border(borderNumber.dp, Color.Blue, CircleShape)
    )
}

