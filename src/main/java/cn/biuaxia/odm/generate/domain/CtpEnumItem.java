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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "CTP_ENUM_ITEM")
public class CtpEnumItem implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "REF_ENUMID")
    private Long refEnumid;

    @TableField(value = "SHOWVALUE")
    private String showvalue;

    @TableField(value = "ENUMVALUE")
    private String enumvalue;

    @TableField(value = "SORTNUMBER")
    private Integer sortnumber;

    @TableField(value = "`STATE`")
    private Short state;

    @TableField(value = "OUTPUT_SWITCH")
    private Short outputSwitch;

    @TableField(value = "ORG_ACCOUNT_ID")
    private Long orgAccountId;

    @TableField(value = "PARENT_ID")
    private Long parentId;

    @TableField(value = "ROOT_ID")
    private Long rootId;

    @TableField(value = "LEVEL_NUM")
    private Short levelNum;

    @TableField(value = "DESCRIPTION")
    private String description;

    @TableField(value = "IFUSE")
    private String ifuse;

    @TableField(value = "I18N")
    private Short i18n;

    @TableField(value = "EXT1")
    private Long ext1;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_REF_ENUMID = "REF_ENUMID";

    public static final String COL_SHOWVALUE = "SHOWVALUE";

    public static final String COL_ENUMVALUE = "ENUMVALUE";

    public static final String COL_SORTNUMBER = "SORTNUMBER";

    public static final String COL_STATE = "STATE";

    public static final String COL_OUTPUT_SWITCH = "OUTPUT_SWITCH";

    public static final String COL_ORG_ACCOUNT_ID = "ORG_ACCOUNT_ID";

    public static final String COL_PARENT_ID = "PARENT_ID";

    public static final String COL_ROOT_ID = "ROOT_ID";

    public static final String COL_LEVEL_NUM = "LEVEL_NUM";

    public static final String COL_DESCRIPTION = "DESCRIPTION";

    public static final String COL_IFUSE = "IFUSE";

    public static final String COL_I18N = "I18N";

    public static final String COL_EXT1 = "EXT1";
}