package org.example;
import java.util.List;

public class Compare {
    public void cmputeList(List<? extends Number> source, List<? extends Number> dest) {

    }

    public <T extends Number> void cmputeList1(List<T> source, List<T> dest) {

    }

    /*
    * In computeList1 Both parameters must be same type
    * But in computeList parameters can be any of child of Number
    * In computeList we can use super also like ? extends Number, for lower bound
    * But in computeList1 it is not possible
    * In computeList multiple type possible like <T,K,V,B.....> etc
    *
    * */
}

