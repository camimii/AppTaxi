/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptaxi;

/**
 *
 * @author Camila
 */
public class Vehiculo {
    private int codigo;
    private String patente;
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double kmLitro;
    private double kmxVuelta;
    private Pasajero[] pasajeros;
    private int precioPasaje;

    public Vehiculo(int codigo, String patente, String marca, String modelo, int añoFabricacion, double kmLitro, double kmxVuelta, int precioPasaje) {
        this.codigo = codigo;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.kmLitro = kmLitro;
        this.kmxVuelta = kmxVuelta;
        this.pasajeros = new Pasajero[16];
        this.precioPasaje = precioPasaje;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getKmLitro() {
        return kmLitro;
    }

    public void setKmLitro(double kmLitro) {
        this.kmLitro = kmLitro;
    }

    public double getKmxVuelta() {
        return kmxVuelta;
    }

    public void setKmxVuelta(double kmxVuelta) {
        this.kmxVuelta = kmxVuelta;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPrecioPasaje() {
        return precioPasaje;
    }

    public void setPrecioPasaje(int precioPasaje) {
        this.precioPasaje = precioPasaje;
    }
    /*
    public void subirPasajero(){
        for(int x = 0;x >= 16;x++){
            pasajeros[x] = new Pasajero("asd","ads","asd"); 
        }
        
    }
    */
    public void subirPasajero(Pasajero esteSujeto){
        for(int x = 0; x < 16 ; x++){
            if(pasajeros[x] == null){
                pasajeros[x] = esteSujeto;
                break;
            }
        }
    }
    
    public void iniciarVuelta(int precioPasaje){
        this.kmxVuelta = 100;
        System.out.println("La vuelta ha iniciado, los km a recorrer son: "+kmxVuelta+"\nElprecio del pasaje es: "+precioPasaje);
   }
   
    public void terminarVuelta(){
        System.out.println("La vuelta ha finalizado");
        System.out.println(verTotalGastoBencina());
        verGananciaxSubida();
        verGananciaDelDia();
        
        
    }
        
   public int verTotalGastoBencina(){
       int valorBencina = 30;
       double totalBencina = kmxVuelta*valorBencina;
       return (int) totalBencina;
       
   } 
    
   public int verGananciaxSubida(){
       int ganancia;
       ganancia = pasajeros.length*precioPasaje;
       return ganancia;
       
   }

   public int verGananciaDelDia(){
      int gananciaDelDia;
      gananciaDelDia = verTotalGastoBencina() - verGananciaxSubida();
      return gananciaDelDia;
   }


}


