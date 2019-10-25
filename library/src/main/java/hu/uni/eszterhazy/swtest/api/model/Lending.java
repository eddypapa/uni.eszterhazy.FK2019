package hu.uni.eszterhazy.swtest.api.model;

import java.util.Date;

public class Lending {

    private Reader reader;
    private BookInstance bookInstance;
    private Date leadingDate;
    private Date expirationTime;
    private Date returningDate;

    public Lending(Reader reader, BookInstance bookInstance, Date leadingDate, Date expirationTime) {
        this.reader = reader;
        this.bookInstance = bookInstance;
        this.leadingDate = leadingDate;
        this.expirationTime = expirationTime;
    }

    public Lending(Reader reader, BookInstance bookInstance, Date leadingDate, Date expirationTime, Date returningDate) {
        this.reader = reader;
        this.bookInstance = bookInstance;
        this.leadingDate = leadingDate;
        this.expirationTime = expirationTime;
        this.returningDate = returningDate;
    }

    public Reader getReader() {
        return reader;
    }

    public BookInstance getBookInstance() {
        return bookInstance;
    }

    public Date getLeadingDate() {
        return leadingDate;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public Date getReturningDate() {
        return returningDate;
    }

    @Override
    public String toString() {
        return "Lending{" +
                "reader=" + reader +
                ", bookInstance=" + bookInstance +
                ", leadingDate=" + leadingDate +
                ", expirationTime=" + expirationTime +
                ", returningDate=" + returningDate +
                '}';
    }
}
