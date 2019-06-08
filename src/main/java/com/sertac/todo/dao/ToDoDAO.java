package com.sertac.todo.dao;

import com.sertac.todo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoDAO extends JpaRepository<ToDo, Long> {

    @Query(value = "SELECT * FROM todo WHERE to_do = :to_do", nativeQuery = true)
    List<ToDo> findByToDo(@Param("to_do") String to_do);

    @Query(value = "SELECT * FROM todo WHERE doing = :doing", nativeQuery = true)
    List<ToDo> findByDoing(@Param("doing") String doing);

    @Query(value = "SELECT * FROM todo WHERE done = :done", nativeQuery = true)
    List<ToDo> findByDone(@Param("done") String done);

}
