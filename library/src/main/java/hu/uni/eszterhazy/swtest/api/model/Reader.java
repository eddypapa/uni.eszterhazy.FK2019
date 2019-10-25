package hu.uni.eszterhazy.swtest.api.model;

public class Reader {

    private String email;
    private String name;

    public Reader(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
