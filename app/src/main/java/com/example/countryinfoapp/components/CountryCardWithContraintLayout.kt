package com.example.countryinfoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import coil3.compose.AsyncImage
import com.example.countryinfoapp.data.CountryInfo

@Composable
fun CountryCardWithContraintLayout(data: CountryInfo) {
    ConstraintLayout(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(2.dp)
            .border(1.dp, Color.Black),
    ) {
        val (
                flag
                ,commonName
                ,capital
                ,officialName
                ,region
                ,subRegion
                ,circularText
                ,currencyName
                ,mobileCode
                ,number
        )=createRefs()
//
//        val imageResId = data.flagId
//        val imagePainter = painterResource(id = imageResId)
//
//        Image(
//            painter = imagePainter,
//            contentDescription = "country Image",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .fillMaxWidth(0.35f)
//                .height(60.dp)
//                .padding(2.dp)
//                .constrainAs(flag) {
//                    top.linkTo(parent.top)
//                    start.linkTo(parent.start)
//                }
//        )
        AsyncImage(model = data.flagId
            , contentDescription = data.commonName
            , contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth(0.35f)
                .height(60.dp)
                .padding(2.dp)
                .constrainAs(flag) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
            )

        Text(
            text = data.commonName,
            modifier = Modifier
                .fillMaxWidth(1.0f)
                .padding(2.dp)
                .constrainAs(commonName) {
                    top.linkTo(flag.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(flag.end)
                }
            , fontSize = 20.sp
            , textAlign = TextAlign.Center
        )
        Text(
            text = data.nationalCapital,
            modifier = Modifier
                .fillMaxWidth(1.0f)
                .padding(2.dp)
                .constrainAs(capital) {
                    start.linkTo(parent.start)
                    top.linkTo(commonName.bottom)
                    end.linkTo(flag.end)
                }
            , fontSize = 15.sp
            , textAlign = TextAlign.Center
        )

        Text(
            text = data.officialName,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(officialName) {
                    start.linkTo(flag.end)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(0.65f)
        )
        Text(
            text = data.region,
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(region) {
                    top.linkTo(officialName.bottom)
                    start.linkTo(flag.end)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(0.8f)
            ,textAlign = TextAlign.Center
        )

        Text(
            text = data.subRegion,
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(subRegion) {
                    top.linkTo(region.bottom)
                    start.linkTo(flag.end)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(0.8f)
            ,textAlign = TextAlign.Center
        )

        CircularText(text = data.currencySymbol
        , modifier = Modifier.constrainAs(circularText) {
                start.linkTo(flag.end)
                bottom.linkTo(parent.bottom, margin = 16.dp)
            }
            )
        Text(
            text = data.currencyName,
            fontSize = 15.sp,
            modifier = Modifier
                .constrainAs(currencyName) {
                    top.linkTo(subRegion.bottom)
                    start.linkTo(circularText.end, margin = 12.dp)
                    bottom.linkTo(parent.bottom, margin = 5.dp)
                    end.linkTo(mobileCode.start)
                }
        )

        Text(
            text = data.mobileCode,
            modifier = Modifier
                .constrainAs(mobileCode) {
                    top.linkTo(subRegion.bottom)
                    end.linkTo(parent.end)

                }
                .width(70.dp)
        )
        Text(
            text = data.tld,
            modifier = Modifier
                .constrainAs(number) {
                    top.linkTo(mobileCode.bottom)
                    end.linkTo(parent.end)
                }
                .width(70.dp)
        )
    }
}

