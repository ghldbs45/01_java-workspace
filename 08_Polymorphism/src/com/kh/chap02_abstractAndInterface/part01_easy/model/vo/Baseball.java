package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class Baseball extends Sports{

	@Override
	public void rule() {
		System.out.println("3번 아웃 되면 공수교대");
	}

}
