package sungbok.Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) throws InterruptedException {

		AcademyDB academyDB = AcademyDB.getInstance();
		InterviewRoomDB interviewDB = InterviewRoomDB.getInstance();

		ArrayList<Academy> QustionList = academyDB.getqustionList();
		ArrayList<InterviewRoom> InterviewList = interviewDB.getinterviewList();

		String message = "인생역전? 인생여전?";
		int width = message.length() + 70;
		int height = 3;

		String horizontalLine = "";
		int i = 0;
		while (i < width) {
			horizontalLine += "+";
			i++;
		}

		String emptyLine = "|";
		i = 0;
		while (i < width - 2) {
			emptyLine += " ";
			i++;
		}
		emptyLine += "|";

		String messageLine = "|";
		i = 0;
		int numSpaces = (width - message.length() - 10) / 2;
		while (i < numSpaces) {
			messageLine += " ";
			i++;
		}
		messageLine += message;
		i = 0;
		while (i < numSpaces + 1) {
			messageLine += " ";
			i++;
		}
		messageLine += "|";

		System.out.println(horizontalLine);

		i = 0;
		while (i < height) {
			if (i == height / 2) {
				System.out.println(messageLine);
			} else {
				System.out.println(emptyLine);
			}
			i++;
		}

		System.out.println(horizontalLine);

		System.out.println("인생을 역전하시겠습니까? 여전하시겠습니까?");
		System.out.println(">>> ");
		Scanner scan = new Scanner(System.in);
		String say = scan.nextLine();
		System.out.println("역전 가즈아!!~~");

		end: while (true) {
			System.out.println("오늘 할일을 선택해주세요");
			System.out.println("1.수업을 배우러 학원에 갑니다 | 2. 면접을 보러 갑니다. | 3. 오징어 게임 참가");
			System.out.println(">>> ");
			String command = scan.nextLine();

			if (command.equals("1") == true) {
				// 수업진행
				Collections.shuffle(QustionList);
				int score = 0;
				for (int a = 0; a < QustionList.size(); a++) {
					System.out.println(QustionList.get(a));
					System.out.println("수업내용이 이해가 되셨나요???");
					System.out.println(">>>");
					String answer = scan.nextLine();

					if (answer.equals("네") == true) {
						score += 20;
					} else {
						continue;
					}
				}
				System.out.println(score);
				if (score >= 100) {
					System.out.println("내 수강 점수:" + score);
					System.out.println("수료 축하합니다 면접 볼 자격이 있네요");
				} else if (score <= 60) {
					System.out.println("내 수강 점수:" + score);
					System.out.println("학원에 좀 더 남아계세요.");
				} else {
					System.out.println("YOU DIE");
				}

			} else if (command.equals("2") == true) {
				// 면접진행
				Run.run();
				Thread.sleep(1000);
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				cartoon.Cartoon();
				Collections.shuffle(InterviewList);
				int point = 0;
				Thread.sleep(1000);
				System.out.println("건물안에서 면접관이 튀어나왔다.");
				System.out.println("                         ");
				out: while (true) {
					System.out.println("어떻게 할까??");
					System.out.println("1.면접관과 배틀 | 2. 어르고 달랜다. | 3. 도망간다.");
					int order = Integer.parseInt(scan.nextLine());
					if (order == 1) {
						for (int b = 0; b < InterviewList.size(); b++) {
							System.out.println(InterviewList.get(b));
							System.out.println("");
							System.out.println(">>>");
							String say1 = scan.nextLine();
							if (say1.equals("네") == true) {
								System.out.println("효과는 굉장했다.");
								point += 20;
							}
						}
						System.out.println(point);
						if (point >= 100) {
							System.out.println("호감도:" + point);
							System.out.println("축하합니다. 우리와 함께합시다.");
						} else if (point <= 60) {
							System.out.println("호감도:" + point);
							System.out.println("오늘 면접 참가 감사합니다. 연락드릴께요.");
						} else {
							System.out.println("GET OUT");
						}

					} else if (order == 2) {
						System.out.println("아무런 효과가 없었다.");
						continue out;
					} else {
						System.out.println("..................");
					}

					System.out.println("히든엔딩 대기업면접에 도전해보세요.");
					System.out.println("도움주신분들");
					System.out.println("정찬웅 선생님, 이자영, 백민기, 박창연");
					break end;

				}

			} else if (command.equals("정찬웅선생님")) {
				// 면접진행
				Run.run();
				Thread.sleep(1000);
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				cartoon.Cartoon();
				Thread.sleep(1000);
				System.out.println("건물안에서 전설의 네카라쿠배가 튀어나왔다.");
				System.out.println("                         ");
				out: while (true) {
					System.out.println("어떻게 할까??");
					System.out.println("1.면접관과 배틀 | 2. 어르고 달랜다. | 3. 도망간다.");
					int order = Integer.parseInt(scan.nextLine());
					if (order == 1) {
						System.out.println("전설의 네카라쿠배는 도망갔다..");

						System.out.println("GAME OVER");
						System.out.println("도움주신분들");
						System.out.println("정찬웅 선생님, 이자영, 백민기, 박창연");
						break end;

					}
				}
			} else {
				cartoon.Younghee();
				System.out.println("무궁화 꽃이 피었습니다??");
				Thread.sleep(1000);
				System.out.println("!");
				Thread.sleep(2000);
				System.out.println("2417번 참가자 탈락");

				Thread.sleep(2000);
				System.out.println("GAME OVER");
				System.out.println("도움주신분들");
				System.out.println("정찬웅 선생님, 이자영, 백민기, 박창연");
				break end;
			}
		}
	}
}