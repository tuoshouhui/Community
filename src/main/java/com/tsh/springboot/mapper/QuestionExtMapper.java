package com.tsh.springboot.mapper;

import com.tsh.springboot.model.Question;

/**
 * Created by ttuos on 2019/9/27.
 */
public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}
