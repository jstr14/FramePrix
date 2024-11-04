package com.jstr14.framepix.compose

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jstr14.designsystem.compose.FrameTheme
import com.jstr14.designsystem.compose.essentials.Spacings
import com.jstr14.framepix.R

@Composable
fun LoginScreen(onGoogleSingIn: (context: Context, navController: NavHostController) -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val navController = rememberNavController()
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(Spacings.spacing16),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_14018816),
            contentDescription = "Login Image",
            modifier = Modifier
                .size(Spacings.spacing96)
                .padding(bottom = Spacings.spacing24)
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            textStyle = FrameTheme.typography.Body2.Regular,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(Spacings.spacing8))

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            textStyle = FrameTheme.typography.Body2.Regular,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(Spacings.spacing16))

        Button(
            onClick = { /* Handle login logic */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = Spacings.spacing8),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = FrameTheme.colors.background.primary,
                contentColor = FrameTheme.colors.content.primary
            ),
        ) {
            Text("Log In", style = FrameTheme.typography.Subtitle2)
        }

        Button(
            onClick = { /* Handle register logic */ },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = FrameTheme.colors.background.primary,
                contentColor = FrameTheme.colors.content.primary
            ), modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = Spacings.spacing8)
        ) {
            Text("Sign Up", style = FrameTheme.typography.Subtitle2)
        }

        Spacer(modifier = Modifier.height(Spacings.spacing8))

        Text(
            text = "Or login with",
            modifier = Modifier.padding(vertical = Spacings.spacing8),
            style = FrameTheme.typography.Body2.Regular,
        )

        Button(
            onClick = {
                onGoogleSingIn(context, navController)
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = FrameTheme.colors.background.primary,
                contentColor = FrameTheme.colors.content.primary
            ), modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = Spacings.spacing8)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google Icon",
                tint = Color.Unspecified,
                modifier = Modifier.size(Spacings.spacing24)
            )
            Spacer(modifier = Modifier.width(Spacings.spacing8))
            Text("Continue with Google", style = FrameTheme.typography.Body3.Regular)
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    FrameTheme {
        LoginScreen(onGoogleSingIn = { context: Context,
                                       navHostController: NavHostController ->
        })
    }
}