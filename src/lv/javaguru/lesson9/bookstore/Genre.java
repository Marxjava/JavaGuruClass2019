package lv.javaguru.lesson9.bookstore;

public enum Genre {
    DETECTIVE("Detective"),
    DRAMA("Drama"),
    NOVEL("Novel"),
    HORROR("Horror");

    private String value;

    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
