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
@TableName(value = "CTP_CONTENT_ALL")
public class CtpContentAll implements Serializable {

    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "CREATE_ID")
    private Long createId;

    @TableField(value = "CREATE_DATE")
    private Date createDate;

    @TableField(value = "MODIFY_ID")
    private Long modifyId;

    @TableField(value = "MODIFY_DATE")
    private Date modifyDate;

    @TableField(value = "MODULE_TYPE")
    private Short moduleType;

    @TableField(value = "MODULE_ID")
    private Long moduleId;

    @TableField(value = "MODULE_TEMPLATE_ID")
    private Long moduleTemplateId;

    @TableField(value = "CONTENT_TYPE")
    private Short contentType;

    @TableField(value = "CONTENT_DATA_ID")
    private Long contentDataId;

    @TableField(value = "CONTENT_TEMPLATE_ID")
    private Long contentTemplateId;

    @TableField(value = "TITLE")
    private String title;

    @TableField(value = "SORT")
    private Short sort;

    @TableField(value = "CONTENT")
    private String content;

    @TableField(value = "trans_id")
    private Long transId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_CREATE_ID = "CREATE_ID";

    public static final String COL_CREATE_DATE = "CREATE_DATE";

    public static final String COL_MODIFY_ID = "MODIFY_ID";

    public static final String COL_MODIFY_DATE = "MODIFY_DATE";

    public static final String COL_MODULE_TYPE = "MODULE_TYPE";

    public static final String COL_MODULE_ID = "MODULE_ID";

    public static final String COL_MODULE_TEMPLATE_ID = "MODULE_TEMPLATE_ID";

    public static final String COL_CONTENT_TYPE = "CONTENT_TYPE";

    public static final String COL_CONTENT_DATA_ID = "CONTENT_DATA_ID";

    public static final String COL_CONTENT_TEMPLATE_ID = "CONTENT_TEMPLATE_ID";

    public static final String COL_TITLE = "TITLE";

    public static final String COL_SORT = "SORT";

    public static final String COL_CONTENT = "CONTENT";

    public static final String COL_TRANS_ID = "trans_id";
}