package com.alura.book_spring_alura.service;

public interface IConvertData {
    <T> T getDates (String json, Class<T> tClass);
}
