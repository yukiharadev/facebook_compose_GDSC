package com.example.facebook.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage



@Composable
fun StoryCard(story: Story) {
    Card(
        modifier = Modifier
            .width(110.dp)
            .height(190.dp)
            .padding(4.dp)
    ) {
        Box {
            AsyncImage(
                model = story.storyImageUrl,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier.padding(6.dp)
            ) {
                AsyncImage(
                    model = story.avatarUrl,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(2.dp, Color.Blue, CircleShape)
                )
            }
            Text(
                text = story.userName,
                color = Color.White,
                fontWeight = FontWeight.W600,
                modifier = Modifier
                    .height(190.dp)
                    .wrapContentHeight(Alignment.Bottom)
                    .padding(vertical = 5.dp, horizontal = 4.dp)
            )
        }
    }
}

data class Story(
    val avatarUrl: String,
    val storyImageUrl: String,
    val userName: String
)
