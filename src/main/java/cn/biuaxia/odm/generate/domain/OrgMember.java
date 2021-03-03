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
@TableName(value = "ORG_MEMBER")
public class OrgMember implements Serializable {

    public static final String COL_ID = "ID";
    public static final String COL_NAME = "NAME";
    public static final String COL_CODE = "CODE";
    public static final String COL_IS_INTERNAL = "IS_INTERNAL";
    public static final String COL_IS_LOGINABLE = "IS_LOGINABLE";
    public static final String COL_IS_VIRTUAL = "IS_VIRTUAL";
    public static final String COL_IS_ADMIN = "IS_ADMIN";
    public static final String COL_IS_ASSIGNED = "IS_ASSIGNED";
    public static final String COL_TYPE = "TYPE";
    public static final String COL_STATE = "STATE";
    public static final String COL_IS_ENABLE = "IS_ENABLE";
    public static final String COL_IS_DELETED = "IS_DELETED";
    public static final String COL_STATUS = "STATUS";
    public static final String COL_SORT_ID = "SORT_ID";
    public static final String COL_ORG_DEPARTMENT_ID = "ORG_DEPARTMENT_ID";
    public static final String COL_ORG_POST_ID = "ORG_POST_ID";
    public static final String COL_ORG_LEVEL_ID = "ORG_LEVEL_ID";
    public static final String COL_ORG_ACCOUNT_ID = "ORG_ACCOUNT_ID";
    public static final String COL_DESCRIPTION = "DESCRIPTION";
    public static final String COL_CREATE_TIME = "CREATE_TIME";
    public static final String COL_UPDATE_TIME = "UPDATE_TIME";
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
    public static final String COL_EXT_ATTR_16 = "EXT_ATTR_16";
    public static final String COL_EXT_ATTR_17 = "EXT_ATTR_17";
    public static final String COL_EXT_ATTR_18 = "EXT_ATTR_18";
    public static final String COL_EXT_ATTR_19 = "EXT_ATTR_19";
    public static final String COL_EXT_ATTR_20 = "EXT_ATTR_20";
    public static final String COL_EXT_ATTR_21 = "EXT_ATTR_21";
    public static final String COL_EXT_ATTR_22 = "EXT_ATTR_22";
    public static final String COL_EXT_ATTR_23 = "EXT_ATTR_23";
    public static final String COL_EXT_ATTR_24 = "EXT_ATTR_24";
    public static final String COL_EXT_ATTR_25 = "EXT_ATTR_25";
    public static final String COL_EXT_ATTR_26 = "EXT_ATTR_26";
    public static final String COL_EXT_ATTR_27 = "EXT_ATTR_27";
    public static final String COL_EXT_ATTR_28 = "EXT_ATTR_28";
    public static final String COL_EXT_ATTR_29 = "EXT_ATTR_29";
    public static final String COL_EXT_ATTR_30 = "EXT_ATTR_30";
    public static final String COL_EXT_ATTR_31 = "EXT_ATTR_31";
    public static final String COL_EXT_ATTR_32 = "EXT_ATTR_32";
    public static final String COL_EXT_ATTR_33 = "EXT_ATTR_33";
    public static final String COL_EXT_ATTR_34 = "EXT_ATTR_34";
    public static final String COL_EXT_ATTR_35 = "EXT_ATTR_35";
    public static final String COL_EXT_ATTR_36 = "EXT_ATTR_36";
    public static final String COL_SECRET_LEVEL = "SECRET_LEVEL";
    private static final long serialVersionUID = 1L;
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;
    
    @TableField(value = "`NAME`")
    private String name;
    
    @TableField(value = "CODE")
    private String code;
    
    @TableField(value = "IS_INTERNAL")
    private Short isInternal;
    
    @TableField(value = "IS_LOGINABLE")
    private Short isLoginable;
    
    @TableField(value = "IS_VIRTUAL")
    private Short isVirtual;
    
    @TableField(value = "IS_ADMIN")
    private Short isAdmin;
    
    @TableField(value = "IS_ASSIGNED")
    private Short isAssigned;
    
    @TableField(value = "`TYPE`")
    private Short type;
    
    @TableField(value = "`STATE`")
    private Short state;
    
    @TableField(value = "IS_ENABLE")
    private Short isEnable;
    
    @TableField(value = "IS_DELETED")
    private Short isDeleted;
    
    @TableField(value = "`STATUS`")
    private Short status;
    
    @TableField(value = "SORT_ID")
    private Integer sortId;
    
    @TableField(value = "ORG_DEPARTMENT_ID")
    private Long orgDepartmentId;
    
    @TableField(value = "ORG_POST_ID")
    private Long orgPostId;
    
    @TableField(value = "ORG_LEVEL_ID")
    private Long orgLevelId;
    
    @TableField(value = "ORG_ACCOUNT_ID")
    private Long orgAccountId;
    
    @TableField(value = "DESCRIPTION")
    private String description;
    
    @TableField(value = "CREATE_TIME")
    private Date createTime;
    
    @TableField(value = "UPDATE_TIME")
    private Date updateTime;
    
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
    private Short extAttr11;
    
    @TableField(value = "EXT_ATTR_12")
    private Short extAttr12;
    
    @TableField(value = "EXT_ATTR_13")
    private Short extAttr13;
    
    @TableField(value = "EXT_ATTR_14")
    private Short extAttr14;
    
    @TableField(value = "EXT_ATTR_15")
    private Short extAttr15;
    
    @TableField(value = "EXT_ATTR_16")
    private Integer extAttr16;
    
    @TableField(value = "EXT_ATTR_17")
    private Integer extAttr17;
    
    @TableField(value = "EXT_ATTR_18")
    private Integer extAttr18;
    
    @TableField(value = "EXT_ATTR_19")
    private Integer extAttr19;
    
    @TableField(value = "EXT_ATTR_20")
    private Integer extAttr20;
    
    @TableField(value = "EXT_ATTR_21")
    private Date extAttr21;
    
    @TableField(value = "EXT_ATTR_22")
    private Date extAttr22;
    
    @TableField(value = "EXT_ATTR_23")
    private Date extAttr23;
    
    @TableField(value = "EXT_ATTR_24")
    private Date extAttr24;
    
    @TableField(value = "EXT_ATTR_25")
    private Date extAttr25;
    
    @TableField(value = "EXT_ATTR_26")
    private Date extAttr26;
    
    @TableField(value = "EXT_ATTR_27")
    private Date extAttr27;
    
    @TableField(value = "EXT_ATTR_28")
    private Date extAttr28;
    
    @TableField(value = "EXT_ATTR_29")
    private Date extAttr29;
    
    @TableField(value = "EXT_ATTR_30")
    private Date extAttr30;
    
    @TableField(value = "EXT_ATTR_31")
    private String extAttr31;
    
    @TableField(value = "EXT_ATTR_32")
    private String extAttr32;
    
    @TableField(value = "EXT_ATTR_33")
    private String extAttr33;
    
    @TableField(value = "EXT_ATTR_34")
    private String extAttr34;
    
    @TableField(value = "EXT_ATTR_35")
    private String extAttr35;
    
    @TableField(value = "EXT_ATTR_36")
    private String extAttr36;
    
    @TableField(value = "SECRET_LEVEL")
    private Short secretLevel;
}