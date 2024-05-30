package com.example.mobileproject.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobileproject.R
import com.example.mobileproject.ui.screen.navigation.NavigationDestination
import kotlinx.coroutines.launch
import android.widget.Toast
import androidx.compose.material3.TextButton
import androidx.compose.ui.platform.LocalContext
import com.example.mobileproject.model.viewModel.AppViewModelProvider
import com.example.mobileproject.model.viewModel.SignInViewModel

object SignInDestination: NavigationDestination {
    override val route = "signin"
    override val title = "Signin"
}
@Composable
fun SignInPage(modifier: Modifier = Modifier,
               navigateToSignUpPage: () -> Unit={},
               navigateToHomePage: () -> Unit={},
               navigateToSplashPage: ()-> Unit = {},
               viewModel: SignInViewModel = viewModel(factory = AppViewModelProvider.Factory))
{
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val userUiState = viewModel.userUiState


    val password = remember { mutableStateOf("") }
    val username = remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var showToast by remember { mutableStateOf(false) }

    if (showToast) {
        Toast.makeText(context, "You have successfully logged in", Toast.LENGTH_SHORT).show()
        showToast = false
    }

    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color.White)
    ) {

        IconButton(
            onClick = { navigateToSplashPage },
            modifier = Modifier.offset(x=15.dp, y=50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Favorite",
                tint = Color.Black
            )
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 24.dp,
                    y = 534.dp
                )
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 82.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Password",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 30.dp))
            OutlinedTextField(
                value = password.value,
                onValueChange = { newValue -> password.value = newValue
                    viewModel.updatePassword(newValue)},
                placeholder = { Text("Enter your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 31.dp
                    )
                    .requiredWidth(width = 355.dp)
                    .requiredHeight(height = 51.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.lockclosedoutline),
                contentDescription = "Lock",
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 320.dp,
                        y = 0.dp
                    )
                    .requiredWidth(width = 25.dp)
                    .requiredHeight(height = 25.dp))
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 24.dp,
                    y = 435.dp
                )
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 82.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Username",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 30.dp))
            OutlinedTextField(
                value = username.value,
                onValueChange = { newValue -> username.value = newValue
                    viewModel.updateUsername(newValue)},
                placeholder = { Text("Enter your username") },
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 31.dp
                    )
                    .requiredWidth(width = 355.dp)
                    .requiredHeight(height = 51.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.useroutlinegray),
                contentDescription = "Message",
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 320.dp,
                        y = 0.dp
                    )
                    .requiredWidth(width = 25.dp)
                    .requiredHeight(height = 25.dp))
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 37.dp,
                    y = 794.dp
                )
                .requiredWidth(width = 356.dp)
                .requiredHeight(height = 54.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Button(
                onClick = {

                    coroutineScope.launch {
                        viewModel.signInUser { success, message ->
                            if (success) {
                                errorMessage = null
                                showToast = true
                                navigateToHomePage()
                            } else {
                                errorMessage = message
                            }
                        }
                    }
                },
                shape = RoundedCornerShape(36.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
                modifier = Modifier
                    //.align(alignment = Alignment.TopCenter)
                    .offset(
                        x = 0.dp,
                        y = 0.dp
                    )
                    .requiredWidth(width = 356.dp)
                    .requiredHeight(height = 54.dp))
            {
                Text(
                text = "Sign in",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    //.align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 0.dp))
            }

        }
        errorMessage?.let {
            Text(
                text = it,
                color = Color.Red,
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .offset(y = 50.dp)
            )
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 60.dp,
                    y = 644.dp
                )
                .requiredWidth(width = 287.dp)
                .requiredHeight(height = 21.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Sign up if you don’t have an account",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 10.dp)
                    .clickable { navigateToSignUpPage() }
            )
            Icon(
                painter = painterResource(id = R.drawable.more_circle),
                contentDescription = "More Circle",
                tint = Color(0xff0373f3),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 20.dp,
                        y = 0.dp
                    )
                    .requiredSize(size = 20.dp))

        }
        Text(
            text = "Sign in",
            color = Color(0xff1f1f1f),
            style = TextStyle(
                fontSize = 30.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 25.dp,
                    y = 130.dp
                ))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Rectangle 589",
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(
                    x = 0.dp,
                    y = 195.dp
                )
                .requiredSize(size = 220.dp))
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun SignInPagePreview() {
    SignInPage(Modifier)
}
