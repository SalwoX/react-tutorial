package com.eyox.reacttutorialapi.core.utilities.results;

public class DataResult<T> extends Result{
    public DataResult(boolean success, T data) {
        super(success);
        this.data = data;
    }

    private T data;
    public DataResult(T data, boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
