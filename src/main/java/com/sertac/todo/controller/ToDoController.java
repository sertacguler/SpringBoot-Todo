package com.sertac.todo.controller;

import com.sertac.todo.entity.ToDo;
import com.sertac.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "todo")
public class ToDoController {

    private ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    /*

    {
        "detail":"Alışveriş yap",
        "toDo":"true",
        "doing":"false",
        "done":"false",
        "subTodo":[
              {
              "detail": "Sut"
              },
              {
              "detail": "2 Ekmek"
              }
        ]
     }

     */

    @PostMapping(value = "/save")
    public ToDo save(@RequestBody ToDo toDo) {
        return toDoService.save(toDo);
    }

    @PutMapping(value = "/update")
    public ToDo update(@RequestBody ToDo toDo) {
        return toDoService.update(toDo);
    }

    @PostMapping(value = "/delete") //http://localhost:8080/todo/delete
    public void delete(@RequestBody ToDo toDo) {
        toDoService.delete(toDo);
    }

    @DeleteMapping(value = "/deleteById") //http://localhost:8080/todo/deleteById?id=1
    public void deleteById(@RequestParam(value = "id") Long id) {
        toDoService.deleteById(id);
    }

    @GetMapping(value = "/findAll")
    public List<ToDo> findAll() {
        return toDoService.findAll();
    }

    @GetMapping(value = "/findById/{id}") //http://localhost:8080/todo/findById/2
    public ToDo findAllById(@PathVariable(value = "id") Long id) {
        return toDoService.findById(id);
    }

    @GetMapping(value = "/findByToDo/{to_do}") //http://localhost:8080/todo/findByToDo/true
    public List<ToDo> findByToDo(@PathVariable(value = "to_do") String to_do) {
        return toDoService.findByToDo(to_do);
    }

    @GetMapping(value = "/findByDoing/{doing}") //http://localhost:8080/todo/findByDoing/false
    public List<ToDo> findByDoing(@PathVariable(value = "doing") String doing) {
        return toDoService.findByDoing(doing);
    }

    @GetMapping(value = "/findByDone/{done}") //http://localhost:8080/todo/findByDone/false
    public List<ToDo> findByDone(@PathVariable(value = "done") String done) {
        return toDoService.findByDone(done);
    }

}
