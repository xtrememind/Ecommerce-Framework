package com.ecf.validation;

import com.ecf.validation.models.Request;

public class RegularExpressionValidator implements Validator  {

    private Validator nextValidator;
    private String pattern;

    @Override
    public void setNextValidator(Validator validator) {
        this.nextValidator=validator;
    }

    @Override
    public void validate(Request request) {
       //need to implement
    }
}
