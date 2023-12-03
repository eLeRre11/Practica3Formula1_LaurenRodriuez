package com.example.practica3formula1.Pilotos

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.practica3formula1.R

class PilotosViewModel : ViewModel() {
    val listaPilotos = mutableStateListOf(
        Pilotos("Max Verstappen", R.drawable.verstappen, "Red Bull", 26),
        Pilotos("Sergio Pérez", R.drawable.perez, "Red Bull", 15),
        Pilotos("Carlos Sainz", R.drawable.sainz, "Ferrari", 10),
        Pilotos("Charles Leclerc", R.drawable.leclerc, "Ferrari", 0),
        Pilotos("Lewis Hamilton", R.drawable.hamilton, "Mercedes", 8),
        Pilotos("George Russell", R.drawable.russell, "Mercedes", 6),
        Pilotos("Lando Norris", R.drawable.norris, "McLaren", 12),
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
    val informacionAdicional = mapOf(
        "Max Verstappen" to "Max Verstappen ha despedido su temporada más dominante en Fórmula 1, en la que además de conquistar su tercer título mundial consecutivo, ha dejado varios récords para la historia. El piloto neerlandés, que a sus 26 años tiene mucho margen para seguir ampliando sus registros, ha ejercido una supremacía casi absoluta en 2023 y solo ha cedido en tres ocasiones, para culminar su trayectoria en Abu Dhabi con 19 victorias en 22 grandes premios.",
        "Sergio Pérez" to "Sergio Pérez vive su tercera temporada con Red Bull Racing, equipo al que llegó en la temporada 2021 luego de haber perdido su asiento en Racing Point, ahora Aston Martin, ante la decisión de contratar a Sebastian Vettel, pero ahora, surgen rumores de una posibilidad de reemplazarlo en 2024. Si bien tanto Christian Horner, jefe de la escudería, como Checo Pérez han señalado que harán valer el contrato hasta finales del 2024, esto luego de la caída de rendimiento del mexicano en la segunda parte de la temporada en donde pasó de luchar por el cetro ante Max Verstappen a batallar por asegurar el subcampeonato. ",
        "Carlos Sainz" to "La temporada 2023 de Fórmula 1 ha contado con un total de 22 carreras, y el equipo Red Bull, campeón tanto del Mundial de Pilotos con Max Verstappen como del de Constructores, ha ganado 21 de ellas. El único equipo capaz de derrotar a la escudería de las bebidas energéticas ha sido Ferrari, y el piloto, Carlos Sainz.",
        "Charles Leclerc" to "No ha sido un gran inicio de temporada para el equipo Ferrari ni para uno de sus pilotos, Charles Leclerc. En el GP de Bahréin, la escudería italiana se vio obligada a sustituir la centralita electrónica del Ferrari SF-23 del monegasco tras descubrir un problema antes de la carrera, y el nuevo componente volvió a fallar durante el Gran Premio, provocando el abandono de Charles cuando iba tercero.",
        "Lewis Hamilton" to "A Lewis Hamilton y a Mercedes, otro año más, la temporada de Fórmula 1 se les ha hecho muy larga. Otra vez sin poder luchar contra Max Verstappen y su Red Bull. Ni una sola victoria y sólo seis podios. Un pobre registro para todo un siete veces campeón del mundo. Se ha tenido que 'conformar' con el tercer puesto en el campeonato.",
        "George Russell" to "George Russell pudo vivir en el día de ayer la gota que colmó el vaso en una decepcionante temporada 2023 de Fórmula 1 en la que sus resultados distan mucho de lo que esperaba en un principio, y más aún después del increíble año de debut que tuvo en Mercedes, superando a Lewis Hamilton en el duelo entre compañeros de equipo.",
        "Lando Norris" to "Lando Norris no pudo despedirse de la temporada 2023 desde un podio que desde el viernes parecía al alcance de su monoplaza. El piloto de McLaren no llegó más allá de la cuarta posición después del error en clasificación que le llevó a partir quinto, y de un error en la parada en boxes por parte de su equipo que le puso detrás de un George Russell al que había adelantado previamente en pista.",
        "Oscar Piastri" to "La salida de los McLaren no fue espectacular, con Lando Norris cayendo del segundo al sexto puesto. Todos los pilotos, excepto Oscar Piastri, que salieron con neumáticos medios, perdieron posiciones. Russell, Sainz y Leclerc ganaron dos posiciones cada uno. Max Verstappen también cayó al quinto lugar, mientras su ingeniero le recordaba que no se metiera en problemas. Fernando Alonso, por su parte, subió al séptimo puesto. Mientras tanto, Liam Lawson perdió el control de su AT04 en la frenada de la curva 2 y provocó el primer coche de seguridad del fin de semana.",
        "Esteban Mojón" to "Esteban Ocon y el equipo Alpine consiguieron despedir el Gran Premio de Las Vegas con una inesperada cuarta posición por parte del piloto que partía desde el puesto 16. Toda una remontada que combinó oportunismo con buen hacer del piloto normando, para finalmente escoltar al trío del podio y obtener un resultado que para Alpnie, sirvió para compensar en la medida de lo posible el desfallecimiento de Pierre Gasly en las vueltas finales que le apartó de sumar otro excelente botín de puntos.",
        "Pierre Gasly" to "El piloto francés ha sido uno de los grandes beneficiados de las largas ocasiones de lluvia sobre el circuito de Zandvoort durante la realización del Gran Premio de Países Bajos, pudiendo pasar de su decimosegundo puesto de salida al podio.",
        "Fernando Alonso" to "La Fórmula 1 no está pasando por sus mejores momentos en términos de realización televisiva. Sorprende la cantidad de detalles que se pierde a lo largo de una carrera cuando realmente no está pasando nada relevante en pista. Para bien o para mal, porque hay quién piensa que es provocado, esto permite disfrutar de contenido inédito a lo largo de la semana.",
        "Lance Stroll" to "Tras unos fines de semana donde los resultados de Aston Martin no llegaban, Brasil ha sido una película completamente diferente y ambos AMR23 han logrado tener un buen ritmo para acabar en las primeras posiciones durante la clasificación en Interlagos.Sobre todo, en esta ocasión destacó un Lance Stroll, que logró quedar en tercera posición, un puesto por encima del cuarto lugar que logró obtener su compañero de equipo al ganarle por 41 milésimas en la parrilla de salida del domingo.",
        "Alexander Albon" to "Los pronósticos para Williams en el Gran Premio de Italia eran altamente positivos, ya que el FW45 había demostrado durante toda la temporada que su gran virtud sería muy buena en el fin de semana en Monza al ser capaces de alcanzar velocidades puntas muy elevadas.",
        "Logan Sargeant" to "La carrera fue agridulce para el piloto de Williams, pues mostró competitividad en diferentes puntos del evento, sin embargo, tal y como confesó el piloto, una mala salida tras la bandera roja condicionó sus posibilidades de entrar en la zona de puntos, lo que no impidió que batallara contra sus rivales.",
        "Valteri Bottas" to "Valtteri Bottas ha renacido a nivel personal y deportivo con su cambio de aires una vez el quipo Mercedes tomó la decisión de dejar de renovar su contrato para ceder su volante a George Russell. Sin embargo, este punto de inflexión que llegó en el momento más complicado de la trayectoria del piloto finlandés acabó resultando un acierto a nivel personal, dado que el equipo Alfa Romeo recuperó con su organización más “familiar”, la mejor cara de un Valtteri Bottas que hacía mucho que desapareció del gran circo. Otro factor que refuta el acierto de este cambio de aires es que el equipo Sauber.",
        "Guanyu Zhou" to "Guanyu Zhou y el equipo Alfa Romeo tuvo un domingo para el olvido en el Gran Premio de Hungría, después de que todas las opciones de extraer un buen resultado del Hungaroring –tras la excelente sesión de clasificación del día anterior–, se esfumasen en tan solo unos pocos metros, en una salida esperpéntica donde destacó en un sentido negativo Guanyu Zhou, quien tuvo una de las peores salidas vistas en los últimos años en Fórmula 1, justo en el fin de semana en el que mejor había clasificado desde que es piloto de Alfa Romeo.",
        "Daniel Ricciardo" to "Daniel Ricciardo afronta un año distinto en 2023, ya que será el tercer piloto del equipo Red Bull. Aunque ha admitido que buscará regresar a la categoría el año que viene, también ha declarado que ayudará en todo lo posible a su equipo mientras se centra en otros objetivos.",
        "Yuki Tsunoda" to "Yuki Tsunoda fue la gran sorpresa de la clasificación del Gran Premio de Abu Dhabi con el que la Fórmula 1 se despide hasta la temporada 2024. El piloto japonés de AlphaTauri hizo valer las mejoras en su monoplaza en un periodo de adaptación a contrarreloj pero que finalmente han permitido a Tsunoda clasificar en la sexta posición de cara a una última carrera en la que el equipo filial de Red Bull aún tiene importantes desafíos por delante.",
        "Nico Hulkenberg" to "Haas finalizó el Gran Premio de Italia ocupando las dos últimas posiciones a pesar de que Nico Hülkenberg no tuvo mala clasificación e incluso durante las primeras vueltas consiguió adelantar a Liam Lawson y a Fernando Alonso y colocarse en posiciones de puntos.",
        "Kevin Magnussen" to "El equipo Haas de Fórmula 1 no tuvo más remedio que conformarse con ser el último equipo del mundial de constructores de nuevo en 2023. Después de un 2022 esperanzador y marcado por el regreso de Kevin Magnussen, la fuerza liderada por Günther Steiner esperaba como poco mantenerse al nivel del año pasado, en el que acabaron octavos en la clasificación general.",
    )
    fun agregarPiloto(piloto: Pilotos) {
        listaPilotos.add(piloto)
    }
}