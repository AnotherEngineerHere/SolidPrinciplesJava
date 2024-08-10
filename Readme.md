# Spring Boot SOLID Principles

Este proyecto de Spring Boot demuestra la aplicación de los principios SOLID en un entorno de desarrollo de software utilizando Java. Cada principio es ejemplificado con código que sigue las mejores prácticas para mantener el código limpio, modular y fácil de mantener. Además, se proporciona una explicación de los conceptos con ejemplos cotidianos para facilitar su comprensión.

## Principios SOLID

### 1. Single Responsibility Principle (SRP)

#### Explicación

El principio de Responsabilidad Única establece que una clase debe tener una sola responsabilidad, lo que significa que debe haber solo una razón para que una clase cambie. Esto hace que el código sea más fácil de mantener y entender, ya que cada clase tiene un propósito claro.

#### Ejemplo en el Código

- **`ReportService`**: Clase que se encarga únicamente de generar reportes.
- **`EmailService`**: Clase que maneja el envío de correos electrónicos.

Ambas clases tienen responsabilidades distintas, y separarlas permite modificar o mejorar una sin afectar a la otra.

#### Ejemplo Cotidiano

Imagina una oficina donde una persona es responsable de preparar informes y otra persona se encarga de enviar correos electrónicos. Si ambas tareas fueran realizadas por la misma persona, cualquier cambio en el formato de los informes podría afectar la manera en que se envían los correos. Al dividir las responsabilidades, puedes cambiar cómo se preparan los informes sin interferir con el proceso de envío de correos.

### 2. Open/Closed Principle (OCP)

#### Explicación

El principio de Abierto/Cerrado establece que las clases deben estar abiertas para extensión, pero cerradas para modificación. Esto significa que se debe poder añadir nuevas funcionalidades mediante la extensión de las clases existentes, sin tener que modificar el código fuente original.

#### Ejemplo en el Código

- **`DiscountPolicy`**: Interfaz que define una política de descuento.
- **`PercentageDiscount` y `FixedAmountDiscount`**: Clases que implementan diferentes tipos de descuentos sin necesidad de modificar la interfaz original.

Al añadir un nuevo tipo de descuento, simplemente creas una nueva clase que implemente `DiscountPolicy`, sin modificar las clases existentes.

#### Ejemplo Cotidiano

Piensa en una tienda que ofrece varios tipos de descuentos: un porcentaje de descuento y un descuento fijo en dólares. Si la tienda decide ofrecer un nuevo tipo de descuento (por ejemplo, un descuento por volumen), no es necesario reescribir todo el sistema de descuentos. En lugar de ello, se añade un nuevo módulo para el descuento por volumen.

### 3. Liskov Substitution Principle (LSP)

#### Explicación

El principio de Sustitución de Liskov establece que los objetos de una clase base deben poder ser reemplazados por objetos de sus clases derivadas sin alterar el comportamiento del programa. Esto asegura que las subclases mantengan las expectativas de comportamiento establecidas por sus superclases.

#### Ejemplo en el Código

- **`Rectangle` y `Square`**: Las clases muestran cómo una subclase debe respetar el contrato de la superclase. En este caso, `Square` hereda de `Rectangle`, pero asegura que se comporta correctamente cuando es tratada como un `Rectangle`.

#### Ejemplo Cotidiano

Imagina que tienes una máquina que acepta cualquier tipo de papel para imprimir, ya sea carta, A4, o legal. Si la máquina no funciona correctamente cuando le pones papel A4 en lugar de papel carta, entonces no cumple con este principio. La máquina debería poder manejar cualquier tipo de papel sin problemas, de la misma manera que una subclase debería poder sustituir a su superclase sin causar errores.

### 4. Interface Segregation Principle (ISP)

#### Explicación

El principio de Segregación de Interfaces sugiere que es mejor tener varias interfaces pequeñas y específicas en lugar de una sola interfaz grande. Las clases no deberían estar obligadas a implementar métodos que no utilizan.

#### Ejemplo en el Código

- **`Workable`** y **`Eatable`**: Dos interfaces separadas para diferentes responsabilidades. Esto permite que `RobotWorker` solo implemente `Workable`, ya que no necesita comer, mientras que `HumanWorker` implementa ambas interfaces porque un humano trabaja y come.

#### Ejemplo Cotidiano

Piensa en un control remoto que tiene botones para controlar la TV, el aire acondicionado, y las luces. Si cada dispositivo tuviera su propio control remoto con solo los botones necesarios para ese dispositivo, sería más fácil de usar. Del mismo modo, las interfaces en código deben ser específicas y solo incluir métodos relevantes para la clase que las implementa.

### 5. Dependency Inversion Principle (DIP)

#### Explicación

El principio de Inversión de Dependencias establece que las clases de alto nivel no deben depender de clases de bajo nivel, sino de abstracciones (interfaces). Esto hace que el código sea más flexible y fácil de cambiar.

#### Ejemplo en el Código

- **`NotificationService`**: Interfaz que define el servicio de notificación.
- **`EmailNotificationService`** y **`SMSNotificationService`**: Implementaciones concretas que dependen de la abstracción `NotificationService`.

La clase `NotificationApplication` depende de `NotificationService`, y no de una implementación específica, lo que facilita cambiar entre diferentes tipos de notificación sin modificar `NotificationApplication`.

#### Ejemplo Cotidiano

Considera una lámpara que puede funcionar con bombillas de diferentes tipos (LED, incandescentes, halógenas). La lámpara está diseñada para trabajar con una interfaz estándar (el casquillo de la bombilla) en lugar de depender de un tipo específico de bombilla. De esta manera, puedes cambiar la bombilla sin tener que cambiar la lámpara entera.

## Estructura del Proyecto

El proyecto está organizado en diferentes paquetes que corresponden a cada principio SOLID:

- **SRP (Single Responsibility Principle)**: Este paquete contiene clases que demuestran cómo cada clase debe tener una única responsabilidad.
- **OCP (Open/Closed Principle)**: Este paquete muestra cómo las clases deben estar abiertas para extensión pero cerradas para modificación.
- **LSP (Liskov Substitution Principle)**: Aquí se demuestra cómo las subclases deben ser sustituibles por sus superclases sin alterar el comportamiento del programa.
- **ISP (Interface Segregation Principle)**: Este paquete contiene ejemplos de cómo dividir las interfaces grandes en interfaces más pequeñas y específicas.
- **DIP (Dependency Inversion Principle)**: Aquí se muestra cómo las clases de alto nivel no deben depender de las clases de bajo nivel, sino de abstracciones.

## Requisitos

- Java 17
- Gradle 8.8

## Configuración

1. Clona este repositorio en tu máquina local.
   

   git clone https://github.com/AnotherEngineerHere/SolidPrinciplesJava.git
   cd SolidPrinciplesJava

2.Importa el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, Spring Tool Suite, etc.).


3.Ejecuta las pruebas con:

```bash
./gradlew test
````