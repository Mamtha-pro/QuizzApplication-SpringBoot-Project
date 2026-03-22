package in.sp.main.controller;

import in.sp.main.Questions;
import in.sp.main.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionServices questionServices;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){
        return questionServices.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable String category){
        return questionServices.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public ResponseEntity<String> addQuestions(@RequestBody Questions question){
        return questionServices. addQuestions(question);
    }

}
