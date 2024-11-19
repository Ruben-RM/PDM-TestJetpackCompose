package com.example.ejemplocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplocompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNewComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun MyPreview() {
    MyNewComposeTheme {
        //MyBox()
        //MyColumn()
        //MyRow()
        //MyComplexLayout()
        MyComplexLayout2()
    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterEnd) {
        Box(modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .background(Color.Cyan)
            .verticalScroll(rememberScrollState()),
            contentAlignment = Alignment.Center) {
            Text("Esto es un EJEMPLO")
        }
    }
}

@Composable
fun MyColumn() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Ejemplo1", modifier = Modifier.background(Color.Red).weight(1f))
        Text("Ejemplo2", modifier = Modifier.background(Color.Black).weight(1f))
        Text("Ejemplo3", modifier = Modifier.background(Color.Cyan).weight(1f))
        Text("Ejemplo4", modifier = Modifier.background(Color.Green).weight(1f))
    }
}

@Composable
fun MyRow() {
    Row(modifier = Modifier.fillMaxSize()
        .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text("Ejemplo1", modifier = Modifier.background(Color.Red).size(100.dp))
        Text("Ejemplo2", modifier = Modifier.background(Color.Black).size(100.dp))
        Text("Ejemplo3", modifier = Modifier.background(Color.Cyan).size(100.dp))
        Text("Ejemplo4", modifier = Modifier.background(Color.Green).size(100.dp))
        Text("Ejemplo1", modifier = Modifier.background(Color.Red).size(100.dp))
        Text("Ejemplo2", modifier = Modifier.background(Color.Black).size(100.dp))
        Text("Ejemplo3", modifier = Modifier.background(Color.Cyan).size(100.dp))
        Text("Ejemplo4", modifier = Modifier.background(Color.Green).size(100.dp))
        Text("Ejemplo1", modifier = Modifier.background(Color.Red).size(100.dp))
        Text("Ejemplo2", modifier = Modifier.background(Color.Black).size(100.dp))
        Text("Ejemplo3", modifier = Modifier.background(Color.Cyan).size(100.dp))
        Text("Ejemplo4", modifier = Modifier.background(Color.Green).size(100.dp))
    }
}

@Composable
fun MyComplexLayout() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Box(modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Red))
            Box(modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Magenta),
                contentAlignment = Alignment.Center) {
                Text("Hola clase!")
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Gray))
    }
}

@Composable
fun MyComplexLayout2() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Cyan))
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Box(modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Red))
            Box(modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Magenta),
                contentAlignment = Alignment.Center) {
                Text("Hola clase!")
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Gray))
    }
}