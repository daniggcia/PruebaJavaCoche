# PruebaJavaCoche
codigo java con menu y metods de acelar y frenar

# 🚗 Proyecto Java - Clase `Coche`

Este proyecto consiste en la implementación de una clase `Coche` en Java, diseñada para simular el comportamiento básico de un coche de carreras en recta y curva. Se trata de un ejercicio de programación orientado a objetos que incluye constructores personalizados, métodos de acceso, operaciones de aceleración/frenado, cálculos de tiempo de recorrido y un menú interactivo para probar todas sus funcionalidades.

---

## 🛠️ Características de la Clase `Coche`

Cada coche tiene **dos atributos principales**:

- 🔹 Velocidad en recta (km/h)
- 🔹 Velocidad en curva (km/h)

> Ambas velocidades deben ser siempre **mayores o iguales a 0 km/h**.

---

## 🧱 Constructores Disponibles

La clase puede inicializarse de cuatro formas diferentes:

1. **Sin argumentos:** ambas velocidades se inician a 0 km/h.
2. **Con un argumento:** representa la velocidad en recta; la velocidad en curva se establece en 1 km/h.
3. **Con dos argumentos:** establece la velocidad en recta y en curva respectivamente.
4. **A partir de otro coche:** copia las velocidades del objeto original.

---

## 🔁 Métodos Implementados

### Getters y Setters
- `getVelocidadRecta()` / `setVelocidadRecta(int v)`
- `getVelocidadCurva()` / `setVelocidadCurva(int v)`

### Acciones del coche

- `acelerarRecta()`: +5 km/h en recta
- `acelerarCurva()`: +5 km/h en curva
- `frenarRecta()`: -5 km/h en recta
- `frenarCurva()`: -5 km/h en curva
- `mejorar()`: +15 km/h en **ambas** velocidades

### Cálculo de tiempos

- `tiempoRecta(double kilometros)`: devuelve el tiempo en **segundos** para recorrer una recta de `k` km. Devuelve `-1` si la velocidad en recta es 0.
- `tiempoCurva(double kilometros)`: lo mismo, pero en curva.

---

## 🖥️ Interfaz por Menú

El programa principal incluye un **menú interactivo** que permite:

- Mostrar el estado actual del coche (`toString()`)
- Probar todas las acciones posibles (acelerar, frenar, mejorar, calcular tiempos)
- Mostrar el menú constantemente y las velocidades actuales en la parte inferior

---

✨ Requisitos Técnicos
Java 8 o superior

IDE recomendado: IntelliJ IDEA

🧪 Objetivos de aprendizaje
Manejo de clases y objetos

Sobrecarga de constructores

Encapsulamiento

Métodos y lógica de negocio

Uso de toString()

Menús interactivos y entrada por consola

## 📌 Nota sobre `toString()`

El método `toString()` ha sido **sobrescrito** para representar de forma clara el estado del coche. Se utiliza para mostrar las características del coche en el menú.

```java
@Override
public String toString() {
    return "Velocidad en recta: " + velocidadRecta + " km/h, " +
           "Velocidad en curva: " + velocidadCurva + " km/h";
}


