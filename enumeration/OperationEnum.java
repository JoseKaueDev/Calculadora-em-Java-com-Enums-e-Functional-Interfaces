package enumeration;

import java.util.function.BiFunction;

public enum OperationEnum
{
    sum(Integer::sum,"+"),
    subtract((Integer v1 , Integer v2) -> v1 - v2,"-"),
    multiply((Integer v1 , Integer v2) -> v1 * v2,"*"),
    divisor((Integer v1 , Integer v2) -> v1 / v2,"/" );

    private final BiFunction<Integer , Integer, Integer> calculate;
    private final String simbolo;

    OperationEnum(BiFunction<Integer, Integer, Integer> calculate, String simbolo) {
        this.calculate = calculate;
        this.simbolo = simbolo;
    }

    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
