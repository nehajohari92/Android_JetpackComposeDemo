package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun callUi() {
 /* Column() {
        getData().map {
            cardStyle(header = it.header, desp = it.description)
        }
  }*/
    
    LazyColumn(content = {
        items(getData()){item ->
            cardStyle(header = item.header, desp = item.description)
        }
    })
}

@Composable
fun cardStyle(header: String, desp: String) {
    Card(
        elevation = 8.dp, modifier = Modifier.padding(8.dp)
    ) {
        Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(width = 2.dp, color = Color.Black, CircleShape)
                    .weight(.1f)
            )
            Column(
                modifier = Modifier
                    .padding(15.dp, 0.dp, 0.dp, 0.dp)
                    .weight(.9f)
            ) {
                Text(text = header, fontWeight = FontWeight.Bold)
                Text(text = desp, fontWeight = FontWeight.Thin)
            }
        }
    }
}

fun getData(): MutableList<ListData> {
    val list = mutableListOf<ListData>()
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    list.add(ListData("John", "Developer"))
    return list
}
