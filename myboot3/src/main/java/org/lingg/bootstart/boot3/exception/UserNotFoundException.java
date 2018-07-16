package org.lingg.bootstart.boot3.exception;

public class UserNotFoundException extends  RuntimeException {

    public UserNotFoundException(){
        super("用户不存在");
    }
}
