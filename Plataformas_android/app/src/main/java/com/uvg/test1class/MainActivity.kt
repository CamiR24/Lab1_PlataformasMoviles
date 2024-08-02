package com.uvg.test1class

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.uvg.test1class.ui.theme.Pink40
import com.uvg.test1class.ui.theme.Pink80
import com.uvg.test1class.ui.theme.Purple40
import com.uvg.test1class.ui.theme.Purple80
import com.uvg.test1class.ui.theme.PurpleGrey40
import com.uvg.test1class.ui.theme.Test1ClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test1ClassTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        name = "Camila",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(name: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {
            Text(text = "Hello $name!",
                color = Purple40,
                fontWeight = FontWeight.Black,
                lineHeight = 4.em,
                fontSize = 38.sp,
                fontFamily = FontFamily.Monospace,
                letterSpacing = 3.sp
                )
            Text(
                text = "Welcome back to your program!",
                color = Purple80,
                lineHeight = 1.em,
                fontSize = 34.sp,
                fontFamily = FontFamily.Cursive
                )
            Text(
                text = "Ready for a new challenge?",
                color = Purple40,
                lineHeight = 3.em,
                fontSize = 25.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Cursive,
                )
             Button(
                onClick = { /*TODO*/ },
                shape = ButtonDefaults.shape,
                colors = ButtonDefaults.buttonColors(Purple40)) {
                Text(text = "Continuar")
            
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun MainScreenPreview() {
    Test1ClassTheme {
        MainScreen("Camila")
    }
}