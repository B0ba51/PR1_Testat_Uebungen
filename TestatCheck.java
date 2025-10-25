public class TestatCheck {
    public static void main(String[] args) {
      int erreichtePunkte = 90;
      boolean alleAufgabenbearbeitet = false;

      if (erreichtePunkte >=90 && alleAufgabenbearbeitet == true){ // das == muss nicht hin da ein boolean wert immer wahr ist
        System.out.println("Testat bestanden mit Note 1");
      }else {if (erreichtePunkte >=75 && alleAufgabenbearbeitet == true){
        System.out.println("Testat bestanden mit Note 2");
      }else {if (erreichtePunkte >=60 && alleAufgabenbearbeitet == true){
        System.out.println("Testat bestanden mit Note 3");
      }else {if (erreichtePunkte >=50 && alleAufgabenbearbeitet == true){
        System.out.println("Testat bestanden mit Note 4");
      }else {if (erreichtePunkte <50 || alleAufgabenbearbeitet == false){ // hier reicht es und ist sogar besser ein "!" zu verwenden
        System.out.println("Testat nicht bestanden mit Note 5");
      }}}}}}}
     

    

