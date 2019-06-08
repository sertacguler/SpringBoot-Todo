# spring-boot-todo
Spring Boot Rest ToDo-API


/todo/save

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
	 
******************************	 
/todo/update

******************************	 
/todo/delete 

******************************	 
/todo/deleteById  /todo/deleteById?id=1

******************************	 
/todo/findAll

return List<ToDo>

******************************	 
/todo/findById/{id}  /todo/findById/2

******************************	 
/todo/findByToDo/true
/todo/findByDoing/false
/todo/findByDone/false

******************************	 
