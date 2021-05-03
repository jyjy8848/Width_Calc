package width_calc;

import java.util.Scanner;

public class WidthMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("���� �ʺ� ���ϱ�");
			System.out.print("�簢��: 1  �ﰢ��: 2    ����: 9  - ");
			int choice = scanner.nextInt();

			Width width = null;
			WidthType widthType = null;
			int value1 = 0;
			int value2 = 0;
			double area = 0.0;

			switch (choice) {
			case 1:
				System.out.print("�簢�� ���� ���� : ");
				value1 = scanner.nextInt();

				System.out.print("�簢�� ���� ���� : ");
				value2 = scanner.nextInt();

				widthType = WidthType.�簢��;
				width = new Square();
				break;
			case 2:
				System.out.print("�ﰢ�� �غ� ���� : ");
				value1 = scanner.nextInt();

				System.out.print("�ﰢ�� ���� ���� : ");
				value2 = scanner.nextInt();

				widthType = WidthType.�ﰢ��;
				width = new Triangle();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}

			width.setData(value1, value2);
			area = width.cale();

			System.out.print(widthType);
			System.out.println(" �ʺ� : " + area);

		}
	}

}
