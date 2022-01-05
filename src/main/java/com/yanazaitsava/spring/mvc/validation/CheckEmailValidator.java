package com.yanazaitsava.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
    // в перв. параметре дженерика  - анатация, кот. будет применяться
    // во втором - к какому типу данных будем применять аннотацию
        implements ConstraintValidator<CheckEmail,String> {

    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail= checkEmail.value();

    }

    @Override
    public boolean isValid(String enteredEmail,
                           ConstraintValidatorContext constraintValidatorContext) {

        return enteredEmail.endsWith(endOfEmail);
    }
}
