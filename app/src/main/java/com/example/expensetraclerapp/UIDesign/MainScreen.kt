package com.example.expensetraclerapp.UIDesign

import android.hardware.camera2.params.BlackLevelPattern
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.combine

@Preview
@Composable
fun MainScreen() {
    Scaffold(
        content = {
            Column(modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(Color.White)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                        //.background(Color.Black)
                        .height(90.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("Expense Tracker", fontSize = 34.sp)
                }
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .height(350.dp)
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Card(
                            shape = RoundedCornerShape(40.dp, 0.dp, 40.dp, 0.dp),
                            elevation = CardDefaults.elevatedCardElevation(8.dp),
                            border = CardDefaults.outlinedCardBorder(enabled = true),
                            modifier = Modifier
                                .fillMaxSize()
                                .border(
                                    width = 2.dp,
                                    Color.Black,
                                    shape = RoundedCornerShape(40.dp, 0.dp, 40.dp, 0.dp)
                                )
                        ) {

                        }
                    }
                }
                Spacer(Modifier.height(20.dp))
                Text("     History:", fontSize = 24.sp)
                Spacer(Modifier.height(1.dp))
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    items(50) {
                       Card(
                           shape = RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp),
                           elevation = CardDefaults.elevatedCardElevation(8.dp),
                           modifier = Modifier.fillMaxWidth(.9f)
                               .height(90.dp).border(
                                   2.dp,
                                   Color.Black,
                                   RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp))
                       ) {
                            Text("")
                       }
                        Spacer(Modifier.height(10.dp))
                    }
                }
            }
        }
    )
}