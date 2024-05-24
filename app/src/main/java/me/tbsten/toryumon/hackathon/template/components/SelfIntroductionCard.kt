package me.tbsten.toryumon.hackathon.template.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SelfIntroductionCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit,
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        content = content,
    )
}

@Preview
@Composable
private fun SelfIntroductionCardPreview() {
    SelfIntroductionCard {
        Column(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
            Text(
                text  = "SelfIntroductionCard Sample",
                style = MaterialTheme.typography.titleMedium,
            )
            Text("this is SelfIntroductionCard sample .")
        }
    }
}
