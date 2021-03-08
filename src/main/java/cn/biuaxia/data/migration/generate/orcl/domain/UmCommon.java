package cn.biuaxia.data.migration.generate.orcl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 用户管理中部门、组和人员的共同信息父表
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UM_COMMON")
public class UmCommon implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "\"NAME\"")
    private String name;

    /**
     * 0为部门 1为组 2为人员
     */
    @TableField(value = "\"OPTIONS\"")
    private Integer options;

    /**
     * 部门、组的父id；
或者人员的主部门id
     */
    @TableField(value = "PID")
    private Long pid;

    /**
     * 简要介绍
     */
    @TableField(value = "DESCRIPTION")
    private String description;

    /**
     * 优先级
     */
    @TableField(value = "PRIORITY")
    private String priority;

    /**
     * 部门、组的代号；或者人员的简称
     */
    @TableField(value = "SYMBOL")
    private String symbol;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_NAME = "NAME";

    public static final String COL_OPTIONS = "OPTIONS";

    public static final String COL_PID = "PID";

    public static final String COL_DESCRIPTION = "DESCRIPTION";

    public static final String COL_PRIORITY = "PRIORITY";

    public static final String COL_SYMBOL = "SYMBOL";
}