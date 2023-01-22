package com.sharlee.boilerplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sharlee.boilerplate.ui.theme.BoilerplateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoilerplateTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                    BoilerplateScreen()
                }
            }
        }
    }
}

@Composable
fun BoilerplateScreen() {
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppPreview() {
    BoilerplateTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            BoilerplateScreen()
        }
    }
}