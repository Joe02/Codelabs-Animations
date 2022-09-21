package com.example.codelabsanimation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.example.android.codelab.animation.ui.Purple500
import com.example.android.codelab.animation.ui.Purple700
import com.example.android.codelab.animation.ui.Teal200

@Composable
fun AnimationCodelabTheme(content: @Composable () -> Unit) {
    val colors = lightColors(
        primary = Purple500,
        primaryVariant = Purple700,
        secondary = Teal200
    )
    MaterialTheme(
        colors = colors,
        content = content
    )
}
