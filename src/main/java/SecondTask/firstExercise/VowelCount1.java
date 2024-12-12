package SecondTask.firstExercise;

class VowelCount1 extends VowelCount {


    public void countVowel(String text) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }

        System.out.println("There are " + count + " vowels in this string.");
    }
}
