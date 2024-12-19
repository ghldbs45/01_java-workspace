package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청 처리해주고 , 결과를 알려주는 클래스 ! 출력문 , 입력문 XXX 금지 
public class MusicController {
	
	// 필드부
	private ArrayList<Music> list = new ArrayList<Music>();
	{ // 초기화 블럭 ( 이중 블럭)
		list.add(new Music("attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥말고 헌삥", "김시연"));
	}
	/**
	 * 1. 새로운 곡 추가하는 메소드
	 * @param title - 추가하려는 제목
	 * @param artist - 추가하려는 가수
	 */
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
	}
	/**
	 * @return 전체곡리스트
	 */
	public ArrayList<Music> selectMusic() {
		
		return list;
		
	}
	public int deleteMusic(String title) {
		int result = 0 ;
		
		for(int i=0; i < list.size(); i ++ ) { 
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1 ;
				break;
			}
		}
		// result == 0 ( 삭제할 곡을 못찾음) // result == 1 (성공적으로 삭제됨)
		return result;
		
		
	}
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<Music>(); // []
		
		 
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
	}
	public int updateMusic(String title, String upArtist, String upTitle) {
		int result = 0;
		
		for(int i=0 ; i <list.size(); i ++ )	{
			
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);		
				
				result = 1;
				break;
				}
		}
		return result; // result == 0 ( 수정할곡을 못찾음 ) | 1 ( 성공적으로 수정됨 )
		
		
	}

}
