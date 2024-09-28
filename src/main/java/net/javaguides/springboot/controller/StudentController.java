package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Car;
import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8080/student
    // map incoming Http get request with this method
    @GetMapping("student")
    public Student getStudent()
    {
        Student student = new Student(1,"Chung", "Ho"
        );
return student;
    }
    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ramesh", "Panda"));
        students.add(new Student(2,"Justin","Ho"));
        students.add(new Student(3,"Jo","Walker"));
        return students;
    }



@GetMapping("car")
    public Car getCar(){
        //Car car = new Car(1,"Ford",2008);
        //return car;
    Car car = new Car();
    car.setId(1);
    car.setModel("Ford");
    car.setYear(2008);
    return car;
}


@GetMapping("cars")
public List<Car> getCars()
{
    List<Car> cars = new ArrayList<>();
    cars.add(new Car(1,"Ford",2018));
    cars.add(new Car(2,"Toyota",2019));
    Car car3 = new Car();
    car3.setId(3);
    car3.setModel("Tesla");
    car3.setYear(2023);
    cars.add(car3);
    return cars;
}
// Spring Boot Rest API with Path Variable
    public Student









}
