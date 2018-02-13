package com.jp.springbootjavabrain.dao;

import com.jp.springbootjavabrain.entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicDao extends CrudRepository<Topic,String> {
}
