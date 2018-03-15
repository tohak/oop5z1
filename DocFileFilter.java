package com.konovalov;

import java.io.File;

import java.io.FileFilter;

public class DocFileFilter implements FileFilter {
private String [] arr;

	public DocFileFilter(String... arr) {
	super();
	this.arr= arr;
}
private boolean check(String ext) {
	for(String stringExt :arr) {
		if (stringExt.equals(ext)) {
			return true;
		}
	}
	return false;
}
@Override
public boolean accept(File pathname) {
	int pointIndex= pathname.getName().lastIndexOf(".");
	if (pointIndex==-1) {
		return false;
	}
	String ext= pathname.getName().substring(pointIndex+1);
	return check(ext);
	
}

	
	
}
