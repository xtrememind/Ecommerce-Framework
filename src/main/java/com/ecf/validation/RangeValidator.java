package com.ecf.validation;
import com.ecf.validation.models.Request;

public class RangeValidator implements Validator {

    private Validator nextValidator;
    private long min;
    //private long max;

    @Override
    public void setNextValidator(Validator validator) {
        this.nextValidator=validator;
    }

    @Override
    public void validate(Request request) {
        if(request.getValue().length()<this.min) {
            request.setValid(false);
            request.setError(String.format("%s should have at least %d characters", request.getControlName(),this.min));
        }
        else {
            if(this.nextValidator!=null)
                this.nextValidator.validate(request);
        }
    }
}
