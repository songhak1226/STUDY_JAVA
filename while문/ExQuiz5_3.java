import java.util.Scanner;

public class ExQuiz5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ID = null;
		String PW = null;
		int num = 3;
		String Question = null;

		while (true) {
			System.out.print("아이디 : ");
			ID = sc.next();
			System.out.print("비밀번호 : ");
			PW = sc.next();
			if (ID.equals("smhrd") && PW.equals("1234")) {
				System.out.println("로그인 성공!");
				break;
			} else {
				num--;
				if(num == 0) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println("로그인 실패");
				System.out.println("계속 하시겠습니까?");
				Question = sc.next();
				if (Question.equals("Y")) {
					
				} else {
					if (Question.equals("N")) {
						break;
					}
				}
			}

		}

		sc.close();

	}

}
