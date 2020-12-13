/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Book {

    private String title;
    private int pages;
    private String publicationDate;

    public Book(String title, int pages, String publicationDate) {
        this.title = title;
        this.pages = pages;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationDate;
    }

}
