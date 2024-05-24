package com.example.mobileproject.ui.screen


import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R
import com.example.mobileproject.ui.theme.MobileProjectTheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.withStyle

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    /*NAVIGATION*/
    Box( //NAVIGATION BOX
        modifier = modifier
            //.requiredWidth(width = 430.dp)
            .fillMaxWidth()
            .requiredHeight(height = 932.dp)

            .background(color = Color(0xfff6f6f6))
    ) {
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
                    //.requiredWidth(width = 430.dp)
                    .fillMaxWidth()
                    .requiredHeight(height = 107.dp)
                //.fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        //.requiredWidth(width = 430.dp)
                        .fillMaxWidth()
                        .requiredHeight(height = 107.dp)
                        .clip(shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                        .background(color = Color.White)
                )

                IconButton( //HOME BUTTON
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
                                tint = Color(0xff0373f3), // Set the color of the Icon
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "Home",
                            color = Color(0xff0373f3),
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }

                IconButton( //TOURS BUTTON
                    onClick = { },
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
                                tint = Color(0xffbcbcbc), // Set the color of the Icon
                                modifier = Modifier
                                    .fillMaxSize()
                                //.border(border = BorderStroke(1.5.dp, Color(0xffbcbcbc)))
                            )
                        }
                        Text(
                            text = "Tours",
                            color = Color(0xffbcbcbc),
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }

                IconButton( //ABOUT BUTTON
                    onClick = { },
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
                                tint = Color(0xffbcbcbc), // Set the color of the Icon
                                modifier = Modifier
                                    .fillMaxSize()
                                //.border(border = BorderStroke(1.5.dp, Color(0xffbcbcbc)))
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

                IconButton( //PROFILE BUTTON
                    onClick = { },
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
            }
        }
    }

        /*END OF NAVIGATION*/
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 95.dp)
                .requiredHeight(height = 40.dp)
                .padding(top = 19.dp)
        ) {
            Text(
                text = "Home page",
                color = Color(0xff818181),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(1.dp))

        Text(
            text = "Welcome to Travel & Tours",
            color = Color.Black,
            style = TextStyle(
                fontSize = 26.sp,
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.25f),
                    offset = Offset(0f, 4f),
                    blurRadius = 4f
                )
            ),
            modifier = Modifier.padding(top = 1.dp)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Check out some of our trips",
            color = Color(0xff818181),
            style = TextStyle(
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier
                .requiredWidth(width = 183.dp)
                .requiredHeight(height = 19.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.nature),
            contentDescription = "Nature Image",
            modifier = Modifier
                .requiredWidth(width = 351.dp)
                .requiredHeight(height = 248.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold)) { append("Travel&Tours \n") }
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Light,
                    fontStyle = FontStyle.Italic)) { append("Where Every Destination \nFeels Like ") }
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold)) { append("Home!") }
            },
            modifier = Modifier
                .padding(top = 12.dp,  bottom = 1.dp)
                .align(Alignment.CenterHorizontally)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp, bottom = 5.dp) // Adjust the padding as needed
                .align(Alignment.CenterHorizontally)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                item {
                    Text(
                        text = "At Travel&Tours, we're dedicated to redefining travel experiences. " +
                                "Our app offers personalised journeys tailored to your interests, from cultural immersion to adventure. " +
                                "Let us transform your wanderlust into unforgettable memories. " +
                                "Discover more with Travel&Tours.",
                        color = Color.Black,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(top=25.dp,bottom=18.dp)
                    )
                }
            }
        }
    }
}



/*@Composable
fun ScrollableText() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 10.dp)
    ) {
        LazyColumn(
            modifier = Modifier
                .align(Alignment.BottomCenter) // Align to the bottom
                .fillMaxWidth() // Occupy full width
        ) {
            item {
                Text(
                    text = "At Travel&Tours, we're dedicated to redefining travel experiences. " +
                            "Our app offers personalised journeys tailored to your interests, from cultural immersion to adventure. " +
                            "Explore curated attractions and create bespoke itineraries effortlessly. " +
                            "Let us transform your wanderlust into unforgettable memories. " +
                            "Discover more with Travel&Tours.",
                    color = Color.Black,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

*/


//@Preview( showBackground = false, uiMode = Configuration.UI_MODE_NIGHT_YES)
@RequiresApi(Build.VERSION_CODES.O) //ŠTA JE OVO?
@Preview(widthDp = 430, heightDp = 932)
@Composable
fun HomeScreenPreview(){
    MobileProjectTheme {
        HomeScreen()
        //ScrollableText()
    }
}
