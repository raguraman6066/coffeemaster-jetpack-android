package com.example.coffeemasters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeemasters.ui.theme.CoffeeMastersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeMastersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                 //   modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  // Greeting("Android")
                   App()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoffeeMastersTheme {
        Greeting("World")
    }
}

@Preview(showBackground = true)
@Composable
fun ShowName(){

    var name= remember{
        mutableStateOf("")
    }
    Column() {
        Text(
            text = "hi guys ${name.value}",
            modifier = Modifier
                .padding(10.dp)
                .background(color = Color.Yellow)
                .padding(10.dp)
        )
        Text(text = "welcome to jetpack")

        TextField(value = name.value, onValueChange = {
            name.value=it
        })
    }

}