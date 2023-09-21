
public class Persona {
    
    private final char DEFAULT_SEXO = 'h'; //Sexo por defecto
    
    private final int PESO_IDEAL = 0;
    private final int  PESO_POR_DEBAJO = -1;
    private final int PESO_SOBREPESO = 1;
    
    //atributos de la clase: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    //Un constructor por defecto.
    public Persona(){
        nombre = "";
        edad = 0;
        sexo = DEFAULT_SEXO;
        peso = 0;
        altura = 0;
        DNI = generarDNI();
    }
    
    //Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        peso = 0;
        altura = 0;
        DNI = generarDNI();
    }

    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        DNI = generarDNI();
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int calcularPesoIdeal(){      
        double pesoActual=peso/(Math.pow(altura, 2));
        
        if (pesoActual>=20 && pesoActual<=25){
            return PESO_IDEAL;
        }else if(pesoActual < 20){
            return PESO_POR_DEBAJO;
        }else{
            return PESO_SOBREPESO;
        }
    }

    public boolean esMayorDeEdad(){
        if (edad<18) return false;
        else return true;
    }

    private void comprobarSexo(char sexo){
        if (sexo != 'm' && sexo!='h') {
            this.sexo = DEFAULT_SEXO;
        } else {
            this.sexo = sexo;
        }
    }
    
    public char getSexo(){
        return sexo;
    }

    
    public String toString() {
        String sexo="";
        if(this.sexo == 'h'){
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Persona:" +
                "Nombre: " + nombre + ", " +
                "Sexo: " + sexo + ", " +
                "Edad: " + edad + " años, " +
                "DNI: " + DNI + ", " +
                "Peso: " + peso + " kg, " +
                "Altura: " + altura + " metros.";
    }

    private String generarDNI(){
        int dni = 0;
        int residuo = 0;
        int random;
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        for (int i = 1; i <= 8; i++){
            dni = dni * 10;
            random = (int)( Math.random()*10);
            dni =  dni + random;
        }
        residuo = dni%23;
        return dni+""+letras[residuo];
    }
}
