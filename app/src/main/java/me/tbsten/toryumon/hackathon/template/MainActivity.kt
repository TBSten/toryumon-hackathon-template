package me.tbsten.toryumon.hackathon.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import me.tbsten.toryumon.hackathon.template.ui.theme.SelfIntroduceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelfIntroduceAppTheme {
                Surface {
                    AppNavigation()
                }
            }
        }
    }
}
