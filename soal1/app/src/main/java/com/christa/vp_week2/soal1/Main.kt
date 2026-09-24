package com.christa.vp_week2.soal1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.christa.vp_week2.ui.theme.VP_Week2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VP_Week2Theme {
                MusicPlayerScreen()
            }
        }
    }
}