package com.boardquest.ui.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.boardquest.viewmodel.HomeViewModel

@Composable
fun PopularGames(homeViewModel: HomeViewModel = viewModel()) {
    val uiState by homeViewModel.uiState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Column {
                    Text(
                        text = "Popularne igre",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.W500
                    )
                }

                Column {
                    Text(
                        text = "Vidi sve",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color(0xFF2563EB)
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(

                ) {
                    uiState.popularGames.forEach { it ->
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                                .shadow(2.dp, RoundedCornerShape(25.dp))
                                .clip(shape = RoundedCornerShape(25.dp))
                                .background(Color.White)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(0.7f)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .weight(0.3f)
                                ) {
                                    AsyncImage(
                                        model = it.imageUrl,
                                        contentDescription = it.name,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .fillMaxHeight(),
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .weight(0.7f)
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
                                    .weight(0.3f),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .weight(0.3f)
                                ) {

                                }

                                Row(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .weight(0.7f)
                                        .padding(horizontal = 15.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = null,
                                        tint = Color(0xFFF59E0B)
                                    )

                                    Text(
                                        text = it.rating.toString(),
                                        style = MaterialTheme.typography.bodyLarge,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                    Text(
                                        text = "•",
                                        modifier = Modifier.padding(horizontal = 10.dp)
                                    )
                                    Text(text = it.minPlayers.toString() + " - " + it.maxPlayers.toString() + " igrača")
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))
                    }
                }
            }
        }
    }
}