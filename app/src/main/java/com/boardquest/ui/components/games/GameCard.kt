package com.boardquest.ui.components.games

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.PeopleOutline
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.boardquest.domain.Game

private val imageSize = 120.dp

@Composable
fun GameCard(it: Game) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(2.dp, RoundedCornerShape(25.dp))
            .clip(shape = RoundedCornerShape(25.dp))
            .background(Color.White)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = it.imageUrl,
                contentDescription = it.name,
                modifier = Modifier.size(imageSize),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(imageSize)
                    .padding(horizontal = 15.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = it.name,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = it.description,
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = imageSize + 15.dp, end = 15.dp, top = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.PeopleOutline,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.size(20.dp).padding(end = 5.dp)
            )
            Text(
                text = "${it.minPlayers} - ${it.maxPlayers}",
                color = Color.Gray
            )
            Icon(
                imageVector = Icons.Default.AccessTime,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.size(16.dp).padding(start = 12.dp, end = 5.dp)
            )
            Text(text = "60 - 120 min", color = Color.Gray)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = imageSize + 15.dp, end = 15.dp, top = 4.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Timeline,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.size(16.dp).padding(end = 5.dp)
            )
            Text(text = "Srednje", color = Color.Gray)
        }
    }
}
