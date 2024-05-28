package com.example.mobileproject.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.ui.theme.MobileProjectTheme
import com.example.mobileproject.model.TourInfo
import com.example.mobileproject.model.sampleTour
import com.example.mobileproject.ui.screen.navigation.NavigationDestination

object TourViewDestination : NavigationDestination {
    override val route = "tourview"
    override val title = "Tourview"
}

@Composable
fun ToursViewScreen(tour: TourInfo, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
<<<<<<< HEAD
            .requiredWidth(430.dp)
            .requiredHeight(932.dp)
            .background(color = Color(0xfff6f6f6))
=======
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            //.background(color = Color(0xfff6f6f6))
>>>>>>> 74c9813f15ebcae84c508ae4133f7116fb8653aa
    ) {
        Image(
            painter = painterResource(id = tour.imageRes),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(530.dp)
                .offset(y = (-60).dp)
                .align(Alignment.TopCenter),
            contentScale = ContentScale.Crop
        )

        Text(
            text = tour.title,
            style = TextStyle(
                color = Color.White,
                fontSize = 42.sp,
                fontWeight = FontWeight.W300
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .offset(x = 80.dp, y = 270.dp)
        )

        IconButton(
            onClick = { },
            modifier = Modifier.offset(x = 15.dp, y = 50.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "Favorite",
                tint = Color.White
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .align(Alignment.Center)
                .offset(y = 150.dp)
                .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "About ${tour.title}",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Text(
                    text = tour.description,
                    style = TextStyle(
                        fontSize = 18.sp
                    ),
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = "Attractions",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    ),
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                tour.attractions.forEach { attraction ->
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = attraction.iconRes),
                            contentDescription = attraction.name,
                            tint = Color.Red,
                            modifier = Modifier
                                .size(30.dp)
                                .padding(end = 8.dp)
                        )

                        Column {
                            Text(
                                text = attraction.name,
                                fontWeight = FontWeight.Bold,
                                style = TextStyle(fontSize = 20.sp)
                            )
                            Text(
                                text = attraction.description,
                                fontSize = 18.sp,
                                color = Color.Gray
                            )
                        }
                    }
                }

                Button(
                    onClick = { /* TODO: Implement booking logic */ },
                    shape = RoundedCornerShape(36.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
                    modifier = Modifier
                        .padding(top = 32.dp)
                        .fillMaxWidth()
                        .height(70.dp)
                ) {
                    Text(
                        text = "Book a trip",
                        color = Color.White,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }

        CustomNavigationBar(currentScreen = Screen.Tours)
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
fun ToursViewScreenPreview() {
    MobileProjectTheme {
        ToursViewScreen(tour = sampleTour, Modifier)
    }
}
