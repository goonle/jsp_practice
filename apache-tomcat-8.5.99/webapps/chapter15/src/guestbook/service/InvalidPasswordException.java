package guestbook.service;

public class InvalidPasswordException extends ServiceException{
    public InvalidPasswordException(String messgae){
        super(messgae);
    }
}
