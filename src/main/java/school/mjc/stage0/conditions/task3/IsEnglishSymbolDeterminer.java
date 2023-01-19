package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
//        int num = (int) symbol;
        if (symbol < 128) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
