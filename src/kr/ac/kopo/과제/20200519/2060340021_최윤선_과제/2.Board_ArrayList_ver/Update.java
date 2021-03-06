package hw.hw14.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class Update extends BoardMenu  {
	Update(){}
	public Update(int no, String title,String writer,String date,String content) {
		this.no=no;
		this.title=title;
		this.writer=writer;
		this.date=date;
		this.content=content;
	}
	
	@Override
	public  void process(int no, ArrayList<BoardPost> bp) {
		System.out.printf("수정하고 싶은 글의 번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		sc.nextLine();
		System.out.printf("글의 제목 입력 : ");
		title=sc.nextLine();
		
		System.out.printf("글의 글쓴이 입력 : ");
		writer=sc.nextLine();
		System.out.printf("글의 내용 입력 : ");
		content=sc.nextLine();
		date="datehaha";

		
		bp.get(no-1).setNo(no);
		bp.get(no-1).setTitle(title);
		bp.get(no-1).setWriter(writer);
		bp.get(no-1).setDate();
		bp.get(no-1).setContent(content);
		//bp.add(n);
		
		
		System.out.println("글 수정 성공!");
		System.out.println("\n\n");
	}

}
