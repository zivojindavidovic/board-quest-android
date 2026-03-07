package com.boardquest.ui.components.games

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    var query by rememberSaveable { mutableStateOf("") }
    var isFocused by remember { mutableStateOf(false) }

    val searchShape = RoundedCornerShape(10.dp)
    val containerColor = MaterialTheme.colorScheme.surfaceContainerHigh
    val borderColor = if (isFocused) Color(0xFF757575) else Color.Transparent
    val textColor = MaterialTheme.colorScheme.onSurface
    val placeholderColor = MaterialTheme.colorScheme.onSurfaceVariant

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
    ) {
        Text(
            text = "Društvene Igre",
            style = MaterialTheme.typography.headlineMedium.copy(
                platformStyle = PlatformTextStyle(includeFontPadding = false)
            ),
            fontWeight = FontWeight.SemiBold
        )

        BasicTextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier
                .fillMaxWidth()
                .onFocusChanged { isFocused = it.isFocused }
                .padding(vertical = 15.dp),
            singleLine = true,
            textStyle = MaterialTheme.typography.bodyLarge.copy(color = textColor),
            cursorBrush = SolidColor(textColor),
            decorationBox = { innerTextField ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .clip(searchShape)
                        .background(containerColor)
                        .border(3.dp, borderColor, searchShape)
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = placeholderColor,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Box(modifier = Modifier.weight(1f)) {
                        if (query.isEmpty()) {
                            Text(
                                text = "Pretraži igre...",
                                style = MaterialTheme.typography.bodyLarge,
                                color = placeholderColor
                            )
                        }
                        innerTextField()
                    }
                }
            }
        )
    }
}
