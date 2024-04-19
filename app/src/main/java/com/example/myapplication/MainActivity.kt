package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}
@Composable
fun App() {

    Column(
        Modifier
            .background(Color.White)
            .fillMaxSize()

    ) {
        Row(
            Modifier

                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text(text = "App de Noticias")
        }
        Column(
            Modifier
                .background(Color.Gray)
        ) {
            Row(
                Modifier

                    .fillMaxWidth(),

                ) {
                Text(text = "Título da Notícia")
            }

            Row(
                Modifier

                    .fillMaxWidth(),

                ) {
                Text(text = "Descrição Curta da Notícia")
            }

            Row(
                Modifier

                    .fillMaxWidth(),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }


        }
        Row(
            Modifier
                .padding(8.dp)
        ) {

        }
        Column(
            Modifier
                .background(Color.Gray)
        ) {
            Row(
                Modifier

                    .fillMaxWidth(),

                ) {
                Text(text = "Título da Notícia")
            }

            Row(
                Modifier

                    .fillMaxWidth(),

                ) {
                Text(text = "Descrição Curta da Notícia")
            }

            Row(
                Modifier

                    .fillMaxWidth(),
                Arrangement.Absolute.Right

            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Leia Mais")
                }
            }


        }
    }
}
@Composable
@Preview
fun AppPreview(){
    Text(text = "teste")

    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}
