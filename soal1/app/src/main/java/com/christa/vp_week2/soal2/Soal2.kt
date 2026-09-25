package com.christa.vp_week2.soal2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.christa.vp_week2.R
import com.christa.vp_week2.ui.theme.VP_Week2Theme

@Composable
fun TravelScreen() {
    val darkBackgroundColor = Color(0xFF323652)
    val textFieldColor = Color(0xFFE2EAF5)
    val starColor = Color(0xFFF6C85F)

    val poppinsFont = FontFamily(
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_bold, FontWeight.Bold)
    )

    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Image(
            painter = painterResource(id = R.drawable.bg_aurora),
            contentDescription = "Aurora Scenery",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.45f)
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.65f)
                .background(
                    color = darkBackgroundColor,
                    shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 28.dp, vertical = 32.dp)
            ) {
                Text(
                    text = "My Travel",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = poppinsFont,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(28.dp))

                Text(
                    text = "Aurora",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = poppinsFont,
                    fontSize = 18.sp
                )

                Text(
                    text = "Tromsø, Norway",
                    color = Color.White,
                    fontFamily = poppinsFont,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(12.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    repeat(5) {
                        Icon(
                            Icons.Default.Star,
                            contentDescription = "Star",
                            tint = starColor,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "5.0",
                        color = starColor,
                        fontFamily = poppinsFont,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }

                Spacer(modifier = Modifier.height(28.dp))

                val customTextFieldColors = TextFieldDefaults.colors(
                    unfocusedContainerColor = textFieldColor,
                    focusedContainerColor = textFieldColor,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedTextColor = Color.DarkGray,
                    focusedTextColor = Color.DarkGray
                )
                val roundedShape = RoundedCornerShape(12.dp)

                TextField(
                    value = text1,
                    onValueChange = { text1 = it },
                    placeholder = { Text("What did you enjoy most about your trip?", fontFamily = poppinsFont, fontSize = 12.sp, color = Color.Gray) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    shape = roundedShape,
                    colors = customTextFieldColors
                )

                TextField(
                    value = text2,
                    onValueChange = { text2 = it },
                    placeholder = { Text("What was your favorite spot?", fontFamily = poppinsFont, fontSize = 12.sp, color = Color.Gray) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    shape = roundedShape,
                    colors = customTextFieldColors
                )

                TextField(
                    value = text3,
                    onValueChange = { text3 = it },
                    placeholder = { Text("Anything else you'd like to add?", fontFamily = poppinsFont, fontSize = 12.sp, color = Color.Gray) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    shape = roundedShape,
                    colors = customTextFieldColors
                )
            }

            FloatingActionButton(
                onClick = { },
                containerColor = textFieldColor,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(24.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add", tint = Color.Black)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2Preview() {
    VP_Week2Theme {
        TravelScreen()
    }
}