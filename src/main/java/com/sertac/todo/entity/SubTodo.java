package com.sertac.todo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "sub_todo")
public class SubTodo extends BaseEntity {

    @Column(name = "detail")
    private String detail;

}
