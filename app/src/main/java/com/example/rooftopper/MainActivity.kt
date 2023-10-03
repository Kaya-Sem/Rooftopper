package com.example.rooftopper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rooftopper.ui.theme.RooftopperTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RooftopperTheme {
                // A surface container using the 'background' color from the theme

                Box {
                    itemFullScreen("Placeholder")
                }
                

            }
        }
    }


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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun addItem() {
var text by remember {mutableStateOf(TextFieldValue(""))}
    
    TextField(
        value = text, onValueChange = {newText -> text = newText},
        label = { Text(text = "title")},
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth(),
        placeholder = { Text(text = "bv. Fluvius kantoren m. kraan")}


    )
    

}


@Preview
@Composable
fun itemFullScreen(title: String = "Constructiesite m. kraan") {

    Column (
        modifier = Modifier
            .background(Color.White)
            .padding(5.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.construction), contentDescription = "", contentScale = ContentScale.Crop)
        Text(text = title, fontWeight = FontWeight.ExtraBold)
        Text(text = "Nieuwpoortstraat 15, 9000 Gent")
    }



}
