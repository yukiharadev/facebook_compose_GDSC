package com.example.facebook.ui.components

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import compose.icons.FeatherIcons
import compose.icons.FontAwesomeIcons
import compose.icons.feathericons.Globe
import compose.icons.feathericons.MessageCircle
import compose.icons.feathericons.ThumbsUp
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.Share


@Composable
fun NewsComponent() {
    Spacer(Modifier.height(5.dp))
    Column(
        Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            AvatarComponent(borderNumber = 0, sizeIcon = 45)
            Column(
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .height(45.dp)
                    .wrapContentHeight()
            ){
                Text("Nguyễn Việt Hoàng ")
                Row(
                    modifier = Modifier
                ) {
                    Text("Time • ",
                        fontSize = 10.sp
                    )
                    IconButton(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(vertical = 1.dp)
                            .size(size = 12.dp)
                        ) {
                        Icon(
                            imageVector = FeatherIcons.Globe,
                            contentDescription = null,
                        )
                    }
                }
            }
        }
        Text("Gory Gory ManUnited",
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 2.dp)

        )
        AsyncImage(
            model ="https://i.ibb.co/tQRcFZ2/1045614-kyoukai-no-kanata-wallpapers-1920x1080-macbook.jpg" ,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(270.dp)
            ,
            contentScale = ContentScale.Crop
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            TextButton(
                onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.ThumbsUp,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = "Like",
                    tint = Color.Black
                )
                Text("Like",
                    color = Color.Black,
                    modifier = Modifier
                        .height(22.dp)
                        .padding(horizontal = 3.dp, vertical = 2.dp)
                )
            }
            TextButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.MessageCircle,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = "Comments",
                    tint = Color.Black
                )
                Text("Comments",
                    color = Color.Black,
                    modifier = Modifier
                        .height(22.dp)
                        .padding(horizontal = 3.dp, vertical = 2.dp)
                )
            }
            TextButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FontAwesomeIcons.Solid.Share,
                    modifier = Modifier
                        .size(size = 18.dp),
                    contentDescription = "Share",
                    tint = Color.Black

                )
                Text("Share",
                    color = Color.Black,
                    modifier = Modifier
                        .height(22.dp)
                        .padding(horizontal = 3.dp, vertical = 2.dp)
                )
            }
        }

    }
}
