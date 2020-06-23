package com.kita.first.level3;

public class BoardTest {

	public static void main(String[] args) {
		BoardVO bv1 = new BoardVO("제목1", "내용1", 1);
		
		BoardVO bv2 = new BoardVO();
		bv2.setTitle("제목2");
		bv2.setContent("내용2");
		bv2.setWriteId(2);
				
		System.out.println("bv2 제목 : " + bv2.getTitle());

	}

}
