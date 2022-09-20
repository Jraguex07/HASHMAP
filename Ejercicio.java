/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Raguex
 */
public class Ejercicio {

  public static void main(String[] args) {
  
  Map mapA = new HashMap();
  mapA.put("1025", "Cafe");
  mapA.put("1026", "Cereal");
  mapA.put("1027", "Leche");
  mapA.put("1028", "Arroz");
  mapA.put("1029", "azucar");
  mapA.put("1030", "verduras");
  mapA.put("1031", "Frutas");
  String elemento1 = (String) mapA.get("1025");
  System.out.println("producto" +elemento1 );

  Iterator iterador = mapA.keySet().iterator();
  System.out.println("Codigo "+ elemento1);   
     
  Iterator iteratorValue = mapA.values().iterator();
  System.out.println("Producto" + iteratorValue);
  Iterator iteratorWhile = mapA.keySet().iterator();
      
  while(iteratorWhile.hasNext()){
    Object key = iteratorWhile.next();
    System.out.println("Numero codigo ->"+key);
    Object value = mapA.get(key);
    System.out.println("Producto ->"+value);
      System.out.println("");
  }
    
  for(Object key: mapA.keySet()){
    Object value = mapA.get(key);
      System.out.println("----------Produto---------");
    System.out.println("Producto ->"+value);
  }
  }
  
  
  
  
}