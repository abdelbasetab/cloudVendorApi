package com.login.constants;

public final class LoginConstants {

    public static final String SOMETHING_WENT_WRONG ;

    public static final String INVALID_DATA;
    public static final String EMAIL_ALREADY_EXISTS  ;

    public static final String SUCCESSFUL_REGISTERS;

    public static final String SUCCESSFUL_LOGIN ;


    public static final String ACCOUNT_IS_NOT_EXISTS;

    public static final String ACCOUNT_IS_NOT_ACTIVE;
    public static final String WRONG_PASSWORD;
    public static final String UPDATED_SUCCESSFUL;


    //static block to initiale static constant
    static {

        SOMETHING_WENT_WRONG ="Something went Wrong";

        INVALID_DATA ="Invalid Data";

        EMAIL_ALREADY_EXISTS ="Email already Exists " ;

        SUCCESSFUL_REGISTERS = "Successful registers ";

        SUCCESSFUL_LOGIN = "Successful login ";

        ACCOUNT_IS_NOT_EXISTS = "this account is not exists please check user data ";

        ACCOUNT_IS_NOT_ACTIVE= "Account is note active anymore  ";

        WRONG_PASSWORD = "Password is incorrect";

        UPDATED_SUCCESSFUL = "Data updated Successful";

    }


}
