package com.jstr14.designsystem.compose.essentials.colors

private val lightContent =
    Content(
        accent = FrameColors.TertiaryLight,
        primary = FrameColors.PrimaryLight,
        secondary = FrameColors.SecondaryLight,
        invertedPrimary = FrameColors.InversePrimaryLight,
        positive = FrameColors.Success40,
        negative = FrameColors.OnErrorContainerLight,
        negativeStrong = FrameColors.OnErrorLight,
    )

private val lightBackground =
    Background(
        primary = FrameColors.BackgroundLight,
        secondary = FrameColors.Neutral97,
        invertedPrimary = FrameColors.Neutral10,
        invertedSecondary = FrameColors.Neutral30,
        overlay = FrameColors.Neutral10_50,
        overlayLight = FrameColors.Neutral99_97,
        neutral = FrameColors.Neutral40,
        positive = FrameColors.Success40,
        positiveLight = FrameColors.Success95,
        negative = FrameColors.ErrorLight,
        negativeLight = FrameColors.OnErrorLight,
        negativeMedium = FrameColors.ErrorContainerLight,
        negativeStrong = FrameColors.OnErrorContainerLight,
        accent = FrameColors.TertiaryLight,
        accentLight = FrameColors.TertiaryContainerLight,
        accentAction = FrameColors.Neutral10_50,
        attention = FrameColors.Attention90,
    )

private val lightBorder =
    Border(
        primary = FrameColors.DividerPrimaryLight,
        secondary = FrameColors.DividerSecondaryLight,
        positive = FrameColors.PrimaryContainerLight,
        negative = FrameColors.ErrorContainerLight,
    )

val LightSemanticColors = SemanticColors(lightContent, lightBackground, lightBorder)
