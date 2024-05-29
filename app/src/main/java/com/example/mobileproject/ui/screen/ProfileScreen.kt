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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
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
import androidx.compose.ui.layout.ContentScale
import com.example.mobileproject.model.DestinationList
import com.example.mobileproject.model.Destination
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobileproject.model.CustomNavigationBar
import com.example.mobileproject.model.Screen
import com.example.mobileproject.model.viewModel.AppViewModelProvider
import com.example.mobileproject.model.viewModel.ProfileViewModel
import com.example.mobileproject.model.viewModel.ToursDetails
import com.example.mobileproject.ui.screen.navigation.NavigationDestination

object ProfileDestination: NavigationDestination {
    override val route = "profile"
    override val title = "Profile"
}
@Composable
fun ProfileScreen(modifier: Modifier = Modifier,
                  userId: Int,
                  viewModel: ProfileViewModel = viewModel(factory = AppViewModelProvider.Factory),
                  onLogout: () -> Unit) {
    //var email by remember { mutableStateOf("initialEmail") }
    val coroutineScope = rememberCoroutineScope()
    val userUiState by viewModel::userUiState
    val toursUiState by viewModel::toursUiState

    var email = "example@gmail.com"
    var username = "username"

    LaunchedEffect(Unit) {
        viewModel.fetchUserData(userId)
        viewModel.fetchPreviousTours()
    }

    Box( //NAVIGATION BOX
        modifier = modifier
            //.requiredWidth(width = 430.dp)
            .fillMaxWidth()
            //.fillMaxHeight()
            .requiredHeight(height = 932.dp)

            .background(color = Color(0xfff6f6f6))
    ) {

        //CustomNavigationBar(currentScreen = Screen.Profile)

    Box( //YOUR PROFILE BOX
        modifier = Modifier
            .align(alignment = Alignment.TopStart)
            .offset(
                x = 30.dp,
                y = 90.dp
            )
    ){
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


    Box( //PROFILE PICTURE
        modifier = Modifier
            .align(alignment = Alignment.TopStart)
            .offset(
                x = 272.dp,
                y = 125.dp
            )
            .requiredSize(size = 100.dp)
            .clip(shape = CircleShape)
            .background(color = Color(0xff0373f3))
    )
    Image(
        painter = painterResource(id = R.drawable.useroutline),
        contentDescription = "UserOutline",
        modifier = Modifier
            .align(alignment = Alignment.TopStart)
            .offset(
                x = 295.dp,
                y = 148.dp
            )
            .requiredSize(size = 54.dp)
    )

    Box( //LOGOUT BUTTON
        modifier = Modifier
            .align(Alignment.TopStart)
            .offset(x = 160.dp, y = 775.dp)
            //.requiredWidth(150.dp)
            //.requiredHeight(26.dp)
            .clickable {

                viewModel.logout(onLogout)
            }
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

        Text( //E-MAIL ADDRESS FIELD
            text = "E-mail address",
            color = Color(0xffadadad),
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 32.dp, y = 254.dp)
        )

            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 31.dp, y = 283.dp)
                    .requiredWidth(355.dp)
                    .requiredHeight(51.dp)
                    .clip(RoundedCornerShape(36.dp))
                    .background(Color.White)
                    .border(
                        border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                        shape = RoundedCornerShape(36.dp)
                    )
            ){
            Icon(
                painter = painterResource(id = R.drawable.email_username),
                contentDescription = "Email",
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 19.dp, y = 15.dp)
                    .requiredSize(22.dp)
            )
            TextField(
                value = userUiState.usersDetails.email,
                //value = userUiState.usersDetails.email,
                onValueChange = { /*newEmail -> email = newEmail*/ },
                textStyle = TextStyle(
                    color = Color(0xffadadad),
                    fontSize = 16.sp
                ),
                isError = false,
                readOnly = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    errorContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 58.dp, y = 15.dp)
                    .requiredHeight(85.dp)
                    .requiredWidth(250.dp)
                    .background(Color.Transparent)
            )
        }


        Text( //USERNAME FILED
            text = "Username",
            color = Color(0xffadadad),
            style = TextStyle(
                fontSize = 14.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 31.dp,
                    y = 345.dp
                )
        )
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 31.dp, y = 374.dp)
                .requiredWidth(355.dp)
                .requiredHeight(51.dp)
                .clip(RoundedCornerShape(36.dp))
                .background(Color.White)
                .border(
                    border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                    shape = RoundedCornerShape(36.dp)
                )
        ){
            Icon(
                painter = painterResource(id = R.drawable.email_username),
                contentDescription = "Email",
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 19.dp, y = 15.dp)
                    .requiredSize(22.dp)
            )
            TextField(
                value = userUiState.usersDetails.username,
                onValueChange = { /*newEmail -> email = newEmail*/ },
                textStyle = TextStyle(
                    color = Color(0xffadadad),
                    fontSize = 16.sp
                ),
                isError = false,
                readOnly = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    errorContainerColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 58.dp, y = 15.dp)
                    .requiredHeight(85.dp)
                    .requiredWidth(250.dp)
                    .background(Color.Transparent)
            )
        }
        Button(//EDIT PROFILE BUTTON
            onClick = { },
            shape = RoundedCornerShape(36.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 260.dp,
                    y = 450.dp
                )
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

        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 15.dp)
                .requiredWidth(390.dp)
                .offset(y = 480.dp)
        ) {
            Text(
                text = "Booked Tours",
                color = Color(0xffadadad),
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier//.padding(bottom = 1.dp)
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp)
            ) /*{
                items(DestinationList.destinations) { destination ->
                    BookedToursCard(destinations = destination)
                }*/
            {
                items(toursUiState.toursList.filter { it.id < 5 }) { tour ->
                    BookedToursCard(tour)
                }
            }

            Text(
                text = "Your Previous Destinations",
                fontSize = 14.sp,
                color = Color(0xffadadad),
                modifier = Modifier//.padding(bottom = 8.dp)
            )

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp)
            ) /*{
                items(DestinationList.destinations) { destination ->
                    HistoryDestinationCard(destinations = destination)
                }*/
            {
                items(toursUiState.toursList.filter { it.id >= 5 }) { tour ->
                    HistoryDestinationCard(tour)
                }
            }

        }
        CustomNavigationBar(currentScreen = Screen.Profile)
    }
}

