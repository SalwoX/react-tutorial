package com.eyox.reacttutorialapi.core.utilities.results;


public class SuccessDataResult<T> extends DataResult {
    public SuccessDataResult(T data) {
        super(true, data);
    }

    public SuccessDataResult(T data, String message) {
        super(data, true, message);
    }
}
