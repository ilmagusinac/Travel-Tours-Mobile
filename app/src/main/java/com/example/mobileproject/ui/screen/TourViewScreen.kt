package com.example.mobileproject.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R
import com.example.mobileproject.ui.theme.MobileProjectTheme

@Composable
fun ToursViewScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color(0xfff6f6f6))
    ) {

        // Image placed as a background
        Image(
            painter = painterResource(id = R.drawable.tourpage),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(530.dp)
                .offset(y = (-60).dp)
                .align(Alignment.TopCenter),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Nordic Cottage",
            style = TextStyle(
                color = Color.White,
                fontSize = 42.sp,
                fontWeight = FontWeight.W300
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .offset(x=80.dp, y=270.dp)// Adjust padding as needed
        )

        // Icon Button Arrow Back
        IconButton(
            onClick = {  },
            modifier = Modifier.offset(x=15.dp, y=50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Favorite",
                tint = Color.White
            )
        }

        // Box with rounded corners
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp) // Adjust the height as per your requirement
                .align(Alignment.Center)
                .offset(y = 150.dp)
                .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                // Title "About Nordic Cottage"
                Text(
                    text = "About Nordic Cottage",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                // Short description
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                    style = TextStyle(
                        fontSize = 18.sp
                    ),
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Title "Attractions"
                Text(
                    text = "Attractions",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                // Attraction 1
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(bottom = 8.dp).offset(y=10.dp)
                ) {
                    // Icon
                    Icon(
                        painter = painterResource(id = R.drawable.globe),
                        contentDescription = "Attraction 1",
                        tint = Color.Red,
                        modifier = Modifier.size(30.dp).offset(y=8.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    // Name and short description
                    Column(
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        Text(
                            text = "Attraction 1",
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                        )
                        Text(
                            text = "Description of Attraction 1",
                            fontSize = 18.sp,
                            color = Color.Gray
                        )
                    }
                }

                // Attraction 2
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(bottom = 8.dp).offset(y=12.dp)
                ) {
                    // Icon
                    Icon(
                        painter = painterResource(id = R.drawable.globe),
                        contentDescription = "Attraction 1",
                        tint = Color.Red,
                        modifier = Modifier.size(30.dp).offset(y=8.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    // Name and short description
                    Column(
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        Text(
                            text = "Attraction 2",
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                        )
                        Text(
                            text = "Description of Attraction 2",
                            fontSize = 18.sp,
                            color = Color.Gray
                        )
                    }
                }
                // Attraction 2
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.padding(bottom = 8.dp).offset(y=12.dp)
                ) {
                    // Icon
                    Icon(
                        painter = painterResource(id = R.drawable.globe),
                        contentDescription = "Attraction 1",
                        tint = Color.Red,
                        modifier = Modifier.size(30.dp).offset(y=8.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    // Name and short description
                    Column(
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        Text(
                            text = "Attraction 3",
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                        )
                        Text(
                            text = "Description of Attraction 3",
                            fontSize = 18.sp,
                            color = Color.Gray
                        )
                    }
                }
            }
            //Book a trip BUTTON
            Button(
                onClick = { },
                shape = RoundedCornerShape(36.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 15.dp,
                        y = 390.dp)
                    .requiredWidth(width = 397.dp)
                    .requiredHeight(height = 70.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically)
            ){
                Text(
                    text = "Book a trip",
                    color = Color(0xffffffff),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }


        NavigationBar(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 0.dp,
                    y = 825.dp
                )
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
                        .background(color = Color.White)
                )


                IconButton( //HOME
                    onClick = { },

                    modifier = Modifier
                        .size(90.dp)
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 15.dp, y = 8.dp)
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
                        .offset(x = 325.dp, y = 8.dp)
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
                                tint = Color(0xffbcbcbc), // Set the color of the Icon
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "Profile",
                            color = Color(0xffbcbcbc),
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }



                IconButton( //TOURS
                    onClick = { },
                    modifier = Modifier
                        .size(90.dp)
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 118.dp,
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
                                tint = Color(0xff0373f3), // Set the color of the Icon
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "Tours",
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
                        .size(90.dp)
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 221.dp,
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
                                tint = Color(0xffbcbcbc), // Set the color of the Icon
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "About",
                            color = Color(0xffbcbcbc),
                            style = TextStyle(
                                fontSize = 14.sp,
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




@Preview(widthDp = 430, heightDp = 932)
@Composable
fun ToursViewScreenPreview() {
    MobileProjectTheme {
        ToursViewScreen(Modifier)
    }
}


