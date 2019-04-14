package lv.javaguru.tests10.homeWork.levle1;

public class User {

    private String name;
    private String lastName;
    private Integer age;

    public User(String name, String lastName, Integer age) {
        checkUserNameLength(name);
        checkUserLastNameLength(lastName);
        checkUserAge(age);
    }

    private void checkUserNameLength(String name) {
        if (name.length() >= 3) {
            if (name.length() <= 15) {
                this.name = name;
            } else {
                throw new ValidationException("Maximum length for user name is 15 characters!");
            }
        } else {
            throw new ValidationException("Minimum length for user name is 3 characters!");
        }
    }

    private void checkUserLastNameLength(String lastName) {
        if (lastName.length() >= 3) {
            if (lastName.length() <= 15) {
                this.lastName = lastName;
            } else {
                throw new ValidationException("Maximum length for user last name is 15 characters!");
            }
        } else {
            throw new ValidationException("Minimum length for user last name is 3 characters!");
        }
    }

    private void checkUserAge(Integer age) {
        if (age >= 0) {
            if (age <= 120) {
                this.age = age;
            } else {
                throw new ValidationException("Age should not exceed 120 years!");
            }
        } else {
            throw new ValidationException("Age must not be less than 0!");
        }
    }

    @Override
    public String toString() {
        return "User name: " + name +
                "\nUser last name is: " + lastName +
                "\nUser age is: " + age+ "\n";
    }
}
