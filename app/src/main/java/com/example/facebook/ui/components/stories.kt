package com.example.facebook.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun StoriesComponent() {
    val stories = listOf(
        Story(
            avatarUrl = "https://i.ibb.co/H4bDrmL/2024-02-11-07-35-IMG-0162.jpg",
            storyImageUrl = "https://i.ibb.co/QN2HvHT/433449968-7480960578618732-174104719673280074-n.jpg",
            userName = "Your Story"
        ),
        Story(
            avatarUrl = "https://picsum.photos/200/200",
            storyImageUrl = "https://picsum.photos/200/300",
            userName = "Kimi Hime"
        ),
        Story(
            avatarUrl = "https://picsum.photos/300/300",
            storyImageUrl = "https://picsum.photos/200/400",
            userName = "Eimi Fukada"
        ),
        Story(
            avatarUrl = "https://picsum.photos/300/300",
            storyImageUrl = "https://picsum.photos/200/400",
            userName = "Jessica"
        ),
    )

    Column {
        Divider(
            color = Color(0x163C3636),
            modifier = Modifier.height(1.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    "Stories",
                    color = Color(0xFF1877F2)
                )
            }
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    "Reels",
                    color = Color(0xDD3C3636)
                )
            }
        }
        LazyRow(
            modifier = Modifier
                .background(color = Color.White)
                .padding(horizontal = 2.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items(stories) { story ->
                StoryCard(story = story)
            }
        }
    }
}