***EXPLICACION DEL EXAMEN DE CALCULADORA***

**Nos metemos en el proyecto calculadora**

Retomamos el proyecto de la calculadora que habiamos hecho con anterioridad y hacemos lo que nos dicen

**Creacion de una nueva clase**

Creamos la nueva clase llamada raices, en la cual vamos a hacer una  nueva operacion, llamada raiz cuadrada y raiz cubica
Comandos:
git branch raices
git checkout raices
Con esto hemos creado la rama y nos cambiamos a ella

**Hacemos la nueva operacion y lo vamos diciendo con los commits**

1. Creamos las constante finales de raiz cuadrada y cubica
2. Las añadimos al switch como una opcion mas a utilizar
3. En el examen lo haremos pudiendo elegir las 2 opciones, pero luego en el readme, lo explicaremos como sería solo para 1.
4. una vez que hicimos los metodos, nos damos cuenta de que solo me hace la raiz cuadrada para una variable, no nos da la opcion de hacerlo con 2.
5. Nos pasa lo mismo con la cubica, así que vamos a hacer algunas modificaciones

**Modificacion para que valga para los 2**

1. hemos añadido alguna variaciones:
2. Hemos puesto que el usuario introduzca una opcion, para saber si quiere hacer la raiz cuadrada con la primera variable o con la segunda
3. Lo mismo, pero con la raiz cubica

**programa hecho**

1. Vamos a verificar que nuestro programa cumple con los requisitos que nos pidieron
2. Efectivamente, nuestro programa funciona.
3. Podriamos hacer que el usuario introduciera una opcion para ver si quería hacer una raiz cuadrada o cubica también. Todo en una me refiero

**procedemos a hacer el jar**

1. Una vez vemos que nuestro programa funciona, queremos que funcione como una libreria
2. para eso lo que hacemos es hacer el jar, pero de forma diferente
3. En el modulo from dependiences, normalmente ponemos la main ahí, pero esta vez no
4. Hacemos el jar, pero sin incluir el metodo main donde se supone que hay que pedirlo

**Hacemos el merge squash**
Una vez hecho, procedemos a subirlo todo a git hub y a hacer la release