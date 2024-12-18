package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class FileCharRun {
	
	// 자동완성 주식 해제 > window > preferences
	// temp 검색 > Jave > codeTemplates
	// > methodBody , catchbody 수정하면 주석 안생김
	public static void main(String[] args) {
		
		FileCharDao dao = new FileCharDao();
		dao.fileRead();
		

	}

}
