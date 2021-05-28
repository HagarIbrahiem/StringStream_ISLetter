
public class main {
    
    public static void main(String[] args) {
        IsAllLetters("HelloWorld");
        IsAllLetters("HelloWorld2");
    }
    
    public static void IsAllLetters ( String _str) {
        System.out.println(_str +" : "+ 
                           _str.chars().allMatch(Character::isLetter)); //Caracter is a rapperclass
    }
}
