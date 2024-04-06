# Lab 1.06

<br><br>

### Instrucciones

<br>

- Crea un nuevo repositorio en GitHub Organisation llamado `Enterprise-Java-Development-1.06_Tu_Nombre`.
- Asegúrate de que tu repositorio esté configurado como privado. Los repositorios públicos recibirán un cero en la tarea. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la diapositiva del día 1.
- En el repositorio, crea un proyecto de Java y agrega el código para las siguientes instrucciones.
- Una vez que hayas terminado la tarea, envía un enlace URL a tu repositorio a continuación.

<br><br>

### Especificaciones

<br>

1. Crea una clase Employee para representar un empleado de una empresa. La clase debe tener las propiedades name, email, age, salary y los getters y setters apropiados.
2. Crea una clase Intern que extienda de Employee. La clase Intern debe tener un límite de salario de 20000 (constante).
3. Implementa la validación en la clase Intern para garantizar que un interno no sea creado (o el salario actualizado) con un salario que exceda el valor máximo permitido.
4. Escriba un programa que cree 10 objetos Employee y muestre todas sus propiedades (nombre, correo electrónico, edad, salario) en un archivo llamado employees.txt.

<br><br>

###  Consejos

<br>

- Asegúrate de considerar la relación entre las clases Employee e Intern al diseñar tu solución.
- Piensa en las diferentes propiedades y comportamientos que son aplicables tanto a los objetos Employee como a Intern y considera cómo puedes usar la herencia para evitar la duplicación de código.
- Usa los modificadores de acceso apropiados (por ejemplo, private, protected, public) para controlar la visibilidad de tus propiedades y métodos de clase.
- Asegúrate de manejar los casos límite y tratarlos adecuadamente (por ejemplo, ¿qué sucede si se crea un objeto Intern con un salario que supera el valor máximo permitido?)