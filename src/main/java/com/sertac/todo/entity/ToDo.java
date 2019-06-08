package com.sertac.todo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "todo")
public class ToDo extends BaseEntity {

    @Column(name = "detail")
    private String detail;

    @Column(name = "to_do")
    private String toDo;

    @Column(name = "doing")
    private String doing;

    @Column(name = "done")
    private String done;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_todo_id")
    private List<SubTodo> subTodo;

}
