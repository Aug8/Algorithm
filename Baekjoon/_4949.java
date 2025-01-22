import java.io.*;
import java.util.*;

public class _4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));

		ArrayDeque<String> bracket = new ArrayDeque<>();
		String input = br.readLine();

		while (!(input.equals("."))) {
			String[] line = input.split("");
			boolean answer = true;

			for (int i = 0; i < line.length; i++) {
				// 대괄호 확인
				if (line[i].equals("[")) {
					bracket.add(line[i]);
				} else if (line[i].equals("]")) {
					if (bracket.isEmpty() || bracket.peekLast().equals("(")) {
						answer = false;
						break;
					} else {
						bracket.removeLast();
					}

					// 소괄호 확인
				} else if (line[i].equals("(")) {
					bracket.add(line[i]);
				} else if (line[i].equals(")")) {
					if (bracket.isEmpty() || bracket.peekLast().equals("[")) {
						answer = false;
						break;
					} else {
						bracket.removeLast();
					}

				}
			}

			if (bracket.isEmpty() && answer) {
				System.out.println("yes");
			} else {
				System.out.println("no");
				bracket.clear();
			}

			input = br.readLine();
		}
	}

}
