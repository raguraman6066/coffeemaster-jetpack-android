package com.example.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeemasters.ui.theme.CoffeeMastersTheme

@Preview
@Composable
fun App_Preview() {
    CoffeeMastersTheme {
        App()
    }
}
@Composable
fun App() {
    var currentRoute= remember {
        mutableStateOf(Routes.MenuPage.route)
    }
    Scaffold(topBar = {
        TopAppBar() {
            AppTitle()
        }
    }, bottomBar = {
       NavBar(
           selectedRoute=currentRoute.value,
           onChange = {
           currentRoute.value=it
       })
    }) {
       OffersPage()
    }
}


@Composable
fun AppTitle() {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
    Image(
       painter = painterResource(id = R.drawable.logo),
       contentDescription ="Coffee Master Logo")
    }
}
