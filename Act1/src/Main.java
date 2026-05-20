public class Main {

    //Nombre del alumno
    private String nombre;

    //Calificaciones
    private double[] calificaciones = new double[5];

    public Main(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    //Promedio de calificaciones
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Promedio a letra
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
            return 'A';
        }
    }


    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del Main: " + nombre);

        for (int i = 0; i < this.calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + this.calificaciones[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }


    public static void main(String[] args) {
        // Calificaciones que se asignan
        double[] misCalificaciones = {85, 92, 78, 88, 95};

        Main alumno = new Main("Alberto Villarreal", misCalificaciones);
        
        double promedioCalculado = alumno.calcularPromedio(misCalificaciones);
        char letraFinal = alumno.obtenerCalificacionFinal(promedioCalculado);

        alumno.imprimirResultados(alumno.nombre, promedioCalculado, letraFinal);
    }
}