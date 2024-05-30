package com.example.mobileproject.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobileproject.R

import com.example.mobileproject.ui.screen.navigation.NavigationDestination

object SplashDestination: NavigationDestination {
    override val route = "splash"
    override val title = "Splash"
}
@Composable
fun SplashScreen(modifier: Modifier = Modifier,
                 navigateToSignInPage: () -> Unit={}
) {
    Box(
        modifier = modifier
            .requiredWidth(width = 430.dp)
            .requiredHeight(height = 932.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 37.dp,
                    y = 792.dp)
                .requiredWidth(width = 356.dp)
                .requiredHeight(height = 54.dp),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = { navigateToSignInPage },
                shape = RoundedCornerShape(36.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0373f3)),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredWidth(width = 356.dp)
                    .requiredHeight(height = 54.dp))
            {
                Text(
                    text = "Continue",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        //.align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 0.dp)
                )
            }

        }
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Rectangle 589",
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 175.dp)
                .requiredWidth(width = 352.dp)
                .requiredHeight(height = 291.dp))
        Text(
            textAlign = TextAlign.Center,
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                ) {append("Travel&Tours \n")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Light,
                    fontStyle = FontStyle.Italic)) {append("Where Every Destination \nFeels Like")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 20.sp)) {append(" ")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)) {append("Home!")}},
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 466.dp)
                .requiredWidth(width = 244.dp))
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun SplashScreenPreview() {
    SplashScreen(Modifier)
}