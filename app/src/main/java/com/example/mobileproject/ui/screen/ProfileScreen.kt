package com.example.mobileproject.ui.screen

import androidx.compose.runtime.Composable


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
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar


@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
        Box(
            modifier = modifier
                .requiredWidth(width = 430.dp)
                .requiredHeight(height = 932.dp)
                .background(color = Color(0xfff6f6f6))
        ) {
            NavigationBar(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 825.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 430.dp)
                        .requiredHeight(height = 107.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 430.dp)
                            .requiredHeight(height = 107.dp)
                            .clip(shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                            .background(color = Color.White))

                    /*
                    IconButton( //HOME
                        onClick = { },
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 38.dp,
                                y = 23.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .requiredSize(size = 30.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.homeoutline),
                                contentDescription = "Vector",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .border(border = BorderStroke(1.5.dp, Color(0xffbcbcbc)))
                            )
                            Text(
                                text = "Home",
                                color = Color(0xff0373f3),
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium),
                                modifier = Modifier
                                    .align(alignment = Alignment.BottomCenter)
                                    .offset(y = 4.dp) // Adjusted offset
                                /*
                                modifier = Modifier
                                    .align(alignment = Alignment.TopStart)
                                    .offset(x = 30.dp,
                                        y = 57.dp)
                                    .requiredWidth(width = 45.dp)
                                    .requiredHeight(height = 22.dp)*/
                                    )

                        }
                    }

                     */

        IconButton( //HOME
            onClick = { },

            modifier = Modifier
                .size(90.dp)
                .align(alignment = Alignment.TopStart)
                .offset(x = 10.dp, y = 8.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier.requiredSize(size = 30.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.homeoutline),
                        contentDescription = "Vector",
                        tint = Color(0xffbcbcbc), // Set the color of the Icon
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Text(
                    text = "Home",
                    color = Color(0xffbcbcbc),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                )
            }
        }



        IconButton( //PROFILE
            onClick = { },
            modifier = Modifier
                .size(90.dp)
                .align(alignment = Alignment.TopStart)
                .offset(x = 320.dp, y = 10.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier.requiredSize(size = 30.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.usercircleoutline),
                        contentDescription = "Vector",
                        tint = Color(0xff0373f3), // Set the color of the Icon
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Text(
                    text = "Profile",
                    color = Color(0xff0373f3),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                )
            }
        }
                    /*
                    Text(
                        text = "Tours",
                        color = Color(0xffbcbcbc),
                        style = TextStyle(
                            fontSize = 14.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 135.dp,
                                y = 57.dp)
                            .requiredWidth(width = 40.dp)
                            .requiredHeight(height = 22.dp))

                     */
                    Text(
                        text = "About",
                        color = Color(0xffbcbcbc),
                        style = TextStyle(
                            fontSize = 14.sp),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 239.dp,
                                y = 57.dp)
                            .requiredWidth(width = 45.dp)
                            .requiredHeight(height = 22.dp))
