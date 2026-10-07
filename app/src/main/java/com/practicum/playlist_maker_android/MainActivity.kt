package com.practicum.playlist_maker_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.practicum.playlist_maker_android.ui.main.MainScreen
import com.practicum.playlist_maker_android.ui.theme.PlaylistmakerandroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlaylistmakerandroidTheme {
                MainScreen()
            }
        }
    }
}