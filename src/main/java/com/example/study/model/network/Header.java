package com.example.study.model.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Header <T>{

    private LocalDateTime transactionTime;

    private String resultCode;

    private String descreption;

    private T data;

    private Pagination pagination;


    public static <T> Header<T> OK(){
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .descreption("OK")
                .build();
    }

    public static <T> Header<T> OK(T data){
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .descreption("OK")
                .data(data)
                .build();
    }

    public static <T> Header<T> OK(T data, Pagination pagination){
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("OK")
                .descreption("OK")
                .data(data)
                .pagination(pagination)
                .build();
    }

    public static <T> Header<T> ERROR(String descreption){
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now())
                .resultCode("ERROR")
                .descreption(descreption)
                .build();
    }
}
