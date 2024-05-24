package me.tbsten.toryumon.hackathon.template.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.tbsten.toryumon.hackathon.template.components.SelfIntroductionCard
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@Composable
fun DetailSection(
    modifier: Modifier = Modifier,
    title: String,
    items: List<String>,
) {
    SelfIntroductionCard(modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(16.dp)) {
            Text(
                text = title,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                items.forEach { item ->
                    Text(item)
                }
            }
        }
    }
}

@Preview
@Composable
private fun DetailSectionPreview() {
    SelfIntroduceAppTheme {
        DetailSection(
            title = "DetailSection Sample",
            items = listOf(
                "this is detail section sample",
                "this is detail section sample",
                "this is detail section sample",
            ),
        )
    }
}
