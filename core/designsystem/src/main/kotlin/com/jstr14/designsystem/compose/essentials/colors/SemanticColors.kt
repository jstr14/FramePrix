package com.jstr14.designsystem.compose.essentials.colors

import androidx.compose.material.Colors
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class SemanticColors(
    val content: Content,
    val background: Background,
    val border: Border,
)

@Immutable
data class Content(
    val accent: Color,
    val primary: Color,
    val secondary: Color,
    val invertedPrimary: Color,
    val positive: Color,
    val negative: Color,
    val negativeStrong: Color,
)

@Immutable
data class Background(
    val primary: Color,
    val secondary: Color,
    val invertedPrimary: Color,
    val invertedSecondary: Color,
    val overlay: Color,
    val overlayLight: Color,
    val neutral: Color,
    val positive: Color,
    val positiveLight: Color,
    val negative: Color,
    val negativeLight: Color,
    val negativeMedium: Color,
    val negativeStrong: Color,
    val accent: Color,
    val accentLight: Color,
    val accentAction: Color,
    val attention: Color,
)

@Immutable
data class Border(
    val primary: Color,
    val secondary: Color,
    val positive: Color,
    val negative: Color,
)

@Suppress("ConflictingOnColor")
fun SemanticColors.mapToMaterialColors(isDark: Boolean) = Colors(
    primary = background.accent,
    primaryVariant = background.primary,
    secondary = background.primary,
    secondaryVariant = background.primary,
    background = background.primary,
    surface = background.primary,
    error = background.negative,
    onPrimary = content.invertedPrimary,
    onSecondary = content.primary,
    onBackground = content.primary,
    onSurface = content.primary,
    onError = content.invertedPrimary,
    isLight = !isDark,
)
