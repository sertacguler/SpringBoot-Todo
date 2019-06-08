package com.sertac.todo.service;

import com.sertac.todo.entity.ToDo;

import java.util.List;

public interface ToDoService {

    ToDo save(ToDo todo);

    ToDo update(ToDo toDo);

    void delete(ToDo todo);

    void deleteById(Long todoId);

    List<ToDo> findAll();

    ToDo findById(Long todoId);

    List<ToDo> findByToDo(String to_do);

    List<ToDo> findByDoing(String doing);

    List<ToDo> findByDone(String done);

}
