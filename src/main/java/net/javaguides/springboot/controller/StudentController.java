package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Car;
import net.javaguides.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Car getCar() {
        Car car = new Car(1, "Ford", 2008);
        car.setYear(2010);
        return car;
    }

@GetMapping("cars")
    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"Ford",2008));
        cars.add(new Car(2,"Tesla",2024));
        return cars;
}

    // Spring Boot Rest API with Path Variable
    // {id} - URL template variable
    @GetMapping("student/{id}")
    public Student studentPathVariable(@PathVariable int id){
        return new Student(id,"Student " + id,"H");
    }
    @GetMapping("student/{id}/{firstName}/{lastName}")
    public Student studentPathVariables(@PathVariable int id, @PathVariable String firstName, @PathVariable String lastName){
        return new Student (id,firstName,lastName);
    }
    // Spring boot REST API with Request
    // http://localhost:8080/query?id=1&firstName=Justin&lastName=Ho
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,@RequestParam String firstName,@RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }

     // Spring boot REST API that handles Http Post request - create new resource
    // @PostMapping and @RequestBody
    @PostMapping("students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

// Spring boot REST API that handles HTTP PUT request -update existing resource
@PutMapping("students/{id}/update}")
    public Student updateStudent(@RequestBody Student student, @PathVariable int id)
{
    System.out.println(student.getFirstName());
    System.out.println(student.getLastName());
    return student;
}

}






