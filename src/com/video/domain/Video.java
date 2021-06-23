package com.video.domain;

import java.util.ArrayList;
import java.util.List;

public class Video {
	protected String URL;
	protected String titol;
	protected List<Tag> tags = new ArrayList<Tag>();
	
	public Video() {} // Constructor buit, per si de cas
	
	public Video (String url, String titol, String tag) {
		this.URL = url;
		this.titol = titol;
		try {
			this.addOneTag(tag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Video (String url, String titol) {
		this.URL = url;
		this.titol = titol;
		
	}
	
	public String getNomVideo() {
		return this.titol;
	}
	
	public void addOneTag(String tag) throws Exception {
		Tag etiqueta = new Tag(tag);
		this.tags.add(etiqueta);
	}

	@Override
	public String toString() {
		return "Títol: " + titol + " URL: " + URL + "\n" + 
				"Data i hora de creació :" + "\n" + 
				"Estat: " + "\n" +
				"Etiquetes del video: " + tags;
	}
	

}
