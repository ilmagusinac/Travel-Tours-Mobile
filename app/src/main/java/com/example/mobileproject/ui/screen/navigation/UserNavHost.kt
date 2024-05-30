package com.example.myapplication.ui.screen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.ui.screen.AboutDestination
import com.example.mobileproject.ui.screen.AboutScreen
import com.example.mobileproject.ui.screen.EditProfileDestination
import com.example.mobileproject.ui.screen.EditProfileScreen
import com.example.mobileproject.ui.screen.HomeDestination
import com.example.mobileproject.ui.screen.HomeScreen
import com.example.mobileproject.ui.screen.ProfileDestination
import com.example.mobileproject.ui.screen.ProfileScreen
import com.example.mobileproject.ui.screen.SignInDestination
import com.example.mobileproject.ui.screen.SignInPage
import com.example.mobileproject.ui.screen.SignUpDestination
import com.example.mobileproject.ui.screen.SignUpPage
import com.example.mobileproject.ui.screen.SplashDestination
import com.example.mobileproject.ui.screen.SplashScreen
import com.example.mobileproject.ui.screen.TourViewDestination
import com.example.mobileproject.ui.screen.ToursDestination
import com.example.mobileproject.ui.screen.ToursScreen
import com.example.mobileproject.ui.screen.ToursViewScreen

@Composable
fun UserNavHost(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = SignInDestination.route){
        composable(route = SignInDestination.route){
            SignInPage(
                navigateToSignUpPage ={ navController.navigate("${SignUpDestination.route}")},
                navigateToHomePage ={ navController.navigate("${HomeDestination.route}")},
                navigateToSplashPage ={ navController.navigate("${SplashDestination.route}")}
            )}
        composable(route = SignUpDestination.route){
            SignUpPage(
                navigateToSignInPage ={ navController.navigate("${SignInDestination.route}")}
            )}
        composable(route = SplashDestination.route){
            SplashScreen(
                navigateToSignInPage ={ navController.navigate("${SignInDestination.route}")}
            ) }
        composable(route = HomeDestination.route) {
            HomeScreen(
                navigateToToursPage = { navController.navigate("${ToursDestination.route}") },
                navigateToAboutUsPage = { navController.navigate("${AboutDestination.route}") },
                navigateToProfilePage = { navController.navigate("${ProfileDestination.route}") }
            )
        }
        composable(route = AboutDestination.route) {
            AboutScreen(
                navigateToToursPage = { navController.navigate("${ToursDestination.route}") },
                navigateToHomePage = { navController.navigate("${HomeDestination.route}") },
                navigateToProfilePage = { navController.navigate("${ProfileDestination.route}") }
            )
        }
        composable(
            route = "${EditProfileDestination.route}/{userId}",
            arguments = listOf(navArgument("userId") { type = NavType.IntType })
        ) { navBackStackEntry ->
            val userId = navBackStackEntry.arguments?.getInt("userId") ?: return@composable
            EditProfileScreen(
                userId = userId,
                navigateToToursPage = { navController.navigate("${ToursDestination.route}") },
                navigateToHomePage = { navController.navigate("${HomeDestination.route}") },
                navigateToAboutUsPage = { navController.navigate("${AboutDestination.route}") },
                navigateToProfilePage = { navController.navigate("${ProfileDestination.route}") }
            )
        }
        composable(route = ProfileDestination.route) {
            ProfileScreen(
                navigateToToursPage = { navController.navigate("${ToursDestination.route}") },
                navigateToHomePage = { navController.navigate("${HomeDestination.route}") },
                navigateToAboutUsPage = { navController.navigate("${AboutDestination.route}")},
                onLogout = {},
                userId = 1
            )
        }
        composable(route = ToursDestination.route) {
            ToursScreen(
                navigateToProfilePage = { navController.navigate("${ProfileDestination.route}") },
                navigateToHomePage = { navController.navigate("${HomeDestination.route}") },
                navigateToAboutUsPage = { navController.navigate("${AboutDestination.route}") }
            )
        }
        /*composable(
            route = TourViewDestination.route,
            arguments = listOf(navArgument("tourId") { type = NavType.StringType })
        ) { navBackStackEntry ->
            val tourId = navBackStackEntry.arguments?.getString("tourId") ?: return@composable
            ToursViewScreen(
                tourId = tourId,
                navigateToProfilePage = { navController.navigate(ProfileDestination.route) },
                navigateToHomePage = { navController.navigate(HomeDestination.route) },
                navigateToAboutUsPage = { navController.navigate(AboutDestination.route) }
            )
            CustomNavigationBar(
                currentScreen = Screen.Home,
                navigateToHomePage = { navController.navigate(HomeDestination.route) },
                navigateToToursPage = { navController.navigate(ToursDestination.route) },
                navigateToAboutUsPage = { navController.navigate(AboutDestination.route) },
                navigateToProfilePage = { navController.navigate(ProfileDestination.route) }
            )
        }*/


    }
}