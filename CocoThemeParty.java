import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class CocoThemeParty {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int amountGuests = Integer.parseInt(br.readLine());
        ArrayList<Integer> guests = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < amountGuests; i++) {
            guests.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(guests);
        int sum = 0;
        Integer[] guestsArray = guests.toArray(new Integer[0]);
        for (int i = 0; i < guestsArray.length / 2; i++) {
            int difference = guestsArray[i] - guestsArray[guestsArray.length - 1 - i];
            sum += Math.abs(difference);
            difference = guestsArray[i + 1] - guestsArray[guestsArray.length - 1 - i];
            sum += Math.abs(difference);
        }

        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.flush();

    }
}
