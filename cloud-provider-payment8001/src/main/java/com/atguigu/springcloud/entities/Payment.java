package com.atguigu.springcloud.entities;

import lombok.*;

import java.io.Serializable;

/**
 * @Author : fhr
 * @Date : 2020/4/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{
        private Long id;
        private String serial;
}
