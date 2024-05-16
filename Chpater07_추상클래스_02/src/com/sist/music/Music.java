package com.sist.music;
// 캠슐화
// => 캡슐화, 오버라이딩
public class Music {
	private String mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	private String getMno() {
		return mno;
	}
	private void setMno(String mno) {
		this.mno = mno;
	}
	private String getTitle() {
		return title;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private String getSinger() {
		return singer;
	}
	private void setSinger(String singer) {
		this.singer = singer;
	}
	private String getAlbum() {
		return album;
	}
	private void setAlbum(String album) {
		this.album = album;
	}
	private String getPoster() {
		return poster;
	}
	private void setPoster(String poster) {
		this.poster = poster;
	}
	
	//변수의 읽기 쓰기
}
