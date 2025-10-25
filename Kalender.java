public class Kalender{
    public static void main(String [] args){
        int monat = 7;
        int anzahlTage = 0;

        switch (monat){
            case 1,3,5,7,8,10,12:
                anzahlTage = 31;
                break;
            case 2:
                anzahlTage = 28;
                break;
            case 4,6,9,11:
                anzahlTage = 30;
                break;
            default: 
                anzahlTage = -1;
                break;
}
    System.out.println("Der Monat " + (monat) + " hat " + (anzahlTage) + " Tage ");
            
        




    }

}