/*
@Composable
fun HistoryDestinationCard(destinations : Destination){
    Card(
        modifier = Modifier
            .padding(20.dp)
            .requiredWidth(345.dp)
            .requiredHeight(70.dp)
            .clip(RoundedCornerShape(36.dp))
            //.offset(x = 10.dp, y = 20.dp)
            .background(Color.White)
            .border(
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xffe9e9e9)),
                shape = RoundedCornerShape(36.dp)
            ),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)

        ){
            Image(
                painter = painterResource(id = destinations.image),
                contentDescription = "History of booked tours",
                modifier = Modifier
                    .requiredWidth(120.dp)
                    .requiredHeight(55.dp)
                    .clip(RoundedCornerShape(36.dp))
                    .background(Color(0xffc4c4c4)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column{
                Text(
                    text = destinations.name,
                    fontSize = 14.sp,
                    color = Color(0xffadadad),
                    )
                Spacer(modifier = Modifier.height(5.dp)
                )
                Row {
                    Text(
                        text = destinations.destination,
                        fontSize = 12.sp,
                        color = Color(0xffadadad)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = destinations.date,
                        fontSize = 12.sp,
                        color = Color(0xffadadad)
                    )
                }
            }
        }
    }
}

@Composable
fun BookedToursCard(destinations: Destination) {
    Card(
        modifier = Modifier
            .padding(20.dp)
            .requiredWidth(345.dp)
            .requiredHeight(70.dp)
            .clip(RoundedCornerShape(36.dp))
            .background(Color.White)
            .border(
                border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xffe9e9e9)),
                shape = RoundedCornerShape(36.dp)
            ),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 8.dp)
        ) {
            Image(
                painter = painterResource(id = destinations.image),
                contentDescription = "Booked Tours",
                modifier = Modifier
                    .requiredWidth(85.dp)
                    .requiredHeight(55.dp)
                    .clip(RoundedCornerShape(36.dp))
                    .background(Color(0xffc4c4c4)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = destinations.name,
                fontSize = 12.sp,
                color = Color(0xffadadad),
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 5.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .requiredHeight(36.dp)
                    .clip(RoundedCornerShape(36.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3))
            ) {
                Text(
                    text = "Cancel",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                    )
                )
            }

        }
    }

}
*/
@Composable
fun HistoryDestinationCard(tour: ToursDetails) {
    Card(
        modifier = Modifier
            .padding(20.dp)
            .requiredWidth(345.dp)
            .requiredHeight(70.dp)
            .clip(RoundedCornerShape(36.dp))
            .background(Color.White)
            .border(
                border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                shape = RoundedCornerShape(36.dp)
            ),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 10.dp, end = 10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.tour1), // Use appropriate image resource
                contentDescription = "History of booked tours",
                modifier = Modifier
                    .requiredWidth(120.dp)
                    .requiredHeight(55.dp)
                    .clip(RoundedCornerShape(36.dp))
                    .background(Color(0xffc4c4c4)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = tour.name,
                    fontSize = 14.sp,
                    color = Color(0xffadadad)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Row {
                    Text(
                        text = tour.destination,
                        fontSize = 12.sp,
                        color = Color(0xffadadad)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = tour.date,
                        fontSize = 12.sp,
                        color = Color(0xffadadad)
                    )
                }
            }
        }
    }
}

@Composable
fun BookedToursCard(tour: ToursDetails) {
    Card(
        modifier = Modifier
            .padding(20.dp)
            .requiredWidth(345.dp)
            .requiredHeight(70.dp)
            .clip(RoundedCornerShape(36.dp))
            .background(Color.White)
            .border(
                border = BorderStroke(1.dp, Color(0xffe9e9e9)),
                shape = RoundedCornerShape(36.dp)
            ),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.tour1), // Use appropriate image resource
                contentDescription = "Booked Tours",
                modifier = Modifier
                    .requiredWidth(85.dp)
                    .requiredHeight(55.dp)
                    .clip(RoundedCornerShape(36.dp))
                    .background(Color(0xffc4c4c4)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = tour.name,
                fontSize = 12.sp,
                color = Color(0xffadadad),
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 5.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Button(
                onClick = { /* Handle button click here */ },
                modifier = Modifier
                    .requiredHeight(36.dp)
                    .clip(RoundedCornerShape(36.dp)),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3))
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
        }
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
fun ProfileScreenPreview(){
    MobileProjectTheme {
        //ProfileScreen(Modifier)
        ProfileScreen(Modifier, userId = 1, onLogout = {})
    }

}

@Preview
@Composable
fun DestinationHistoryCardPreview(){
    MobileProjectTheme {

    }
    //HistoryDestinationCard(DestinationList.destinations[0])
    HistoryDestinationCard(ToursDetails(id = 5, name = "Sample Tour", destination = "Sample Destination", description = "Sample Description", date = "01.01.2023"))

}

@Preview
@Composable
fun BookedToursCardPreview(){
    MobileProjectTheme {

    }
    //BookedToursCard(DestinationList.destinations[0])
    BookedToursCard(ToursDetails(id = 1, name = "Sample Tour", destination = "Sample Destination", description = "Sample Description", date = "01.01.2023"))

}