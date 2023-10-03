package com.example.rooftopper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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



@Preview
@Composable
fun itemFullScreen(title: String = "Constructiesite m. kraan") {

    Column (
        modifier = Modifier
            .background(Color.White)
            .padding(5.dp)
    ) {

        Card (shape = RoundedCornerShape(5.dp)){
            Image(
                painter = painterResource(id = R.drawable.construction),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
        Text(text = title, fontWeight = FontWeight.ExtraBold)

        Text(text = "Nieuwpoortstraat 15, 9000 Gent")



        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Information")
        Text(text = "3 months, 5days old  (added 15/02/2023)")

        Spacer(modifier = Modifier.height(300.dp))
        Text(text = "Comments")
    }



}
