package com.boardquest.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.boardquest.domain.Game

@Composable
fun GameCard(game: Game) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = game.name, style = MaterialTheme.typography.titleMedium)
            Text(text = game.category, style = MaterialTheme.typography.bodySmall)
            Text(
                text = "Igrači: ${game.minPlayers}–${game.maxPlayers}",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}