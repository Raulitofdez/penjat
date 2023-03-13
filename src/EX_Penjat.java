
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raulf
 */
public class EX_Penjat {
    public static void main(String[] args) {
        
        final char[][] estatPenjatInicial =
        {
          {' ',' ',' ',' ','_','_','_','_',' ',' ',' ',' '},                                      
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ','_','_','|','_',' ',' ',' ',' ',' ',' ',' '},                                      
          {'|',' ',' ',' ',' ','|','_','_','_','_','_',' '},
          {'|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
          {'|','_','_','_','_','_','_','_','_','_','_','|'}
         };   
        
        
        final String[] paraules = {"patata","armari","bicicleta",
                            "advocat","ascensor","astronauta","autopista",
                            "avinguda","bigoti","carretera","castanya",
                            "cervell","civada","cultura","dentista","esquena",
                            "estrella","formatge","gendre","genoll",
                            "infermera","internet","maduixa","malaltia",
                            "maluc","mandarina","maquinista","motocicleta",
                            "nebot","pastanaga","patinet","perruqueria",
                            "pissarra","professor","quadrat","taronja",
                            "tramvia","trapezi","tricicle","violeta"};
        
        
        final int MAXINTENTS = 7;
        
            
            // Estat gràfic del joc durant la partida
            char[][] estatPenjat = 
              new char[estatPenjatInicial.length][estatPenjatInicial[0].length];
            
            
            // Inicialitzar el dibuix del penjat
            inicialitzarEstatPenjat(estatPenjatInicial,estatPenjat);
            mostrarEstatPenjat(estatPenjat);
            
            // Seleccionar la paraula aleatòriament
            int index = (int)(Math.random()*paraules.length);
            String paraula = paraules[index];
            // Eliminar aquesta línia quan el joc estigui completat
            paraula = "patata";
            
            
            int totalEncerts = 0,totalErrors = 0;
            
            // Estructra de dades (array) per saber quines lletres portem 
            //encertades            
            boolean[] lletresEncertades = new boolean[paraula.length()];
            
            // Llistat de lletres que hem introduït
            String lletres = "";
            
            do {
            
                
            } while(totalEncerts < paraula.length() && totalErrors < MAXINTENTS);
            
    }
    
    
    static void mostrarEstatPenjat(char[][] estat) {
        
        for (char[] fila : estat) {
            for (char valor : fila) {
                System.out.print(valor);
            }
            System.out.println("");
        }
        
    }
    
    static void inicialitzarEstatPenjat(char[][] estatPenjatIni, char[][] estat) {
    
        for (int i = 0; i < estatPenjatIni.length; ++i) {
            for (int j = 0; j < estatPenjatIni[0].length; ++j) {
                estat[i][j] = estatPenjatIni[i][j];
            }
        }
        
    }
    
    static void mostrarParaula(String paraula, boolean[] encertades) {
        System.out.println(paraula + "Total de encertades: "+encertades);
    }
    
    static void mostrarLletresIntroduides(String lletres) {
        System.out.print("Lletres introduïdes: ");
        for (int i=0; i<lletres.length(); i++) {
            System.out.print(lletres.charAt(i) + " ");
        }
        System.out.println();
    }
    
    static String demanarLletra(String lletres) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix una lletra: ");
        char lletra = sc.nextLine().charAt(0);
        lletres+=lletra;
        return lletres;
    
    }
    
    static boolean existeixLletra(String lletres, char lletra) {
        for(int i=0; i<lletres.length();i++){
            for(int j=0; j<lletres.length()-1;j++){
                if(lletra==lletres.charAt(j)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    
    static void actualitzarEstatPenjat(char[][] penjat,int errors) {
        
            errors--;
            System.out.println("Intents restansts: "+errors);
            mostrarEstatPenjat(penjat);
    }
    
    static void netejaPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
