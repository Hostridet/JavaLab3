package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalInfo
{
    private String passport = "Empty";
    private String registration = "Empty";
    private String snills = "Empty";
    public PersonalInfo(String passport, String registration, String snils)
    {
        if (isCorrect(passport, registration, snils))
        {
            this.registration = registration;
            this.passport = passport;
            this.snills = snils;
        }
    }

    private boolean isCorrect(String passport, String registration, String snils)
    {
        return isCorrectCurr(passport, "(\\d{2}\\s*\\d{2})\\s*[\\W*]\\s*(\\d{3,6})") &&
                isCorrectCurr(snils, "^\\d{3}-\\d{3}-\\d{3}-\\d{2}$") &&
                isCorrectCurr(registration, "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$");
    }


    private boolean isCorrectCurr(String str, String regex)
    {
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(str);
       return matcher.find();
    }


    public String getPassport()
    {
        return this.passport;
    }


    public String getRegistration()
    {
        return this.registration;
    }


    public String getSnills()
    {
        return this.snills;
    }

}
