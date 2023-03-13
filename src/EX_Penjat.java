
import java.io.IOException;
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
        
        
        final int MAXINTENTS = 8;
        
            
            // Estat gràfic del joc durant la partida
            char[][] estatPenjat = 
              new char[estatPenjatInicial.length][estatPenjatInicial[0].length];
            
            
            // Inicialitzar el dibuix del penjat
            inicialitzarEstatPenjat(estatPenjatInicial,estatPenjat);
            mostrarEstatPenjat(estatPenjat);
            
            // Seleccionar la paraula aleatòriament
            int index = (int)(Math.random()*paraules.length);
            String paraula = paraules[index];
            paraula="patata";
            
            int totalEncerts = 0,totalErrors = 0, intents =0;
            
            // Estructra de dades (array) per saber quines lletres portem 
            //encertades            
            boolean[] lletresEncertades = new boolean[paraula.length()];
            
            // Llistat de lletres que hem introduït
            String lletres = "";
            
            char lletra=' ';
            boolean intent =false;
            do {    
                    lletra = demanarLletra(lletres).charAt(lletres.length());
                    intent = existeixLletra(lletres,lletra);
                        if(intent==true){
                            System.out.println("La lletra esta repetida torna a introduir una diferent! ");
                            
                        }   
                        else{
                            
                            lletres+=lletra;
                            for (int i=0;i<paraula.length();i++){
                                for(int j=0; j<paraula.length();j++){
                                    if (lletra==paraula.charAt(j)){
                                        lletresEncertades[j]=true;
                                    }
                                }  
                            }
                boolean comprova = false;
                int cont=0;
                //ERRORS i ENCERTS
                for(int i=0; i<paraula.length();i++){
                    if(lletra==paraula.charAt(i)){
                        comprova = true;
                        totalEncerts++;
                    }
                    else{
                        comprova=false;
                        cont++;
                    }
                    
                }
                if(cont==paraula.length()){
                    totalErrors++;
                    }
                              
                actualitzarEstatPenjat(estatPenjat,totalErrors);
                mostrarEstatPenjat(estatPenjat);
                mostrarLletresIntroduides(lletres);
                mostrarParaula(paraula,lletresEncertades);
                System.out.println("Total de errors = "+totalErrors);
                System.out.println("Total de Encerts = "+totalEncerts);
                netejaPantalla();
                }    
              
            
           }while(totalEncerts < paraula.length() && totalErrors < MAXINTENTS);
            
             
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
        System.out.print("Paraula oculta   ");
        for (int i=0;i<paraula.length();i++){
        if(encertades[i]==true){
            System.out.print(paraula.charAt(i));
        }
        else{
            System.out.print("*");
        }
    }
        System.out.println("");
    }
    
    static void mostrarLletresIntroduides(String lletres) {
        System.out.print("Lletres introduïdes:   ");
        for (int i=0; i<lletres.length(); i++) {
            System.out.print(lletres.charAt(i));
        }
        System.out.println();
    }
    
    static String demanarLletra(String lletres) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix una lletra:   ");
        char lletra = sc.next().charAt(0);
        lletres+=lletra;
        return lletres;
    
    }
    
    static boolean existeixLletra(String lletres, char lletra) {
        for (int i=0;i<lletres.length();i++){
                        if (lletra==lletres.charAt(i)){
                            return true;
                        }
                        
                    }
       return false;
    }
    
    static void actualitzarEstatPenjat(char[][] penjat,int errors) {
            switch(errors-1) {
                case 0:
                        penjat[1][8]='|';
                        break;
                case 1:
                        penjat[2][8]='O';
                        break;
                case 2:
                        penjat[3][8]='|';
                        break;
                case 3:
                        penjat[3][7]='/';   
                        break;
                case 4:
                        penjat[3][9]='\\';
                        break;
                case 5:
                        penjat[4][8]='|';
                        break;
                case 6:
                        penjat[5][7]='/';
                        break;
                case 7:
                
                        penjat[5][9]='\\';
                        break;
                default:
                        break;
              }
    }
    
    static void netejaPantalla() {
          try {
  		if (System.getProperty("os.name").contains("Windows")) {
    		  new ProcessBuilder("cmd", "/c", "cls").
                          inheritIO().start().waitFor();
  		} else {
    	    		System.out.print("\033[H\033[2J");
    			System.out.flush();
  		}
            } catch (IOException | InterruptedException ex) {}
    }
}
