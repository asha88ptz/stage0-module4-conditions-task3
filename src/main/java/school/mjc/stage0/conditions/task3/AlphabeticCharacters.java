package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {

    /**
     * Implement the program that will consume a character from method argument which will be from english alphabet
     * and print vowel if it is "Vowel" or consonant if it's "Consonant".
     * And If it is not from eng alphabet than print "wrong alphabet!"
     * @param character
     */
    public void vowelDeterminer(char character) {
        if (character >= 128) {
            System.out.println("wrong alphabet!");
        } else if (character == 65 || character == 69 || character == 73 || character == 79 ||
                    character == 85 || character == 89 ||
                    character == 97 || character == 101 || character == 105 || character == 111 ||
                    character == 117 || character == 121) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }
}
