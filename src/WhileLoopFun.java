public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        int tempNumber = number;
        while (tempNumber > 0) {
            System.out.println(tempNumber % 10);
            tempNumber /= 10;
        }
    }

    public int countLetter(String word, String letter) {
        int letterIndex = 0;
        int wordLength = word.length();
        int letterCount = 0;

        while (letterIndex < wordLength) {
            if (word.substring(letterIndex, letterIndex + 1).equals(letter)) {
                letterCount ++;
            }
            letterIndex ++;
        }
        return letterCount;
    }

    public int maxDoubles(int number, int threshold) {
        int tempNumber = number * 2;
        int doubleCount = 0;

        while (tempNumber <= threshold) {
            tempNumber *= 2;
            doubleCount ++;
        }

        return doubleCount;
    }

    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int currentDivisor = 2;

        while (currentDivisor < number) {
            if (number % currentDivisor == 0) {
                return false;
            }
            currentDivisor ++;
        }
        return true;
    }

}
