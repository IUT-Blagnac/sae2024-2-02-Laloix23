package iut.sae.algo;


public class simplicite{
    public static String RLE(String chaine){
        String resultat="";
        int indice=1;
        char actuelle=chaine.charAt(0); 
        int taille=chaine.length();
        int nbCar=1;
        while (indice<taille){
            if (chaine.charAt(indice)==actuelle){
                if (nbCar==9){
                    resultat+="9"+actuelle;
                    nbCar=0;
                }
                nbCar+=1;
            }
            else{
                resultat+=""+nbCar+""+actuelle;
                actuelle=chaine.charAt(indice);
                nbCar=1;
            }
            indice+=1;
        }
        return resultat;
    }

    public static String RLE(String in, int iteration) throws AlgoException{
        return "NotYetImplemented";
    }

    public static String unRLE(String chaine) {
        StringBuilder resultat = new StringBuilder(); 
        int indice = 0;
        
        while (indice < chaine.length()) {
            char actuelle = chaine.charAt(indice);
        
            if (Character.isDigit(actuelle)) {
                int nbCar = Character.getNumericValue(actuelle); 
                char car = chaine.charAt(indice + 1); 
        
                for (int i = 0; i < nbCar; i++) {
                    resultat.append(car);
                }
                indice += 2;
            } else {
                resultat.append(actuelle); 
                indice++; 
            }
        }
        
        return resultat.toString();
    }
    

    public static String unRLE(String in, int iteration) throws AlgoException{
        // Provide your algo here
        return "NotYetImplemented";
    }
}