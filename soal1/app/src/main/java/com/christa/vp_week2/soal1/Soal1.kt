package com.christa.vp_week2.soal1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.christa.vp_week2.ui.theme.VP_Week2Theme
import com.christa.vp_week2.R

@Composable
fun MusicPlayerScreen() {
    val bgColor = Color(0xFFFFAAA5)
    val lyricsBgColor = Color(0xFF4A1C14)
    val contentColor = Color.Black

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(bgColor)
            .padding(horizontal = 24.dp, vertical = 32.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.KeyboardArrowDown, contentDescription = "Down", tint = contentColor)
            Text("Liked Songs", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = contentColor)
            Icon(Icons.Default.MoreVert, contentDescription = "More", tint = contentColor)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .background(Color.White, RoundedCornerShape(8.dp))
                .padding(4.dp)
                .clip(RoundedCornerShape(4.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_compose),
                contentDescription = "Album Cover",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "SPECIALZ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    color = contentColor
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "King Gnu",
                    fontSize = 18.sp,
                    color = contentColor
                )
            }
            Icon(
                Icons.Default.Favorite,
                contentDescription = "Favorite",
                tint = contentColor,
                modifier = Modifier.size(32.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(contentColor)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("0:12", color = contentColor, fontSize = 12.sp)
                Text("-2:14", color = contentColor, fontSize = 12.sp)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Default.SkipPrevious,
                contentDescription = "Previous",
                tint = contentColor,
                modifier = Modifier.size(36.dp)
            )

            Spacer(modifier = Modifier.width(32.dp))

            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
                    .background(contentColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    tint = bgColor,
                    modifier = Modifier.size(40.dp)
                )
            }

            Spacer(modifier = Modifier.width(32.dp))

            Icon(
                Icons.Default.SkipNext,
                contentDescription = "Next",
                tint = contentColor,
                modifier = Modifier.size(36.dp)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp, bottomStart = 8.dp, bottomEnd = 8.dp))
                .background(lyricsBgColor)
                .padding(24.dp)
        ) {
            Column {
                Text(
                    text = "Lyrics",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = """
                        You are my special
                        You are my special
                        You are my special
                        今際の際際で踊りましょう
                        東京前線興の都
                        往生際の際際で足掻きましょう
                        お行儀の悪い面も見せてよ
                        I love you, baby
                        謳い続けましょう
                        如何痴れ者も 如何余所者も
                        心燃える一挙手一投足
                        走り出したらアンコントロール
                        You are my special
                        無茶苦茶にしてくれないかい？
                        一切を存分に喰らい尽くして
                        一生迷宮廻遊ランデブー
                        眩暈がする程
                        You are my special
                        有耶無耶な儘廻る世界
                        No, no, no! そう冷静にはならないで
                        一生迷宮廻遊ランデブー
                        誰が如何言おうと
                        You are my special
                        We are special
                    """.trimIndent(),
                    color = Color.White,
                    fontSize = 16.sp,
                    lineHeight = 26.sp,

                    modifier = Modifier.verticalScroll(rememberScrollState())
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MusicPlayerPreview() {
    VP_Week2Theme {
        MusicPlayerScreen()
    }
}