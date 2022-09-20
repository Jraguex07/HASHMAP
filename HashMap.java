/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author Raguex
 */
public class HashMap {
    private int dorsal;
    private String nombre;
    private String demarcacion;

	public  HashMap() {
	}

	public  HashMap(int dorsal, String nombre, String demarcación) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.demarcacion = demarcación;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDemarcación() {
		return demarcacion;
	}

	public void setDemarcación(String demarcación) {
		this.demarcacion = demarcación;
	}

	@Override
	public String toString() {
		return this.dorsal+"  --  "+this.nombre+"  --  "+this.demarcacion;
	}
        
        public static void main(String[] args) {
            System.out.println("********* Seleccion Nacional España Rumbo Qatar 2022*********");
        Map <String, HashMap> jugadores = new TreeMap<String, HashMap>();
        jugadores.put("Ramos", new HashMap        (4,"Ramos", "Lateral Derecho"));
        jugadores.put("Lucas Vazquez", new HashMap(15,"Lucas Vazquez", "Lateral Derecho"));
        jugadores.put("Pau Torres", new HashMap   (13,"Pau Torres", "Central"));
        jugadores.put("Pique", new HashMap        (5,"Pique", "Central"));
        jugadores.put("Jordi Alba", new HashMap   (11,"Jordi Alba", "Lateral Izquierdo"));
        jugadores.put("Thiago ", new HashMap      (14,"Thiago ", "Medio Centro"));
        jugadores.put("Busquets", new HashMap     (16,"Busquets", "Medio Centro"));
        jugadores.put("GABY", new HashMap         (8,"GABY", "Centro Campista"));
        jugadores.put("Pedri", new HashMap(       18,"Pedri", "Interior Izquierdo"));
        jugadores.put("Ferran Torres", new HashMap(6,"Ferran Torres", "Interior Derecho"));
        jugadores.put("Morata", new HashMap       (9,"Morata", "Delantero"));

        for (Entry<String, HashMap> jugador : jugadores.entrySet()){
                String clave = jugador.getKey();
                HashMap valor = jugador.getValue();
                System.out.println(clave+"  ->  "+valor.toString());
        }

    }

}

