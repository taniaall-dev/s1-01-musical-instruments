# Instrumentos musicales
**Descripción**: Ejercicio de Java centrado en la herencia y el polimorfismo, utilizando los instrumentos musicales como
ejemplo. También explora la carga de clases de Java y los bloques de inicialización.

## 📌 Instrucciones del ejercicio 
Desarrollar un programa Java para representar los instrumentos de un grupo de música. Los instrumentos se clasifican en:
- Instrumentos de viento
- Instrumentos de cuerda
- Instrumentos de percusión

Todos los instrumentos comparte un nombre y un precio, y pueden sonar de diferentes maneras.

**Objetivos del ejercicio:**

- Aplicar la herencia y el polimorfismo en la programación orientada a objetos.
- Comprender cómo se cargan las clases de Java durante la ejecución del programa.
- Explorar los bloques de inicialización estáticos y de instancia.
- Investigar cuándo se ejecutan los bloques de inicialización y en qué se diferencian.

## ✨ Características 

- Representar tres tipos de instrumentos musicales.
- Mostrar un mensaje específico cuando suena cada tipo de instrumento.
- Demostrar el comportamiento polimórfico llamando al método play() con diferentes instrumentos.
- Observar la carga e inicialización de las clases con bloque de inicialización estático.
- Investigar los bloques de inicialización de instancia y comparar su comportamiento con los bloques de inicialización 
  estáticos.

## 📚 Investigación: bloques de inicialización

**Bloque de inicialización sin static**
- Es un bloque de código que sirve para inicializar atributos de una clase. Se escribe dentro de una clase entre llaves `{}`,
  pero fuera de los métodos constructores y demás bloques.

- Puede utilizarse para inicializar atributos o ejecutar código que deba realizarse cada vez que se cree un objeto de esa clase.
- Se ejecuta cada vez que se crea una nueva instancia de la clase, antes de que se ejecute el cuerpo del constructor.

**Diferencia entre bloque de inicialización static y no static**

La diferencia principal es cuántas veces se ejecuta cada bloque y a qué pertenece.
- Bloque `static { }` se ejecuta cuando se inicializa la clase, una vez por cargador de clases.
- Bloque `sin static { }` se ejecuta cada vez que se inicializa una nueva instancia, antes del cuerpo del constructor.

Los bloques static no se ejecutan cada vez que creas un objeto. Si la clase ya se ha inicializado, crear más
objetos no vuelve a ejecutar sus bloques estáticos.

## Prueba de bloques de inicialización

La clase `Main` permite comprobar el funcionamiento de los bloques de inicialización estáticos (`static`) y de instancia
(sin `static`).

### Pasos de la prueba

1. **Llamada al método estático:**
Se llama a `WindInstrument.showMessage()` sin crear ningún objeto. Como la clase todavía no se había inicializado, se
ejecuta primero su bloque `static` y después el método.
2. **Creación de un instrumento de percusión:**
Se crea un objeto de `PercussionInstrument`. Al inicializarse la clase por primera vez, se ejecuta su bloque `static`,
que muestra un mensaje por consola.
3. **Creación de un instrumento de cuerda:**
Se crea un objeto de `StringInstrument`. Como esta clase no contiene bloques de inicialización propios, no aparece 
ningún mensaje adicional durante su creación.
4. **Creación de un instrumento de viento:**
Se crea un objeto de `WindInstrument`. Su bloque `static` no vuelve a ejecutarse, pero sí lo hace su bloque de 
instancia, que muestra un mensaje por consola.
5. **Reproducción de los instrumentos:**
Se llama al método `play()` de cada objeto. Cada subclase muestra un mensaje diferente según el tipo de instrumento.

### Conclusión

La prueba permite comprobar que los bloques `static` se ejecutan una vez cuando se inicializa cada clase, mientras que 
los bloques de instancia se ejecutan cada vez que se inicializa un objeto de esa clase.
