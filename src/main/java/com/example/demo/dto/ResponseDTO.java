package com.example.demo.dto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class ResponseDTO<T> {
    private String error;
    private List<T> data;
}
