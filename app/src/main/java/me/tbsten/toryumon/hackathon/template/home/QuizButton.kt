package me.tbsten.toryumon.hackathon.template.home

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@Composable
fun QuizButton(gotoQuizScreen: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        modifier = modifier,
        onClick = gotoQuizScreen,
    ) {
        Text("クイズをしてみる")
    }
}

@Preview
@Composable
private fun QuizButtonPreview() {
    SelfIntroduceAppTheme {
        QuizButton(gotoQuizScreen = {})
    }
}
