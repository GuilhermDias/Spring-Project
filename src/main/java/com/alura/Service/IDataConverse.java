package com.alura.Service;

public interface IDataConverse {
    <T> T getData(String json, Class<T> tClass);
}
