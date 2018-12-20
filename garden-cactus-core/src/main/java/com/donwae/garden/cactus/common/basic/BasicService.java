package com.donwae.garden.cactus.common.basic;

/**
 * TODO
 *
 * @auther Jeremy
 * 2018/10/30 下午3:53
 */
public interface BasicService<T> {

    default void deleteOne(T entity){}

    void updateOne(T entity);

    T getOneById(String id);

    T addOne(T entity);
}
