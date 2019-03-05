import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Senti2 {
    public static void main(String[] args) throws FileNotFoundException {
        String word = args[0];
        String filename = args[1];

        File file = new File(filename);
        Scanner in = new Scanner(file);

        double total = 0;
        int count = 0;

        while (in.hasNextLine()) {
            String review = in.nextLine();
            int score = Integer.parseInt(review.substring(0, 1));
            if (review.contains(word)) {
                total += score;
                count++;
            }

        }

        in.close();

        Double avg = total / (double) count;

        System.out.format("%s appears %d times.\n", word, count);
        if (avg.isNaN()) {
            System.out.format("The average score of the reviews containing %s is 0.00\n", word, avg);
        } else {
            System.out.format("The average score of the reviews containing %s is %.2f\n", word, avg);
        }
    }
}

