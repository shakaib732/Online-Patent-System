package com.globsyn.bean;

public class Comments {
	private int commentID;
	private Request request;
	private String commentDate;
	private String commentText;
	
	
	
	public Comments(int commentID, Request request, String commentDate, String commentText) {
		super();
		this.commentID = commentID;
		this.request = request;
		this.commentDate = commentDate;
		this.commentText = commentText;
	}
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public String getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	
	
}
