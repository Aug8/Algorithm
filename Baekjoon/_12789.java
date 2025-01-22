import java.io.*;
import java.util.*;

public class _12789 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
		int n = Integer.parseInt(br.readLine());

		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int[] line = new int[st.countTokens()];
		for (int i = 0; i < line.length; i++) {
			line[i] = Integer.parseInt(st.nextToken());
		}

		ArrayDeque<Integer> wait = new ArrayDeque<>();

		int order = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(wait);
			while (!wait.isEmpty() && wait.peekFirst() == order) {
				wait.removeFirst();
				order++;
			}
			if (line[i] == order) {
				order++;
			} else {
				wait.addFirst(line[i]);
			}
		}

		while (!wait.isEmpty() && wait.peekFirst() == order) {
			wait.removeFirst();
			order++;
		}

		if (wait.isEmpty()) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
	}

}
