package com.boardquest.ui.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.EditCalendar
import androidx.compose.material.icons.outlined.PeopleAlt
import androidx.compose.material.icons.outlined.SportsEsports
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Statistics(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
                    .shadow(8.dp, RoundedCornerShape(25.dp))
                    .clip(shape = RoundedCornerShape(25.dp))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Outlined.SportsEsports,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color(0xFF2563EB)
                    )

                    Text(
                        text = "16",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Text(
                        text = "Igara",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
                    .shadow(8.dp, RoundedCornerShape(25.dp))
                    .clip(shape = RoundedCornerShape(25.dp))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
               Column (
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {
                   Icon(
                       imageVector = Icons.Outlined.PeopleAlt,
                       contentDescription = null,
                       modifier = Modifier.size(30.dp),
                       tint = Color(0xFF16A34A)
                   )

                   Text(
                       text = "25",
                       style = MaterialTheme.typography.headlineSmall,
                       fontWeight = FontWeight.ExtraBold
                   )

                   Text(
                       text = "Klubova",
                       style = MaterialTheme.typography.bodyMedium
                   )
               }
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
                    .shadow(8.dp, RoundedCornerShape(25.dp))
                    .clip(shape = RoundedCornerShape(25.dp))
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Outlined.EditCalendar,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp),
                        tint = Color(0xFF9333EA)
                    )

                    Text(
                        text = "24",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Text(
                        text = "Događaja",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}