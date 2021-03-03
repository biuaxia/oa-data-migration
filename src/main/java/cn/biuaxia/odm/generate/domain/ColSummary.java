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
@TableName(value = "COL_SUMMARY")
public class ColSummary implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "`STATE`")
    private Short state;

    @TableField(value = "SUBJECT")
    private String subject;

    @TableField(value = "DEADLINE")
    private Long deadline;

    @TableField(value = "COL_TYPE")
    private Short colType;

    @TableField(value = "CAN_ARCHIVE")
    private Short canArchive;

    @TableField(value = "CAN_MODIFY")
    private Short canModify;

    @TableField(value = "CAN_DUE_REMINDER")
    private Short canDueReminder;

    @TableField(value = "CAN_FORWARD")
    private Short canForward;

    @TableField(value = "CAN_EDIT")
    private Short canEdit;

    @TableField(value = "CAN_TRACK")
    private Short canTrack;

    @TableField(value = "REMIND_INTERVAL")
    private Long remindInterval;

    @TableField(value = "PROJECT_ID")
    private Long projectId;

    @TableField(value = "IMPORTANT_LEVEL")
    private Short importantLevel;

    @TableField(value = "RESENT_TIME")
    private Short resentTime;

    @TableField(value = "CREATE_DATE")
    private Date createDate;

    @TableField(value = "START_DATE")
    private Date startDate;

    @TableField(value = "FINISH_DATE")
    private Date finishDate;

    @TableField(value = "IS_AUDITED")
    private Short isAudited;

    @TableField(value = "ARCHIVE_ID")
    private Long archiveId;

    @TableField(value = "START_MEMBER_ID")
    private Long startMemberId;

    @TableField(value = "PROCESS_ID")
    private String processId;

    @TableField(value = "CASE_ID")
    private Long caseId;

    @TableField(value = "ADVANCE_REMIND")
    private Long advanceRemind;

    @TableField(value = "IDENTIFIER")
    private String identifier;

    @TableField(value = "FORWARD_MEMBER")
    private String forwardMember;

    @TableField(value = "TEMPLETE_ID")
    private Long templeteId;

    @TableField(value = "WORKFLOW_RULE")
    private String workflowRule;

    @TableField(value = "WEBSERVICE_CODE")
    private String webserviceCode;

    @TableField(value = "BODY_TYPE")
    private String bodyType;

    @TableField(value = "FORM_RECORDID")
    private Long formRecordid;

    @TableField(value = "FORMID")
    private Long formid;

    @TableField(value = "FORM_APPID")
    private Long formAppid;

    @TableField(value = "ORG_DEPARTMENT_ID")
    private Long orgDepartmentId;

    @TableField(value = "ORG_ACCOUNT_ID")
    private Long orgAccountId;

    @TableField(value = "`SOURCE`")
    private String source;

    @TableField(value = "PARENTFORM_SUMMARYID")
    private Long parentformSummaryid;

    @TableField(value = "NEWFLOW_TYPE")
    private Short newflowType;

    @TableField(value = "CAN_EDIT_ATTACHMENT")
    private Short canEditAttachment;

    @TableField(value = "VOUCH")
    private Short vouch;

    @TableField(value = "OVER_WORKTIME")
    private Long overWorktime;

    @TableField(value = "RUN_WORKTIME")
    private Long runWorktime;

    @TableField(value = "OVER_TIME")
    private Long overTime;

    @TableField(value = "RUN_TIME")
    private Long runTime;

    @TableField(value = "CAN_AUTOSTOPFLOW")
    private Short canAutostopflow;

    @TableField(value = "IS_COVER_TIME")
    private Short isCoverTime;

    @TableField(value = "DEADLINE_DATETIME")
    private Date deadlineDatetime;

    @TableField(value = "CURRENT_NODES_INFO")
    private String currentNodesInfo;

    @TableField(value = "CAN_MERGE_DEAL")
    private Short canMergeDeal;

    @TableField(value = "ADVANCE_PIGEONHOLE")
    private String advancePigeonhole;

    @TableField(value = "secret_related_level")
    private Short secretRelatedLevel;

    @TableField(value = "GOVDOC_TYPE")
    private String govdocType;

    @TableField(value = "is_quick_send")
    private Short isQuickSend;

    @TableField(value = "SECRET_LEVEL")
    private Short secretLevel;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_STATE = "STATE";

    public static final String COL_SUBJECT = "SUBJECT";

    public static final String COL_DEADLINE = "DEADLINE";

    public static final String COL_COL_TYPE = "COL_TYPE";

    public static final String COL_CAN_ARCHIVE = "CAN_ARCHIVE";

    public static final String COL_CAN_MODIFY = "CAN_MODIFY";

    public static final String COL_CAN_DUE_REMINDER = "CAN_DUE_REMINDER";

    public static final String COL_CAN_FORWARD = "CAN_FORWARD";

    public static final String COL_CAN_EDIT = "CAN_EDIT";

    public static final String COL_CAN_TRACK = "CAN_TRACK";

    public static final String COL_REMIND_INTERVAL = "REMIND_INTERVAL";

    public static final String COL_PROJECT_ID = "PROJECT_ID";

    public static final String COL_IMPORTANT_LEVEL = "IMPORTANT_LEVEL";

    public static final String COL_RESENT_TIME = "RESENT_TIME";

    public static final String COL_CREATE_DATE = "CREATE_DATE";

    public static final String COL_START_DATE = "START_DATE";

    public static final String COL_FINISH_DATE = "FINISH_DATE";

    public static final String COL_IS_AUDITED = "IS_AUDITED";

    public static final String COL_ARCHIVE_ID = "ARCHIVE_ID";

    public static final String COL_START_MEMBER_ID = "START_MEMBER_ID";

    public static final String COL_PROCESS_ID = "PROCESS_ID";

    public static final String COL_CASE_ID = "CASE_ID";

    public static final String COL_ADVANCE_REMIND = "ADVANCE_REMIND";

    public static final String COL_IDENTIFIER = "IDENTIFIER";

    public static final String COL_FORWARD_MEMBER = "FORWARD_MEMBER";

    public static final String COL_TEMPLETE_ID = "TEMPLETE_ID";

    public static final String COL_WORKFLOW_RULE = "WORKFLOW_RULE";

    public static final String COL_WEBSERVICE_CODE = "WEBSERVICE_CODE";

    public static final String COL_BODY_TYPE = "BODY_TYPE";

    public static final String COL_FORM_RECORDID = "FORM_RECORDID";

    public static final String COL_FORMID = "FORMID";

    public static final String COL_FORM_APPID = "FORM_APPID";

    public static final String COL_ORG_DEPARTMENT_ID = "ORG_DEPARTMENT_ID";

    public static final String COL_ORG_ACCOUNT_ID = "ORG_ACCOUNT_ID";

    public static final String COL_SOURCE = "SOURCE";

    public static final String COL_PARENTFORM_SUMMARYID = "PARENTFORM_SUMMARYID";

    public static final String COL_NEWFLOW_TYPE = "NEWFLOW_TYPE";

    public static final String COL_CAN_EDIT_ATTACHMENT = "CAN_EDIT_ATTACHMENT";

    public static final String COL_VOUCH = "VOUCH";

    public static final String COL_OVER_WORKTIME = "OVER_WORKTIME";

    public static final String COL_RUN_WORKTIME = "RUN_WORKTIME";

    public static final String COL_OVER_TIME = "OVER_TIME";

    public static final String COL_RUN_TIME = "RUN_TIME";

    public static final String COL_CAN_AUTOSTOPFLOW = "CAN_AUTOSTOPFLOW";

    public static final String COL_IS_COVER_TIME = "IS_COVER_TIME";

    public static final String COL_DEADLINE_DATETIME = "DEADLINE_DATETIME";

    public static final String COL_CURRENT_NODES_INFO = "CURRENT_NODES_INFO";

    public static final String COL_CAN_MERGE_DEAL = "CAN_MERGE_DEAL";

    public static final String COL_ADVANCE_PIGEONHOLE = "ADVANCE_PIGEONHOLE";

    public static final String COL_SECRET_RELATED_LEVEL = "secret_related_level";

    public static final String COL_GOVDOC_TYPE = "GOVDOC_TYPE";

    public static final String COL_IS_QUICK_SEND = "is_quick_send";

    public static final String COL_SECRET_LEVEL = "SECRET_LEVEL";
}