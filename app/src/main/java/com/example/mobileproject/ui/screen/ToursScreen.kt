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
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.mobileproject.model.Attraction
import com.example.mobileproject.ui.theme.MobileProjectTheme
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.model.TourInfo
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

        //CustomNavigationBar(currentScreen = Screen.Tours)
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

        AttractionGrid()
        }
    }

@Composable
fun TourCard(
    imageRes: Int,
    title: String,
    date: String,
    onClick: () -> Unit
)  {
    Box(
        modifier = Modifier
            .size(width = 150.dp, height = 220.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = Color.Gray)
            .clickable(onClick = onClick)
    ) {
        // Photo
        Image(
            painter = painterResource(id = imageRes),
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
                text = title,
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = date,
                color = Color.White,
                style = TextStyle(fontSize = 12.sp)
            )
        }
    }
}

@Composable
fun AttractionGrid(/*navigateToTourView: (TourInfo) -> Unit*/) {
    // Sample tour data
    val tours = listOf(
        TourInfo(
            imageRes = R.drawable.tour1,
            title = "Western Strait",
            description = "5 attractions",
            attractions = listOf(
                Attraction("Attraction 1", "Description 1", R.drawable.globe),
                Attraction("Attraction 2", "Description 2", R.drawable.globe)
            )
        ),
        TourInfo(
            imageRes = R.drawable.tour2,
            title = "Lake cottage",
            description = "3 attractions",
            attractions = listOf(
                Attraction("Attraction 1", "Description 1", R.drawable.globe),
                Attraction("Attraction 2", "Description 2", R.drawable.globe)
            )
        ),
        TourInfo(
            imageRes = R.drawable.tour3,
            title = "Lake cottage",
            description = "3 attractions",
            attractions = listOf(
                Attraction("Attraction 1", "Description 1", R.drawable.globe),
                Attraction("Attraction 2", "Description 2", R.drawable.globe)
            )
        ),
        TourInfo(
            imageRes = R.drawable.tour4,
            title = "Lake cottage",
            description = "3 attractions",
            attractions = listOf(
                Attraction("Attraction 1", "Description 1", R.drawable.globe),
                Attraction("Attraction 2", "Description 2", R.drawable.globe)
            )
        )
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 260.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        for (i in tours.indices step 2) {
            Row(
                modifier = Modifier.padding(bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TourCard(
                    imageRes = tours[i].imageRes,
                    title = tours[i].title,
                    date = tours[i].description,
                    onClick = { /*navigateToTourView(tours[i])*/ }
                )
                Spacer(modifier = Modifier.width(30.dp))
                if (i + 1 < tours.size) {
                    TourCard(
                        imageRes = tours[i + 1].imageRes,
                        title = tours[i + 1].title,
                        date = tours[i + 1].description,
                        onClick = { /*navigateToTourView(tours[i + 1])*/ }
                    )
                }
            }
        }
        CustomNavigationBar(currentScreen = Screen.Tours)
    }
}
@Preview(widthDp = 430, heightDp = 932)
@Composable
fun ToursScreenPreview() {
    MobileProjectTheme {
        ToursScreen(Modifier)
    }
}

@Preview()
@Composable
fun TourCardPreview() {
    MobileProjectTheme {

    }
    TourCard(R.drawable.tour1, "Western Strait", "22.2.2022", onClick={/**/})
}


