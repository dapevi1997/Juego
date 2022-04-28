# Juego
Prueba Técnica Softka

****************************
JUEGO by DANIEL PEREZ VITOLA
Correo: dapevi1997@gmail.com
***************************

******************************
DESCRIPCIÓN DE LA APLICACIÓN.

JUEGO es una aplicación contruida utilizando el lenguaje de programación JAVA en su version 8. 
La IDE utilizada fue Intelijj IDEA, control de versiones GIT, además del uso de MAVEN y base de 
datos en SQLite.
*****************************

FUNCIONAMIENTO.

Al iniciar la aplicación se pide el nombre del jugador el cual posteriormente será guardado en una base 
de datos embebida. 
![](https://i.ibb.co/zNHc7Hm/vent-Bienv.png)

Si el jugador no ingresa nombre, el programa mostrará una advertencia para que ingrese un nombre válido.
![](https://i.ibb.co/SrK1rB2/ingresenomvali.png)

Después de ingresar un nombre válido comienza el juego con la Ronda 1. En total son 5 rondas y cada ronda 
contiene 5 preguntas categorizadas en un mismo nivel de dificultad. La pregunta seleccionada se escoge 
aleatoriamente. Se muestran cuatro opciones de respuesta.

![](https://i.ibb.co/zmphBD7/primeraronda.png)

Se debe escoger una respuesta y luego pulsar el botón Validar. Si al pulsar el botón el jugador no selecciona 
ninguna el programa lo toma como respuesta incorrecta, el juego será terminado su y puntaje será guardado en 
datos históricos. Si selecciona la respuesta correcta el programa muestra una ventana confirmando que la 
respuesta es correcta y los puntos conseguidos hasta el momento (cada ronda suma 10 puntos al acumulado). El 
jugador pasará a la segunda ronda.

![](https://i.ibb.co/ZW2dCC1/respucorre.png)

Si el jugador selecciona la respuesta incorrecta, el programa
mostrará una ventana diciendo que la respuesta es incorrecta y los puntos conseguidos hasta el momento.

![](https://i.ibb.co/9sm0ncS/reincorr.png)

Los datos de cada juagador se 
guardaran en el histórico (esta ventana se muestra automáticamente al terminar el juego ya sea por retirarse, 
por perder, o por haber pasado todas las rondas).

![](https://i.ibb.co/1mb3Cpv/venhist.png)

Por último el jugador puede retirarse en cualquiera de las rondas pulsando el botón Retirarse y su puntaje
será guardado en el histórico.

![](https://i.ibb.co/thx27RL/retirarse.png)





