package com.example.mobileproject.ui.screen
/*
import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobileproject.R
import com.example.mobileproject.model.viewModel.AppViewModelProvider
import com.example.mobileproject.model.viewModel.SignUpViewModel
import com.example.mobileproject.model.viewModel.UsersDetails
import com.example.mobileproject.ui.screen.navigation.NavigationDestination
import kotlinx.coroutines.launch

object SignUpDestination: NavigationDestination {
    override val route = "signup"
    override val title = "Signup"
}
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SignUpPage(modifier: Modifier = Modifier,
               viewModel: SignUpViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val userUiState = viewModel.userUiState

    /*
    //val coroutineScope = rememberCoroutineScope()
    var uiState = viewModel.studentsUiState
    var detailsState = uiState.studentsDetails
    * */

    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val confirmPassword = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var showToast by remember { mutableStateOf(false) }

    if (showToast) {
        Toast.makeText(context, "User signed up successfully", Toast.LENGTH_SHORT).show()
        showToast = false
    }

    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color.White)
    ) {


        IconButton(
            onClick = {  },
            modifier = Modifier.offset(x=15.dp, y=50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Favorite",
                tint = Color.Black
            )
        }
        Text(
            text = "Sign up for free",
            color = Color(0xff1f1f1f),
            style = TextStyle(
                fontSize = 30.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 25.dp,
                    y = 130.dp
                ))
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 25.dp,
                    y = 453.dp
                )
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 80.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Create password",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    // .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 30.dp))
            OutlinedTextField(
                value = password.value,
                onValueChange = { newValue -> password.value = newValue; viewModel.updateUiState(userUiState.usersDetails.copy(password = newValue)) },
                placeholder = { Text("Enter your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 29.dp
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
                    x = 25.dp,
                    y = 544.dp
                )
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 80.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Repeat password",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 30.dp))
            OutlinedTextField(
                value = confirmPassword.value,
                onValueChange = { newValue -> confirmPassword.value = newValue },
                placeholder = { Text("Repeat your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 29.dp
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
                    x = 25.dp,
                    y = 271.dp
                )
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 80.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "E-mail address",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 30.dp))
            OutlinedTextField(
                value = email.value,
                onValueChange = { newValue -> email.value = newValue },
                placeholder = { Text("Enter your email address") },
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 29.dp
                    )
                    .requiredWidth(width = 355.dp)
                    .requiredHeight(height = 51.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.mailopenoutline),
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
                    x = 24.dp,
                    y = 362.dp
                )
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 80.dp),
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
                onValueChange = { newValue -> username.value = newValue },
                placeholder = { Text("Enter your username") },
                modifier = Modifier
                    // .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 29.dp
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
                    y = 792.dp
                )
                .requiredWidth(width = 356.dp)
                .requiredHeight(height = 54.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Button(
                //onClick = { },
                onClick = {
                    coroutineScope.launch {
//                        viewModel.updateUiState(
//                            UsersDetails(
//                                username = username.value,
//                                email = email.value,
//                                password = password.value
//                            )
//                        )
                        viewModel.registerUserTest()
                       /*viewModel.registerUser { success, message ->
                            if (success) {
                                errorMessage = null
                                // Handle successful registration, e.g., navigate to login screen
                            } else {
                                errorMessage = message
                            }
                        }*/
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
                    text = "Sign up",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        //.align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 0.dp)
                )
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
                    x = 60.00010681152344.dp,
                    y = 647.dp
                )
                .requiredWidth(width = 277.dp)
                .requiredHeight(height = 21.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "If you are already registered Sign in",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    //.align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 10.dp)
                    .clickable { }
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
                    .requiredSize(size = 20.dp)
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun SignUpPagePreview() {
    SignUpPage(Modifier)
}*/

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobileproject.R
import com.example.mobileproject.model.viewModel.AppViewModelProvider
import com.example.mobileproject.model.viewModel.SignUpViewModel
import com.example.mobileproject.ui.screen.navigation.NavigationDestination
import kotlinx.coroutines.launch

object SignUpDestination : NavigationDestination {
    override val route = "signup"
    override val title = "Signup"
}

@Composable
fun SignUpPage(
    modifier: Modifier = Modifier,
    viewModel: SignUpViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val userUiState = viewModel.userUiState

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var showToast by remember { mutableStateOf(false) }

    if (showToast) {
        Toast.makeText(context, "User signed up successfully", Toast.LENGTH_SHORT).show()
        showToast = false
    }

    Box(
        modifier = modifier
            .requiredWidth(430.dp)
            .requiredHeight(932.dp)
            .background(color = Color.White)
    ) {
        IconButton(
            onClick = { /* Handle navigation back */ },
            modifier = Modifier.offset(x = 15.dp, y = 50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Back",
                tint = Color.Black
            )
        }
        Text(
            text = "Sign up for free",
            color = Color(0xff1f1f1f),
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp, y = 130.dp)
        )
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp, y = 453.dp)
                .requiredWidth(355.dp)
                .requiredHeight(80.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Create password",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.offset(x = 0.dp, y = 30.dp)
            )
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                    viewModel.updateUiState(userUiState.usersDetails.copy(password = it))
                },
                placeholder = { Text("Enter your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .offset(x = 0.dp, y = 29.dp)
                    .requiredWidth(355.dp)
                    .requiredHeight(51.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.lockclosedoutline),
                contentDescription = "Lock",
                modifier = Modifier
                    .offset(x = 320.dp, y = 0.dp)
                    .requiredWidth(25.dp)
                    .requiredHeight(25.dp)
            )
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp, y = 544.dp)
                .requiredWidth(355.dp)
                .requiredHeight(80.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Repeat password",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.offset(x = 0.dp, y = 30.dp)
            )
            OutlinedTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                placeholder = { Text("Repeat your password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .offset(x = 0.dp, y = 29.dp)
                    .requiredWidth(355.dp)
                    .requiredHeight(51.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.lockclosedoutline),
                contentDescription = "Lock",
                modifier = Modifier
                    .offset(x = 320.dp, y = 0.dp)
                    .requiredWidth(25.dp)
                    .requiredHeight(25.dp)
            )
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 25.dp, y = 271.dp)
                .requiredWidth(355.dp)
                .requiredHeight(80.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "E-mail address",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.offset(x = 0.dp, y = 30.dp)
            )
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                    viewModel.updateUiState(userUiState.usersDetails.copy(email = it))
                },
                placeholder = { Text("Enter your email address") },
                modifier = Modifier
                    .offset(x = 0.dp, y = 29.dp)
                    .requiredWidth(355.dp)
                    .requiredHeight(51.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.mailopenoutline),
                contentDescription = "Email",
                modifier = Modifier
                    .offset(x = 320.dp, y = 0.dp)
                    .requiredWidth(25.dp)
                    .requiredHeight(25.dp)
            )
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp, y = 362.dp)
                .requiredWidth(355.dp)
                .requiredHeight(80.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Username",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.offset(x = 0.dp, y = 30.dp)
            )
            OutlinedTextField(
                value = username,
                onValueChange = {
                    username = it
                    viewModel.updateUiState(userUiState.usersDetails.copy(username = it))
                },
                placeholder = { Text("Enter your username") },
                modifier = Modifier
                    .offset(x = 0.dp, y = 29.dp)
                    .requiredWidth(355.dp)
                    .requiredHeight(51.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.useroutlinegray),
                contentDescription = "Username",
                modifier = Modifier
                    .offset(x = 320.dp, y = 0.dp)
                    .requiredWidth(25.dp)
                    .requiredHeight(25.dp)
            )
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 37.dp, y = 792.dp)
                .requiredWidth(356.dp)
                .requiredHeight(54.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Button(
                onClick = {
                    coroutineScope.launch {
                        viewModel.registerUser { success, message ->
                            if (success) {
                                errorMessage = null
                                showToast = true
                                // Handle successful registration, e.g., navigate to login screen
                            } else {
                                errorMessage = message
                            }
                        }
                    }
                },
                shape = RoundedCornerShape(36.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
                modifier = Modifier
                    .offset(x = 0.dp, y = 0.dp)
                    .requiredWidth(356.dp)
                    .requiredHeight(54.dp)
            ) {
                Text(
                    text = "Sign up",
                    color = Color.White,
                    style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium),
                    modifier = Modifier.offset(x = 0.dp, y = 0.dp)
                )
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
                .offset(x = 60.dp, y = 644.dp)
                .requiredWidth(287.dp)
                .requiredHeight(21.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Sign up if you don’t have an account",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .offset(x = 50.dp, y = 10.dp)
                    .clickable { /* Handle sign up navigation */ }
            )
            Icon(
                painter = painterResource(id = R.drawable.more_circle),
                contentDescription = "More Circle",
                tint = Color(0xff0373f3),
                modifier = Modifier
                    .offset(x = 20.dp, y = 0.dp)
                    .requiredSize(20.dp)
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun SignUpPagePreview() {
    SignUpPage(Modifier)
}
