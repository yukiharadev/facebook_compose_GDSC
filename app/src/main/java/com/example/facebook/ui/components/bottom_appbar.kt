package com.example.facebook.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons
import compose.icons.FontAwesomeIcons
import compose.icons.feathericons.BarChart2
import compose.icons.feathericons.Bell
import compose.icons.feathericons.Home
import compose.icons.feathericons.Menu
import compose.icons.feathericons.Tv
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.Store

@Composable
fun BottomBarComponent(){
    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .padding(vertical = 1.dp, horizontal = 1.dp),
        contentColor = Color(0xFF1877F2),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.Home,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.Tv,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FontAwesomeIcons.Solid.Store,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.BarChart2,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.Bell,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.Menu,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
        }
    }
}