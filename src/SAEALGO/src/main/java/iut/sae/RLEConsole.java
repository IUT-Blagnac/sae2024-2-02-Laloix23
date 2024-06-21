package iut.sae;

import java.util.Scanner;

public class RLEConsole{

    public static void main(String[] args) throws AlgoException{
        String in="";
        
        if(args.length>0){
            in=args[0];
        }
        else{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Chaine à transformer : ");
            in = scanner.next();
            scanner.close();

            
        }

        System.out.println("Entrée : "+in);
        System.out.println("Sortie : "+ MonAlgo.RLE(in)); 

        System.out.println(MonAlgo.unRLE("9W1B8W3B3W1B7W"));
        
    }
}