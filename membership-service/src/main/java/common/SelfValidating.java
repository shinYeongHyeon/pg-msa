package common;

import javax.xml.validation.Validator;

public abstract class SelfValidating<T> {
    private Validator validator;

    public SelfValidating() {

    }
}
