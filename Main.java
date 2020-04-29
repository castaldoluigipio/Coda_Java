public class Main {
    public static void main(String args[]){
        Server S=new Server();
        Client C=new Client();
        
        
        System.out.println("-->SERVER<--\n");
        S.creazionePorta();
        S.Listen();
        S.attesa();
        System.out.println("-->CLIENT<--\n");
        C.indirizzamento();
        C.connect();
        System.out.println("-->SERVER<--\n");
        S.creazioneSocket();
        S.Accept();
        System.out.println("-->CLIENT<--\n");
        C.comunicazione();
        System.out.println("-->SERVER<--\n");
        S.comunicazione();
        
    }
}
