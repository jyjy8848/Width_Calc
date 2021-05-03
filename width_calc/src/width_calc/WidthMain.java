package width_calc;

import java.util.Scanner;

public class WidthMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("도형 너비 구하기");
			System.out.print("사각형: 1  삼각형: 2    종료: 9  - ");
			int choice = scanner.nextInt();

			Width width = null;
			WidthType widthType = null;
			int value1 = 0;
			int value2 = 0;
			double area = 0.0;

			switch (choice) {
			case 1:
				System.out.print("사각형 가로 길이 : ");
				value1 = scanner.nextInt();

				System.out.print("사각형 세로 길이 : ");
				value2 = scanner.nextInt();

				widthType = WidthType.사각형;
				width = new Square();
				break;
			case 2:
				System.out.print("삼각형 밑변 길이 : ");
				value1 = scanner.nextInt();

				System.out.print("삼각형 높이 길이 : ");
				value2 = scanner.nextInt();

				widthType = WidthType.삼각형;
				width = new Triangle();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}

			width.setData(value1, value2);
			area = width.cale();

			System.out.print(widthType);
			System.out.println(" 너비 : " + area);

		}
	}

}
