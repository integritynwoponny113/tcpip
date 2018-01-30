package mvc;

public class TryHelloWorld {
	public int chooseCity(int n, int[][] city) {
		int answer = 0;
		int distance, min = 0;
		for (int i = 0; i < n; i++) {
			distance = 0;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				distance += Math.abs(city[i][0] - city[j][0]) * city[j][1];

			}
			System.out.println(distance);
			if (i == 0) {
				min = distance;
				answer = city[i][0];
				continue;
			}
			if (distance < min) {
				min = distance;
				answer = city[i][0];

			} else if (distance == min) {
				if(answer>city[i][0]) {
					answer = city[i][0];
				}

			}

		}

		return answer;
	}

	public static void main(String[] args) {
		TryHelloWorld test = new TryHelloWorld();
		int tn = 6;
		int[][] tcity = { { 3, 3 }, { 1, 5 }, { 2, 2 }, { -5, 12 }, { -1, 3 }, { -3, 2 } };
		System.out.println(test.chooseCity(tn, tcity));
	}
}