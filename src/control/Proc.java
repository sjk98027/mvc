package control;

import java.util.List;
import java.util.Scanner;

import impl.BoradService;
import impl.BoradServiceimpl;
import model.Borad;
import model.User;

public class Proc {
	User user = new User();
	BoradService service = new BoradServiceimpl();
	Scanner sc = new Scanner(System.in);

	public Proc() {
		
	}

	private void userLogin() {
		
	}
	
	public void execute() {
		userLogin();
		
		
		boolean breakPoint = false;

		while (!breakPoint) {
			System.out.println("1)전체리스트 2)단건검색 3)키워드검색 4)게시글추가  5)게시글수정 6)게시글삭제 7)나가기");

			int menu = sc.nextInt();
			if (menu != 7) {
				roofSwitch(menu);
			} else {
				breakPoint = true;
				}

		}

	}

	private void roofSwitch(int num) {
			Borad borad = new Borad();
			switch (num) {
			case 1: //전체리스트
				List<Borad> list = service.getBoradList();
				for (Borad b : list) {
					System.out.println(b);
				}
				break;
			case 2: //단건검색
				System.out.println("게시글번호 입력하세요");
				int boradId = sc.nextInt();
				sc.nextLine();
				borad = service.getBorad(boradId);
				System.out.println(borad);
				break;
			case 3: //키워드검색 
				
				System.out.println("키워드를  입력하세요");
				String boradKeyword = sc.nextLine();
				list = service.getBoradList(boradKeyword);
				for (Borad b : list) {
					System.out.println(b);
				}
				
				
				break;
			case 4://게시글추가 
				System.out.println("제목을 입력하세요");
				String title = sc.nextLine();
				sc.nextLine();
				borad.setTitle(title);
				System.out.println("덧글 원글 을 입력하세요");
				int originNumber = sc.nextInt();
				borad.setOriginNumber(originNumber);
				System.out.println("내용을 입력하세요");
				String content = sc.nextLine();
				borad.setContent(content);
				
//				System.out.println("을 입력하세요");
//				String userId = sc.nextLine();
//				borad.setUserId(userId);
				service.insertBorad(borad);
				break;
			case 5: //게시글수정
				System.out.println("을 입력하세요");
				int boradSeq = sc.nextInt();sc.nextLine();
				borad.setBoradSeq(boradSeq);
				System.out.println("을 입력하세요");
				title = sc.nextLine();
				borad.setTitle(title);
				System.out.println("을 입력하세요");
				originNumber = sc.nextInt();
				borad.setOriginNumber(originNumber);
				System.out.println("을 입력하세요");
				content = sc.nextLine();
				borad.setContent(content);
//				System.out.println("을 입력하세요");
//				userId = sc.nextLine();
//				borad.setUserId(userId);
				service.updateBorad(borad);
				break;

			case 6: //게시글삭제 
				System.out.println("제목을 입력하세요");
				title = sc.nextLine();
				sc.nextLine();
				borad.setTitle(title);
				service.deleteBorad(borad);
				break;
			default:
				System.out.println("잘못된 입력값입니다.");
				break;
			}
		}

	}


