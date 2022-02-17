package ru.job4j.ex;

public class UserStory {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user: users) {
            if (users.equals(login)) {
                return user;
            }
        }
                throw new UserNotFoundException("Not found login");

            }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User is invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ee) {
            ee.printStackTrace();
        } catch (UserNotFoundException ef) {
            ef.printStackTrace();
        }
    }
}

