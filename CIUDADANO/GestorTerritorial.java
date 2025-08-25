public class GestorTerritorial {
    public static void main(String[] args) {
        Ciudadano[] ciudadanos = new Ciudadano[3];

        // ✅ Índices corregidos: 0, 1, 2
        ciudadanos[0] = new Ciudadano("Silvia Fernanda Lopez Azcarriaga", 23, "Profesora de matematicas", "Santa rita", true, "Femenino", "Universitario");
        ciudadanos[1] = new Ciudadano("Luis Fernando Monroy Solorzano", 17, "Carpintero", "Tuna Alta", true, "masculino", "Tecnico");
        ciudadanos[2] = new Ciudadano("Lorena Farfan Contreras", 30, "Ingeniera catastral", "Iberia", true, "Femenino", "Postgrado");

        Zona zona1 = new Zona("Zona Norte", "Suba", 150000, 20, false, 12.5, "Urbana");
        zona1.mostrarZona(true);

        System.out.println("\n=== Revisión de participación ciudadana ===");
        for (Ciudadano c : ciudadanos) {
            c.saludar();
            if (c.puedeParticipar()) {
                System.out.println("Puede participar en el proceso territorial.");
            } else {
                System.out.println("No puede participar todavía.");
            }
        }

        System.out.println("\n=== Cálculo de densidad poblacional ===");
        double densidad = zona1.densidadPoblacional();
        System.out.println("Densidad: " + densidad + " hab/km²");

        int i = 0, conteo = 0;
        while (i < ciudadanos.length) {
            if (ciudadanos[i] != null && ciudadanos[i].puedeParticipar()) {
                conteo++;
            }
            i++;
        }

        System.out.println("Número total de ciudadanos que pueden participar: " + conteo);
    }
}