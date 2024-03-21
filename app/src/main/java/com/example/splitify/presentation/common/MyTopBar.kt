package com.example.splitify.presentation.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieClipSpec
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.splitify.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(navController : NavHostController) {
    TopAppBar(
        title = {  val composition by rememberLottieComposition(
            LottieCompositionSpec.RawRes(
                R.raw.game)
        )


            val clipSpecs = LottieClipSpec.Progress(
                min =  0.0f,
                max =  0.9f
            )


            LottieAnimation(
                composition = composition,
                clipSpec = clipSpecs,
                modifier = Modifier.size(50.dp),
                iterations =LottieConstants.IterateForever,
            )
        },
            actions = {Icon(
            imageVector = Icons.Filled.Menu,
            contentDescription = null,
            modifier = Modifier
                .size(35.dp)
                .clickable { navController.navigate("HamburgerScreen") }
        )},modifier = Modifier.padding(end = 16.dp)
    )
}