package com.example.mobileproject.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R
import com.example.mobileproject.ui.theme.MobileProjectTheme
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen

import com.example.mobileproject.ui.screen.navigation.NavigationDestination

object EditProfileDestination: NavigationDestination {
    override val route = "edit"
    override val title = "Edit"
}
@Composable
fun EditProfileScreen(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("")}
    var text2 by remember { mutableStateOf("")}

//dialog popup //
    Box( //NAVIGATION BOX
        modifier = modifier
            //.requiredWidth(width = 430.dp)
            .fillMaxWidth()
            //.requiredHeight(height = 932.dp)

            .background(color = Color(0xfff6f6f6))
    ) {

        //CustomNavigationBar(currentScreen = Screen.Profile)

        Box( //YOUR PROFILE BOX
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 30.dp,
                    y = 90.dp
                )
        ){
            Box(
                modifier = modifier
                    //.requiredWidth(width = 95.dp)
                    .requiredHeight(height = 24.dp)
            ) {
                Text(
                    text = "Edit Your Profile",
                    color = Color(0xff818181),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }


        Box( //PROFILE PICTURE
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 272.dp,
                    y = 125.dp
                )
                .requiredSize(size = 100.dp)
                .clip(shape = CircleShape)
                .background(color = Color(0xff0373f3))
        )
        Image(
            painter = painterResource(id = R.drawable.useroutline),
            contentDescription = "UserOutline",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 295.dp,
                    y = 148.dp
                )
                .requiredSize(size = 54.dp)
        )

        Column(
            modifier = Modifier
                .padding(start = 32.dp, top = 300.dp)
        ) {
            Text(
                text = "Enter new e-mail address",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp)
            )
            Box(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .requiredWidth(width = 355.dp)
                    .requiredHeight(height = 51.dp)
                    .clip(shape = RoundedCornerShape(36.dp))
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                        shape = RoundedCornerShape(36.dp)
                    )
            ) {
                TextField(
                    value = text,
                    onValueChange = { text = it },
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
                        .size(22.dp)
                )
            }

            Text(
                text = "Enter new username",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(top = 61.dp)
            )

            Box(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .requiredWidth(width = 355.dp)
                    .requiredHeight(height = 51.dp)
                    .clip(shape = RoundedCornerShape(36.dp))
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                        shape = RoundedCornerShape(36.dp)
                    )
            ) {
                TextField(
                    value = text2,
                    onValueChange = { text2 = it },
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
                    contentDescription = "Group 116",
                    modifier = Modifier
                        .padding(start = 19.dp, top = 15.dp)
                        .size(22.dp)
                )
            }

            Button(
                onClick = { },
                shape = RoundedCornerShape(36.dp),
                //colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff0373f3)),
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
        CustomNavigationBar(currentScreen = Screen.Profile)
    }
}



@Preview(widthDp = 430, heightDp = 932)
@Composable
fun EditProfileScreenPreview(){
    MobileProjectTheme {
        EditProfileScreen(Modifier)
    }
}