/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        
        //1.
        System.out.println("Digite coeficiente A");
        int A= entrada.nextInt();
        
        System.out.println("Digite coeficiente B");
        int B= entrada.nextInt();
        
        System.out.println("Digite coeficiente C");
        int C= entrada.nextInt();
        
        System.out.println("Digite coeficiente D");
        int D= entrada.nextInt();
        
        System.out.println("Digite coeficiente E");
        int E= entrada.nextInt();
        
        System.out.println("Digite coeficiente F");
        int F= entrada.nextInt();
        
        double x=((C*E)-(B*F))/((A*E)-(B*D));
        double y=((A*F)-(C*D))/((A*E)-(B*D));
        
        
        //2
        int contador=0;
        do{
            System.out.println("Digite un numero ");
            int numero=entrada.nextInt();
            
            if(numero<0){
                contador++;
            }
            
        }while(contador<20);
        
        System.out.println("el numero de negativos ingresados fue de: "+contador);
        
        //3. 
         System.out.print("Digite numero de filas: ");
        int numeroFilas=entrada.nextInt();
        System.out.print("Digite numero de columnas: ");
        int numeroColumnas=entrada.nextInt();
        
        
        int[][] matriz= new int[numeroFilas][numeroColumnas];
        
        for (int filas = 0; filas < matriz.length; filas++) {
            
            for(int columnas = 0; columnas < matriz[0].length; columnas++){
                
                System.out.print("Digite elemento de matriz: ");
                matriz[filas][columnas]=entrada.nextInt();
                
            }
            
        }
        
        System.out.println("*******");
        System.out.println("La matriz digitada es: ");
        
        int[] sumatoriaFilas = new int[numeroFilas];
        int[] sumatoriaColumnas = new int[numeroColumnas];
        
        for (int filas = 0; filas < matriz.length; filas++) {
            
            for(int columnas = 0; columnas < matriz[0].length; columnas++){
                
                System.out.print(matriz[filas][columnas]+" ");
                sumatoriaFilas[filas]=sumatoriaFilas[filas]+matriz[filas][columnas];   
            }
            System.out.println("");
            
        }
        System.out.println("");
        for (int columnas = 0; columnas < matriz[0].length; columnas++) {
            
            for(int filas = 0; filas < matriz.length; filas++){ //1
               
                sumatoriaColumnas[columnas]=sumatoriaColumnas[columnas]+matriz[filas][columnas];   
            }
            System.out.println("");
            
        }
        
        System.out.println("");
        System.out.println("La sumatoria de filas es: ");
        for(int i=0; i<sumatoriaFilas.length;i++){
            System.out.print(sumatoriaFilas[i]+" ");
        }
        
        System.out.println("");
        System.out.println("La sumatoria de columnas es: ");
        for(int i=0; i<sumatoriaColumnas.length;i++){
            System.out.print(sumatoriaColumnas[i]+" ");
        }
        
        //4
        String[] productos= new String[10];
        
        int opcion;
        int numeroProducto=0;
        
        do{
            
            System.out.println("*********** INVENTARIO DON GUSTAVO ***********");
            System.out.println("**************************************************");
            System.out.println("**** 1.Agregar Producto");
            System.out.println("**** 2.Buscar producto");
            System.out.println("**** 3.Editar producto");
            System.out.println("**** 4.Mostrar Inventario");
            System.out.println("**** 5.Salir");
            System.out.println("**************************************************");
            System.out.println("Por favor digite la opcion deseada: ");
            opcion=entrada.nextInt();
            
            
            switch(opcion){
                
                case 1:
                    
                    System.out.println("Digita el nuevo producto: ");
                    productos[numeroProducto]=entrada.next();
                    numeroProducto++;
                    break;
                    
                case 2:
                    
                    boolean bandera=true;
                    System.out.println("Digita el nombre del producto a buscar: ");
                    String productoBuscado=entrada.next();
                    
                    for(int i=0; i<productos.length; i++){
                       
                        if(productoBuscado.equals(productos[i])){
                            System.out.println("Exito el producto existe en BD");
                            break;
                        }else{
                            bandera=false;
                        }
                    }
                    
                    if(!bandera){
                       System.out.println("el producto NO existe en BD"); 
                    }
                    break;
                    
                case 3:
                    boolean posibleEdicion=true;
                    System.out.println("Digita el nombre del producto a buscar: ");
                    String productoaEditar=entrada.next();
                    
                    for(int i=0; i<productos.length; i++){
                        
                        if(productoaEditar.equals(productos[i])){
                            System.out.print("Digite el nuevo producto:");
                            productos[i]=entrada.next();
                            break;
                        }else{
                            posibleEdicion=false;
                        }
                        
                        if(!posibleEdicion){
                            System.out.println("el producto NO existe en BD, por lo tanto no se actualizo"); 
                        }   
                    }
                    break;
                    
                case 4: 
                    System.out.println("");
                    for(int i=0; i<productos.length;i++){
                        
                        if(productos[i]!=null){
                            System.out.print(productos[i]+"--");
                        }
                        
                    }
                    System.out.println("");
                    
                break;
                
                case 5:
                    System.exit(0);
                    break;
                
            }
            
            
            
            
            
            
        }while(opcion!=5);
        
        
    }
    
}
