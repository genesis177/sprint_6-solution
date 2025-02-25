package ru.yandex.practicum.javadeveloper.javakanban;


public class Task {


    private String title;


    private String description;


    private int id;


    private Status status;


    public Task(String title, String description) {


        this.title = title;


        this.description = description;


        this.status = Status.NEW;


    }


    public String getTitle() {


        return title;


    }


    public String getDescription() {


        return description;


    }


    public int getId() {


        return id;


    }


    public Status getStatus() {


        return status;


    }


    public void setId(int id) {


        this.id = id;


    }


    public void setStatus(Status status) {


        this.status = status;


    }


    @Override


    public boolean equals(Object o) {


        if (this == o) return true;


        if (!(o instanceof Task)) return false;


        Task task = (Task) o;


        return id == task.id;


    }


    @Override


    public int hashCode() {


        return Integer.hashCode(id);


    }


}
