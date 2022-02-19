package com.prabhavpandya;

import java.util.List;

class PointStarFunction implements PointStarCallable {

    @Override
    public int arity() {
        return declaration.params.size();
    }

    @Override
    public String toString() {
        return "<fn " + declaration.name.lexeme + ">";
    }

    private final Stmt.Function declaration;
    PointStarFunction(Stmt.Function declaration) {
        this.declaration = declaration;
    }

    @Override
    public Object call(Interpreter interpreter,
                       List<Object> arguments) {
        Environment environment = new Environment(interpreter.globals);
        for (int i = 0; i < declaration.params.size(); i++) {
            environment.define(declaration.params.get(i).lexeme,
                    arguments.get(i));
        }

        try {
            interpreter.executeBlock(declaration.body, environment);
        } catch (Return returnValue) {
            return returnValue.value;
        }

        return null;
    }



}