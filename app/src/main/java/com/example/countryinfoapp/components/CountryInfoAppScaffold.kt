package com.example.countryinfoapp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.example.countryinfoapp.data.CountryInfo

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountryInfoWithScaffold(data:List<CountryInfo>) {
    val scrollBehavior=TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
                title = { Text(text = "CountryAppInfo")}
                , colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                    , titleContentColor = MaterialTheme.colorScheme.primary
                )
                , navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Clear, contentDescription = "Clear")
                    }
                }
                , actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Search, contentDescription = "search")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Share, contentDescription = "Share")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "MoreVert")
                    }
                }
                , scrollBehavior = scrollBehavior
            )
        }
        , bottomBar = {
            BottomAppBar (

            ){
                Spacer(modifier = Modifier.weight(1.0f))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "search")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.AddCircle, contentDescription = "Share")
                }
            }
        }
        , floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ }
                , containerColor = BottomAppBarDefaults.bottomAppBarFabColor
                , elevation = FloatingActionButtonDefaults.elevation()
            ) {
                Icon(imageVector = Icons.Filled.Create, contentDescription = "add Country")
            }
        }
    ) {

        MainScreen(data = data,it)
    }
}
