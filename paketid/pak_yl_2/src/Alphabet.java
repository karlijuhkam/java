import java.util.HashMap;

public class Alphabet {
    private static final HashMap<Character, String[]> alphabet = new HashMap<>();

    static {
        alphabet.put('a', new String[]{
                " ###  ",
                "#   # ",
                "##### ",
                "#   # ",
                "#   # "
        });
    }

    public static HashMap<Character, String[]> getAlphabet() {
        return alphabet;
    }
}
