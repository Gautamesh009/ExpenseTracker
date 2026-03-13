package com.example.expensetraclerapp.UIDesign

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.twotone.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.expensetraclerapp.R


@Composable
fun Settings(navController: NavController) {
    val isSetBalOpen = remember { mutableStateOf(false) }
    val isAppearanceOpen = remember { mutableStateOf(false) }
    val isName = remember { mutableStateOf(false) }
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
                onClick = {
                    navController.navigate("MainScreen")
                },
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
                .background(Color.White)
                .padding(16.dp)
        ) {
            Card(
                colors = CardDefaults.cardColors(Color(0xFFFFE4DB)),
                elevation = CardDefaults.elevatedCardElevation(8.dp),
                shape = RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp),
                modifier = Modifier.border(
                    2.dp,
                    Color.Black,
                    RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp)
                )
                .animateContentSize(animationSpec = spring(Spring.DampingRatioLowBouncy,
                    Spring.StiffnessMedium)
                )
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .height(90.dp)
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Set Balance", fontSize = 32.sp)
                        IconButton(
                            onClick = {
                                if(isSetBalOpen.value == false) {
                                    isSetBalOpen.value = true
                                } else {
                                    isSetBalOpen.value = false
                                }
                            }
                        ) {
                            if(isSetBalOpen.value == false) {
                                Icon(Icons.Default.KeyboardArrowDown, null)
                            } else {
                                Icon(Icons.Default.KeyboardArrowUp, null)
                            }
                        }
                    }
                    if(isSetBalOpen.value == true) {
                        SetBal()
                    }
                }

            }
            Spacer(Modifier.height(10.dp))
            Card(
                colors = CardDefaults.cardColors(Color(0xFFFFE4DB)),
                elevation = CardDefaults.elevatedCardElevation(8.dp),
                shape = RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp),
                modifier = Modifier.border(
                    2.dp,
                    Color.Black,
                    RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp)
                ).animateContentSize(animationSpec = spring(Spring.DampingRatioLowBouncy,
                    Spring.StiffnessMedium
                )
                )
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .height(90.dp)
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Set Name", fontSize = 32.sp)
                        IconButton(
                            onClick = {
                                if(isName.value == false) {
                                    isName.value = true
                                } else {
                                    isName.value = false
                                }
                            }
                        ) {
                            if(isName.value == false) {
                                Icon(Icons.Default.KeyboardArrowDown, null)
                            } else {
                                Icon(Icons.Default.KeyboardArrowUp, null)
                            }
                        }
                    }
                    if(isName.value == true) {
                        SetName()
                    }
                }
            }

            Spacer(Modifier.height(10.dp))

            Card(
                colors = CardDefaults.cardColors(Color(0xFFFFE4DB)),
                elevation = CardDefaults.elevatedCardElevation(8.dp),
                shape = RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp),
                modifier = Modifier.border(
                    2.dp,
                    Color.Black,
                    RoundedCornerShape(20.dp, 0.dp, 20.dp, 0.dp)
                )
                    .animateContentSize(animationSpec = spring(Spring.DampingRatioLowBouncy,
                        Spring.StiffnessMedium
                    )
                    )
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .height(90.dp)
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Appearance", fontSize = 32.sp)
                        IconButton(
                            onClick = {
                                if(isAppearanceOpen.value == false) {
                                    isAppearanceOpen.value = true
                                } else {
                                    isAppearanceOpen.value = false
                                }
                            }
                        ) {
                            if(isAppearanceOpen.value == false) {
                                Icon(Icons.Default.KeyboardArrowDown, null)
                            } else {
                                Icon(Icons.Default.KeyboardArrowUp, null)
                            }
                        }
                    }
                    if(isAppearanceOpen.value == true) {
                        Appearance()
                    }
                }
            }
        }
    }
}

@Composable
fun SetBal() {
    var textFieldValue by rememberSaveable { mutableStateOf("") }
    var setBal by rememberSaveable { mutableStateOf("0") }
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = textFieldValue,
                onValueChange = {
                    textFieldValue = it
                },
                label = {
                    Text("Set Balance")
                },
                singleLine = true,
                modifier = Modifier.width(230.dp)
            )
            Spacer(Modifier.width(10.dp))
            ExtendedFloatingActionButton(
                onClick = {
                   setBal = textFieldValue
                }
            ) {
                Text("Save")
            }
        }
    }
}

@Composable
fun Appearance() {
    var checked by remember { mutableStateOf(false) }
    Column(
        Modifier.padding(16.dp)
    ) {
        Row(
            Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Light", fontSize = 24.sp)
            Spacer(Modifier.width(20.dp))
            Switch(
                checked = checked,
                onCheckedChange = {
                    checked = it
                },
                thumbContent = if (checked) {
                    {
                        Icon(painter = painterResource(id = R.drawable.baseline_dark_mode_24),
                            contentDescription = null,
                            modifier = Modifier.size(SwitchDefaults.IconSize)
                        )
                    }
                } else {
                    null
                }
            )
            Spacer(Modifier.width(20.dp))
            Text("Dark", fontSize = 24.sp)
        }
    }
}

@Composable
fun SetName() {
    val setName = remember { mutableStateOf("Unknown") }
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = setName.value,
                onValueChange = {
                    setName.value = it
                },
                label = {
                    Text("Set Name")
                },
                singleLine = true,
                modifier = Modifier.width(230.dp)
            )
            Spacer(Modifier.width(10.dp))
            ExtendedFloatingActionButton(
                onClick = {}
            ) {
                Text("Save")
            }
        }
    }
}