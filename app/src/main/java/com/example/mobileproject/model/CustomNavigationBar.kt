package com.example.mobileproject.model

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.mobileproject.ui.screen.HomeScreen
import com.example.mobileproject.ui.screen.navigation.NavigationDestination
import com.example.mobileproject.ui.theme.MobileProjectTheme


enum class Screen {
    Home, Tours, About, Profile
}

@Composable
fun CustomNavigationBar(modifier: Modifier = Modifier, currentScreen: Screen,
                        navigateToHomePage: ()-> Unit ={},
                        navigateToToursPage: ()-> Unit ={},
                        navigateToAboutUsPage: ()-> Unit ={},
                        navigateToProfilePage: ()-> Unit ={}) {

    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        NavigationBar(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 0.dp,
                    y = 820.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(height = 107.dp)
                   // .clip(shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                    .background(color = Color.White)
            ) {

                IconButton( //HOME BUTTON
                    onClick = { navigateToHomePage },

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
                                tint = if (currentScreen == Screen.Home) Color(0xff0373f3) else Color(0xffbcbcbc),
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "Home",
                            color = if (currentScreen == Screen.Home) Color(0xff0373f3) else Color(0xffbcbcbc),
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }

                IconButton( //TOURS BUTTON
                    onClick = { navigateToToursPage },
                    modifier = Modifier
                        .size(90.dp)
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 110.dp,
                            y = 8.dp
                        )
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
                                tint = if (currentScreen == Screen.Tours) Color(0xff0373f3) else Color(0xffbcbcbc),
                                modifier = Modifier
                                    .fillMaxSize()
                                //.border(border = BorderStroke(1.5.dp, Color(0xffbcbcbc)))
                            )
                        }
                        Text(
                            text = "Tours",
                            color = if (currentScreen == Screen.Tours) Color(0xff0373f3) else Color(0xffbcbcbc),
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }

                IconButton( //ABOUT BUTTON
                    onClick = { navigateToAboutUsPage },
                    modifier = Modifier
                        .size(90.dp)
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 220.dp,
                            y = 8.dp
                        )
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
                                painter = painterResource(id = R.drawable.mailopenoutline),
                                contentDescription = "Vector",
                                tint = if (currentScreen == Screen.About) Color(0xff0373f3) else Color(0xffbcbcbc),
                                modifier = Modifier
                                    .fillMaxSize()
                                //.border(border = BorderStroke(1.5.dp, Color(0xffbcbcbc)))
                            )
                        }
                        Text(
                            text = "About",
                            color = if (currentScreen == Screen.About) Color(0xff0373f3) else Color(0xffbcbcbc),
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }

                IconButton( //PROFILE BUTTON
                    onClick = { navigateToProfilePage },
                    modifier = Modifier
                        .size(90.dp)
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 320.dp, y = 8.dp)
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
                                tint = if (currentScreen == Screen.Profile) Color(0xff0373f3) else Color(0xffbcbcbc),
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "Profile",
                            color = if (currentScreen == Screen.Profile) Color(0xff0373f3) else Color(0xffbcbcbc),
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    MobileProjectTheme {
        CustomNavigationBar(currentScreen = Screen.Home)
    }
}