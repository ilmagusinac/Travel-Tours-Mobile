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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
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
import java.time.format.TextStyle

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AboutScreen() {
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
                .requiredHeight(height = 19.dp))


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
                            .background(
                                brush = Brush.linearGradient(
                                    0f to Color(0xff18acfe),
                                    1f to Color(0xff0163e0),
                                    start = Offset(14f, 0f),
                                    end = Offset(14f, 27.92f)
                                )
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "f",
                        modifier = Modifier.fillMaxSize()
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
                            .background(
                                brush = Brush.linearGradient(
                                    0f to Color(0xff18acfe),
                                    1f to Color(0xff0163e0),
                                    start = Offset(14f, 0f),
                                    end = Offset(14f, 27.92f)
                                )
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.pinterest),
                        contentDescription = "f",
                        modifier = Modifier.fillMaxSize()
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
                            .background(
                                brush = Brush.linearGradient(
                                    0f to Color(0xff18acfe),
                                    1f to Color(0xff0163e0),
                                    start = Offset(14f, 0f),
                                    end = Offset(14f, 27.92f)
                                )
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.instagram),
                        contentDescription = "f",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}




@Preview( showBackground = false, uiMode = Configuration.UI_MODE_NIGHT_YES)
@RequiresApi(Build.VERSION_CODES.O)
@Preview( showBackground = true)
@Composable
fun AboutScreenPreview(){
    MobileProjectTheme {
        AboutScreen()
    }
}