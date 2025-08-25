public class Principal{
    public static void main(String args[]){
        System.out.println("Esta es mi clase principal y funciona");
        Persona lupita = new Persona (5,4,3,'F', "Colombiana", 100,"Lupita");
        Persona Carlos = new Persona (5,4,3,'H', "Colombiana", 100,"Carlos R");
        Persona jonne = new Persona (5,4,3,'H', "Colombiana", 100,"Jonne D");
        lupita.domir();
        lupita.embriagarse();
        Carlos.domir();
        jonne.domir();
        System.out.println(lupita.getEdad());
        Carlos.embriagarse();
        Carlos.embriagarse();
        Carlos.embriagarse();
    }
}