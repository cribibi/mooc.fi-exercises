package week7.exercise2dereluatlapuricat;

public class Change {
    char fromCharacter;
    char toCharacter;


    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }



    public String change(String characterString){
        String stringB=new String();
        for (int i = 0; i <characterString.length() ; i++) {
            if (characterString.charAt(i) == fromCharacter) {
                stringB=characterString.replace(fromCharacter, toCharacter);
            }
        }
        return stringB;
    }
}
