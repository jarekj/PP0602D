import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
//      https://pl.spoj.com/problems/PP0602D/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        String input = reader.readLine();
        String[] inputArray = input.split("\\s");

        int n = Integer.parseInt(inputArray[0]);
        int k = Integer.parseInt(inputArray[1]);

        input = reader.readLine();
        String[] arrayToMove = input.split("\\s");

        int pos;

        for (int i = 0; i < n; i++) {
            pos = i + k;
            if (pos > n - 1) {
                pos = pos - n;
            }
            writer.print(arrayToMove[pos] + " ");
        }
        writer.flush();

    }
}
