package org.zerock.jspmvc.todo.service;

import org.zerock.jspmvc.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 *  enum 타입의 클래스의 장점은 정해진 수만큼만 객체를 생성할 수 있다.
 *
 */
public enum TodoService {
    INSTANCE;

    /*새로운 TodoDTO 객체를 받아서 확인할 수 있는 것을 목표로 작성*/
    public void register(TodoDTO todoDTO) {
        System.out.println("DEBUG.........." + todoDTO);
    }

    /*10개의 TodoDTO 객체를 만들어서 반환하도록 구성한다.*/
    public List<TodoDTO> getList(){
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i->{
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle(("Todo..")+i);
            dto.setDueDate(LocalDate.now());

            return dto;
        }).collect(Collectors.toList()); // 리스트로 변환해서 저장한다.
        return todoDTOS;
    }

    public TodoDTO get(Long tno){
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }
}
