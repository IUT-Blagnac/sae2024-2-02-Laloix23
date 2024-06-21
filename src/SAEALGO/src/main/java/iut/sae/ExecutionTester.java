package iut.sae;

public class ExecutionTester {

    public static void main(String[] args) throws AlgoException {
        long startTime = System.nanoTime();

        for(int i=0;i<10;i++)
            Algo.RLE("SAE ALGORITHME DE LA SAE 2.02 de 2024");

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Durée d'exécution en nanosecondes: " + duration);
        System.out.println("Durée d'exécution en millisecondes: " + (duration / (1000000.0*10)));
    

        
        long startTime2 = System.nanoTime();

        for(int i=0;i<10;i++)
            Algo.RLE("SAE ALGORITHME DE LA SAE 2.02 de 2024", 25);

        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        System.out.println("Durée d'exécution en nanosecondes: " + duration2);
        System.out.println("Durée d'exécution en millisecondes: " + (duration2 / (1000000.0*10)));
    }
}
