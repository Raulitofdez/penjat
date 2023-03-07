/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raulf
 */
public class Ex03_Penjat {
    
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
        
    }
    
    static void mostrarLletresIntroduides(String lletres) {
        
    }
    
    static String demanarLletra(String lletres) {
        
        return null;
    
    }
    
    static boolean existeixLletra(String lletres, char lletra) {
        
        return true;
    
    }
    
    static void actualitzarEstatPenjat(char[][] penjat,int errors) {
        
    }
    
    static void netejaPantalla() {
    
    }
    
    
    
}
