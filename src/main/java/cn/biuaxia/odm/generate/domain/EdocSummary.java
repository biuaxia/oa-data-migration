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
@TableName(value = "EDOC_SUMMARY")
public class EdocSummary implements Serializable {

    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "IDENTIFIER")
    private String identifier;

    @TableField(value = "HAS_ARCHIVE")
    private Short hasArchive;

    @TableField(value = "EDOC_TYPE")
    private Short edocType;

    @TableField(value = "DEADLINE")
    private Long deadline;

    @TableField(value = "CAN_TRACK")
    private Short canTrack;

    @TableField(value = "COMMENTS")
    private String comments;

    @TableField(value = "PROCESS_ID")
    private String processId;

    @TableField(value = "CASE_ID")
    private Long caseId;

    @TableField(value = "FORM_ID")
    private Long formId;

    @TableField(value = "CREATE_TIME")
    private Date createTime;

    @TableField(value = "START_USER_ID")
    private Long startUserId;

    @TableField(value = "START_TIME")
    private Date startTime;

    @TableField(value = "CREATE_PERSON")
    private String createPerson;

    @TableField(value = "COMPLETE_TIME")
    private Date completeTime;

    @TableField(value = "`STATE`")
    private Short state;

    @TableField(value = "SUBJECT")
    private String subject;

    @TableField(value = "DOC_TYPE")
    private String docType;

    @TableField(value = "SEND_TYPE")
    private String sendType;

    @TableField(value = "DOC_MARK")
    private String docMark;

    @TableField(value = "SERIAL_NO")
    private String serialNo;

    @TableField(value = "SECRET_LEVEL")
    private String secretLevel;

    @TableField(value = "URGENT_LEVEL")
    private String urgentLevel;

    @TableField(value = "SEND_UNIT")
    private String sendUnit;

    @TableField(value = "SEND_UNIT_ID")
    private String sendUnitId;

    @TableField(value = "ISSUER")
    private String issuer;

    @TableField(value = "SIGNING_DATE")
    private Date signingDate;

    @TableField(value = "SEND_TO")
    private String sendTo;

    @TableField(value = "SEND_TO_ID")
    private String sendToId;

    @TableField(value = "COPY_TO")
    private String copyTo;

    @TableField(value = "COPY_TO_ID")
    private String copyToId;

    @TableField(value = "REPORT_TO")
    private String reportTo;

    @TableField(value = "REPORT_TO_ID")
    private String reportToId;

    @TableField(value = "KEYWORDS")
    private String keywords;

    @TableField(value = "PRINT_UNIT")
    private String printUnit;

    @TableField(value = "COPIES")
    private Integer copies;

    @TableField(value = "PRINTER")
    private String printer;

    @TableField(value = "ADVANCE_REMIND")
    private Long advanceRemind;

    @TableField(value = "TEMPLETE_ID")
    private Long templeteId;

    @TableField(value = "WORKFLOW_RULE")
    private String workflowRule;

    @TableField(value = "PACK_DATE")
    private Date packDate;

    @TableField(value = "ISUNIT")
    private Short isunit;

    @TableField(value = "DOC_MARK2")
    private String docMark2;

    @TableField(value = "SEND_UNIT2")
    private String sendUnit2;

    @TableField(value = "SEND_UNIT_ID2")
    private String sendUnitId2;

    @TableField(value = "SEND_TO2")
    private String sendTo2;

    @TableField(value = "SEND_TO_ID2")
    private String sendToId2;

    @TableField(value = "COPY_TO2")
    private String copyTo2;

    @TableField(value = "COPY_TO_ID2")
    private String copyToId2;

    @TableField(value = "REPORT_TO2")
    private String reportTo2;

    @TableField(value = "REPORT_TO_ID2")
    private String reportToId2;

    @TableField(value = "COPIES2")
    private Integer copies2;

    @TableField(value = "ORG_DEPARTMENT_ID")
    private Long orgDepartmentId;

    @TableField(value = "ORG_ACCOUNT_ID")
    private Long orgAccountId;

    @TableField(value = "UPDATE_TIME")
    private Date updateTime;

    @TableField(value = "ARCHIVE_ID")
    private Long archiveId;

    @TableField(value = "PROCESS_TYPE")
    private Long processType;

    @TableField(value = "SUB_EDOC_TYPE")
    private Long subEdocType;

    @TableField(value = "FILESM")
    private String filesm;

    @TableField(value = "FILEFZ")
    private String filefz;

    @TableField(value = "PARTY")
    private String party;

    @TableField(value = "ADMINISTRATIVE")
    private String administrative;

    @TableField(value = "SEND_DEPARTMENT")
    private String sendDepartment;

    @TableField(value = "SEND_DEPARTMENT2")
    private String sendDepartment2;

    @TableField(value = "SEND_DEPARTMENT_ID")
    private String sendDepartmentId;

    @TableField(value = "SEND_DEPARTMENT_ID2")
    private String sendDepartmentId2;

    @TableField(value = "ATTACHMENTS")
    private String attachments;

    @TableField(value = "OVER_WORKTIME")
    private Long overWorktime;

    @TableField(value = "RUN_WORKTIME")
    private Long runWorktime;

    @TableField(value = "OVER_TIME")
    private Long overTime;

    @TableField(value = "RUN_TIME")
    private Long runTime;

    @TableField(value = "KEEP_PERIOD")
    private Integer keepPeriod;

    @TableField(value = "IS_COVER_TIME")
    private Short isCoverTime;

    @TableField(value = "RECEIPT_DATE")
    private Date receiptDate;

    @TableField(value = "REGISTRATION_DATE")
    private Date registrationDate;

    @TableField(value = "AUDITOR")
    private String auditor;

    @TableField(value = "REVIEW")
    private String review;

    @TableField(value = "UNDERTAKER")
    private String undertaker;

    @TableField(value = "PHONE")
    private String phone;

    @TableField(value = "DEADLINE_DATETIME")
    private Date deadlineDatetime;

    @TableField(value = "IS_QUICK_SEND")
    private Short isQuickSend;

    @TableField(value = "CURRENT_NODES_INFO")
    private String currentNodesInfo;

    @TableField(value = "UNDERTAKENOFFICE")
    private String undertakenoffice;

    @TableField(value = "UNDERTAKENOFFICE_ID")
    private String undertakenofficeId;

    @TableField(value = "UNIT_LEVEL")
    private String unitLevel;

    @TableField(value = "govcode")
    private String govcode;

    @TableField(value = "secret_related_level")
    private Short secretRelatedLevel;

    @TableField(value = "TRANSFER_STATUS")
    private Short transferStatus;

    @TableField(value = "govdoc_type")
    private Integer govdocType;

    @TableField(value = "sign_person")
    private String signPerson;

    @TableField(value = "sign_Account_Id")
    private String signAccountId;

    @TableField(value = "EDOC_SECRET_LEVEL")
    private Short edocSecretLevel;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_IDENTIFIER = "IDENTIFIER";

    public static final String COL_HAS_ARCHIVE = "HAS_ARCHIVE";

    public static final String COL_EDOC_TYPE = "EDOC_TYPE";

    public static final String COL_DEADLINE = "DEADLINE";

    public static final String COL_CAN_TRACK = "CAN_TRACK";

    public static final String COL_COMMENTS = "COMMENTS";

    public static final String COL_PROCESS_ID = "PROCESS_ID";

    public static final String COL_CASE_ID = "CASE_ID";

    public static final String COL_FORM_ID = "FORM_ID";

    public static final String COL_CREATE_TIME = "CREATE_TIME";

    public static final String COL_START_USER_ID = "START_USER_ID";

    public static final String COL_START_TIME = "START_TIME";

    public static final String COL_CREATE_PERSON = "CREATE_PERSON";

    public static final String COL_COMPLETE_TIME = "COMPLETE_TIME";

    public static final String COL_STATE = "STATE";

    public static final String COL_SUBJECT = "SUBJECT";

    public static final String COL_DOC_TYPE = "DOC_TYPE";

    public static final String COL_SEND_TYPE = "SEND_TYPE";

    public static final String COL_DOC_MARK = "DOC_MARK";

    public static final String COL_SERIAL_NO = "SERIAL_NO";

    public static final String COL_SECRET_LEVEL = "SECRET_LEVEL";

    public static final String COL_URGENT_LEVEL = "URGENT_LEVEL";

    public static final String COL_SEND_UNIT = "SEND_UNIT";

    public static final String COL_SEND_UNIT_ID = "SEND_UNIT_ID";

    public static final String COL_ISSUER = "ISSUER";

    public static final String COL_SIGNING_DATE = "SIGNING_DATE";

    public static final String COL_SEND_TO = "SEND_TO";

    public static final String COL_SEND_TO_ID = "SEND_TO_ID";

    public static final String COL_COPY_TO = "COPY_TO";

    public static final String COL_COPY_TO_ID = "COPY_TO_ID";

    public static final String COL_REPORT_TO = "REPORT_TO";

    public static final String COL_REPORT_TO_ID = "REPORT_TO_ID";

    public static final String COL_KEYWORDS = "KEYWORDS";

    public static final String COL_PRINT_UNIT = "PRINT_UNIT";

    public static final String COL_COPIES = "COPIES";

    public static final String COL_PRINTER = "PRINTER";

    public static final String COL_ADVANCE_REMIND = "ADVANCE_REMIND";

    public static final String COL_TEMPLETE_ID = "TEMPLETE_ID";

    public static final String COL_WORKFLOW_RULE = "WORKFLOW_RULE";

    public static final String COL_PACK_DATE = "PACK_DATE";

    public static final String COL_ISUNIT = "ISUNIT";

    public static final String COL_DOC_MARK2 = "DOC_MARK2";

    public static final String COL_SEND_UNIT2 = "SEND_UNIT2";

    public static final String COL_SEND_UNIT_ID2 = "SEND_UNIT_ID2";

    public static final String COL_SEND_TO2 = "SEND_TO2";

    public static final String COL_SEND_TO_ID2 = "SEND_TO_ID2";

    public static final String COL_COPY_TO2 = "COPY_TO2";

    public static final String COL_COPY_TO_ID2 = "COPY_TO_ID2";

    public static final String COL_REPORT_TO2 = "REPORT_TO2";

    public static final String COL_REPORT_TO_ID2 = "REPORT_TO_ID2";

    public static final String COL_COPIES2 = "COPIES2";

    public static final String COL_ORG_DEPARTMENT_ID = "ORG_DEPARTMENT_ID";

    public static final String COL_ORG_ACCOUNT_ID = "ORG_ACCOUNT_ID";

    public static final String COL_UPDATE_TIME = "UPDATE_TIME";

    public static final String COL_ARCHIVE_ID = "ARCHIVE_ID";

    public static final String COL_PROCESS_TYPE = "PROCESS_TYPE";

    public static final String COL_SUB_EDOC_TYPE = "SUB_EDOC_TYPE";

    public static final String COL_FILESM = "FILESM";

    public static final String COL_FILEFZ = "FILEFZ";

    public static final String COL_PARTY = "PARTY";

    public static final String COL_ADMINISTRATIVE = "ADMINISTRATIVE";

    public static final String COL_SEND_DEPARTMENT = "SEND_DEPARTMENT";

    public static final String COL_SEND_DEPARTMENT2 = "SEND_DEPARTMENT2";

    public static final String COL_SEND_DEPARTMENT_ID = "SEND_DEPARTMENT_ID";

    public static final String COL_SEND_DEPARTMENT_ID2 = "SEND_DEPARTMENT_ID2";

    public static final String COL_ATTACHMENTS = "ATTACHMENTS";

    public static final String COL_OVER_WORKTIME = "OVER_WORKTIME";

    public static final String COL_RUN_WORKTIME = "RUN_WORKTIME";

    public static final String COL_OVER_TIME = "OVER_TIME";

    public static final String COL_RUN_TIME = "RUN_TIME";

    public static final String COL_KEEP_PERIOD = "KEEP_PERIOD";

    public static final String COL_IS_COVER_TIME = "IS_COVER_TIME";

    public static final String COL_RECEIPT_DATE = "RECEIPT_DATE";

    public static final String COL_REGISTRATION_DATE = "REGISTRATION_DATE";

    public static final String COL_AUDITOR = "AUDITOR";

    public static final String COL_REVIEW = "REVIEW";

    public static final String COL_UNDERTAKER = "UNDERTAKER";

    public static final String COL_PHONE = "PHONE";

    public static final String COL_DEADLINE_DATETIME = "DEADLINE_DATETIME";

    public static final String COL_IS_QUICK_SEND = "IS_QUICK_SEND";

    public static final String COL_CURRENT_NODES_INFO = "CURRENT_NODES_INFO";

    public static final String COL_UNDERTAKENOFFICE = "UNDERTAKENOFFICE";

    public static final String COL_UNDERTAKENOFFICE_ID = "UNDERTAKENOFFICE_ID";

    public static final String COL_UNIT_LEVEL = "UNIT_LEVEL";

    public static final String COL_GOVCODE = "govcode";

    public static final String COL_SECRET_RELATED_LEVEL = "secret_related_level";

    public static final String COL_TRANSFER_STATUS = "TRANSFER_STATUS";

    public static final String COL_GOVDOC_TYPE = "govdoc_type";

    public static final String COL_SIGN_PERSON = "sign_person";

    public static final String COL_SIGN_ACCOUNT_ID = "sign_Account_Id";

    public static final String COL_EDOC_SECRET_LEVEL = "EDOC_SECRET_LEVEL";
}