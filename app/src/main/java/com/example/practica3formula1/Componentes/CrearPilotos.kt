package com.example.practica3formula1.Componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.practica3formula1.Pilotos.Pilotos
import com.example.practica3formula1.Pilotos.PilotosViewModel
import com.example.practica3formula1.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CrearPilotos(viewModel: PilotosViewModel, onPilotoCreado: (Pilotos) -> Unit) {
    var nombre by remember { mutableStateOf("") }
    var equipo by remember { mutableStateOf("") }
    var puntosGP by remember { mutableStateOf(0) }
    var imagenUri by remember { mutableStateOf<Int?>(null) }
    var dropdownExpanded by remember { mutableStateOf(false) }

    // Lista de equipos
    val equipos = listOf("Red Bull", "Ferrari", "Mercedes", "McLaren", "Alpine", "Aston Martin", "Williams", "Alfa Romeo", "Alpha Tauri", "Haas")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Nombre del piloto:")
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Text("Equipo del piloto:")
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray.copy(alpha = 0.1f))
                .padding(8.dp)
                .clickable { dropdownExpanded = true }
        ) {
            Text( "Equipo seleccionado: $equipo", modifier = Modifier.padding(16.dp))
            DropdownMenu(
                expanded = dropdownExpanded,
                onDismissRequest = { dropdownExpanded = false }
            ) {
                equipos.forEach { team ->
                    DropdownMenuItem(text = { Text(text = team) }, onClick = { equipo = team
                        dropdownExpanded = true })
                }
            }
        }

        // Slider de puntos GP
        Text("Puntos en el GP: $puntosGP")
        Slider(
            value = puntosGP.toFloat(),
            onValueChange = { puntosGP = it.toInt() },
            valueRange = 0f..26f,
            steps = 27,
            modifier = Modifier.fillMaxWidth()
        )

        // Botón para crear el piloto
        Button(
            onClick = {
                val nuevoPiloto = Pilotos(nombre, imagenUri ?: R.drawable.alonso, equipo, puntosGP)
                viewModel.agregarPiloto(nuevoPiloto) // Asegúrate de tener esta función en tu ViewModel
                onPilotoCreado(nuevoPiloto)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Crear Piloto")
        }
    }
}