package me.tbsten.toryumon.hackathon.template.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelfIntroductionAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = { Text("てべすてんのアプリ") },
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            scrolledContainerColor = MaterialTheme.colorScheme.primary,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
        ),
    )
}

@Preview
@Composable
private fun SelfIntroductionAppBarPreview() {
    SelfIntroduceAppTheme {
        SelfIntroductionAppBar()
    }
}
