
package palabraClave;

import java.util.Arrays;
import java.util.Scanner;

public class cifraditooo {
char Abec[] ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char AbecOr[] = new char[27];
    
    Scanner sc = new Scanner(System.in,"ISO-8859-1");
    
    char es[]= {' '};
    
    
    public void CalcularAbecedario(){
        char Cadena[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char Cadena2[] = {'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-'};
        
        boolean opcion = true;
        
        String palabra;
        
         
        System.out.print("Palabra clave: ");
        palabra = sc.nextLine();
        
        char cadenaChars[] = new char[palabra.length()]; 
        for (int i=0; i<palabra.length(); i++){ 
             cadenaChars[i] = palabra.charAt(i); 
            }
       
        
        for(int b = 0;b<=(palabra.length()-1);b++){
            Cadena2[b] = cadenaChars[b];
        }
        
         
         char arregloLetras[];
        arregloLetras = new char[Cadena.length];
         
        for(int a = 0;a<=25;a++){
            for(int j = 0;j<=25;j++){
                if(Cadena[a] == Cadena2[j]){
                    opcion = true;
                    break;
                }else{
                    opcion = false;
                }
            }
            if(opcion == false){
                arregloLetras[a] = Cadena[a];
            }else{
                arregloLetras[a] = '-';
            }
            
        }
        
        Arrays.sort(arregloLetras);
        
        
        for(int g=0;g<=(palabra.length()-1);g++){
            arregloLetras[g] = Cadena2[g];
        }
        
        for(int n=0;n<=25;n++){
            
            
            this.AbecOr[n] = arregloLetras[n];
            
            
        }
        
       
    }
    
    public void Cifrar(){
        CalcularAbecedario();
        String Texto;
        
        
        System.out.print("Texto que desea cifrar: ");
        Texto = sc.nextLine();
        
        char cadenaChars[] = new char[Texto.length()]; 
        for (int i=0; i<Texto.length(); i++){ 
             cadenaChars[i] = Texto.charAt(i); 
            }
        System.out.print("Texto cifrado: ");
        
        for(int n = 0;n<Texto.length();n++){
            if(cadenaChars[n] == es[0]){
                    System.out.print(" ");
                }else{
                    for(int j = 0;j<=25;j++){
                        if(cadenaChars[n] == this.AbecOr[j]){
                            System.out.print(this.Abec[j]);
                        }
                    }
                }
            
        }
        
        System.out.print("\n");
    }
    
    public void Decifrar(){
        CalcularAbecedario();
        
        
        String Texto;
        
        System.out.print("Texto que desea  decifrar: ");
        Texto = sc.nextLine();
        
        char cadenaChars[] = new char[Texto.length()]; 
        for (int i=0; i<Texto.length(); i++){ 
             cadenaChars[i] = Texto.charAt(i); 
            }
        
        System.out.print("Texto decifrado: ");
        
        for(int n = 0;n<Texto.length();n++){
            if(cadenaChars[n] == es[0]){
                System.out.print(" ");
            }else{
                for(int j=0;j<26;j++){
                    if(cadenaChars[n] == this.Abec[j]){
                        System.out.print(this.AbecOr[j]);
                    }
                }
            }
        }
        
        System.out.print("\n");
    }
    
}
