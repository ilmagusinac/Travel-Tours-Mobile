package com.example.mobileproject.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R
import com.example.mobileproject.ui.theme.MobileProjectTheme

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {

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
                                tint = Color(0xffbcbcbc), // Set the color of the Icon
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "Home",
                            color = Color(0xffbcbcbc),
                            style = androidx.compose.ui.text.TextStyle(
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
                            style = androidx.compose.ui.text.TextStyle(
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
                            style = androidx.compose.ui.text.TextStyle(
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
                                tint = Color(0xff0373f3), // Set the color of the Icon
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Text(
                            text = "Profile",
                            color = Color(0xff0373f3),
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier.padding(top = 4.dp) // Add padding to separate icon and text
                        )
                    }
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 25.dp)
                .padding(top = 60.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 95.dp)
                    .requiredHeight(height = 24.dp)
            ) {
                Text(
                    text = "About Us",
                    color = Color(0xff818181),
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Our team",
                color = Color(0xff818181),
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .requiredWidth(width = 64.dp)
                    .requiredHeight(height = 19.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Andjela
            Box(
                modifier = Modifier
                    .requiredWidth(width = 356.dp)
                    .requiredHeight(height = 69.dp)
            ) {
                Text(
                    text = "Anđela",
                    color = Color.Black,
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 66.dp, y = 0.dp)
                )
                Text(
                    text = "Chief Travel Experiencer",
                    color = Color(0xffa8a8a8),
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 67.dp, y = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.andjela),
                    contentDescription = "Ellipse 299",
                    modifier = Modifier
                        .requiredSize(size = 48.dp)
                        .clip(shape = CircleShape)
                )
                Divider(
                    color = Color(0xfff3f3f3),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 68.dp)
                        .requiredWidth(width = 356.dp)
                        .requiredHeight(height = 1.dp)
                )

            }

            Spacer(modifier = Modifier.height(10.dp))


            // Ilma
            Box(
                modifier = Modifier
                    .requiredWidth(width = 356.dp)
                    .requiredHeight(height = 69.dp)
            ) {
                Text(
                    text = "Ilma",
                    color = Color.Black,
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 66.dp, y = 0.dp)
                )
                Text(
                    text = "Chief Travel Experiencer",
                    color = Color(0xffa8a8a8),
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 67.dp, y = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.ilma),
                    contentDescription = "Ellipse 299",
                    modifier = Modifier
                        .requiredSize(size = 48.dp)
                        .clip(shape = CircleShape)
                )
                Divider(
                    color = Color(0xfff3f3f3),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 68.dp)
                        .requiredWidth(width = 356.dp)
                        .requiredHeight(height = 1.dp)
                )

            }

            Spacer(modifier = Modifier.height(10.dp))
            // Jasmina
            Box(
                modifier = Modifier
                    .requiredWidth(width = 356.dp)
                    .requiredHeight(height = 69.dp)
            ) {
                Text(
                    text = "Jasmina",
                    color = Color.Black,
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 66.dp, y = 0.dp)
                )
                Text(
                    text = "Private Tour Guide",
                    color = Color(0xffa8a8a8),
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 67.dp, y = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.jasmina),
                    contentDescription = "Ellipse 299",
                    modifier = Modifier
                        .requiredSize(size = 48.dp)
                        .clip(shape = CircleShape)
                )
                Divider(
                    color = Color(0xfff3f3f3),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 68.dp)
                        .requiredWidth(width = 356.dp)
                        .requiredHeight(height = 1.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))


            // Eldar
            Box(
                modifier = Modifier
                    .requiredWidth(width = 356.dp)
                    .requiredHeight(height = 69.dp)
            ) {
                Text(
                    text = "Eldar",
                    color = Color.Black,
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 66.dp, y = 0.dp)
                )
                Text(
                    text = "Travel YouTube Master",
                    color = Color(0xffa8a8a8),
                    lineHeight = 20.sp,
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 67.dp, y = 24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.eldar),
                    contentDescription = "Ellipse 299",
                    modifier = Modifier
                        .requiredSize(size = 48.dp)
                        .clip(shape = CircleShape)
                )
                Divider(
                    color = Color(0xfff3f3f3),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 68.dp)
                        .requiredWidth(width = 356.dp)
                        .requiredHeight(height = 1.dp)
                )


            }

            Spacer(modifier = Modifier.height(15.dp))


            // Social Media
            Text(
                text = "Follow us on Social Media",
                color = Color(0xff818181),
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .requiredWidth(width = 167.dp)
                    .requiredHeight(height = 19.dp)
            )


            Spacer(modifier = Modifier.height(20.dp))


            // Facebook
            Column(
                modifier = Modifier
                    .requiredWidth(width = 271.dp)
                    .requiredHeight(height = 54.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 271.dp)
                        .requiredHeight(height = 54.dp)

                ) {
                    Text(
                        text = "Facebook",
                        color = Color.Black,
                        lineHeight = 10.28.em,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 16.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 72.dp, y = 2.dp)
                            .clickable {  }
                    )
                    Text(
                        text = "Limited time paid promotion",
                        color = Color(0xffa4a4a4),
                        lineHeight = 11.75.em,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 16.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 72.dp, y = 30.dp)
                    )
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 54.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffe8e8e8))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp, y = 12.dp)
                            .requiredSize(size = 32.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.facebook),
                            contentDescription = "f",
                            modifier = Modifier.fillMaxSize()
                                .clickable {  }
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            // Pinterest
            Column(
                modifier = Modifier
                    .requiredWidth(width = 271.dp)
                    .requiredHeight(height = 54.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 271.dp)
                        .requiredHeight(height = 54.dp)
                ) {
                    Text(
                        text = "Pinterest",
                        color = Color.Black,
                        lineHeight = 10.28.em,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 16.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 72.dp, y = 2.dp)
                            .clickable {  }
                    )
                    Text(
                        text = "Promote your blog for free",
                        color = Color(0xffa4a4a4),
                        lineHeight = 11.75.em,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 16.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 72.dp, y = 30.dp)
                    )
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 54.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffe8e8e8))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp, y = 12.dp)
                            .requiredSize(size = 32.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.pinterest),
                            contentDescription = "f",
                            modifier = Modifier.fillMaxSize()
                                .clickable {  }
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(20.dp))


            // Instagram
            Column(
                modifier = Modifier
                    .requiredWidth(width = 271.dp)
                    .requiredHeight(height = 54.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 271.dp)
                        .requiredHeight(height = 54.dp)
                ) {
                    Text(
                        text = "Instagram",
                        color = Color.Black,
                        lineHeight = 10.28.em,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 16.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 72.dp, y = 2.dp)
                            .clickable {}
                    )
                    Text(
                        text = "Promote your blog for free",
                        color = Color(0xffa4a4a4),
                        lineHeight = 11.75.em,
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 16.sp
                        ),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 72.dp, y = 30.dp)
                    )
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 54.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffe8e8e8))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp, y = 12.dp)
                            .requiredSize(size = 32.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = CircleShape)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.instagram),
                            contentDescription = "f",
                            modifier = Modifier.fillMaxSize()
                                .clickable {  }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}
