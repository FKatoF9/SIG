public class Zona {
    private String nombre;
    private String localidad;
    private int poblacion;
    private int numsectocats;
    private boolean zonaRural;
    private double area;
    private String tipoZona;

    public Zona(String nombre, String localidad, int poblacion, int numsectocats,
                boolean zonaRural, double area, String tipoZona) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.poblacion = poblacion;
        this.numsectocats = numsectocats;
        this.zonaRural = zonaRural;
        this.area = area;
        this.tipoZona = tipoZona;
    }

    public void mostrarZona() {
        System.out.println("Zona: " + nombre + " - Tipo: " + tipoZona);
    }

    public void mostrarZona(boolean zonaRural) {
        if (zonaRural) {
            System.out.println("Zona: " + nombre + ", Localidad: " + localidad + ", Población: " + poblacion);
        } else {
            mostrarZona();
        }
    }

    public double densidadPoblacional() {
        if (area == 0) return 0; // Evitar división por cero
        return (double) poblacion / area;
    }

    public boolean esZonaRural() {
        return zonaRural;
    }

    public void cambiarTipo(String nuevoTipo) {
        this.tipoZona = nuevoTipo;
    }

    public void mostrarArea() {
        System.out.println("Área de la zona: " + area + " km²");
    }

    public void mostrarBarrios() {
        System.out.println("Número de barrios: " + numsectocats);
    }
}
