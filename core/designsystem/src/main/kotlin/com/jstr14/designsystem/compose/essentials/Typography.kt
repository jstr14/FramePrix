package com.jstr14.designsystem.compose.essentials

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.jstr14.designsystem.compose.essentials.colors.SemanticColors

@Immutable
data class Typography internal constructor(
    val Display: TextStyle,
    val Headline1: TextStyle,
    val Headline2: TextStyle,
    val Headline3: TextStyle,
    val Headline4: TextStyle,
    val Subtitle1: TextStyle,
    val Subtitle2: TextStyle,
    val Label1: TextStyle,
    val Label2: TextStyle,
    val Label3: TextStyle,
    val Label4: TextStyle,
    val Body1: Body1,
    val Body2: Body2,
    val Body3: Body3,
) {
    constructor(defaultColors: SemanticColors) : this(
        Display =
        TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 64.sp,
            letterSpacing = (-0.01).em,
            color = defaultColors.content.primary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Headline1 =
        TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 48.sp,
            letterSpacing = 0.em,
            color = defaultColors.content.primary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Headline2 =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 32.sp,
            letterSpacing = 0.em,
            color = defaultColors.content.primary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Headline3 =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 24.sp,
            letterSpacing = 0.01.em,
            color = defaultColors.content.primary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Headline4 =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            letterSpacing = 0.01.em,
            color = defaultColors.content.primary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Subtitle1 =
        TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp,
            letterSpacing = 0.01.em,
            color = defaultColors.content.secondary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Subtitle2 =
        TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            letterSpacing = 0.em,
            color = defaultColors.content.secondary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Label1 =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 24.sp,
            letterSpacing = 0.01.em,
            color = defaultColors.content.invertedPrimary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Label2 =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            letterSpacing = 0.01.em,
            color = defaultColors.content.invertedPrimary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Label3 =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            letterSpacing = 0.em,
            color = defaultColors.content.invertedPrimary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Label4 =
        TextStyle(
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            letterSpacing = 0.02.em,
            color = defaultColors.content.invertedPrimary,
            platformStyle = PlatformTextStyle(includeFontPadding = true),
        ),
        Body1 =
        Body1(
            Regular =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                letterSpacing = 0.03.em,
                color = defaultColors.content.primary,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
            Italic =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                fontSize = 18.sp,
                letterSpacing = 0.03.em,
                color = defaultColors.content.primary,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
            Medium =
            TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                letterSpacing = 0.03.em,
                color = defaultColors.content.primary,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
        ),
        Body2 =
        Body2(
            Regular =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                letterSpacing = 0.01.em,
                color = defaultColors.content.primary,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
            Italic =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                fontSize = 16.sp,
                letterSpacing = 0.01.em,
                color = defaultColors.content.primary,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
            Bold =
            TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                letterSpacing = 0.01.em,
                color = defaultColors.content.primary,
                fontFamily = FontFamily.SansSerif,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
        ),
        Body3 =
        Body3(
            Regular =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                letterSpacing = 0.02.em,
                color = defaultColors.content.primary,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
            Italic =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Italic,
                fontSize = 14.sp,
                letterSpacing = 0.02.em,
                color = defaultColors.content.primary,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
            Bold =
            TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                letterSpacing = 0.03.em,
                color = defaultColors.content.primary,
                fontFamily = FontFamily.SansSerif,
                platformStyle = PlatformTextStyle(includeFontPadding = true),
            ),
        ),
    )
}

@Immutable
data class Body1(
    val Regular: TextStyle,
    val Italic: TextStyle,
    val Medium: TextStyle,
)

@Immutable
data class Body2(
    val Regular: TextStyle,
    val Italic: TextStyle,
    val Bold: TextStyle,
)

@Immutable
data class Body3(
    val Regular: TextStyle,
    val Italic: TextStyle,
    val Bold: TextStyle,
)