package me.tbsten.toryumon.hackathon.template.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.tbsten.toryumon.hackathon.template.components.SelfIntroductionAppBar
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@Composable
fun HomeScreen(
    gotoQuizScreen: () -> Unit,
) {
    Scaffold(
        topBar = { SelfIntroductionAppBar() },
    ) { paddingValues ->
        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(40.dp),
        ) {
            ProfileSection()

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                QuizButton(gotoQuizScreen = gotoQuizScreen, modifier = Modifier.weight(1f))
                XButton(xUrl = "https://twitter.com/tbs__ten", modifier = Modifier.weight(1f))
            }

            DetailSection(
                title = "スキル",
                items =
                listOf(
                    "Android",
                    "React/Nextjs",
                ),
            )

            DetailSection(
                title = "好きなもの",
                items =
                listOf(
                    "ずっと真夜中でいいのに。",
                    "ヒトカラ",
                    "Final Fantasy",
                ),
            )
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    SelfIntroduceAppTheme {
        HomeScreen(
            gotoQuizScreen = {},
        )
    }
}
