package com.example.webflux.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document
@Data
public class Employee {
    @Id
    @Getter @Setter
    int id;
    @Getter @Setter
    String name;
    @Getter @Setter
    String department;
    @Getter @Setter
    long salary;

    public  String toString(){
        return "Employee [id = " + id + ", name = "+name+", department = "+department+", salary = "+salary+"]";
    }
}
