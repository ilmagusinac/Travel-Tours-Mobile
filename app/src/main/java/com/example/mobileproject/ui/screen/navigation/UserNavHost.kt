package com.example.mobileproject.ui.screen.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mobileproject.ui.screen.SplashDestination
/*import com.example.myapplication.ui.screen.LoginScreen
import com.example.myapplication.ui.screen.LoginScreenWithTopBar
import com.example.myapplication.ui.screen.ProfileDestination
import com.example.myapplication.ui.screen.ProfileScreen
import com.example.myapplication.ui.screen.ProfileScreenWithTopBar
import com.example.myapplication.ui.screen.RegistrationDestination
import com.example.myapplication.ui.screen.RegistrationScreen
import com.example.myapplication.ui.screen.RegistrationScreenWithTopBar*/

@Composable
fun UserNavHost(
    navController: NavHostController
){
    /*
    NavHost(navController = navController, startDestination = ){
    }

     */

    NavHost(navController = navController, startDestination = SplashDestination.route){
        composable(route = SplashDestination.route){
            /*
            LoginScreenWithTopBar(
                navigateToRegister ={ navController.navigate("${RegistrationDestination.route}") },
                navigateToProfilePage = { navController.navigate("${ProfileDestination.route}/${it}") }
            )*/
        }




        /*
        composable(route = RegistrationDestination.route){
            RegistrationScreenWithTopBar(
                context = navController.context,
                navigateToLogin ={ navController.navigate("${LoginDestination.route}") },
                navigateToProfilePage = { navController.navigate("${ProfileDestination.route}/${it}") }
            )
        }*/
        /*
        composable(
            route = ProfileDestination.routeWithArgs,
            arguments = listOf(navArgument(ProfileDestination.studentIdArg) {
                type = NavType.IntType })
        ) {
            ProfileScreenWithTopBar(navigateBack = { navController.navigateUp() } )
        }*/
    }
}