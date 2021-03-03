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
@TableName(value = "CTP_TEMPLATE")
public class CtpTemplate implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "CATEGORY_ID")
    private Long categoryId;

    @TableField(value = "MODULE_TYPE")
    private Short moduleType;

    @TableField(value = "SUB_MODULE_TYPE")
    private Long subModuleType;

    @TableField(value = "`TYPE`")
    private String type;

    @TableField(value = "SUBJECT")
    private String subject;

    @TableField(value = "IS_SYSTEM")
    private Short isSystem;

    @TableField(value = "MEMBER_ID")
    private Long memberId;

    @TableField(value = "CREATE_DATE")
    private Date createDate;

    @TableField(value = "MODIFY_MEMBER")
    private Long modifyMember;

    @TableField(value = "MODIFY_DATE")
    private Date modifyDate;

    @TableField(value = "SUMMARY")
    private String summary;

    @TableField(value = "WORKFLOW_ID")
    private Long workflowId;

    @TableField(value = "BODY")
    private Long body;

    @TableField(value = "BODY_TYPE")
    private String bodyType;

    @TableField(value = "`STATE`")
    private Short state;

    @TableField(value = "IS_DELETE")
    private Short isDelete;

    @TableField(value = "DESCRIPTION")
    private String description;

    @TableField(value = "ORG_ACCOUNT_ID")
    private Long orgAccountId;

    @TableField(value = "IDENTIFIER")
    private String identifier;

    @TableField(value = "PROJECT_ID")
    private Long projectId;

    @TableField(value = "FORM_PARENTID")
    private Long formParentid;

    @TableField(value = "TEMPLETE_NUMBER")
    private String templeteNumber;

    @TableField(value = "COL_SUBJECT")
    private String colSubject;

    @TableField(value = "STANDARD_DURATION")
    private Long standardDuration;

    @TableField(value = "SORT")
    private Short sort;

    @TableField(value = "CAN_SUPERVISE")
    private Short canSupervise;

    @TableField(value = "CAN_TRACK_WORKFLOW")
    private Short canTrackWorkflow;

    @TableField(value = "secret_related_level")
    private Short secretRelatedLevel;

    @TableField(value = "MARK_INFO")
    private String markInfo;

    @TableField(value = "TAOHONG_TEMPLETE")
    private Long taohongTemplete;

    @TableField(value = "SECRET_LEVEL")
    private Short secretLevel;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_CATEGORY_ID = "CATEGORY_ID";

    public static final String COL_MODULE_TYPE = "MODULE_TYPE";

    public static final String COL_SUB_MODULE_TYPE = "SUB_MODULE_TYPE";

    public static final String COL_TYPE = "TYPE";

    public static final String COL_SUBJECT = "SUBJECT";

    public static final String COL_IS_SYSTEM = "IS_SYSTEM";

    public static final String COL_MEMBER_ID = "MEMBER_ID";

    public static final String COL_CREATE_DATE = "CREATE_DATE";

    public static final String COL_MODIFY_MEMBER = "MODIFY_MEMBER";

    public static final String COL_MODIFY_DATE = "MODIFY_DATE";

    public static final String COL_SUMMARY = "SUMMARY";

    public static final String COL_WORKFLOW_ID = "WORKFLOW_ID";

    public static final String COL_BODY = "BODY";

    public static final String COL_BODY_TYPE = "BODY_TYPE";

    public static final String COL_STATE = "STATE";

    public static final String COL_IS_DELETE = "IS_DELETE";

    public static final String COL_DESCRIPTION = "DESCRIPTION";

    public static final String COL_ORG_ACCOUNT_ID = "ORG_ACCOUNT_ID";

    public static final String COL_IDENTIFIER = "IDENTIFIER";

    public static final String COL_PROJECT_ID = "PROJECT_ID";

    public static final String COL_FORM_PARENTID = "FORM_PARENTID";

    public static final String COL_TEMPLETE_NUMBER = "TEMPLETE_NUMBER";

    public static final String COL_COL_SUBJECT = "COL_SUBJECT";

    public static final String COL_STANDARD_DURATION = "STANDARD_DURATION";

    public static final String COL_SORT = "SORT";

    public static final String COL_CAN_SUPERVISE = "CAN_SUPERVISE";

    public static final String COL_CAN_TRACK_WORKFLOW = "CAN_TRACK_WORKFLOW";

    public static final String COL_SECRET_RELATED_LEVEL = "secret_related_level";

    public static final String COL_MARK_INFO = "MARK_INFO";

    public static final String COL_TAOHONG_TEMPLETE = "TAOHONG_TEMPLETE";

    public static final String COL_SECRET_LEVEL = "SECRET_LEVEL";
}