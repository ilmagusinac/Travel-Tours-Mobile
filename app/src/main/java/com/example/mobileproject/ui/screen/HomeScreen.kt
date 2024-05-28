package com.example.mobileproject.ui.screen


import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
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
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.input.pointer.pointerInput
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.ui.screen.navigation.NavigationDestination
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object HomeDestination: NavigationDestination {
    override val route = "home"
    override val title = "Home"
}
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val images = listOf(
        R.drawable.slider1,
        R.drawable.slider2,
        R.drawable.slider3,
        R.drawable.slider4,
        R.drawable.slider5
    )

    var currentPage by remember { mutableStateOf(0) }
    var dragOffset by remember { mutableStateOf(0f) }
    val coroutineScope = rememberCoroutineScope()

    // Automatic slider logic
    LaunchedEffect(currentPage) {
        coroutineScope.launch {
            delay(3000) // Delay for 3 seconds
            currentPage = (currentPage + 1) % images.size
        }
    }

    //CustomNavigationBar(currentScreen = Screen.Home)

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

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(248.dp)
                .clip(RoundedCornerShape(16.dp))
                .pointerInput(Unit) {
                    detectHorizontalDragGestures(
                        onDragStart = { dragOffset = 0f },
                        onDragEnd = {
                            val threshold = 100f
                            if (dragOffset > threshold) {
                                currentPage = (currentPage - 1).coerceIn(0, images.size - 1)
                            } else if (dragOffset < -threshold) {
                                currentPage = (currentPage + 1).coerceIn(0, images.size - 1)
                            }
                        }
                    ) { change, dragAmount ->
                        dragOffset += dragAmount
                        change.consume()
                    }
                }
        ) {
            Image(
                painter = painterResource(id = images[currentPage]),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
            )
        }

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
                .padding(top = 12.dp, bottom = 1.dp)
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
                    .height(200.dp)
                    .padding(top = 25.dp, bottom = 18.dp) // Ensure proper padding for scrolling
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
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
            //CustomNavigationBar(currentScreen = Screen.Home)
        }
        //CustomNavigationBar(currentScreen = Screen.Home)
    }
    CustomNavigationBar(currentScreen = Screen.Home)
}

@Preview(showBackground=true,widthDp = 430, heightDp = 932)
@Composable
fun HomeScreenPreview(){
    MobileProjectTheme {
        HomeScreen()
    }
}
