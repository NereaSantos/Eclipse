package practicasevaluables1ºtrimestre;
import java.util.*;

public class Practicaevaluable4 {
    
public static void main(String[] args){

Scanner teclado = new Scanner(System.in);

String palabra1 = "null", palabra2 = "null", palabra3 = "null";

System.out.println("Escriba una palabra ");

    palabra1 = teclado.next();

    int long1 = palabra1.length();

System.out.println("Escriba otra palabra ");

    palabra2 = teclado.next();

    int long2 = palabra2.length();

System.out.println("Escriba otra palabra ");

    palabra3 = teclado.next();

    int long3 = palabra3.length(); 

    //cpmaración de longitud de palabras

if (long1 > long2 && long2 > long3){

    System.out.println("El orden de las palabras es " + palabra1 + " , " + palabra2 + " , " + palabra3);

        }else if (long1 > long3 && long3 > long2){

            System.out.println("El orden de las palabras es " + palabra1 + " , " + palabra3 + " , " + palabra2);

                }else if (long2 > long1 && long1 > long3){

                    System.out.println("El orden de las palabras es " + palabra2 + " , " + palabra1 + " , " + palabra3);

                        }else if (long2 > long3 && long3 > long1){

                            System.out.println("El orden de las palabras es " + palabra2 + " , " + palabra3 + " , " + palabra1);

                                }else if (long3 > long1 && long1 > long2){

                                    System.out.println("El orden de las palabras es " + palabra3 + " , " + palabra1 + " , " + palabra2);

                                        }else if (long3 > long2 && long2 > long1){

                                            System.out.println("El orden de las palabras es " + palabra3 + " , " + palabra2 + " , " + palabra1);
}

    //comparación alfabetica de palabras

if(palabra1.compareTo(palabra2) < 0 && palabra2.compareTo(palabra3) < 0){

    System.out.println("El orden de las palabras es " + palabra1 + " , " + palabra2 + " , " + palabra3);

    }else if(palabra1.compareTo(palabra3) < 0 && palabra3.compareTo(palabra2) < 0){

        System.out.println("El orden de las palabras es " + palabra1 + " , " + palabra3 + " , " + palabra2);
    
        }else if(palabra2.compareTo(palabra1) < 0 && palabra1.compareTo(palabra3) < 0){

            System.out.println("El orden de las palabras es " + palabra2 + " , " + palabra1 + " , " + palabra3);
        
            }else if(palabra2.compareTo(palabra3) < 0 && palabra3.compareTo(palabra1) < 0){

                System.out.println("El orden de las palabras es " + palabra2 + " , " + palabra3 + " , " + palabra1);
            
                }else if(palabra3.compareTo(palabra1) < 0 && palabra1.compareTo(palabra2) < 0){

                    System.out.println("El orden de las palabras es " + palabra3 + " , " + palabra1 + " , " + palabra2);
                
                    }else if(palabra1.compareTo(palabra2) == 0 && palabra2.compareTo(palabra3) < 0){

                        System.out.println("El orden de las palabras es " + palabra1 + " , " + palabra2 + " , " + palabra3);

                            }else if(palabra1.compareTo(palabra3) == 0 && palabra3.compareTo(palabra2) < 0){

                                System.out.println("El orden de las palabras es " + palabra1 + " , " + palabra3 + " , " + palabra2);
                        
                                    }else if(palabra2.compareTo(palabra1) == 0 && palabra1.compareTo(palabra3) < 0){

                                        System.out.println("El orden de las palabras es " + palabra2 + " , " + palabra1 + " , " + palabra3);
                                    
                                        }else if(palabra2.compareTo(palabra3) == 0 && palabra3.compareTo(palabra1) < 0){

                                            System.out.println("El orden de las palabras es " + palabra2 + " , " + palabra3 + " , " + palabra1);
                                        
                                            }else if(palabra3.compareTo(palabra1) == 0 && palabra1.compareTo(palabra2) < 0){

                                                System.out.println("El orden de las palabras es " + palabra3 + " , " + palabra1 + " , " + palabra2);
                                            
                                                }

teclado.close();

}}
