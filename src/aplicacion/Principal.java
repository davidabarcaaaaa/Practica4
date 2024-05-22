public class Principal {

    public static void main(String[] args) {
        // Ejemplo de cadenas para calcular su distancia de edición
        String palabra1 = "intención";
        String palabra2 = "ejecución";

        // Llamada al método calcularDistancia de la clase CalculadoraDistancias
        int distancia = CalculadoraDistancias.calcularDistancia(palabra1, palabra2);

        // Mostrar el resultado en consola
        System.out.println("La distancia de edición entre \"" + palabra1 + "\" y \"" + palabra2 + "\" es: " + distancia);
        
        // Puedes agregar más ejemplos aquí para probar con diferentes cadenas
    }
}
