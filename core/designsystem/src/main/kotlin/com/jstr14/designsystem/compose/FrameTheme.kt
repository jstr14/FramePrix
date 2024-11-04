package com.jstr14.designsystem.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.jstr14.designsystem.compose.essentials.CornerRadius
import com.jstr14.designsystem.compose.essentials.Elevations
import com.jstr14.designsystem.compose.essentials.Spacings
import com.jstr14.designsystem.compose.essentials.Typography
import com.jstr14.designsystem.compose.essentials.colors.DarkSemanticColors
import com.jstr14.designsystem.compose.essentials.colors.LightSemanticColors
import com.jstr14.designsystem.compose.essentials.colors.SemanticColors
import com.jstr14.designsystem.compose.essentials.colors.mapToMaterialColors

internal val LocalFrameTypography =
    staticCompositionLocalOf { Typography(defaultColors = LightSemanticColors) }
internal val LocalSemanticColors = staticCompositionLocalOf { LightSemanticColors }

@Composable
fun FrameTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val semanticColors = if (darkTheme) {
        DarkSemanticColors
    } else {
        LightSemanticColors
    }

    val typography = Typography(defaultColors = semanticColors)
    CompositionLocalProvider(
        LocalFrameTypography provides typography,
        LocalSemanticColors provides semanticColors,
    ) {
        MaterialTheme(
            colors = semanticColors.mapToMaterialColors(darkTheme),
            content = content,
        )
    }
}

object FrameTheme {
    val typography: Typography
        @Composable
        get() = LocalFrameTypography.current
    val colors: SemanticColors
        @Composable
        get() = LocalSemanticColors.current
    val spacings = Spacings
    val cornerRadius = CornerRadius
    val elevations = Elevations
}
