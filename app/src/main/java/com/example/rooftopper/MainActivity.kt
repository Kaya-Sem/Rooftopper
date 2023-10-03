package com.example.rooftopper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rooftopper.ui.theme.RooftopperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RooftopperTheme {
                // A surface container using the 'background' color from the theme

            }
        }
    }

@Preview(showBackground = true)
@Composable
fun ItemCard() {
    RooftopperTheme {
        Card (

            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(15.dp)
                .clickable { } // #TODO
        ){
            Text(text = "Titel")
            Text(text = "adress")


        }
    }
    }
}


