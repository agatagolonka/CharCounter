import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacterCounter implements CharacterCounter {

    private String message;
    static final int ASCII_SIZE = 256;


    public MostFrequentCharacterCounter(String message) {

        this.message=message;
    }

    @Override
    public Character getCharacter() {
        int count[] = new int[ASCII_SIZE];
        int max=0;
        char result = ' ';

        for (int i=0; i<message.length(); i++)
            count[message.charAt(i)]++;

        for (int i = 0; i < message.length(); i++) {
            if (max < count[message.charAt(i)]&&message.charAt(i)!=32 ) {
                max = count[message.charAt(i)];
                result = message.charAt(i);
            }
        }

        return result;

    }
}
