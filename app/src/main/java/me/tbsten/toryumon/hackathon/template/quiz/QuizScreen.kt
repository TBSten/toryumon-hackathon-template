package me.tbsten.toryumon.hackathon.template.quiz

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.tbsten.toryumon.hackathon.template.components.SelfIntroductionAppBar
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@Composable
fun QuizScreen() {
    Scaffold(
        topBar = { SelfIntroductionAppBar() }
    ) { paddingValues ->
        Column(
            Modifier
                .padding(paddingValues)
                .padding(vertical = 10.dp, horizontal = 10.dp)
        ) {
            SkillQuizSection()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun QuizScreenPreview() {
    SelfIntroduceAppTheme {
        QuizScreen()
    }
}
