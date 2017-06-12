package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *  |_ Music.java
 * 
 * Date : 2017. 6. 12.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString() {
		return title + " (" + singer + ")"; 
	}
}
