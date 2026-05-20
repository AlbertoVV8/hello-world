public class Main {

    // 1 y 2. Atributo String para el nombre del participante
    private String nombre;

    // 1 y 3. Atributo tipo array para almacenar cinco calificaciones
    private double[] calificaciones = new double[5];

    // Constructor para inicializar los valores
    public Main(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // 4a. Método que calcula el promedio de las cinco calificaciones
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // 4b. Método que obtiene la calificación final en formato de letra
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A'; // Aplica para 91 a 100
        }
    }

    // 4c. Método que imprime los resultados con el formato solicitado
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del Main: " + nombre);

        // El arreglo se lee directamente de los atributos de la clase para imprimir cada elemento
        for (int i = 0; i < this.calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + this.calificaciones[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método principal para probar el funcionamiento de la clase
    public static void main(String[] args) {
        // Definimos las 5 calificaciones
        double[] misCalificaciones = {85, 92, 78, 88, 95};

        // Instanciamos el objeto con datos de prueba
        Main alumno = new Main("Alberto Villarreal", misCalificaciones);

        // Ejecutamos los métodos de cálculo
        double promedioCalculado = alumno.calcularPromedio(misCalificaciones);
        char letraFinal = alumno.obtenerCalificacionFinal(promedioCalculado);

        // Imprimimos el resultado
        alumno.imprimirResultados(alumno.nombre, promedioCalculado, letraFinal);
    }
}