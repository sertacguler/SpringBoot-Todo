package com.sertac.todo.service;

import com.sertac.todo.dao.ToDoDAO;
import com.sertac.todo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    private final ToDoDAO toDoDAO;

    @Autowired
    public ToDoServiceImpl(ToDoDAO toDoDAO) {
        this.toDoDAO = toDoDAO;
    }

    @Transactional
    @Override
    public ToDo save(ToDo todo) {
        return toDoDAO.save(todo);
    }

    @Transactional
    @Override
    public ToDo update(ToDo toDo) {
        return toDoDAO.save(toDo);
    }

    @Transactional
    @Override
    public void delete(ToDo todo) {
        toDoDAO.delete(todo);
    }

    @Transactional
    @Override
    public void deleteById(Long todoId) {
        toDoDAO.deleteById(todoId);
    }

    @Transactional
    @Override
    public List<ToDo> findAll() {
        return toDoDAO.findAll();
    }

    @Transactional
    @Override
    public ToDo findById(Long id) {
        return toDoDAO.findById(id).get();
    }

    @Override
    public List<ToDo> findByToDo(String to_do) {
        return toDoDAO.findByToDo(to_do);
    }

    @Override
    public List<ToDo> findByDoing(String doing) {
        return toDoDAO.findByDoing(doing);
    }

    @Override
    public List<ToDo> findByDone(String done) {
        return toDoDAO.findByDone(done);
    }

}
