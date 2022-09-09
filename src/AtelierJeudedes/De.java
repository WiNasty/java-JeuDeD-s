package AtelierJeudedes;

    public class De {
        private int num;
        private int nbFaces;
        private int valeur;
        private boolean estPipe = false;
        
        public De(){
            num = 0;
            nbFaces = 6;
            valeur = 0;
        }

        public De(int num, int nbFaces, int valeur) {
            this.num = num;
            this.nbFaces = nbFaces;
            this.valeur = valeur;
        }
        
            public De(int nbFaces) {
        this();
        this.nbFaces = nbFaces;
        }
        
        public void lancer(){
            valeur = (int)(Math.random()* nbFaces) + 1;
        }
        
        public String toString(){
            return "de " + num + " : " + valeur;
        }
        
        public void piper(){
            valeur = (int)(Math.random()* nbFaces) + 1;
            if (valeur == 1){
                valeur = 1;
            }
            else if (valeur == 2){
                valeur = 2;
            }
            else if (valeur == 3){
                valeur = 2;
            }
            else if (valeur == 4){
                valeur = 4;
            }
            else if (valeur == 5){
                valeur = 4;
            }
            else if (valeur == 6){
                valeur = 1;
            }
            System.out.println("♠" + "De : " + valeur); // "♠" pour dire si c'est piper ou pas
            
        }
        
        public int getNum() {
            return num;
        }

        public int getNbFaces() {
            return nbFaces;
        }

        public int getValeur() {
            return valeur;
        }
        
        

    }
