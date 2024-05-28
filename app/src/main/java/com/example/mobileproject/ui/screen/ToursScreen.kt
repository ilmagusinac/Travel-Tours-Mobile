package com.example.mobileproject.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.mobileproject.ui.theme.MobileProjectTheme
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.ui.screen.navigation.NavigationDestination

object ToursDestination: NavigationDestination {
    override val route = "tours"
    override val title = "Tours"
}
@Composable
fun ToursScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color(0xfff6f6f6))
    ) {

        CustomNavigationBar(currentScreen = Screen.Tours)
        Box(
            modifier = modifier
                .requiredWidth(width = 95.dp)
                .requiredHeight(height = 24.dp)
                .align(alignment = Alignment.TopStart)
                .offset(x = 30.dp, y = 90.dp)
        ) {
            Text(
                text = "Tours",
                color = Color(0xff818181),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier.fillMaxSize()
            )
        }

        // Title
        Box(
            modifier = modifier
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 35.dp)
                .align(alignment = Alignment.TopStart)
                .offset(x = 30.dp, y = 120.dp)
        ) {
            Text(
                text = "Find your next trip",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 26.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.fillMaxSize()
            )
        }

        //Popular tours title
        Box(
            modifier = modifier
                .requiredWidth(width = 220.dp)
                .requiredHeight(height = 35.dp)
                .align(alignment = Alignment.TopStart)
                .offset(x = 30.dp, y = 180.dp)
        ) {
            Text(
                text = "Popular tours",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.fillMaxSize()
            )
        }

        // Grid of cards
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .padding(top = 260.dp)
                .offset(x = 50.dp)
        ) {
            // First row of cards
            Row(
                modifier = Modifier.padding(bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Card 1
                Box(
                    modifier = Modifier
                        .size(width = 150.dp, height = 220.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color.Gray)
                ) {
                    // Photo
                    Image(
                        painter = painterResource(id = R.drawable.tour1),
                        contentDescription = "Photo",
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(16.dp))
                            .clickable { }
                    )

                    // Title and description 1
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(18.dp)
                    ) {
                        Text(
                            text = "Western Strait",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = "5 attractions",
                            color = Color.White,
                            style = TextStyle(fontSize = 12.sp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(30.dp))

                //Card 2
                Box(
                    modifier = Modifier
                        .size(width = 150.dp, height = 220.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color.Gray)
                ) {
                    // Photo
                    Image(
                        painter = painterResource(id = R.drawable.tour4),
                        contentDescription = "Photo",
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(16.dp))
                            .clickable { }
                    )

                    // Title and description
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(18.dp)
                    ) {
                        Text(
                            text = "Lake cottage",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = "3 attractions",
                            color = Color.White,
                            style = TextStyle(fontSize = 12.sp)
                        )
                    }
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .padding(top = 510.dp)
                .offset(x = 50.dp)
        ) {
            // First row of cards
            Row(
                modifier = Modifier.padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Card 1
                Box(
                    modifier = Modifier
                        .size(width = 150.dp, height = 220.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color.Gray)
                ) {
                    // Photo
                    Image(
                        painter = painterResource(id = R.drawable.tour3),
                        contentDescription = "Photo",
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(16.dp))
                            .clickable { }
                    )

                    // Title and description
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(18.dp)
                    ) {
                        Text(
                            text = "Scottish castle",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = "7 attractions",
                            color = Color.White,
                            style = TextStyle(fontSize = 12.sp)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(30.dp))

                //Card 2
                Box(
                    modifier = Modifier
                        .size(width = 150.dp, height = 220.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = Color.Gray)
                ) {
                    // Photo
                    Image(
                        painter = painterResource(id = R.drawable.tour2),
                        contentDescription = "Photo",
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(shape = RoundedCornerShape(16.dp))
                            .clickable { }
                    )

                    // Title and description
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(18.dp)
                    ) {
                        Text(
                            text = "Forest Heaven",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = "6 attractions",
                            color = Color.White,
                            style = TextStyle(fontSize = 12.sp)
                        )
                    }
                }
            }
        }
    }

}

@Preview(widthDp = 430, heightDp = 932)
@Composable
fun ToursScreenPreview() {
    MobileProjectTheme {
        ToursScreen(Modifier)
    }
}


