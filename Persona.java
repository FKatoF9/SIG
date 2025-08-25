public class Persona{
    int edad;
    int estatura;
    int peso;
    char genero;
    String nacionalidad;
    int energia;
    String nombre;
    Persona(int edad, int estatura, int peso, char genero, String nacionalidad, int prueba, String nombre){
        this.edad=edad;
        this.estatura=estatura;
        this.peso=peso;
        this.genero=genero;
        this.nacionalidad=nacionalidad;
        energia=prueba;
        this.nombre=nombre;
    }
    public void domir (){
        System.out.println("La persona "+nombre+" esta durmiendo");
        energia=energia+10;
        System.out.println("La nueva energia de la persona es:"+energia);
    }
    public void embriagarse (){
        System.out.println("La persona esta tomando chirrincho");
        if (energia>=20){
            energia=energia-20;
        }else{
            energia=0;
        }
        if(energia<=0){
            System.out.println(nombre+"Llamó al ex");
        }
        System.out.println("La energia que queda es :"+energia);
    }
    public void comer (){
        System.out.println("La persona esta comiendo");
    }
    public void respirar (){
        System.out.println("La persona esta respirando");
    }
    public int getEdad(){
        return edad;
    }
}
