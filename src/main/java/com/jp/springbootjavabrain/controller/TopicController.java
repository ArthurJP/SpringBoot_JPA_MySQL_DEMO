package com.jp.springbootjavabrain.controller;

import com.jp.springbootjavabrain.entity.Topic;
import com.jp.springbootjavabrain.service.TopicService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class TopicController {

    @Resource
    private TopicService topicService;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("/topics")
    public List<Topic> list2json() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{name}")
    public Topic getTopic(@PathVariable String name) {
        return topicService.getTopic( name );
    }

    @PostMapping("/topics")
    public int addTopic(@RequestBody Topic topic) {
        return topicService.addTopic( topic );
    }

    @PutMapping("/topics")
    public int updateTopic(@RequestBody Topic topic){
        return topicService.updateTopic(topic);
    }


    @DeleteMapping("/topics/{name}")
    public int deleteTopic(@PathVariable String name){
        return topicService.delTopic(name);
    }
}
