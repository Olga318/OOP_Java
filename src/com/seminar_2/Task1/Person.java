package com.seminar_2.Task1;

public class Person extends Family {
    private String status;

    public String getStatus() {return status;
    }

    public void setStatus(String status) {this.status = status;
    }

    void showPerson() {System.out.println("Статус: " + status);
    }

}
