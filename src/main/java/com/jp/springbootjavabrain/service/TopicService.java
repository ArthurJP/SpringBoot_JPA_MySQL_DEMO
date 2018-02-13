package com.jp.springbootjavabrain.service;

import com.jp.springbootjavabrain.dao.TopicDao;
import com.jp.springbootjavabrain.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private final TopicDao topicDao;

    @Autowired
    public TopicService(TopicDao topicDao) {
        this.topicDao = topicDao;
    }

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicDao.findAll().forEach( topics::add );
        return topics;
    }

    public Topic getTopic(String name) {
        return topicDao.findOne( name );
    }

    public int addTopic(Topic topic) {
        try {
            topicDao.save( topic );
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int updateTopic(Topic topic) {
        try {
            topicDao.save( topic );
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }


    public int delTopic(String name) {
        try {
            topicDao.delete( name );
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
