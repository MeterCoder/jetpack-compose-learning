package com.example.jetpackcomposelearning.modules.buildingBasicLayout

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.jetpackcomposelearning.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ImageViewScreen(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text("Image View") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary              )
            )
        }
    ) {
      Box(){
          Greeting()
      }
    }
}

@Composable
fun Greeting(){
    val image = painterResource(R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null
    )

}