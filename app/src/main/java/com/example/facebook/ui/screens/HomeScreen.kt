package com.example.facebook.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.facebook.ui.components.BottomBarComponent
import com.example.facebook.ui.components.PostContainer
import com.example.facebook.ui.components.StoriesComponent
import com.example.facebook.ui.components.TopAppBarComponent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBarComponent()
        },
        bottomBar = {
            BottomBarComponent()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .background(color = Color(0x17000000))

        ) {
            PostContainer()
            StoriesComponent()
        }
    }
}