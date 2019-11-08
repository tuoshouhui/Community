package com.tsh.springboot.exception;

/**
 * Created by ttuos on 2019/9/27.
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND(2001,"你找的问题不在了，要不要换一个试试！"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复！"),
    NO_LOGIN(2003,"该操作需要登录，请登录后再进行操作！"),
    SYS_ERROR(2004,"服务器出错，请稍后再试！"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在!"),
    COMMENT_NOT_FOUND(2006,"你要回复的评论不在了，要不要换一个试试！"),
    CONTENT_IS_EMPTY(2007,"回复内容不能为空");


    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
