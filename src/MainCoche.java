
import java.util.Scanner;

public class MainCoche {
    public static void main(String[] args) {


        public class MainCoche {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Coche coche = new Coche(); // Empieza con velocidades a 0

                int opcion;
                do {
                    mostrarMenu();
                    System.out.println("Estado actual del coche -> " + coche.toString());
                    System.out.print("Selecciona una opción: ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1: coche.acelerarRecta(); break;
                        case 2: coche.acelerarCurva(); break;
                        case 3: coche.frenarRecta(); break;
                        case 4: coche.frenarCurva(); break;
                        case 5: coche.mejorar(); break;
                        case 6:
                            System.out.print("Introduce kms de recta: ");
                            double kmsRecta = scanner.nextDouble();
                            int tiempoR = coche.tiempoRecta(kmsRecta);
                            if (tiempoR == -1) System.out.println("No se puede calcular: velocidad en recta = 0");
                            else System.out.println("Tiempo en recta: " + tiempoR + " segundos");
                            break;
                        case 7:
                            System.out.print("Introduce kms de curva: ");
                            double kmsCurva = scanner.nextDouble();
                            int tiempoC = coche.tiempoCurva(kmsCurva);
                            if (tiempoC == -1) System.out.println("No se puede calcular: velocidad en curva = 0");
                            else System.out.println("Tiempo en curva: " + tiempoC + " segundos");
                            break;
                        case 0:
                            System.out.println("Saliendo del programa.");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    System.out.println();
                } while (opcion != 0);

                scanner.close();
            }

            private static void mostrarMenu() {
                System.out.println("========= MENÚ DEL COCHE =========");
                System.out.println("1. Acelerar en recta (+5 km/h)");
                System.out.println("2. Acelerar en curva (+5 km/h)");
                System.out.println("3. Frenar en recta (-5 km/h)");
                System.out.println("4. Frenar en curva (-5 km/h)");
                System.out.println("5. Mejorar coche (+15 km/h a ambas)");
                System.out.println("6. Calcular tiempo en recta");
                System.out.println("7. Calcular tiempo en curva");
                System.out.println("0. Salir");
                System.out.println("==================================");
            }
        }
    }
    public class Coche {
        private int velocidadRecta;
        private int velocidadCurva;

        // Constructor sin argumentos: ambas velocidades a 0
        public Coche() {
            this.velocidadRecta = 0;
            this.velocidadCurva = 0;
        }

        // Constructor con un argumento (velocidad recta)
        public Coche(int velocidadRecta) {
            this.velocidadRecta = Math.max(velocidadRecta, 0);
            this.velocidadCurva = 1;
        }

        // Constructor con dos argumentos
        public Coche(int velocidadRecta, int velocidadCurva) {
            this.velocidadRecta = Math.max(velocidadRecta, 0);
            this.velocidadCurva = Math.max(velocidadCurva, 0);
        }

        // Constructor por copia
        public Coche(Coche otro) {
            this.velocidadRecta = otro.velocidadRecta;
            this.velocidadCurva = otro.velocidadCurva;
        }

        // Getters
        public int getVelocidadRecta() {
            return velocidadRecta;
        }

        public int getVelocidadCurva() {
            return velocidadCurva;
        }

        // Setters
        public void setVelocidadRecta(int velocidadRecta) {
            this.velocidadRecta = Math.max(velocidadRecta, 0);
        }

        public void setVelocidadCurva(int velocidadCurva) {
            this.velocidadCurva = Math.max(velocidadCurva, 0);
        }

        // Método toString sobrescrito
        @Override
        public String toString() {
            return "Velocidad en recta: " + velocidadRecta + " km/h, Velocidad en curva: " + velocidadCurva + " km/h";
        }

        // Acelerar recta
        public void acelerarRecta() {
            velocidadRecta += 5;
        }

        // Acelerar curva
        public void acelerarCurva() {
            velocidadCurva += 5;
        }

        // Frenar recta
        public void frenarRecta() {
            velocidadRecta = Math.max(velocidadRecta - 5, 0);
        }

        // Frenar curva
        public void frenarCurva() {
            velocidadCurva = Math.max(velocidadCurva - 5, 0);
        }

        // Mejorar coche
        public void mejorar() {
            velocidadRecta += 15;
            velocidadCurva += 15;
        }

        // Calcular tiempo recta (en segundos)
        public int tiempoRecta(double kilometros) {
            if (velocidadRecta == 0) return -1;
            double tiempoHoras = kilometros / velocidadRecta;
            return (int) (tiempoHoras * 3600);
        }

        // Calcular tiempo curva (en segundos)
        public int tiempoCurva(double kilometros) {
            if (velocidadCurva == 0) return -1;
            double tiempoHoras = kilometros / velocidadCurva;
            return (int) (tiempoHoras * 3600);
        }
    }
}