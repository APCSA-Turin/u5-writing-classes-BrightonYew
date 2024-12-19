public class HiddenWord{
// type up the complete HiddenWord class here
//private int length;
private String word;

public HiddenWord(String word) {
    this.word = word;
}

public String getHint(String guess) {
    String finalstr = "";
    for (int index = 0; index < word.length(); index++) { //going through each letter of guess, and determining the expected character
            if (guess.substring(index,index + 1).equals(word.substring(index,index + 1))) {
                finalstr += word.substring(index,index + 1);
            } else if (word.indexOf(guess.substring(index,index + 1)) != -1) {
                finalstr += "+";
            } else {
                finalstr += "*";
            }
        }

    return finalstr;
    }

}