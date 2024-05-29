package com.example.mobileproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileproject.ui.theme.MobileProjectTheme

import com.example.mobileproject.ui.screen.ProfileScreen
import com.example.mobileproject.ui.screen.ToursScreen

import com.example.mobileproject.ui.screen.HomeScreen
import com.example.mobileproject.ui.screen.AboutScreen

import com.example.mobileproject.ui.screen.EditProfileScreen
import com.example.mobileproject.ui.screen.SignInPage
//<<<<<<< HEAD
import com.example.mobileproject.ui.screen.ToursViewScreen
//=======
import com.example.mobileproject.ui.screen.SignUpPage
//>>>>>>> 74c9813f15ebcae84c508ae4133f7116fb8653aa

/*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    //LoginScreen()
                    //ProfileScreen()
//<<<<<<< HEAD
                    //ToursViewScreen("tourView")
                    //AboutScreen()
                    //ProfileScreen()
                    //EditProfileScreen()
                    //ToursScreen()
                    //HomeScreen()
//=======
                    //HomeScreen()
                    //AboutScreen()
                    //ProfileScreen()
                    //EditProfileScreen()
                    //ToursScreen()
                    SignUpPage()
//>>>>>>> 74c9813f15ebcae84c508ae4133f7116fb8653aa


                }
            }
        }
    }
}
*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //LoginScreen()
                    //RegistrationScreen(this)
                    //ProfileScreen()
                    //HomeScreen()
                    //StudentNavHost(navController = rememberNavController())
                    //SignUpPage()
                    //SignInPage()
                    EditProfileScreen(userId = 4)
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MobileProjectTheme {
        Greeting("Android")
    }
}