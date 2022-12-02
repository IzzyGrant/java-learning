# Preguntas Java
📕📘📗☕
## 1️⃣¿Qué es un objeto y cuál es la diferencia entre un objeto y una clase?
Una  **clase**  es un plan o prototipo que define las variables y los métodos o funciones comunes a todos los objetos de un cierto tipo.

Un **objeto**  es un espécimen de una clase. Los objetos de  [software](https://www.tokioschool.com/noticias/el-software/) a menudo se utilizan para modelar objetos del mundo real que se encuentran en la vida cotidiana.
> **fuente:** [¿Qué es una clase en Java? ¡Contrólalo al detalle! | 35mm (tokioschool.com)](https://www.tokioschool.com/noticias/que-es-clase-java/)

## 2️⃣¿Qué es un constructor?
**El constructor es un elemento de una clase cuyo identificador coincide con esa clase**. Esto resulta de utilidad porque nos permite obligar y controlar cómo se inicializa una instancia de una determinada clase. Llegados a este punto debemos recordar que, a diferencia de otros lenguajes, **en Java no se pueden dejar las variables miembro de una nueva instancia sin inicializar**.

> **Fuente:** [Descubre qué es un constructor en Java. ¡Infórmate aquí! (tokioschool.com)](https://www.tokioschool.com/noticias/que-es-constructor-java/)

## 3️⃣¿Cuáles son las diferencias entre String y StringBuilder?
**String:** Es inmutable, la longitud de caracteres es estática, Podemos crear un objeto String sin usar un nuevo operador, lo que no es posible con **StringBuilder**...

**StringBuilder:** Es mutable, consume menor memoria con las concatenaciones, su longitud es dinámica lo cual es posible usar **setLength()**...

> **Fuente (Ingles):** [Difference between String and StringBuilder in Java | Techie Delight](https://www.techiedelight.com/difference-between-string-stringbuilder-java/)
## 4️⃣¿En términos de eficiencia, es mejor utilizar String o StringBuilder y por qué?
**StringBuilder** es rápido y consume menos memoria que una cadena mientras realiza concatenaciones. Esto se debe a que la cadena es inmutable en Java y la concatenación de dos objetos de cadena implica la creación de un nuevo objeto.

> **Fuente (Ingles):** [Difference between String and StringBuilder in Java | Techie Delight](https://www.techiedelight.com/difference-between-string-stringbuilder-java/)
> 
## 5️⃣¿Cuáles son las diferencias entre un método no estático y un método estático?
una variable **estática** pertenece a la clase misma y una variable **no estática** pertenece a cada instancia de una clase. Por lo tanto, el valor de una variable **estática** sigue siendo el mismo para cada instancia de la clase, pero no se puede decir lo mismo de la variable **no estática**.

No podemos acceder a variables **no estáticas** dentro de un método **estático** sin una instancia de su clase. Un método **estático** solo puede acceder a variables estáticas, mientras que un método no estático puede acceder tanto a variables estáticas como no estáticas...

> **Fuente:** [Diferencia entre métodos estáticos y no estáticos en Java (techiedelight.com)](https://www.techiedelight.com/es/difference-between-static-and-non-static-method-java/)
## 6️⃣¿Qué es el bloque static y para que nos sirve?
El **bloque static** es un bloque de instrucción dentro de una clase Java que se ejecuta cuando una clase se carga por primera vez en la JVM. Básicamente un bloque static inicializa variables de tipo static dentro de una clase, al igual que los constructores ayudan a inicializar las variables de instancia, un bloque static inicializa las variables de tipo static en una clase.

> **Fuente:** [Métodos, variables y bloques static en Java con ejemplos (ecodeup.com)](https://www.ecodeup.com/metodos-variables-y-bloques-static-en-java-con-ejemplos/#:~:text=El%20bloque%20static%20es%20un,primera%20vez%20en%20la%20JVM.)
## 7️⃣¿Qué es encapsulamiento y como implementarlo en una clase?

Hace referencia a limitar el acceso a las variables de nuestras clases Java de tal forma que podamos tener un mayor control sobre ellas. Normalmente utilizando métodos **set/get**.

```mermaid
graph LR
A[Encapsulacion]  ------> B[Set/Get]

```
```
package com.arquitecturajava.ejemplo3;

public class Bateria {

  private int capacidad;

  public int getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  public Bateria(int capacidad) {
    super();
    this.capacidad = capacidad;
  }

  public int duracionBateria() {

    if (capacidad < 3000) {
      return 16;
    } else {

      return 24;
    }
  }
}
```
> **Fuente:** [Java Encapsulamiento y reutilización - Arquitectura Java](https://www.arquitecturajava.com/java-encapsulamiento-y-reutilizacion/)
