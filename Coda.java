public class Coda{
    private Nodo head;
    private Nodo coda;
    private int c;

    public Coda(){
        this.c=0;
        this.head=null;
        this.coda=null;
    }

    public boolean vuoto(){
        return this.c==0;
    }

    public int size() {
        return this.c;
    }

    public void stampa(){
        Nodo a = this.head;

        System.out.printf("[%d]\n ", this.size());

        while (a!=null) {
            System.out.printf("%d --> ",a.v);
            a=a.next;
        }
    }

    public void accodare(int val)
    {
        Nodo temp = new Nodo(val);

        this.c++;

        if (this.head == null) {
            this.head = temp;
        } else {
            this.coda.next = temp;
        }

        this.coda = temp;
    }

    public int rimozione()
    {
        int val;

        val=this.head.v;

        this.head = this.head.next;

        if (this.head==null) {
            this.coda=null;
        }

        this.c--;

        return val;
    }
}
