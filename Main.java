public class Main {
        public static void main(String[] args)
    {
        Coda A=new Coda();
        int val;

        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();

        A.accodare(1);
        
        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();

        A.accodare(2);
    
        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();

        A.accodare(3);

        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();

        A.accodare(4);
        
        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();

        A.accodare(5);
    
        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();

        if (!A.vuoto()) {
            val=A.rimozione();
            System.out.printf("Elemento da togliere in testa: %d\n",val);
        }
 
        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();

        if (!A.vuoto()) {
            val=A.rimozione();
            System.out.printf("Elemento da togliere in testa: %d\n",val);
        }
        
        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();
        
        if (!A.vuoto()) {
            val=A.rimozione();
            System.out.printf("Elemento da togliere in testa: %d\n",val);
        }
        
        System.out.printf("E' vuoto? %s\n",A.vuoto()?"Si":"No");
        A.stampa();
        System.out.println();
    }
}

