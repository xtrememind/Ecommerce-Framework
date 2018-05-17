package com.ecf.validation;
import com.ecf.validation.models.Request;


public interface Validator {
    public void setNextValidator(Validator validator);
    public void validate(Request request);
}
