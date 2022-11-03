package org.zerock.jspmvc.todo.dto;

import java.time.LocalDate;

/*
 * DTO(Data Transfer Object)
 * - 3 티어와 같이 계층을 분리하는 경우에는 반드시 계층이나 객체들 간에 데이터 교환이 이루어진다.
 * - 이 경우 대부분 한 개 이상의 데이터를 전달할 때가 많기 때문에 여러개의 데이터를 묶어서 하나의
 *   객체로 전달하는 것을 DTO라고 한다.
 * - 대부분은 Java Beans 형태로 구성하는 경우가 많다.
 * 1. 생성자가 없거나 반드시 파라미터가 없는 생성자 함수를 가지는 형태
 * 2. 속성(멤버 변수)은 private으로 작성
 * 3. getter/setter를 제공할 것.
 */
public class TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "tno=" + tno +
                ", title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", finished=" + finished +
                '}';
    }
}
