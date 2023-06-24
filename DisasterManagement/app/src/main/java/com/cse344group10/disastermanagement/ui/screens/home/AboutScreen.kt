package com.cse344group10.disastermanagement.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    backAction: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "About Disaster Management App",
                        textAlign = TextAlign.Justify
                    ) },
                navigationIcon = {
                    IconButton(onClick = backAction) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
                    }
                }
            )
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            item {
                Text(
                    text = "This app is developed by:",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 20.sp


                )
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ){
                    Column(modifier = Modifier.fillMaxWidth()){

                        Text(
                            text = " Name-surname: Begüm Yıldırım\n School number: 20200702062",
                            fontSize = 18.sp
                        )

                    }
                }
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ){
                    Column(modifier = Modifier.fillMaxWidth()){

                        Text(
                            text = " Name-surname: İrem Tuğba Sağsöz\n School number: 20200702079",
                            fontSize = 18.sp
                        )

                    }
                }
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ){
                    Column(modifier = Modifier.fillMaxWidth()){

                        Text(text = " Name-surname: Taha Eren Keleş\n School number: 20200702028",
                            fontSize = 18.sp
                        )

                    }
                }
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ){
                    Column(modifier = Modifier.fillMaxWidth()){

                        Text(text = " Name-surname: Yahya Koyuncu\n School number: 20200702058",
                            fontSize = 18.sp)

                    }
                }
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ){
                    Column(modifier = Modifier.fillMaxWidth()){

                        Text(text = " Name-surname: Oğuzhan İçelliler\n School number: 20200702042",
                            fontSize = 18.sp)

                    }
                }
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ){
                    Column(modifier = Modifier.fillMaxWidth()){

                        Text(text = " Name-surname: Umut Aydın\n School number: 20200702020",
                            fontSize = 18.sp)

                    }
                }
            }
            item{
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ){
                    Column(modifier = Modifier.fillMaxWidth()){

                        Text(text = " Name-surname: Burak Eymen Çevik\n School number: 20200702123 ",
                            fontSize = 18.sp)

                    }
                }
            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun AboutScreenPreview() {
    AboutScreen()
}