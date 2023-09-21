package com.example.vpnappclonelikeflutter.view.home_page

import androidx.annotation.ColorInt
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vpnappclonelikeflutter.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePageConnect() {
    Scaffold(
        containerColor = Color(0xFF181818),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color(0xFF333333),

                ),
                title = {

                },
                navigationIcon = {
                    IconButton(onClick = {
                        println("Hello world")
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    Row {
                        IconButton(onClick = {
                            //enter your drawer here
                            //DrawerHomePage()
                            println("Location hello world")
                        }) {
                            Icon(
                                imageVector = Icons.Filled.LocationOn,
                                contentDescription = "Localized description"
                            )


                        }
                        IconButton(onClick = {
                            //DrawerHomePage()
                            println("Hello star")
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "Localized description"
                            )


                        }
                    }

                }
            )
        },



        ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(), contentAlignment = Alignment.Center){
                val imageRes = painterResource(id = R.drawable.circut)
                Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.TopCenter){
                    Image(painter = imageRes, contentDescription = null, modifier = Modifier.fillMaxSize())

                }

                Box(contentAlignment = Alignment.Center
                    ){
                    Button(onClick = { println("Connect button is here") }, modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .padding(top = 16.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0x00FFFFFF))) {

                    }
                }




            }
        }

    }
}
