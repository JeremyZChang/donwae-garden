package com.donwae.garden.cactus.common.basic;

public interface BasicMapper<T> {

    T queryOne(String key);

    String insertOne(T entity);

    void deleteOne(T entity);

    T updateOne(T entity);

}
