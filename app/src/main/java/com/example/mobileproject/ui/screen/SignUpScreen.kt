package com.example.mobileproject.ui.screen

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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R
import com.example.mobileproject.ui.screen.navigation.NavigationDestination

object SignUpDestination: NavigationDestination {
    override val route = "signup"
    override val title = "Signup"
}
@Composable
fun SignUpPage(modifier: Modifier = Modifier) {
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val confirmPassword = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
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
                onValueChange = { newValue -> password.value = newValue },
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
                onClick = { },
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
}