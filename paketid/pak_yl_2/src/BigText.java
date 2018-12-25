public class BigText {
    public static void main(String[] args) {
        String smallText = "aaa";

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < smallText.length(); i++) {
                if (Alphabet.getAlphabet().containsKey(smallText.charAt(i))) {
                    String symbol[] = Alphabet.getAlphabet().get(smallText.charAt(i));
                    System.out.print(symbol[row]);
                }
            }
            System.out.println();
        }

    }
}
