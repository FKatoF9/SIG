public class Ciudadano {
    String nombrecompleto;
    int edad;
    String ocupacion;
    String nomsectorcat;
    boolean participa;
    String genero;
    String nivelEducativo;

    public Ciudadano (String nombrecompleto, int edad, String ocupacion, String nomsectorcat, boolean participa, String genero, String nivelEducativo) {
        this.nombrecompleto = nombrecompleto;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nomsectorcat = nomsectorcat;
        this.participa = participa;
        this.genero = genero;
        this.nivelEducativo = nivelEducativo;
    }

    public Ciudadano(String nombrecompleto, int edad) {
    this(nombrecompleto, edad, "Desconocida", "Desconocido", false, "No definido", "No definido");
    System.out.println("Ciudadano creado: " + nombrecompleto +
                   ", Edad: " + edad +
                   ", Ocupación: " + ocupacion +
                   ", Barrio: " + nomsectorcat +
                   ", ¿Puede Participar?: " + participa +
                   ", Género: " + genero +
                   ", Nivel Educativo: " + nivelEducativo);

}


    public void saludar () {
        System.out.println("Hola, soy " + nombrecompleto + " y vivo en " + nomsectorcat+participa);
    }

    public void mostrarOcupacion () {
        System.out.println("Mi ocupación es: " + ocupacion);
    }

    public boolean puedeParticipar () {
        return participa && edad >= 18;
    }

    public void cambiarnomsectorcat (String nuevonomsectorcat) {
        this.nomsectorcat = nuevonomsectorcat;
    }

    public void mostrarEdad () {
        System.out.println("Tengo " + edad + " años.");
    }

    public void mostrarGenero () {
        System.out.println("Mi género es " + genero);
    }
}
