package Rutas

sealed class Rutas(val ruta: String) {
    object PantallaPilotos : Rutas("PantallaPilotos")
    object CrearPilotos : Rutas("CrearPilotos")
    object DetallesPiloto : Rutas("DetallesPiloto")
}