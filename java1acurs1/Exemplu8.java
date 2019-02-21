public class Exemplu8 {
    public static void main (String [] args){
        char anotimp = 'p';
        
        switch (anotimp){
            case 'v':
                System.out.println("Este cald!");
                break;
            case 'i':
                System.out.println("Este firg!");
                break;
            case 'p':
            case 't':
                System.out.println("Ploua!");
                break;
            default:
                System.out.println(":)");
        }
    }
}