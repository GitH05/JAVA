// remove unwanted character from the string.
public class RemoveJunk {
    public static void main(String[] args) {
        String s = "Removed$#^^& All $#%^:{|{)_Junk Character";
        s = s.replaceAll("[^a-zA-Z0-9]", "");     // regular expression || regex pattern
        System.out.println("Clean Character: " +s);
    }
}
