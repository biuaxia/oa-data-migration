package cn.biuaxia.odm.generate.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ORG_UNIT")
public class OrgUnit implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "`NAME`")
    private String name;

    @TableField(value = "SECOND_NAME")
    private String secondName;

    @TableField(value = "CODE")
    private String code;

    @TableField(value = "SHORT_NAME")
    private String shortName;

    @TableField(value = "`TYPE`")
    private String type;

    @TableField(value = "IS_GROUP")
    private Short isGroup;

    @TableField(value = "`PATH`")
    private String path;

    @TableField(value = "IS_INTERNAL")
    private Short isInternal;

    @TableField(value = "SORT_ID")
    private Integer sortId;

    @TableField(value = "IS_ENABLE")
    private Short isEnable;

    @TableField(value = "IS_DELETED")
    private Short isDeleted;

    @TableField(value = "`STATUS`")
    private Short status;

    @TableField(value = "LEVEL_SCOPE")
    private Integer levelScope;

    @TableField(value = "ORG_ACCOUNT_ID")
    private Long orgAccountId;

    @TableField(value = "CREATE_TIME")
    private Date createTime;

    @TableField(value = "UPDATE_TIME")
    private Date updateTime;

    @TableField(value = "DESCRIPTION")
    private String description;

    @TableField(value = "EXT_ATTR_1")
    private String extAttr1;

    @TableField(value = "EXT_ATTR_2")
    private String extAttr2;

    @TableField(value = "EXT_ATTR_3")
    private String extAttr3;

    @TableField(value = "EXT_ATTR_4")
    private String extAttr4;

    @TableField(value = "EXT_ATTR_5")
    private String extAttr5;

    @TableField(value = "EXT_ATTR_6")
    private String extAttr6;

    @TableField(value = "EXT_ATTR_7")
    private String extAttr7;

    @TableField(value = "EXT_ATTR_8")
    private String extAttr8;

    @TableField(value = "EXT_ATTR_9")
    private String extAttr9;

    @TableField(value = "EXT_ATTR_10")
    private String extAttr10;

    @TableField(value = "EXT_ATTR_11")
    private Integer extAttr11;

    @TableField(value = "EXT_ATTR_12")
    private Integer extAttr12;

    @TableField(value = "EXT_ATTR_13")
    private Integer extAttr13;

    @TableField(value = "EXT_ATTR_14")
    private Integer extAttr14;

    @TableField(value = "EXT_ATTR_15")
    private Integer extAttr15;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_NAME = "NAME";

    public static final String COL_SECOND_NAME = "SECOND_NAME";

    public static final String COL_CODE = "CODE";

    public static final String COL_SHORT_NAME = "SHORT_NAME";

    public static final String COL_TYPE = "TYPE";

    public static final String COL_IS_GROUP = "IS_GROUP";

    public static final String COL_PATH = "PATH";

    public static final String COL_IS_INTERNAL = "IS_INTERNAL";

    public static final String COL_SORT_ID = "SORT_ID";

    public static final String COL_IS_ENABLE = "IS_ENABLE";

    public static final String COL_IS_DELETED = "IS_DELETED";

    public static final String COL_STATUS = "STATUS";

    public static final String COL_LEVEL_SCOPE = "LEVEL_SCOPE";

    public static final String COL_ORG_ACCOUNT_ID = "ORG_ACCOUNT_ID";

    public static final String COL_CREATE_TIME = "CREATE_TIME";

    public static final String COL_UPDATE_TIME = "UPDATE_TIME";

    public static final String COL_DESCRIPTION = "DESCRIPTION";

    public static final String COL_EXT_ATTR_1 = "EXT_ATTR_1";

    public static final String COL_EXT_ATTR_2 = "EXT_ATTR_2";

    public static final String COL_EXT_ATTR_3 = "EXT_ATTR_3";

    public static final String COL_EXT_ATTR_4 = "EXT_ATTR_4";

    public static final String COL_EXT_ATTR_5 = "EXT_ATTR_5";

    public static final String COL_EXT_ATTR_6 = "EXT_ATTR_6";

    public static final String COL_EXT_ATTR_7 = "EXT_ATTR_7";

    public static final String COL_EXT_ATTR_8 = "EXT_ATTR_8";

    public static final String COL_EXT_ATTR_9 = "EXT_ATTR_9";

    public static final String COL_EXT_ATTR_10 = "EXT_ATTR_10";

    public static final String COL_EXT_ATTR_11 = "EXT_ATTR_11";

    public static final String COL_EXT_ATTR_12 = "EXT_ATTR_12";

    public static final String COL_EXT_ATTR_13 = "EXT_ATTR_13";

    public static final String COL_EXT_ATTR_14 = "EXT_ATTR_14";

    public static final String COL_EXT_ATTR_15 = "EXT_ATTR_15";
}