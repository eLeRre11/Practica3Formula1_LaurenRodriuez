package Nav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practica3formula1.Componentes.CrearPilotos
import com.example.practica3formula1.Componentes.DetallesPiloto
import com.example.practica3formula1.Componentes.FantasyF1
import com.example.practica3formula1.Pilotos.PilotosViewModel

@Composable
fun GrafoNavegacion() {
    val navController = rememberNavController();
    val pilotosViewModel = remember { PilotosViewModel() }

    NavHost(navController = navController, startDestination = Rutas.Rutas.PantallaPilotos.ruta) {
        composable(Rutas.Rutas.PantallaPilotos.ruta) {
            FantasyF1(navController = navController, viewModel = pilotosViewModel)
        }
        composable(Rutas.Rutas.CrearPilotos.ruta) {
            CrearPilotos(viewModel = pilotosViewModel) { nuevoPiloto ->
                // Aquí puedes realizar alguna acción con el nuevo piloto creado si es necesario
                navController.navigate(Rutas.Rutas.PantallaPilotos.ruta)
            }
        }
        composable(Rutas.Rutas.DetallesPiloto.ruta + "/{piloto}") { backStackEntry ->
            val piloto = backStackEntry.arguments?.getString("piloto")
            val pilotoSeleccionado = pilotosViewModel.listaPilotos.find { it.nombre == piloto }
            if (pilotoSeleccionado != null) {
                DetallesPiloto(navController = navController, piloto = pilotoSeleccionado, viewModel = pilotosViewModel)
            }
        }
    }
}