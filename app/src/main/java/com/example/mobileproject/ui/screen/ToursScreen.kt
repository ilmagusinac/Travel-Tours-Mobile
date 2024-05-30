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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobileproject.R
import com.example.mobileproject.model.Attraction
import com.example.mobileproject.ui.theme.MobileProjectTheme
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.model.TourInfo
import com.example.mobileproject.model.viewModel.AppViewModelProvider
import com.example.mobileproject.model.viewModel.ToursDetails
import com.example.mobileproject.model.viewModel.ToursViewModel
import com.example.mobileproject.ui.screen.navigation.NavigationDestination
import kotlin.random.Random

object ToursDestination: NavigationDestination {
    override val route = "tours"
    override val title = "Tours"
}

@Composable
fun ToursScreen(modifier: Modifier = Modifier,
                navigateToHomePage: ()-> Unit ={},
                navigateToAboutUsPage: ()-> Unit ={},
                navigateToProfilePage: ()-> Unit ={},

                viewModel: ToursViewModel = viewModel(factory = AppViewModelProvider.Factory)
                ) {
    val uiState by viewModel.uiState.collectAsState()

        Box(
            modifier = modifier
                .requiredWidth(430.dp)
                .requiredHeight(932.dp)
                .background(color = Color(0xfff6f6f6))

        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                // Title section
                Box(
                    modifier = Modifier
                        .requiredWidth(95.dp)
                        .requiredHeight(50.dp)
                        .align(alignment = Alignment.Start)
                        .offset(x = 30.dp, y = 80.dp)
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

                Box(
                    modifier = Modifier
                        .requiredWidth(220.dp)
                        .requiredHeight(35.dp)
                        .align(alignment = Alignment.Start)
                        .offset(x = 30.dp, y = 80.dp)
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

                Box(
                    modifier = Modifier
                        .requiredWidth(220.dp)
                        .requiredHeight(35.dp)
                        .align(alignment = Alignment.Start)
                        .offset(x = 30.dp, y = 120.dp)
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

                Spacer(modifier = Modifier.height(10.dp)) // Add some space before the grid

                // Attraction grid
                //AttractionGrid()
                // Tours grid
                TourGrid(tours = uiState.toursList)
            }
            // Navigation bar
            CustomNavigationBar(currentScreen = Screen.Tours,
                onItemSelected = { item ->
                    when (item) {
                        0 -> navigateToHomePage()
                        2 -> navigateToAboutUsPage()
                        3 -> navigateToProfilePage()
                    }
                })
        }
        // Navigation bar
        //CustomNavigationBar(currentScreen = Screen.Tours)
    }

    data class TourImage(
        val imageRes: Int
    )

    val tourImages = listOf(
        TourImage(R.drawable.tour1),
        TourImage(R.drawable.tour2),
        TourImage(R.drawable.tour3),
        TourImage(R.drawable.tour4)
    )

    /*
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
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Photo",
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(16.dp))
        )

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
fun AttractionGrid() {
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
            .padding(top = 180.dp),
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
                    onClick = { /* navigateToTourView(tours[i]) */ }
                )
                Spacer(modifier = Modifier.width(30.dp))
                if (i + 1 < tours.size) {
                    TourCard(
                        imageRes = tours[i + 1].imageRes,
                        title = tours[i + 1].title,
                        date = tours[i + 1].description,
                        onClick = { /* navigateToTourView(tours[i + 1]) */ }
                    )
                }
            }
        }
    }
}
*/@Composable
    fun TourCard(
        title: String,
        destination: String,
        imageRes: Int,
        onClick: () -> Unit
    ) {
        Box(
            modifier = Modifier
                .size(width = 150.dp, height = 220.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(color = Color.Gray)
                .clickable(onClick = onClick)
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "Tour Image",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(16.dp))
            )

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
                    text = destination,
                    color = Color.White,
                    style = TextStyle(fontSize = 12.sp)
                )
            }
        }
    }

    @Composable
    fun TourGrid(tours: List<ToursDetails>) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 180.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            for (i in tours.indices step 2) {
                Row(
                    modifier = Modifier.padding(bottom = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    val image1 = tourImages[Random.nextInt(tourImages.size)].imageRes
                    TourCard(
                        title = tours[i].name,
                        destination = tours[i].destination,
                        imageRes = image1,
                        onClick = { /* navigateToTourView(tours[i]) */ }
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    if (i + 1 < tours.size) {
                        val image2 = tourImages[Random.nextInt(tourImages.size)].imageRes
                        TourCard(
                            title = tours[i + 1].name,
                            destination = tours[i + 1].destination,
                            imageRes = image2,
                            onClick = { /* navigateToTourView(tours[i + 1]) */ }
                        )
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

@Preview
@Composable
fun TourCardPreview() {
     MobileProjectTheme {
         TourCard("Western Strait", "22.2.2022", R.drawable.tour1, onClick = { /* */ })
        }
    }

