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

			System.out.println("������ ���Ͻô� ���񽺸� �����ϼ���\n" + "������ �Է��� 1��\n" + "������ ������ 2��\n" + "������ ���Ŵ� 3��\n"
					+ "������ Ȯ���� 4��\n" + "������ ��üȮ���� 5��\n" + "���ϴ� ���񽺰� �����ø� 0���� �����ּ���");
			int service_num = sc.nextInt();

			if (service_num == 0) {
				exit = false;
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			switch (service_num) {
			case 1:
				System.out.println("���� ������ �Է����ּ���(id, pwd, name)");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();

				user = new UserVO(id, pwd, name);
				try {
					biz.register(user);
				} catch (Exception e) {
					System.out.println("�� �����͸� �Է� �� �� �����ϴ�.");
				}

				break;
			case 2:
				System.out.println("���� id�� �Է����ּ���");
				String id1 = sc.next();
				System.out.println("�ٲٽ� ��й�ȣ�� �̸��� �Է����ּ���(pwd, name)");
				String pwd1 = sc.next();
				String name1 = sc.next();

				user = new UserVO(id1, pwd1, name1);
				try {
					biz.modify(user);
				} catch (Exception e) {
					System.out.println("�� �����͸� ���� �� �� �����ϴ�.");
				}

				break;
			case 3:
			case 4:
				System.out.println("���� id�� �Է��ϼ���");
				String id2 = sc.next();
				if (service_num == 3) {
					try {
						biz.remove(id2);
					} catch (Exception e) {
						System.out.println("�������͸� ���� �� �����ϴ�.");
					}

				} else {
					try {
						System.out.println(biz.get(id2));
					} catch (Exception e) {
						System.out.println("�� �����͸� ������ �� �����ϴ�.");
					}

				}

				break;

			case 5:

				try {
					biz.get();
				} catch (Exception e) {
					System.out.println("�� ��ü �����͸� ������ �� �����ϴ�.");
				}

				break;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}

		}

	}
}