@Preview(widthDp = 430, heightDp = 932)
@Composable
fun AboutScreenPreview(){
    MobileProjectTheme {
        AboutScreen(Modifier)
    }
}
/*
package com.example.mobileproject.ui.screen

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R
import com.example.mobileproject.ui.theme.MobileProjectTheme

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(932.dp)
            .background(Color(0xfff6f6f6))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 25.dp)
                .padding(top = 60.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(95.dp)
                    .requiredHeight(24.dp)
            ) {
                Text(
                    text = "About Us",
                    color = Color(0xff818181),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Our team",
                color = Color(0xff818181),
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .requiredWidth(64.dp)
                    .requiredHeight(19.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Team members
            val teamMembers = listOf(
                "Anđela" to "Chief Travel Experiencer",
                "Ilma" to "Chief Travel Experiencer",
                "Jasmina" to "Private Tour Guide",
                "Eldar" to "Travel YouTube Master"
            )

            teamMembers.forEach { (name, title) ->
                Box(
                    modifier = Modifier
                        .requiredWidth(356.dp)
                        .requiredHeight(69.dp)
                ) {
                    Text(
                        text = name,
                        color = Color.Black,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 66.dp, y = 0.dp)
                    )
                    Text(
                        text = title,
                        color = Color(0xffa8a8a8),
                        fontSize = 16.sp,
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .offset(x = 67.dp, y = 24.dp)
                    )
                    Image(
                        painter = painterResource(
                            id = when (name) {
                                "Anđela" -> R.drawable.andjela
                                "Ilma" -> R.drawable.ilma
                                "Jasmina" -> R.drawable.jasmina
                                "Eldar" -> R.drawable.eldar
                                else -> R.drawable.ilma // Add a placeholder if needed
                            }
                        ),
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .requiredSize(48.dp)
                            .clip(CircleShape)
                            .align(Alignment.TopStart)
                    )
                    Divider(
                        color = Color(0xfff3f3f3),
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .offset(y = (-1).dp)
                            .fillMaxWidth()
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

            Spacer(modifier = Modifier.height(15.dp))

            // Social Media
            Text(
                text = "Follow us on Social Media",
                color = Color(0xff818181),
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .requiredWidth(167.dp)
                    .requiredHeight(19.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Social Media Links
            val socialMediaLinks = listOf(
                "Facebook" to "Limited time paid promotion",
                "Pinterest" to "Promote your blog for free",
                "Instagram" to "Promote your blog for free"
            )

            socialMediaLinks.forEach { (name, description) ->
                Column(
                    modifier = Modifier
                        .requiredWidth(271.dp)
                        .requiredHeight(54.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(271.dp)
                            .requiredHeight(54.dp)
                    ) {
                        Text(
                            text = name,
                            color = Color.Black,
                            fontSize = 16.sp,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 72.dp, y = 2.dp)
                        )
                        Text(
                            text = description,
                            color = Color(0xffa4a4a4),
                            fontSize = 16.sp,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 72.dp, y = 30.dp)
                        )
                        Box(
                            modifier = Modifier
                                .requiredSize(54.dp)
                                .clip(CircleShape)
                                .background(Color(0xffe8e8e8))
                        )
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 11.dp, y = 12.dp)
                                .requiredSize(32.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(CircleShape)
                                    .background(
                                        brush = Brush.linearGradient(
                                            colors = listOf(Color(0xff18acfe), Color(0xff0163e0)),
                                            start = Offset(14f, 0f),
                                            end = Offset(14f, 27.92f)
                                        )
                                    )
                            )
                            Image(
                                painter = painterResource(
                                    id = when (name) {
                                        "Facebook" -> R.drawable.facebook
                                        "Pinterest" -> R.drawable.pinterest
                                        "Instagram" -> R.drawable.instagram
                                        else -> R.drawable.instagram // Add a placeholder if needed
                                    }
                                ),
                                contentDescription = "$name Icon",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }

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
                                    tint = Color(0xff0373f3), // Set the color of the Icon
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                            Text(
                                text = "Profile",
                                color = Color(0xff0373f3),
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
}
*/
    /*
@Preview(widthDp = 430, heightDp = 932)
@Composable
fun AboutScreenPreview() {
    MobileProjectTheme {
        AboutScreen()
    }
}*/