/*
                    Text(
                        text = "Profile",
                        color = Color(0xff0373f3),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 345.dp,
                                y = 57.dp)
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 22.dp))*/

        IconButton( //TOURS
            onClick = { },
            modifier = Modifier
                .size(90.dp)
                .align(alignment = Alignment.TopStart)
                .offset(x = 140.dp,
                    y = 23.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .requiredSize(size = 30.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.calendaroutline),
                        contentDescription = "Vector",
                        modifier = Modifier
                            .fillMaxSize()
                            .border(border = BorderStroke(1.5.dp, Color(0xffbcbcbc)))
                    )
                }
                Text(
                    text = "Profile",
                    color = Color(0xff0373f3),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                )
            }
        }
                    IconButton( //ABOUT
                        onClick = { },
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 247.dp,
                                y = 23.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .requiredSize(size = 30.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.mailopenoutline),
                                contentDescription = "Vector",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .border(border = BorderStroke(1.5.dp, Color(0xffbcbcbc))))
                        }
                    }
                }
            }
            HomePage(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp,
                        y = 90.dp))

            //LOGOUT
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 167.dp, y = 775.dp)
                    .requiredWidth(97.dp)
                    .requiredHeight(26.dp)
                    .clickable { /* Handle button click here */ }
                    .background(color = Color.Transparent)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.logout_profile),
                        contentDescription = "Group 173",
                        tint = Color(0xff0373f3),
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Log Out",
                        color = Color(0xff0373f3),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
            //END OF LOGOUT


            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 31.dp,
                        y = 283.dp)
                    .requiredWidth(width = 355.dp)
                    .requiredHeight(height = 51.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 355.dp)
                        .requiredHeight(height = 51.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color.White)
                        .border(border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                            shape = RoundedCornerShape(36.dp)))
                Icon(
                    painter = painterResource(id = R.drawable.email_username),
                    contentDescription = "Group 28",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 19.dp,
                            y = 15.dp)
                        .requiredSize(size = 22.dp))
                Text(
                    text = "ilma.gusinac@stu.ibu.edu.ba",
                    color = Color(0xffadadad),
                    style = TextStyle(
                        fontSize = 16.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 58.dp,
                            y = 15.dp))
            }
            Text(
                text = "E-mail address",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp,
                        y = 254.dp))
            Text(
                text = "Booked Tours",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp,
                        y = 496.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp,
                        y = 374.dp)
                    .requiredWidth(width = 355.dp)
                    .requiredHeight(height = 51.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 355.dp)
                        .requiredHeight(height = 51.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color.White)
                        .border(border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                            shape = RoundedCornerShape(36.dp)))
                Text(
                    text = "ilmagusinac",
                    color = Color(0xffadadad),
                    style = TextStyle(
                        fontSize = 16.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 55.dp,
                            y = 15.dp))
                Icon(
                    painter = painterResource(id = R.drawable.email_username),
                    contentDescription = "Group 116",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 19.dp,
                            y = 15.dp)
                        .requiredSize(size = 22.dp))
            }
            Text(
                text = "Username",
                color = Color(0xffadadad),
                style = TextStyle(
                    fontSize = 14.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 31.dp,
                        y = 345.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp,
                        y = 539.dp)
                    .requiredWidth(width = 368.dp)
                    .requiredHeight(height = 54.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 368.dp)
                        .requiredHeight(height = 54.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color.White)
                        .border(border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                            shape = RoundedCornerShape(36.dp)))
                Text(
                    text = "Nordic Cottage",
                    color = Color(0xffadadad),
                    style = TextStyle(
                        fontSize = 14.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 131.dp,
                            y = 17.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))

                //CANCEL BUTTON 1
                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .offset(x = 260.dp, y = 11.dp)
                        //.requiredWidth(width = 85.dp)
                        .requiredHeight(height = 32.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .wrapContentHeight(align = Alignment.CenterVertically),
                    colors = ButtonDefaults.buttonColors(containerColor = Color((0xff0373f3)))
                ) {
                    Text(
                        text = "Cancel",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                //CANCEL BUTTON END

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.dp,
                            y = 5.dp)
                        .requiredWidth(width = 99.dp)
                        .requiredHeight(height = 44.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color(0xffc4c4c4)))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp,
                        y = 615.dp)
                    .requiredWidth(width = 368.dp)
                    .requiredHeight(height = 54.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 368.dp)
                        .requiredHeight(height = 54.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color.White)
                        .border(border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                            shape = RoundedCornerShape(36.dp)))

                //CANCEL BUTTON 2
                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .offset(x = 260.dp, y = 11.dp)
                        //.requiredWidth(width = 85.dp)
                        .requiredHeight(height = 32.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .wrapContentHeight(align = Alignment.CenterVertically),
                    colors = ButtonDefaults.buttonColors(containerColor = Color((0xff0373f3)))
                ) {
                    Text(
                        text = "Cancel",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                //CANCEL BUTTON END

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.dp,
                            y = 5.dp)
                        .requiredWidth(width = 99.dp)
                        .requiredHeight(height = 44.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color(0xffc4c4c4)))
                Text(
                    text = "Nordic Cottage",
                    color = Color(0xffadadad),
                    style = TextStyle(
                        fontSize = 14.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 130.dp,
                            y = 18.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 30.dp,
                        y = 694.dp)
                    .requiredWidth(width = 368.dp)
                    .requiredHeight(height = 54.dp)
            ) {

                Box(
                    modifier = Modifier
                        .requiredWidth(width = 368.dp)
                        .requiredHeight(height = 54.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color.White)
                        .border(border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                            shape = RoundedCornerShape(36.dp))
                )
                //BUTTON CANCEL 3
                Button(
                    onClick = { /* Handle button click here */ },
                    modifier = Modifier
                        .offset(x = 260.dp, y = 11.dp)
                        //.requiredWidth(width = 85.dp)
                        .requiredHeight(height = 32.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .wrapContentHeight(align = Alignment.CenterVertically),
                    colors = ButtonDefaults.buttonColors(containerColor = Color((0xff0373f3)))
                ) {
                    Text(
                        text = "Cancel",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                //Button cancel
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 5.dp,
                            y = 5.dp)
                        .requiredWidth(width = 99.dp)
                        .requiredHeight(height = 44.dp)
                        .clip(shape = RoundedCornerShape(36.dp))
                        .background(color = Color(0xffc4c4c4)))
                Text(
                    text = "Nordic Cottage",
                    color = Color(0xffadadad),
                    style = TextStyle(
                        fontSize = 14.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 130.dp,
                            y = 17.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            //EDIT PROFILE BUTTON
            Button(
                onClick = { },
                shape = RoundedCornerShape(36.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 260.dp,
                        y = 450.dp)
                    //.requiredWidth(width = 120.dp)
                    //.requiredHeight(height = 32.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            ){
                    Text(
                        text = "Edit Profile",
                        color = Color(0xffffffff),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
            }
            //END OF EDIT PROFILE BUTTON


            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 272.dp,
                        y = 125.dp)
                    .requiredSize(size = 100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff0373f3)))
            Image(
                painter = painterResource(id = R.drawable.useroutline),
                contentDescription = "UserOutline",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 295.dp,
                        y = 148.dp)
                    .requiredSize(size = 54.dp))
        }
    }

    @Composable
    fun HomePage(modifier: Modifier = Modifier) {
        Box(
            modifier = modifier
                .requiredWidth(width = 95.dp)
                .requiredHeight(height = 24.dp)
        ) {
            Text(
                text = "Your Profile",
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
@Preview(widthDp = 430, heightDp = 932)
@Composable
fun ProfileScreenPreview(){
    MobileProjectTheme {
        ProfileScreen(Modifier)
    }
}