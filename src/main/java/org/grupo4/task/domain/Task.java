package org.grupo4.task.domain;

public class Task {
    private final Integer id;
    private String name;
    private Boolean status;

    public Task(Integer id, String name, Boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean isStatus() {
        return status;
    }

    public void check() {
        if (!this.isStatus()) {
            this.status = Boolean.TRUE;
        }
    }

    public void uncheck() {
        if (this.isStatus()) {
            this.status = Boolean.FALSE;
        }
    }

    public void changeName(String newName) {
        if (this.nameHasChanged(newName)) {
            this.name = newName;
        }
    }

    public boolean nameHasChanged(String newName) {
        return this.name.equals(newName);
    }

    @Override
    public String toString() {
        return String.format("Task(id=%s, name=%s, status=%b)", id, name, status);
    }

}
