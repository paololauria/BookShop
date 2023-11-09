package org.paololauria.objectoriented.booksShop;

public class Books {
    private String title;
    private String genre;
    private int publicationYear;
    private String author;
    private int pages;
    private double price;
    private boolean isAvailable;

    public Books(String title, String genre, int publicationYear, String author, int pages, double price, boolean isAvailable) {
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages(){
        return pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void infoBook(){
        String information = "********** \nTITLE \n" + this.getTitle() + "\nGENRE \n" + this.getGenre() + "\nYEAR \n" + this.getPublicationYear() + "\nAUTHOR \n" + this.getAuthor() + "\nPAGES \n" + this.getPages() + "\nPRICE \n" + this.getPrice() + "€ \n" + "AVAILABLE \n" + this.isAvailable() + "\n**********\n";
        System.out.println(information);
    }
}



