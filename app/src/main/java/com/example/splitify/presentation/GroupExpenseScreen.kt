package com.example.splitify.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GroupExpenseScreen(navController: NavHostController) {
    Scaffold(topBar = {
        TopAppBar(title = { }, navigationIcon = {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.size(50.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        })
    }, floatingActionButton = {
        Card(
            elevation = CardDefaults.cardElevation(30.dp), modifier = Modifier
                .height(80.dp)
                .shadow(5.dp)
                .width(200.dp), colors = CardDefaults.cardColors(Color.White),
            onClick = {navController.navigate("ExpenseHistory")}
        ) {
            Text(text = "Expense history",modifier = Modifier.padding(top = 30.dp).padding(horizontal = 8.dp), fontWeight = FontWeight.Medium, textAlign = TextAlign.Center, fontSize = 25.sp)
        }}, floatingActionButtonPosition = FabPosition.Center) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValues.calculateTopPadding() + 10.dp)
                .padding(horizontal = 25.dp), verticalArrangement = Arrangement.Top
        ) {

            Text(
                text = "Expenses",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(40.dp))

            Text(text = "No Expenses")

        }

    }
}