package com.nvocc.example.cloud.loadbalancer.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Lay
 * @since x.x
 */
@Data
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = 5585830572625959960L;

    private String name;

    private Integer age;
}
