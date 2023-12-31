package com.example.vpnappclonelikeflutter.view.home_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vpnappclonelikeflutter.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePageDrawer(

){

                Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                    Box(modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)){
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = null
                        )
                    }
                    Box(modifier = Modifier.width(30.dp))
                    Box (modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .background(color = Color.DarkGray), contentAlignment = Alignment.CenterStart,){
                        Text(modifier = Modifier.align(Alignment.Center),text = "Free " +
                                "plan", fontWeight = FontWeight.Bold, fontSize = 12.sp, color = Color.Black, lineHeight = 20.sp)
                    }
                }

                Divider()
                NavigationDrawerItem(
                    label = {
                        Row {
                            Icon(
                                Icons.Rounded.AccountBox,
                                contentDescription = "Account"
                            )
                            Box(modifier = Modifier.width(10.dp))

                            Text(text = "Account")

                        }
                    },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                    label = {
                        Row {
                            Icon(
                                Icons.Rounded.Settings,
                                contentDescription = "Settings"
                            )
                            Box(modifier = Modifier.width(10.dp))

                            Text(text = "Settings")

                        }
                    },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                    label = {
                        Row {
                            Icon(
                                Icons.Rounded.Build,
                                contentDescription = "Filter"
                            )
                            Box(modifier = Modifier.width(10.dp))

                            Text(text = "Filter")

                        }
                    },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                    label = {
                        Row {
                            Icon(
                                Icons.Rounded.Star,
                                contentDescription = "Rate"
                            )
                            Box(modifier = Modifier.width(10.dp))

                            Text(text = "Rate us")

                        }
                    },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                    label = {
                        Row {
                            Icon(
                                Icons.Rounded.Send,
                                contentDescription = "Help And Feedback"
                            )
                            Box(modifier = Modifier.width(10.dp))

                            Text(text = "Help and Feedback")

                        }
                    },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
                NavigationDrawerItem(
                    label = {
                        Row {
                            Icon(
                                Icons.Rounded.Share,
                                contentDescription = "Share"
                            )
                            Box(modifier = Modifier.width(10.dp))

                            Text(text = "Share")

                        }
                    },
                    selected = false,
                    onClick = { /*TODO*/ }
                )
                // ...other drawer items



}