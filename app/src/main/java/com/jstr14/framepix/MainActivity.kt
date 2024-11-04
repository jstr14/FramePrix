package com.jstr14.framepix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jstr14.designsystem.compose.FrameTheme
import com.jstr14.framepix.compose.LoginScreen
import com.jstr14.framepix.viewmodel.GoogleSignInViewModel

class MainActivity : ComponentActivity() {

    private val googleSignInViewModel = GoogleSignInViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FrameTheme {
                LoginScreen(
                    onGoogleSingIn =
                    googleSignInViewModel::handleGoogleSignIn
                )
            }
        }
    }
}