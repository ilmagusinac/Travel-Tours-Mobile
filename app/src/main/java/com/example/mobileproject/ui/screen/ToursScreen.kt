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
import com.example.mobileproject.model.daos.ToursDao_Impl
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
                navigateToViewTour: (Int)-> Unit ={},
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
                TourGrid(tours = uiState.toursList,navigateToViewTour)
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
        val tourId: Int,
        val imageRes: Int
    )

    val tourImages = listOf(
        TourImage(tourId = 1, imageRes = R.drawable.tour1),
        TourImage(tourId = 2, imageRes = R.drawable.tour2),
        TourImage(tourId = 3, imageRes = R.drawable.tour3),
        TourImage(tourId = 4, imageRes = R.drawable.tour4)
    )

    @Composable
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
    fun TourGrid(tours: List<ToursDetails>,navigateToViewTour: (Int) -> Unit) {
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
                    val tour1=tours[i]
                    val image1 = tourImages.find {it.tourId == tour1.id}?.imageRes ?: R.drawable.tour1
                    TourCard(
                        title = tour1.name,
                        destination = tour1.destination,
                        imageRes = image1,
                        onClick = {navigateToViewTour(tour1.id)}
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    if (i + 1 < tours.size) {
                        val tour2= tours[i+1]
                        val image2 = tourImages.find { it.tourId == tour2.id }?.imageRes ?: R.drawable.tour2
                        TourCard(
                            title = tour2.name,
                            destination = tour2.destination,
                            imageRes = image2,
                            onClick = {navigateToViewTour(tour2.id) }
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

