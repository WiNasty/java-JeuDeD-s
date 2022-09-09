package AtelierJeudedes;

public class AtelierJeuDeDes {

    public static void main(String[] args) {
        
        De L1 = new De();
        De L2 = new De();
        De L3 = new De();
        L1.lancer();
        System.out.println(L1.toString());
        L2.lancer();
        System.out.println(L2.toString());
        L3.lancer();
        System.out.println(L3.toString());
        
        L1.piper();
        L1.piper();
        L1.piper();
        
        
    }
    
}
