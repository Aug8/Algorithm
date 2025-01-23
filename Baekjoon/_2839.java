import java.io.*;
import java.util.*;

public class _2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}

	public static int solution(int n) {

		int count = 0;

		while (n > 0) {
			if (n < 3) {
				return -1;
			}

			if (n % 15 == 0) {
				count += n / 5;
				break;
			}

			if (n >= 5 && n % 3 != 0) {
				count += 1;
				n -= 5;
			} else if (n >= 3) {
				count++;
				n -= 3;
			}
		}

		return count;
	}

}
