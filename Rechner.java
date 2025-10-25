public class Rechner {
    public static void main(String[] args){
        int a = 17;
        int b = 5;
        double x = 17.0;
        double y = 5.0;

    System.out.println("Addition: " + (a + b)); 
    System.out.println("Subtraktion: " + (a - b));
    System.out.println("Multiplikation: " + (a * b)); 
    System.out.println("Division: " + (a / b)); 
    System.out.println("Modulo: " + (a % b)); 
    System.out.println("DivisionDouble: " + (x / y));
    System.out.println("ImpliziteDivision: " + (a / x)); 
    System.out.println("ExpliziteDivision: " + (double)a / (double)b); 
// 3. Der Rest bei einer Division mit / wird abgeschnitten wenn beide Operanten ein int sind
// 4. Bei der Division mit Double wird der genaue Wert ausgegeben
// 5. Bei der Division mit einem int und einem double wird der genaue Wert ausgegeben
//6. Indem ich einen Type Cast bei a und b durchführe ist es möglich die Ints genau zu berechnen
    }
}