package com.nelio.javacompleto.jdbc.db;

/**
 * Exceção customizada para erros de banco de dados
 */
public class DbException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DbException(String msg) {
        super(msg);
    }
}
