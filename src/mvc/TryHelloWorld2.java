package mvc;

public class TryHelloWorld2 {
	public int chooseCity(int n, int[][] city) {
		int answer = 0;
		int distance =0;
		for (int i = 0; i < n; i++) {
			if (city[i][1] > distance) {
				distance = city[i][1];
				answer = city[i][0];

			}

		}

		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld2 test = new TryHelloWorld2();
		int tn = 5;
		int[][] tcity = { { -3, 3 },{ 0, 5 },{ 1, 5 }, { 2, 2 }, { 3, 3 } };
		System.out.println(test.chooseCity(tn, tcity));
	}
}