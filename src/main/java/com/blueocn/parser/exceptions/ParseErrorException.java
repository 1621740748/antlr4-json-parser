package com.blueocn.parser.exceptions;

public class ParseErrorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ParseErrorException(String msg) {
        super(msg);
    }

    public ParseErrorException(String msg, Throwable inner) {
        super(msg, inner);
    }

}
