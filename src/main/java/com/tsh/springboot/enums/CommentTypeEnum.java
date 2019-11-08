package com.tsh.springboot.enums;

/**
 * Created by ttuos on 2019/10/10.
 */
public enum CommentTypeEnum {
    COMMENT(2),
    QUESTION(1);
    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if(commentTypeEnum.getType() == type){
                return true;
            }
        }
        return false;
    }
}
