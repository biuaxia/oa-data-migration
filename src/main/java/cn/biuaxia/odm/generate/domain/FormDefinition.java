package cn.biuaxia.odm.generate.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "FORM_DEFINITION")
public class FormDefinition implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "`NAME`")
    private String name;

    @TableField(value = "CREATE_ID")
    private Long createId;

    @TableField(value = "CREATE_TIME")
    private Date createTime;

    @TableField(value = "FORM_TYPE")
    private Short formType;

    @TableField(value = "CATEGORY_ID")
    private Long categoryId;

    @TableField(value = "USE_FLAG")
    private Short useFlag;

    @TableField(value = "`STATE`")
    private Short state;

    @TableField(value = "DELETE_FLAG")
    private Short deleteFlag;

    @TableField(value = "FIELD_INFO")
    private String fieldInfo;

    @TableField(value = "VIEW_INFO")
    private String viewInfo;

    @TableField(value = "QUERY_INFO")
    private String queryInfo;

    @TableField(value = "REPORT_INFO")
    private String reportInfo;

    @TableField(value = "TRIGGER_INFO")
    private String triggerInfo;

    @TableField(value = "APPBIND_INFO")
    private String appbindInfo;

    @TableField(value = "EXTENSIONS_INFO")
    private String extensionsInfo;

    @TableField(value = "MODIFY_TIME")
    private Date modifyTime;

    @TableField(value = "FORM_STYLE")
    private String formStyle;

    @TableField(value = "PREPARE_FLAG")
    private Short prepareFlag;

    @TableField(value = "SOURCE_TYPE")
    private String sourceType;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_NAME = "NAME";

    public static final String COL_CREATE_ID = "CREATE_ID";

    public static final String COL_CREATE_TIME = "CREATE_TIME";

    public static final String COL_FORM_TYPE = "FORM_TYPE";

    public static final String COL_CATEGORY_ID = "CATEGORY_ID";

    public static final String COL_USE_FLAG = "USE_FLAG";

    public static final String COL_STATE = "STATE";

    public static final String COL_DELETE_FLAG = "DELETE_FLAG";

    public static final String COL_FIELD_INFO = "FIELD_INFO";

    public static final String COL_VIEW_INFO = "VIEW_INFO";

    public static final String COL_QUERY_INFO = "QUERY_INFO";

    public static final String COL_REPORT_INFO = "REPORT_INFO";

    public static final String COL_TRIGGER_INFO = "TRIGGER_INFO";

    public static final String COL_APPBIND_INFO = "APPBIND_INFO";

    public static final String COL_EXTENSIONS_INFO = "EXTENSIONS_INFO";

    public static final String COL_MODIFY_TIME = "MODIFY_TIME";

    public static final String COL_FORM_STYLE = "FORM_STYLE";

    public static final String COL_PREPARE_FLAG = "PREPARE_FLAG";

    public static final String COL_SOURCE_TYPE = "SOURCE_TYPE";
}