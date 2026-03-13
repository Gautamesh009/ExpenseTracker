package com.example.expensetraclerapp.UIDesign

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.expensetraclerapp.Room.PaymentHistory
import com.example.expensetraclerapp.ViewModel.TrackerViewModel

@Composable
fun MainScreen(navController: NavController, viewModel: TrackerViewModel) {
    val payments by viewModel.allPayments.collectAsState()
    val textFieldMoney = remember {
        mutableStateOf("")
    }

    Scaffold(
        content = {
            Column(modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        //.background(Color.Black)
                        .padding(start = 32.dp, end = 20.dp)
                        .height(90.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Expense Tracker", fontSize = 34.sp)
                    Spacer(Modifier.width(40.dp))
                    IconButton(
                        onClick = {
                            navController.navigate("Settings")
                        },
                        Modifier.size(50.dp)
                            .background(Color(0x0DFC8080), RoundedCornerShape(100))
                            .border(
                            2.dp,
                            Color.Transparent,
                            RoundedCornerShape(100)
                        )
                    ) {
                        Icon(Icons.Outlined.Settings, "Settings")
                    }
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
                            colors = CardDefaults.cardColors(Color(0xFF4FD07C)),
                            modifier = Modifier
                                .fillMaxSize()
                                .border(
                                    width = 2.dp,
                                    Color.Black,
                                    shape = RoundedCornerShape(40.dp, 0.dp, 40.dp, 0.dp)
                                )
                        ) {
                            Column(
                                modifier = Modifier.fillMaxWidth()
                                    .padding(36.dp),
                                horizontalAlignment = Alignment.End
                            ) {
                                Text("Spend Goal :", fontSize = 32.sp, fontFamily = FontFamily.Monospace)

                                Spacer(modifier = Modifier.height(10.dp))

                                Text("15000 INR", textAlign = TextAlign.Center ,fontSize = 24.sp, fontFamily = FontFamily.Monospace)
                            }
                            Spacer(Modifier.height(30.dp))
                            Column(
                                modifier = Modifier.fillMaxSize()
                                    .padding(top = 6.dp, bottom = 3.dp, start = 20.dp, end = 10.dp),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text("Total Spend :", fontSize = 32.sp, fontFamily = FontFamily.Monospace)
                                Spacer(Modifier.height(10.dp))
                                Text("4048 INR", textAlign = TextAlign.Center, fontSize = 24.sp, fontFamily = FontFamily.Monospace)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = textFieldMoney.value,
                        onValueChange = {
                            textFieldMoney.value = it
                        },
                        label = {
                            Text("Enter Spend")
                        }
                    )
                    Spacer(Modifier.width(5.dp))
                    ExtendedFloatingActionButton(
                        onClick = {

                        }
                    ) {
                        Text("Save")
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
                    items(2) {
                       Card(
                           shape = RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp),
                           elevation = CardDefaults.elevatedCardElevation(8.dp),
                           modifier = Modifier.fillMaxWidth(.9f)
                               .height(90.dp).border(
                                   2.dp,
                                   Color.Black,
                                   RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp))
                       ) {
                           Column(
                               modifier = Modifier.fillMaxSize()
                                   .padding(16.dp),
                               horizontalAlignment = Alignment.Start,
                               verticalArrangement = Arrangement.SpaceEvenly
                           ) {
                               Row(
                                   modifier = Modifier.fillMaxWidth(),
                                   horizontalArrangement = Arrangement.SpaceBetween,
                                   verticalAlignment = Alignment.CenterVertically
                               ) {
                                   Text("Payment Message :", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                   Text("payment price", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                               }
                               Spacer(modifier = Modifier.height(5.dp))
                               Text("Date", fontSize = 10.sp, fontWeight = FontWeight.Light)
                           }
                       }
                        Spacer(Modifier.height(10.dp))
                    }
                }
            }
        }
    )
}