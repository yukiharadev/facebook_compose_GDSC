package com.example.facebook.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.facebook.R
import compose.icons.FeatherIcons
import compose.icons.FontAwesomeIcons
import compose.icons.feathericons.Search
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.brands.FacebookMessenger

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun TopAppBarComponent(){
    TopAppBar(
        modifier = Modifier.height(50.dp),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = Color(0xFF1877F2),
        ),
        title = {
            Icon(
                painter = painterResource(id = R.drawable.facebook_logo),
                contentDescription = null,
                modifier = Modifier
                    .size(size = 110.dp)

            )
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FeatherIcons.Search,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = FontAwesomeIcons.Brands.FacebookMessenger,
                    modifier = Modifier
                        .size(size = 22.dp),
                    contentDescription = null
                )
            }
        }
    )
}