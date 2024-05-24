package me.tbsten.toryumon.hackathon.template.quiz

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.tbsten.toryumon.hackathon.template.components.SelfIntroductionCard
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SkillQuizSection(modifier: Modifier = Modifier) {
    var isCorrectAnswer by remember { mutableStateOf<Boolean?>(null) }

    SelfIntroductionCard(modifier = modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                text = "てべすてんのスキルクイズ",
                fontSize = 32.sp,
                lineHeight = 32.sp,
                fontWeight = FontWeight.Bold,
            )
            Text("てべすてんが得意なモバイル領域は？")

            if (isCorrectAnswer == null) {
                // 解答中の場合
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    Button(onClick = { isCorrectAnswer = true }) {
                        Text("Android")
                    }
                    Button(onClick = { isCorrectAnswer = false }) {
                        Text("iOS")
                    }
                    Button(onClick = { isCorrectAnswer = false }) {
                        Text("Flutter")
                    }
                }
            } else if (isCorrectAnswer == true) {
                // 正解の場合
                Text(
                    text = "正解！",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
            } else {
                // 不正解の場合
                Text(
                    text = "不正解...",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "正解はAndroidでした",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@Preview
@Composable
private fun SkillQuizSectionPreview() {
    SelfIntroduceAppTheme {
        SkillQuizSection()
    }
}
