import java.util.Random;
public class RandomNumbers {
    int max = 0;            //maksymalna wylosowana
    int min = 30;           //minimalna wylosowana
    int sum = 0;            //suma wszystkich wylosowanych

    public void getNumbers() {
        Random random = new Random();
        while (sum <= 5000) {
            int i = random.nextInt(31);
            sum += i;
            System.out.println("i: " + i);
            minNumber(i);
            maxNumber(i);
        }
    }
    public void maxNumber (int i){
            if (i > max) {
                max = i;
            } else
                return;
            System.out.println("max: " + max);
        }
   public void minNumber (int i){
            if (i < min) {
                min = i;
            } else
                return;
       System.out.println("min: " + min);
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getNumbers();

        System.out.println("min ostateczne: " + randomNumbers.min);
        System.out.println("max ostateczne: " + randomNumbers.max);
        System.out.println("suma: " + randomNumbers.sum);
    }
}
