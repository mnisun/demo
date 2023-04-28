package com.example.demo.dto;

public class BookDTO {

    private long idx;
    private String title; // 제목
    private String author; // 작가
    private String publisher; // 출판사
    private int publishingDate; // 출판일

    public BookDTO(long idx, String title, String author, String publisher, int publishingDate) {
        this.idx = idx;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingDate = publishingDate;
    }

    public BookDTO() {

    }

    public long getIdx() {
        return idx;
    }

    public void setIdx(long idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "idx=" + idx +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishingDate=" + publishingDate +
                '}';
    }
}
