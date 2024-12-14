package com.example.countryinfoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.countryinfoapp.R
import com.example.countryinfoapp.data.CountryInfo

val indiaInfo=CountryInfo(
    R.drawable.`in`,
    "india",
    "delhi",
    "republic of india",
    "Asia",
    "South Asia",
    "$",
    "Indian Rupee",
    "+91",
    "number"

)
@Preview(showBackground = true)
@Composable
fun t() {
    CountryCards(data = indiaInfo)
}

@Composable
fun CountryCards(data:CountryInfo){
    Surface(
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .padding(10.dp)
            .wrapContentHeight(align = Alignment.Top)
            .border(1.dp, Color.Black), shadowElevation = 3.dp
    ) {
        //Text(text="Hello World", modifier = Modifier.padding(4.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(2.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.2f)
                    .padding(2.dp)
            ) {
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .width(80.dp)
                        .padding(2.dp), contentAlignment = Alignment.Center
                ) {
                    val imageResId = data.flagId
                    val imagePainter = painterResource(id = imageResId)

                    Image(
                        painter = imagePainter,
                        contentDescription = "country Image",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = data.commonName,
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp)
                    , fontSize = 20.sp
                    , textAlign = TextAlign.Center
                )
                Text(
                    text = data.nationalCapital,
                    modifier = Modifier
                        .fillMaxWidth(1.0f)
                        .padding(2.dp), fontSize = 15.sp, textAlign = TextAlign.Center
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(1.0f)
                    .padding(2.dp)
            ) {
                Text(
                    text = data.officialName,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = data.region,
                    fontSize = 15.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = data.subRegion,
                    fontSize = 15.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Row(
                    modifier = Modifier.fillMaxWidth(1.0f),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CircularText(text = data.currencySymbol, modifier = Modifier)
                    Text(
                        text = data.currencyName,
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(0.2f),
                        textAlign = TextAlign.Center
                    )
                    Column(
                        modifier = Modifier.fillMaxWidth(0.6f), horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = data.mobileCode,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                        Text(
                            text = data.tld,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CountryCard(data: CountryInfo) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .padding(5.dp)
            .border(1.dp, Color.DarkGray)
            .wrapContentHeight(align = Alignment.Top)

    ) {
        CountryCardWithContraintLayout(data)
    }
}