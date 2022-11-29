public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Peres", "Hermenejildo", "Pablo"};

        String namesConcated = "";

        for(String nombre :nombres) {
            namesConcated+= " " + nombre;
        }

        System.out.println(namesConcated);
    }
}