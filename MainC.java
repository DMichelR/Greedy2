import java.util.*;
import java.io.*;

public class MainC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 && m == 0)
                break;

            int[] heads = new int[n];
            int[] knights = new int[m];

            for (int i = 0; i < n; i++) {
                heads[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < m; i++) {
                knights[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(heads);
            Arrays.sort(knights);

            int i = 0, j = 0;
            long cost = 0;

            while (i < n && j < m) {
                if (knights[j] >= heads[i]) {
                    cost += knights[j];
                    i++;
                }
                j++;
            }

            if (i == n) {
                pw.println(cost);
            } else {
                pw.println("Loowater is doomed!");
            }
        }

        pw.close();
        br.close();
    }
}