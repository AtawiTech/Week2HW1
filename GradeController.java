package com.example.week2hw1;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class GradeController {
    ArrayList<String> grades= new ArrayList<>();
    @GetMapping("/grade")
    public ArrayList getGrade(){
        return grades;}
    @PostMapping("/grade")
    public String addGrade(int index, String grade){
        grades.add(grade);
        return "a new grade has been added to the list";}
    @PutMapping ("/grade")
    public String putGrade(int index , String grade) {
        grades.set(index, grade);
        return "a grade has been updated";}
    @DeleteMapping ("/grade")
    public String DeleteGrade(int index){
        grades.remove(index);
        return "a grade has been deleted";}
}
