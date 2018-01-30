package app;

import java.util.Scanner;

import com.frame.Biz;
import com.user.UserBiz;
import com.vo.UserVO;

public class View {

	public static void main(String[] args) {
		Biz<UserVO, String> biz = new UserBiz();

		UserVO user = null;

		Scanner sc = new Scanner(System.in);
		boolean exit = true;

		while (exit) {

			System.out.println("고객님이 원하시는 서비스를 선택하세요\n" + "고객정보 입력은 1번\n" + "고객정보 수정은 2번\n" + "고객정도 제거는 3번\n"
					+ "고객정보 확인은 4번\n" + "고객정보 전체확인은 5번\n" + "원하는 서비스가 없으시면 0번을 눌러주세요");
			int service_num = sc.nextInt();

			if (service_num == 0) {
				exit = false;
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			switch (service_num) {
			case 1:
				System.out.println("고객의 정보를 입력해주세요(id, pwd, name)");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();

				user = new UserVO(id, pwd, name);
				try {
					biz.register(user);
				} catch (Exception e) {
					System.out.println("고객 데이터를 입력 할 수 없습니다.");
				}

				break;
			case 2:
				System.out.println("고객의 id를 입력해주세요");
				String id1 = sc.next();
				System.out.println("바꾸실 비밀번호와 이름을 입력해주세요(pwd, name)");
				String pwd1 = sc.next();
				String name1 = sc.next();

				user = new UserVO(id1, pwd1, name1);
				try {
					biz.modify(user);
				} catch (Exception e) {
					System.out.println("고객 데이터를 변경 할 수 없습니다.");
				}

				break;
			case 3:
			case 4:
				System.out.println("고객의 id를 입력하세요");
				String id2 = sc.next();
				if (service_num == 3) {
					try {
						biz.remove(id2);
					} catch (Exception e) {
						System.out.println("고객데이터를 지울 수 없습니다.");
					}

				} else {
					try {
						System.out.println(biz.get(id2));
					} catch (Exception e) {
						System.out.println("고객 데이터를 가져올 수 없습니다.");
					}

				}

				break;

			case 5:

				try {
					biz.get();
				} catch (Exception e) {
					System.out.println("고객 전체 데이터를 가져올 수 없습니다.");
				}

				break;

			default:
				System.out.println("잘못입력하셨습니다.");
			}

		}

	}
}
