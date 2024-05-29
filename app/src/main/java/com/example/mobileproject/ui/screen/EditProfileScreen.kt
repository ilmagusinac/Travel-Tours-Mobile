package com.example.mobileproject.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobileproject.R
import com.example.mobileproject.ui.theme.MobileProjectTheme
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.model.viewModel.AppViewModelProvider
import com.example.mobileproject.model.viewModel.EditProfileViewModel
import com.example.mobileproject.ui.screen.navigation.NavigationDestination
import kotlinx.coroutines.launch
import android.widget.Toast

object EditProfileDestination : NavigationDestination {
    override val route = "edit"
    override val title = "Edit"
}

@Composable
fun EditProfileScreen(modifier: Modifier = Modifier,
        userId: Int,
        viewModel: EditProfileViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val userUiState by viewModel::userUiState

    var errorMessage by remember { mutableStateOf<String?>(null) }
    var showToast by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        viewModel.fetchUserData(userId)
    }

    if (showToast) {
        Toast.makeText(context, "You have edited your profile successfully", Toast.LENGTH_SHORT).show()
        showToast = false
    }

    var text by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .requiredWidth(430.dp)
            .requiredHeight(932.dp)
            .background(color = Color(0xfff6f6f6))
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Edit Your Profile Text
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.Start)
                    .offset(x = 30.dp, y = 70.dp)
            ) {
                Text(
                    text = "Edit Your Profile",
                    color = Color(0xff818181),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                )
            }

            // Profile Picture
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.Start)
                    .offset(x = 272.dp, y = 125.dp)
                    .requiredSize(100.dp)
                    .clip(CircleShape)
                    .background(Color(0xff0373f3))
            )

            Image(
                painter = painterResource(id = R.drawable.useroutline),
                contentDescription = "UserOutline",
                modifier = Modifier
                    .align(alignment = Alignment.Start)
                    .offset(x = 295.dp, y = 55.dp)
                    .requiredSize(54.dp)
            )

            // Input Fields
            Column(
                modifier = Modifier
                    .padding(start = 32.dp, top = 180.dp)
            ) {
                // Email Input
                Text(
                    text = "Enter new e-mail address",
                    color = Color(0xffadadad),
                    style = TextStyle(fontSize = 14.sp)
                )
                Box(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .requiredWidth(355.dp)
                        .requiredHeight(51.dp)
                        .clip(RoundedCornerShape(36.dp))
                        .background(Color.White)
                        .border(BorderStroke(1.dp, Color(0xffe9e9e9)), RoundedCornerShape(36.dp))
                ) {
                    TextField(
                        value = userUiState.usersDetails.email,
                        onValueChange = { viewModel.updateEmail(it)  },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            errorContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 55.dp)
                            .background(Color.Transparent)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.email_username),
                        contentDescription = "Email",
                        modifier = Modifier
                            .padding(start = 19.dp, top = 15.dp)
                            .requiredSize(22.dp)
                    )
                }

                // Username Input
                Text(
                    text = "Enter new username",
                    color = Color(0xffadadad),
                    style = TextStyle(fontSize = 14.sp),
                    modifier = Modifier.padding(top = 61.dp)
                )

                Box(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .requiredWidth(355.dp)
                        .requiredHeight(51.dp)
                        .clip(RoundedCornerShape(36.dp))
                        .background(Color.White)
                        .border(BorderStroke(1.dp, Color(0xffe9e9e9)), RoundedCornerShape(36.dp))
                ) {
                    TextField(
                        value = userUiState.usersDetails.username,
                        onValueChange = { viewModel.updateUsername(it) },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            errorContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 55.dp)
                            .background(Color.Transparent)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.email_username),
                        contentDescription = "Username",
                        modifier = Modifier
                            .padding(start = 19.dp, top = 15.dp)
                            .requiredSize(22.dp)
                    )
                }

                Button(
                    onClick = {
                        coroutineScope.launch {
                            viewModel.saveChanges { success, message ->
                                if (success) {
                                    errorMessage = null
                                    showToast = true
                                    // Handle successful save, e.g., navigate to profile screen
                                } else {
                                    errorMessage = message
                                }
                            }
                        }
                    },
                    shape = RoundedCornerShape(36.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
                    modifier = Modifier
                        .padding(top = 61.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = "Save Changes",
                        color = Color.White,
                        style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)
                    )
                }
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

        CustomNavigationBar(currentScreen = Screen.Profile)
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
fun EditProfileScreenPreview() {
    MobileProjectTheme {
        EditProfileScreen(userId = 1)
    }
}
