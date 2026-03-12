package com.example.expensetraclerapp.UIDesign

import com.example.expensetraclerapp.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.twotone.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.fromColorLong
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Settings() {
    Column(
        Modifier.fillMaxSize()
            .background(Color.White)
        //.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                //.background(Color.Black)
                //.padding(start = 20.dp, end = 32.dp)
                .height(90.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(
                onClick = {},
                Modifier.size(50.dp)
                    .background(Color(0x0DFC8080), RoundedCornerShape(100))
                    .border(
                        2.dp,
                        Color.Transparent,
                        RoundedCornerShape(100)
                    )
            ) {
                Icon(Icons.Outlined.ArrowBack, "Settings")
            }
            Spacer(Modifier.width(40.dp))
            Text("Settings", fontSize = 34.sp)
            Spacer(Modifier.width(40.dp))
            IconButton(
                {},
                Modifier.size(50.dp)
                    .background(Color(0x0DFC8080), RoundedCornerShape(100))
                    .border(
                        2.dp,
                        Color.Transparent,
                        RoundedCornerShape(100)
                    )
            ) {
                Icon(Icons.TwoTone.Check, null)
            }
        }
        Column(
            modifier = Modifier.fillMaxSize()
                .background(Color.Black)
        ) {

        }
    }
}
