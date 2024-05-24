package me.tbsten.toryumon.hackathon.template

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.tbsten.toryumon.hackathon.template.home.HomeScreen
import me.tbsten.toryumon.hackathon.template.quiz.QuizScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(gotoQuizScreen = { navController.navigate("quiz") })
        }
        composable("quiz") {
            QuizScreen()
        }
    }
}
