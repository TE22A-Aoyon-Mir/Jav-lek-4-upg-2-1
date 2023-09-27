import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner tangentbord = new Scanner (System.in);
        
        System.out.println("Ange en text:");
        String text = tangentbord.nextLine();
        System.out.println(text);

        int antal = text.length();
        System.out.println("har "+antal+" bokstäver");

        System.out.println("Ange ett tecken:");
        String tecken = tangentbord.nextLine();
        int plats = text.indexOf(tecken);
        System.out.println(tecken+" ligger på plats "+plats);

        System.out.println("Ange start:");
        int start = tangentbord.nextInt();
        System.out.println("Ange slut:");
        int slut =  tangentbord.nextInt();
        tangentbord.nextLine(); //reset
        String del = text.substring(start, slut);
        System.out.println(del);

        System.out.println("Ange svar:");
        String sf = tangentbord.nextLine();
        boolean svar = text.contains(sf);
        System.out.println(svar);

        System.out.println("Ange en nytext:");
        String nytext = tangentbord.nextLine();
        String återplacering = text.replace(text, nytext);
        System.out.println(återplacering);
    }
}