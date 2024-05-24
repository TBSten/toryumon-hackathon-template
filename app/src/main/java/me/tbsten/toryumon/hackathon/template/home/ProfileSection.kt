package me.tbsten.toryumon.hackathon.template.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.tbsten.toryumon.hackathon.template.R
import me.tbsten.toryumon.hackathon.template.components.SelfIntroductionCard
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@Composable
fun ProfileSection(modifier: Modifier = Modifier) {
    SelfIntroductionCard(modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.tbsten),
                contentDescription = "てべすてん",
                modifier = Modifier.size(180.dp)
            )
            Text(
                text = "てべすてん",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "ずとまよとドロイドくんが大好きなAndroidエンジニア Lv 1。TBStenとかいて てべすてんと読みます。",
                fontSize = 16.sp,
            )
        }
    }
}

@Preview
@Composable
private fun ProfileSectionPreview() {
    SelfIntroduceAppTheme {
        ProfileSection()
    }
}
