import java.util.Scanner;
import java.util.StringTokenizer;

public class KiritoAndDragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fyn = sc.nextLine();
        String result = "YES";
        StringTokenizer st = new StringTokenizer(fyn);
        int n = 0;
        int s = 0;

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                s = Integer.parseInt(st.nextToken());
            } else {
                n = Integer.parseInt(st.nextToken());
            }

        }
        int stats_dragon[][] = new int[n][2];
        int bonus_dragon[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            String d_i = sc.nextLine();
            StringTokenizer s_d = new StringTokenizer(d_i);
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    stats_dragon[i][j] = Integer.parseInt(s_d.nextToken());

                } else {
                    stats_dragon[i][j] = Integer.parseInt(s_d.nextToken());
                    // stats_dragon->
                    // i es el numero del dragon
                    // j es el numero las estadisticas

                }
            }
        }
        for (int i = 0; i < n; i++) {

            if (s > stats_dragon[i][0]) {
                s += stats_dragon[i][1];
                result = "YES";

            } else {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}
