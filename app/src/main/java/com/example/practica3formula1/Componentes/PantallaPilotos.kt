package com.example.practica3formula1.Componentes


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica3formula1.Pilotos.Pilotos
import com.example.practica3formula1.R
import com.example.practica3formula1.ui.theme.AlfaRomeo
import com.example.practica3formula1.ui.theme.AlphaTauri
import com.example.practica3formula1.ui.theme.Alpine
import com.example.practica3formula1.ui.theme.AstonMartin
import com.example.practica3formula1.ui.theme.McLaren
import com.example.practica3formula1.ui.theme.Mercedes
import com.example.practica3formula1.ui.theme.RedBull
import com.example.practica3formula1.ui.theme.Williams

@Composable
fun FantasyF1() {
    var lista by remember { mutableStateOf(generateSampleData()) }
    var searchQuery by remember { mutableStateOf("") }
    var isHintVisible by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // SearchBar
        SearchBar(
            searchQuery = searchQuery,
            onValueChange = { newQuery ->
                searchQuery = newQuery
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        // Lista de pilotos
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .weight(1f)
        ) {
            val filteredList = lista.filter { piloto ->
                piloto.equipo.contains(searchQuery, ignoreCase = true)
            }

            items(filteredList) { piloto ->
                FilaPiloto(piloto)
            }
        }

        // Botones de agregar y eliminar piloto
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color.White),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    // Lógica para agregar piloto
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text("Agregar piloto")
            }

            // Eliminar piloto
            Button(
                onClick = {
                    // Lógica para eliminar piloto
                },
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            ) {
                Text("Eliminar piloto")
            }
        }
    }
}

@Composable
fun FilaPiloto(piloto: Pilotos) {
    val borderColor = when (piloto.equipo) {
        "Red Bull" -> RedBull
        "Ferrari" -> Color.Red
        "Mercedes" -> Mercedes
        "McLaren" -> McLaren
        "Alpine" -> Alpine
        "Aston Martin" -> AstonMartin
        "Williams" -> Williams
        "Alfa Romeo" -> AlfaRomeo
        "Alpha Tauri" -> AlphaTauri
        "Haas" -> Color.Black
        else -> Color.White
    }
    Column (modifier = Modifier.fillMaxWidth()){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .drawBehind {
                    // Dibuja un borde por el lado derecho
                    drawLine(
                        color = borderColor,
                        strokeWidth = 10f,
                        start = Offset(size.width, 0f),
                        end = Offset(size.width, size.height),
                    )
                    // Dibuja un borde por arriba
                    drawLine(
                        color = borderColor,
                        strokeWidth = 10f,
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                    )
                },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = piloto.nombre,
                    modifier = Modifier.padding(bottom = 3.dp)
                )
                Text(
                    text = piloto.equipo,
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }

            Text(
                text = "Puntos último GP: ${piloto.puntosGP}",
                modifier = Modifier.padding(bottom = 1.dp)
            )

            Image(
                painter = painterResource(id = piloto.imagen),
                contentDescription = "",
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
            )
        }
    }
}

fun generateSampleData(): List<Pilotos> {
    // Simplemente devuelve una lista de ejemplo
    return listOf(
        Pilotos("Max Verstappen", R.drawable.verstappen, "Red Bull", 26),
        Pilotos("Sergio Pérez", R.drawable.perez, "Red Bull", 15),
        Pilotos("Carlos Sainz", R.drawable.sainz, "Ferrari", 10),
        Pilotos("Charles Leclerc", R.drawable.leclerc, "Ferrari", 0),
        Pilotos("Lewis Hamilton", R.drawable.hamilton, "Mercedes", 8),
        Pilotos("George Russell", R.drawable.russell, "Mercedes", 6),
        Pilotos("Lando Nosrris", R.drawable.norris, "McLaren", 12),
        Pilotos("Oscar Piastri", R.drawable.piastri, "McLaren", 4),
        Pilotos("Esteban Mojón", R.drawable.mojon, "Alpine", 0),
        Pilotos("Pierre Gasly", R.drawable.gasly, "Alpine", 1),
        Pilotos("Fernando Alonso", R.drawable.alonso, "Aston Martin", 18),
        Pilotos("Lance Stroll", R.drawable.stroll, "Aston Martin", 2),
        Pilotos("Alexander Albon", R.drawable.albon, "Williams", 0),
        Pilotos("Logan Sargeant", R.drawable.sargeant, "Williams", 0),
        Pilotos("Valteri Bottas", R.drawable.bottas, "Alfa Romeo", 0),
        Pilotos("Guanyu Zhou", R.drawable.zhou, "Alfa Romeo", 0),
        Pilotos("Daniel Ricciardo", R.drawable.ricciardo, "Alpha Tauri", 0),
        Pilotos("Yuki Tsunoda", R.drawable.tsunoda, "Alpha Tauri", 0),
        Pilotos("Nico Hulkenberg", R.drawable.hulkenberg, "Haas", 0),
        Pilotos("Kevin Magnussen", R.drawable.magnussen, "Haas", 0)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    searchQuery: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    var isHintVisible by remember { mutableStateOf(true) }

    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.sports_motorsports_fill0_wght400_grad0_opsz24),
            contentDescription = null,
            modifier = Modifier.size(35.dp),
        )

        TextField(
            value = searchQuery,
            onValueChange = {
                onValueChange(it)
                isHintVisible = it.isEmpty()
            },
            placeholder = {
                if (isHintVisible) {
                    Text("Busca por equipo")
                }
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
        )
    }
}