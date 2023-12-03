package com.example.practica3formula1.Componentes

import Rutas.Rutas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.practica3formula1.Pilotos.Pilotos
import com.example.practica3formula1.Pilotos.PilotosViewModel

@Composable
fun DetallesPiloto(navController: NavHostController, piloto: Pilotos, viewModel: PilotosViewModel) {
    val informacionAdicional = viewModel.informacionAdicional[piloto.nombre] ?: ""

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Nombre y equipo
        Text(
            text = piloto.nombre,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = piloto.equipo,
            color = Color.Gray,
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Imagen
        Image(
            painter = painterResource(id = piloto.imagen),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = RoundedCornerShape(8.dp))
        )

        // Información adicional
        Text(
            text = "Puntos GP: ${piloto.puntosGP}",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "Información adicional: $informacionAdicional",
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Botón para volver
        Button(
            onClick = { navController.navigate(Rutas.PantallaPilotos.ruta) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver")
        }
    }
}