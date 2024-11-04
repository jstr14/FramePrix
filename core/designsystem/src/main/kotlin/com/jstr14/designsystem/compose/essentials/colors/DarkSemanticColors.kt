package com.jstr14.designsystem.compose.essentials.colors


private val darkContent =
    Content(
        accent = FrameColors.TertiaryDark,
        primary = FrameColors.PrimaryDark,
        secondary = FrameColors.SecondaryDark,
        invertedPrimary = FrameColors.InversePrimaryDark,
        positive = FrameColors.Success80,
        negative = FrameColors.ErrorContainerDark,
        negativeStrong = FrameColors.OnErrorDark,
    )

private val darkBackground =
    Background(
        primary = FrameColors.Neutral10,
        secondary = FrameColors.Neutral20,
        invertedPrimary = FrameColors.Neutral99,
        invertedSecondary = FrameColors.Neutral80,
        overlay = FrameColors.Neutral99_15,
        overlayLight = FrameColors.Neutral10_97,
        neutral = FrameColors.Neutral70,
        positive = FrameColors.Success80,
        positiveLight = FrameColors.Success20,
        negative = FrameColors.ErrorContainerDark,
        negativeLight = FrameColors.OnErrorContainerDark,
        negativeMedium = FrameColors.ErrorDark,
        negativeStrong = FrameColors.OnErrorDark,
        accent = FrameColors.TertiaryDark,
        accentLight = FrameColors.TertiaryContainerDark,
        accentAction = FrameColors.Neutral99_50,
        attention = FrameColors.Attention30,
    )

private val darkBorder =
    Border(
        primary = FrameColors.DividerPrimaryDark,
        secondary = FrameColors.DividerSecondaryDark,
        positive = FrameColors.PrimaryContainerDark,
        negative = FrameColors.ErrorContainerDark,
    )

val DarkSemanticColors = SemanticColors(darkContent, darkBackground, darkBorder)
