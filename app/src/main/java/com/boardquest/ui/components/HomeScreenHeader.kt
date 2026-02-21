package com.boardquest.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreenHeader() {
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(start = 24.dp)
    ) {
        Text(text = "Ćaooo👋", style = MaterialTheme.typography.titleSmall)
        Text(text = "Otkrivamo Igre", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
    }
}