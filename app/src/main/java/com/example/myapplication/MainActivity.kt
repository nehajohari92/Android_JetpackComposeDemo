package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            callUi()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Message1")
@Composable
fun textField(){
    val state = remember{mutableStateOf("")}
    TextField(value = state.value,
        onValueChange = {
            state.value=it
        })
}

//For Button
/*@Preview(showBackground = true, showSystemUi = true, name = "Message1")
@Composable
fun clickButton() {
    Button(onClick = {},colors=ButtonDefaults.buttonColors(
        contentColor = Color.Blue,
        backgroundColor = Color.White), enabled = false
    ) {
        Text(text = "Hello")
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "image")
    }
}*/

//For Text
/*@Preview(showBackground = true, showSystemUi = true, name = "Message1")
@Composable()
fun inputTextType(name: String = "Hello") {
    Text(
        text = "demo $name",
        textAlign = TextAlign.Center,
        color = Color.Blue,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Default,
        fontSize = 20.sp
    )
}*/

//For Image preview
/*@Preview(showBackground = true, showSystemUi = true, name = "Message1")
@Composable()
fun inputImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "DummyImage",
        alignment = Alignment.CenterStart
        )
}*/
