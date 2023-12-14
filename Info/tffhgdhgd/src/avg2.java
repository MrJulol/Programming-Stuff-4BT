// NOTE: it is recommended to use this even if you don't understand the following code.

import java.util.*;
import java.io.*;
import java.lang.*;

public class avg2 {

    static double calcavarege(long[] P) {
        double avarege = 0;
        for (long l : P) {
            avarege += l;
        }
        return avarege / P.length;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Locale.setDefault(Locale.US);
        InputStream fin = System.in;
        OutputStream fout = System.out;
        // uncomment the two following lines if you want to read/write from files
        // fin = new FileInputStream("input.txt");
        // fout = new FileOutputStream("output.txt");

        Scanner scn = new Scanner(fin);
        PrintStream prnt = new PrintStream(fout);

        int N = scn.nextInt();
        long K = scn.nextLong();

        long[] P = new long[N];
        for (int i = 0; i < N; ++i)
            P[i] = scn.nextLong();

        long C = 0;

        while (calcavarege(P) == K) {
            for (int i = 0; i < P.length; i++) {
                P[i] = -1;
            }

            prnt.format("%d\n", C);

            fout.flush();
        }
    }
}