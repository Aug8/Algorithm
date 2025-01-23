import java.io.*;
import java.util.*;

public class _7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] list = new int[n][2];

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			list[i][0] = Integer.parseInt(input[0]);
			list[i][1] = Integer.parseInt(input[1]);
		}

		int[] rank = new int[n];
		for (int i = 0; i < n; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (list[i][0] < list[j][0] && list[i][1] < list[j][1]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(rank[i] + " ");
		}

	}

}
