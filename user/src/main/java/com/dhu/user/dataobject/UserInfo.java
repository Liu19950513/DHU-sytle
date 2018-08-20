package com.dhu.user.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * creater: LIUYING
 * date:2018/8/14 15:18
 */
@Data
@Entity
public class UserInfo {
    @Id
    private String userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 用户身材：
     * 五种身材：标准（standard）梨形（pear）圆型（circle）长方形（rectangle）倒三角（triangle）
     */
    private String body;
    /**
     * 用户肤色
     * 六种肤色：浅冷 浅暖 中冷 中暖 深冷 深暖
     */
    private String skin;
    /**
     * 用户在线状态
     * -1：下线；1：在线
     */
    private Integer type;
    /**
     * 用户喜好风格
     * 六种风格：
     */
    private String style;

}
