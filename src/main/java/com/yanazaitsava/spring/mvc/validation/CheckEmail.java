package com.yanazaitsava.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) //указывает область, к которой будет применятся аннотация
@Retention(RetentionPolicy.RUNTIME)//информация о аннотации должна сохранятся вплоть до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class)// описывает какой класс будет обрабатывать информацию CheckEmail
public @interface CheckEmail {
    public String value()default "xyz.com";
    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
