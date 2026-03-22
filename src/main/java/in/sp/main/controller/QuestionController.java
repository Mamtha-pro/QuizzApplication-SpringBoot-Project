package in.sp.main.controller;

import in.sp.main.Questions;
import in.sp.main.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionServices questionServices;

    @GetMapping("allQuestions")
    public List<Questions> getAllQuestions(){
        return questionServices.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Questions> getQuestionsByCategory(@PathVariable String category){
        return questionServices.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public String addQuestions(@RequestBody Questions question){
        return questionServices. addQuestions(question);
    }

}
