package com.example.splitify.presentation

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.splitify.presentation.common.MyTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController : NavHostController) {
    Scaffold(topBar = { MyTopBar(navController) }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding())
        ) {
            Text(modifier = Modifier.fillMaxWidth(),
                text = "Monthly expenses tracker",
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF2764CB)
            )
            Spacer(modifier = Modifier.height(60.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Card(
                    modifier = Modifier.size(160.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(15.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "This month", fontSize = 18.sp, fontWeight = FontWeight.Light)
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "0", fontSize = 40.sp, fontWeight = FontWeight.Bold)

                    }
                }
                Card(
                    modifier = Modifier.size(160.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(15.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Past Prices", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                    }
                }

            }
            Spacer(modifier = Modifier.height(70.dp))
            Text(
                text = "Spent by:",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(
                    start = 36.dp
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Your Name: 0",
                fontWeight = FontWeight.Medium,
                fontSize = 25.sp,
                modifier = Modifier.padding(start = 36.dp),
                color = Color(0xFF2764CB)
            )
            Spacer(modifier = Modifier.height(120.dp))
            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Card(
                    modifier = Modifier
                        .width(160.dp)
                        .height(50.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.cardElevation(15.dp),
                    onClick = {navController.navigate("ExpenseCat")}
                ) {
                    Text(
                        text = "Past Prices",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 10.dp),
                        textAlign = TextAlign.Center
                    )
                }
                Card(elevation =CardDefaults.cardElevation(10.dp), colors = CardDefaults.cardColors(Color.White), shape = CircleShape) {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(55.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(.6f),
                        tint = Color(0xFF2764CB)
                    )
                }

                }
            }

        }
    }
}