package com.example.countryinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.countryinfoapp.components.CountryInfoWithScaffold
import com.example.countryinfoapp.components.MainScreen
import com.example.countryinfoapp.data.CountryInfo
import com.example.countryinfoapp.data.getCountryList
import com.example.countryinfoapp.ui.theme.CountryInfoAppTheme

class MainActivity : ComponentActivity() {
//    private val indiaInfo=CountryInfo(
//        R.drawable.`in`,
//        "india",
//        "delhi",
//        "republic of india",
//        "Asia",
//        "South Asia",
//        "$",
//        "Indian Rupee",
//        "+91",
//        "number"
//
//    )

    private val countiesInfo= getCountryList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //MainScreen(countiesInfo)
            CountryInfoAppTheme {
                CountryInfoWithScaffold(countiesInfo)
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    val indiaInfo=CountryInfo(
//        R.drawable.`in`,
//        "india",
//        "delhi",
//        "republic of india",
//        "Asia",
//        "South Asia",
//        "$",
//        "Indian Rupee",
//        "+91",
//        "number"
//
//    )
//    MainScreen(getCountryList())
//}