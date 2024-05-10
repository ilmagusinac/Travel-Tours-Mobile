package com.example.mobileproject.ui.screen

import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R
import com.example.mobileproject.ui.theme.MobileProjectTheme
import androidx.compose.ui.text.TextStyle

@Composable

fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .padding(top = 100.dp, start = 20.dp),
            text = "Your profile",
            color = Color(0xff1f1f1f),
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        )

    }
    Spacer(modifier = Modifier.size(width = 0.dp, height = 10.dp))
    Box{
            Text(
                modifier = Modifier
                    .padding(top = 100.dp, start = 20.dp),
                text = "Sign in",
                color = Color(0xff1f1f1f),
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "",
            modifier = Modifier.size(width = 100.dp, height = 100.dp)
        )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 40.dp))

        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Username",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp)
            )
        }

        Spacer(modifier = Modifier.size(width = 0.dp, height = 5.dp))
        TextField(
            value = "",
            onValueChange = { /* TODO */ },
            label = {
                Text(
                    text = "Enter username ",
                    color = Color(0xffadadad),
                    style = TextStyle(
                        fontSize = 16.sp
                    )
                )
            },
            modifier = Modifier
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 51.dp)
                .clip(shape = RoundedCornerShape(36.dp))
                //.background(Color(0xffffff))
                .border(
                    border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                    shape = RoundedCornerShape(36.dp)
                ),
            isError = false,

            )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        TextField(
            value = "",
            onValueChange = { /* TODO */ },
            label = {
                Text(
                    text = "Enter password",
                    color = Color(0xffadadad),
                    style = TextStyle(
                        fontSize = 16.sp
                    )
                )
            },
            modifier = Modifier
                .requiredWidth(width = 355.dp)
                .requiredHeight(height = 51.dp)
                .clip(shape = RoundedCornerShape(36.dp))
                .background(Color(0xffe9e9e9))
                .border(
                    border = BorderStroke(1.dp, Color(0xffffff)),
                    shape = RoundedCornerShape(36.dp)
                ),
            isError = false,

        )

        Spacer(modifier = Modifier.size(width = 0.dp, height = 5.dp))

        TextButton(
            onClick = { /*TODO*/ },
            //modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Sign up if you don’t have an account")
        }

        Spacer(modifier = Modifier.size(width = 0.dp, height = 20.dp))

        CustomButton(
            onClick = { /*TODO*/  },
            backgroundColor = Color(0xff0373f3) // Your custom color here
        ) {
            Text(
                text = "Log out",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                ),
                color = Color.White // Set text color to white
            )
        }

    }


@Composable
fun CustomButton(
    onClick: () -> Unit,
    backgroundColor: Color,
    content: @Composable () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(horizontal = 125.dp, vertical = 5.dp)
            .background(color = backgroundColor), // Set the background color here
    ) {
        content()
    }
}
@Preview( showBackground = false, uiMode = Configuration.UI_MODE_NIGHT_YES)
@RequiresApi(Build.VERSION_CODES.O) //ŠTA JE OVO?
@Preview( showBackground = true)
@Composable
fun LoginScreenPreview(){
    MobileProjectTheme {
        LoginScreen()
    }
}
