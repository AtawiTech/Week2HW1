package com.example.week2hw1;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
public class PeopleController {
    ArrayList<String> names=new ArrayList<>();
    @GetMapping("/name")
    public ArrayList GetName(){
        return names;}
    @PostMapping("/name")
    public String addName(@RequestBody String name){
        names.add(name);
        return "a name has been added to the list";}
    @PutMapping("/name/{index}")
    public String UpdateName(@PathVariable int index,@RequestBody String name){
        names.set(index,name);
        return " a name has been updated";}
    @DeleteMapping("/name/{index}")
    public String DeleteName(@PathVariable int index){
        names.remove(index);
        return "a name has been removed";}
}