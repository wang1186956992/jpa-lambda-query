package com.github.xuejike.query.jpa.lambda.core;

import java.util.List;

public interface IPage<T> {


    abstract List<T> getData();

    int getPageNo();

    int getPageSize();

    long getTotal();

    boolean isHaveTotal();
}
