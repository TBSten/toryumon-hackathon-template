package me.tbsten.toryumon.hackathon.template.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LightColorScheme = lightColorScheme(
    primary = Color(0xFFC9E8EA),
    onPrimary = Color(0xFF000000),
    secondary = Color(0xFF3F4B7F),
    onSecondary = Color(0xFFFFFFFF),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF000000),
    background = Color(0xFFEEEEEE),
)

val DarkColorScheme = LightColorScheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ColorSchemePreviewContent() {
    val colors = with(MaterialTheme.colorScheme) {
        mapOf(
            "primary" to (primary to onPrimary),
            "secondary" to (secondary to onSecondary),
            "surface" to (surface to onSurface),
            "background" to (background to onBackground),
        )
    }

    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        colors.forEach { (colorName, colors) ->
            val (bgColor, textColor) = colors
            Box(
                modifier = Modifier
                    .background(bgColor)
                    .size(100.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(colorName, color = textColor)
            }
        }
    }
}

@Preview
@Composable
private fun LightColorSchemePreview() {
    MaterialTheme(colorScheme = LightColorScheme) {
        ColorSchemePreviewContent()
    }
}

@Preview
@Composable
private fun DarkColorSchemePreview() {
    MaterialTheme(colorScheme = DarkColorScheme) {
        ColorSchemePreviewContent()
    }
}
