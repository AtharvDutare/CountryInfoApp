package com.example.countryinfoapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.countryinfoapp.data.CountryInfo

@Composable
fun MainScreen(data:List<CountryInfo>,innerPaddingValues: PaddingValues) {
//    Surface(modifier = Modifier
//        .fillMaxSize()
//        .border(1.dp, Color.Black)
//        ,color = MaterialTheme.colorScheme.surface, shadowElevation = 2.dp
//    ) {
//        CountryCard(data)
//        CountryCard(data)
//        CountryCard(data)
//        CountryCard(data)
//    }
    Surface(modifier = Modifier.fillMaxSize().padding(innerPaddingValues)) {
//       Column(modifier = Modifier.fillMaxSize()) {
//           data.forEach {
//               CountryCard(data = it)
//           }
//       }
        LazyColumn {
            items(data) {
                CountryCard(data = it)
            }

        }
    }
}