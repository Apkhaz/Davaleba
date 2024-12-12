package SecondTask.secondExercise;

public class SymbolReplacer implements ReplaceSymbolA, ReplaceSymbolB {

    public void replaceSymbolA(String text) {
        String result = text.replace('i', 'z');
        System.out.println(result);
    }

    public void replaceSymbolB(String text) {
        String result = text.replace('a', 'w');
        System.out.println(result);
    }
}

