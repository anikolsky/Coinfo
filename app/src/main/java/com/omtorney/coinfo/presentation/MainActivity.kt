package com.omtorney.coinfo.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.omtorney.coinfo.presentation.ui.theme.CoinfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoinfoTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}