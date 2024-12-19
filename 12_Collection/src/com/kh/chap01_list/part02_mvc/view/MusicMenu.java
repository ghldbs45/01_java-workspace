package com.kh.chap01_list.part02_mvc.view;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicMenu {

	// 전역변수 == 필드
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	private ArrayList<Music> al = new ArrayList<Music>();

	/*
	 * 화면 설계
	 * 
	 * 1. 메인 메뉴
	 * 
	 * 곡 추가 화면 전체 곡 조회 화면 곡 삭제 화면 곡 검색 화면 곡 수정 화면
	 */

	public void mainMenu() {

		while (true) { // 무한 반복 시키기

			System.out.println("\n========== Welcome 별밤 ==========");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");

			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertMusic();
				break;
			case 2:
				selectMusic();
				break;
			case 3:
				deleteMusic();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다 . 이용해주셔서 감사합니다. ");
				return;
			default:
				System.out.println(" 잘못 입력 하셨습니다. 다시 선택해주세요 ");

			}
		}
	}

	// alt + shift + j
	/**
	 * 1. 새로운 곡 추가하는 서브 화면
	 */
	public void insertMusic() {

		System.out.println("\n====== 새로운 곡 추가 ======");
		System.out.println("노래 제목을 입력하시요 : ");
		String title = sc.nextLine();

		System.out.println("가수 이름을 입력하세요 : ");
		String artist = sc.nextLine();

		mc.insertMusic(title, artist);

	}

	/**
	 * 2. 전체 곡 조회용 서브 화면
	 */
	public void selectMusic() {
		System.out.println("\n====== 전체 곡 리스트 ======");

		ArrayList<Music> list = mc.selectMusic();

		/*
		 * 리스트가 비어 있을 때는 이 for 문이 안돈다. for(int i = 0 ; i < list.size();i++) {
		 * System.out.println(list.get(i)); }
		 */

		if (list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없습니다.");

		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}

	}

	/**
	 * 3. 특정곡 삭제시켜주는 서브 화면
	 */
	public void deleteMusic() {
		System.out.println("\n====== 특정 곡 삭제 ======");

		System.out.println("삭제하고자 하는 곡 명 : ");
		String title = sc.nextLine();

		int result = mc.deleteMusic(title);

		if (result == 1) {
			System.out.println(" 성공적으로 삭제 되었습니다. ");
		} else {
			System.out.println(" 삭제할 곡을 찾지 못했습니다. ");
		}

	}

	/**
	 * 4. 특정곡 검색해주는 서브 화면
	 */
	public void searchMusic() {

		System.out.println("\n====== 특정 곡 검색 ======");

		// 1. 간단 버전

		System.out.println(" 검색할 곡 명(키워드만도 가능) : ");
		String keyword = sc.nextLine();

		ArrayList<Music> searchList = mc.searchMusic(keyword);

		if (searchList.isEmpty()) {
			System.out.println("검색할 곡 이 없습니다");
		} else {
			for (int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}

	}

	/**
	 * 5. 특정곡 수정해주는 서브 화면
	 */
	public void updateMusic() {

		System.out.println("\n ======= 특정 곡 수정 =======");

		System.out.println(" 수정하고자 하는 곡 명 : ");
		String title = sc.nextLine();

		System.out.println(" 수정 내용 (가수) : ");
		String upArtist = sc.nextLine();

		System.out.println(" 수정 내용 (곡명) : ");
		String upTitle = sc.nextLine();

		int result = mc.updateMusic(title, upArtist, upTitle);
		
		if(result > 0) {
			System.out.println(" 성공적으로 수정 되었습니다. ");
		}else {
			System.out.println(" 수정할 곡을 찾지 못했습니다. ");
		}

	}

}
