package Model;
import java.util.ArrayList;

public class Vehiculo {
    private String marca;
    private String color;
     private ArrayList<Vehiculo> arraymarcavehiculo;
     private ArrayList<Vehiculo> arraycolorvehiculo;
     
     public Vehiculo(String marca, String color, ArrayList<Vehiculo> arraymarcavehiculo,ArrayList<Vehiculo> arraycolorvehiculo) {
        this.marca = marca;
        this.color = color;
        this.arraymarcavehiculo= arraymarcavehiculo;
        this.arraycolorvehiculo= arraycolorvehiculo;
        
     }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Vehiculo> getArraymarcavehiculo() {
        return arraymarcavehiculo;
    }

    public void setArraymarcavehiculo(ArrayList<Vehiculo> arraymarcavehiculo) {
        this.arraymarcavehiculo = arraymarcavehiculo;
    }

    public ArrayList<Vehiculo> getArraycolorvehiculo() {
        return arraycolorvehiculo;
    }

    public void setArraycolorvehiculo(ArrayList<Vehiculo> arraycolorvehiculo) {
        this.arraycolorvehiculo = arraycolorvehiculo;
    }
     }

    