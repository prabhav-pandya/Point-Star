package com.prabhavpandya;


import java.util.List;

interface PointStarCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}