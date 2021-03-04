package cn.biuaxia.odm.generate.domain;

import cn.hutool.core.util.IdUtil;
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
@TableName(value = "km_imissive_send_main")
public class KmImissiveSendMain implements Serializable {

    @TableId(value = "fd_id", type = IdType.INPUT)
    private String fdId;

    @TableField(value = "fd_is_topiced")
    private Boolean fdIsTopiced;

    @TableField(value = "fd_is_supervised")
    private Boolean fdIsSupervised;

    @TableField(value = "fd_supervise_flag")
    private Boolean fdSuperviseFlag;

    @TableField(value = "fd_is_advice")
    private Boolean fdIsAdvice;

    @TableField(value = "fd_is_public")
    private Boolean fdIsPublic;

    @TableField(value = "fd_reserve_one")
    private String fdReserveOne;

    @TableField(value = "fd_reserve_two")
    private String fdReserveTwo;

    @TableField(value = "fd_reserve_three")
    private String fdReserveThree;

    @TableField(value = "doc_delete_flag")
    private Integer docDeleteFlag;

    @TableField(value = "doc_delete_time")
    private Date docDeleteTime;

    @TableField(value = "doc_delete_by")
    private String docDeleteBy;

    @TableField(value = "fd_reserve_four")
    private String fdReserveFour;

    @TableField(value = "fd_reserve_five")
    private String fdReserveFive;

    @TableField(value = "fd_isfrom_out")
    private Boolean fdIsfromOut;

    @TableField(value = "fd_old_data")
    private Boolean fdOldData;

    @TableField(value = "fd_main_id")
    private String fdMainId;

    @TableField(value = "fd_need_content")
    private String fdNeedContent;

    @TableField(value = "fd_detail_id")
    private String fdDetailId;

    @TableField(value = "fd_readsend_opinion")
    private Boolean fdReadsendOpinion;

    @TableField(value = "doc_subject")
    private String docSubject;

    @TableField(value = "fd_template_id")
    private String fdTemplateId;

    @TableField(value = "fd_number_main_id")
    private String fdNumberMainId;

    @TableField(value = "fd_missive_type")
    private String fdMissiveType;

    @TableField(value = "fd_auto_deliver")
    private String fdAutoDeliver;

    @TableField(value = "fd_is_joint")
    private String fdIsJoint;

    @TableField(value = "fd_table_head")
    private String fdTableHead;

    @TableField(value = "fd_doc_num")
    private String fdDocNum;

    @TableField(value = "fd_doc_flow")
    private String fdDocFlow;

    @TableField(value = "fd_flow_no")
    private String fdFlowNo;

    @TableField(value = "fd_no_rule")
    private String fdNoRule;

    @TableField(value = "fd_content")
    private String fdContent;

    @TableField(value = "fd_use_form")
    private Boolean fdUseForm;

    @TableField(value = "extend_file_path")
    private String extendFilePath;

    @TableField(value = "extend_data_xml")
    private String extendDataXml;

    @TableField(value = "doc_read_count")
    private Long docReadCount;

    @TableField(value = "auth_att_nodownload")
    private Boolean authAttNodownload;

    @TableField(value = "auth_att_nocopy")
    private Boolean authAttNocopy;

    @TableField(value = "auth_att_noprint")
    private Boolean authAttNoprint;

    @TableField(value = "auth_reader_flag")
    private Boolean authReaderFlag;

    @TableField(value = "doc_status")
    private String docStatus;

    @TableField(value = "doc_alter_time")
    private Date docAlterTime;

    @TableField(value = "doc_publish_time")
    private Date docPublishTime;

    @TableField(value = "doc_publish_time_upper")
    private String docPublishTimeUpper;

    @TableField(value = "doc_publish_time_num")
    private String docPublishTimeNum;

    @TableField(value = "doc_create_time")
    private Date docCreateTime;

    @TableField(value = "fd_dead_time")
    private Date fdDeadTime;

    @TableField(value = "fd_model_name")
    private String fdModelName;

    @TableField(value = "fd_model_id")
    private String fdModelId;

    @TableField(value = "fd_is_filing")
    private Boolean fdIsFiling;

    @TableField(value = "fd_filing_time")
    private Date fdFilingTime;

    @TableField(value = "fd_change_reader_flag")
    private Boolean fdChangeReaderFlag;

    @TableField(value = "fd_rbp_flag")
    private Boolean fdRbpFlag;

    @TableField(value = "fd_change_att")
    private Boolean fdChangeAtt;

    @TableField(value = "fd_print_num")
    private Integer fdPrintNum;

    @TableField(value = "fd_print_page_num")
    private Integer fdPrintPageNum;

    @TableField(value = "fd_draft_time")
    private Date fdDraftTime;

    @TableField(value = "fd_draft_dept_id")
    private String fdDraftDeptId;

    @TableField(value = "fd_report_status")
    private String fdReportStatus;

    @TableField(value = "fd_is_change_pdf")
    private String fdIsChangePdf;

    @TableField(value = "fd_last_modified_time")
    private Date fdLastModifiedTime;

    @TableField(value = "fd_distribute_time")
    private Date fdDistributeTime;

    @TableField(value = "fd_report_time")
    private Date fdReportTime;

    @TableField(value = "fd_version")
    private String fdVersion;

    @TableField(value = "fd_level")
    private String fdLevel;

    @TableField(value = "fd_secret_year")
    private String fdSecretYear;

    @TableField(value = "fd_print_time")
    private Date fdPrintTime;

    @TableField(value = "fd_print_unit_id")
    private String fdPrintUnitId;

    @TableField(value = "fd_draft_unit_id")
    private String fdDraftUnitId;

    @TableField(value = "fd_draft_id")
    private String fdDraftId;

    @TableField(value = "fd_signature_id")
    private String fdSignatureId;

    @TableField(value = "fd_distributer_id")
    private String fdDistributerId;

    @TableField(value = "fd_reporter_id")
    private String fdReporterId;

    @TableField(value = "fd_check_id")
    private String fdCheckId;

    @TableField(value = "fd_filinger_id")
    private String fdFilingerId;

    @TableField(value = "doc_create_id")
    private String docCreateId;

    @TableField(value = "fd_secret_grade")
    private String fdSecretGrade;

    @TableField(value = "fd_emergency_grade")
    private String fdEmergencyGrade;

    @TableField(value = "fd_doc_type")
    private String fdDocType;

    @TableField(value = "fd_secret_grade_str")
    private String fdSecretGradeStr;

    @TableField(value = "fd_emergency_grade_str")
    private String fdEmergencyGradeStr;

    @TableField(value = "fd_doc_type_str")
    private String fdDocTypeStr;

    @TableField(value = "fd_sendto_unit")
    private String fdSendtoUnit;

    @TableField(value = "doc_alteror_id")
    private String docAlterorId;

    @TableField(value = "auth_area_id")
    private String authAreaId;

    private static final long serialVersionUID = 1L;

    public static final String COL_FD_ID = "fd_id";

    public static final String COL_FD_IS_TOPICED = "fd_is_topiced";

    public static final String COL_FD_IS_SUPERVISED = "fd_is_supervised";

    public static final String COL_FD_SUPERVISE_FLAG = "fd_supervise_flag";

    public static final String COL_FD_IS_ADVICE = "fd_is_advice";

    public static final String COL_FD_IS_PUBLIC = "fd_is_public";

    public static final String COL_FD_RESERVE_ONE = "fd_reserve_one";

    public static final String COL_FD_RESERVE_TWO = "fd_reserve_two";

    public static final String COL_FD_RESERVE_THREE = "fd_reserve_three";

    public static final String COL_DOC_DELETE_FLAG = "doc_delete_flag";

    public static final String COL_DOC_DELETE_TIME = "doc_delete_time";

    public static final String COL_DOC_DELETE_BY = "doc_delete_by";

    public static final String COL_FD_RESERVE_FOUR = "fd_reserve_four";

    public static final String COL_FD_RESERVE_FIVE = "fd_reserve_five";

    public static final String COL_FD_ISFROM_OUT = "fd_isfrom_out";

    public static final String COL_FD_OLD_DATA = "fd_old_data";

    public static final String COL_FD_MAIN_ID = "fd_main_id";

    public static final String COL_FD_NEED_CONTENT = "fd_need_content";

    public static final String COL_FD_DETAIL_ID = "fd_detail_id";

    public static final String COL_FD_READSEND_OPINION = "fd_readsend_opinion";

    public static final String COL_DOC_SUBJECT = "doc_subject";

    public static final String COL_FD_TEMPLATE_ID = "fd_template_id";

    public static final String COL_FD_NUMBER_MAIN_ID = "fd_number_main_id";

    public static final String COL_FD_MISSIVE_TYPE = "fd_missive_type";

    public static final String COL_FD_AUTO_DELIVER = "fd_auto_deliver";

    public static final String COL_FD_IS_JOINT = "fd_is_joint";

    public static final String COL_FD_TABLE_HEAD = "fd_table_head";

    public static final String COL_FD_DOC_NUM = "fd_doc_num";

    public static final String COL_FD_DOC_FLOW = "fd_doc_flow";

    public static final String COL_FD_FLOW_NO = "fd_flow_no";

    public static final String COL_FD_NO_RULE = "fd_no_rule";

    public static final String COL_FD_CONTENT = "fd_content";

    public static final String COL_FD_USE_FORM = "fd_use_form";

    public static final String COL_EXTEND_FILE_PATH = "extend_file_path";

    public static final String COL_EXTEND_DATA_XML = "extend_data_xml";

    public static final String COL_DOC_READ_COUNT = "doc_read_count";

    public static final String COL_AUTH_ATT_NODOWNLOAD = "auth_att_nodownload";

    public static final String COL_AUTH_ATT_NOCOPY = "auth_att_nocopy";

    public static final String COL_AUTH_ATT_NOPRINT = "auth_att_noprint";

    public static final String COL_AUTH_READER_FLAG = "auth_reader_flag";

    public static final String COL_DOC_STATUS = "doc_status";

    public static final String COL_DOC_ALTER_TIME = "doc_alter_time";

    public static final String COL_DOC_PUBLISH_TIME = "doc_publish_time";

    public static final String COL_DOC_PUBLISH_TIME_UPPER = "doc_publish_time_upper";

    public static final String COL_DOC_PUBLISH_TIME_NUM = "doc_publish_time_num";

    public static final String COL_DOC_CREATE_TIME = "doc_create_time";

    public static final String COL_FD_DEAD_TIME = "fd_dead_time";

    public static final String COL_FD_MODEL_NAME = "fd_model_name";

    public static final String COL_FD_MODEL_ID = "fd_model_id";

    public static final String COL_FD_IS_FILING = "fd_is_filing";

    public static final String COL_FD_FILING_TIME = "fd_filing_time";

    public static final String COL_FD_CHANGE_READER_FLAG = "fd_change_reader_flag";

    public static final String COL_FD_RBP_FLAG = "fd_rbp_flag";

    public static final String COL_FD_CHANGE_ATT = "fd_change_att";

    public static final String COL_FD_PRINT_NUM = "fd_print_num";

    public static final String COL_FD_PRINT_PAGE_NUM = "fd_print_page_num";

    public static final String COL_FD_DRAFT_TIME = "fd_draft_time";

    public static final String COL_FD_DRAFT_DEPT_ID = "fd_draft_dept_id";

    public static final String COL_FD_REPORT_STATUS = "fd_report_status";

    public static final String COL_FD_IS_CHANGE_PDF = "fd_is_change_pdf";

    public static final String COL_FD_LAST_MODIFIED_TIME = "fd_last_modified_time";

    public static final String COL_FD_DISTRIBUTE_TIME = "fd_distribute_time";

    public static final String COL_FD_REPORT_TIME = "fd_report_time";

    public static final String COL_FD_VERSION = "fd_version";

    public static final String COL_FD_LEVEL = "fd_level";

    public static final String COL_FD_SECRET_YEAR = "fd_secret_year";

    public static final String COL_FD_PRINT_TIME = "fd_print_time";

    public static final String COL_FD_PRINT_UNIT_ID = "fd_print_unit_id";

    public static final String COL_FD_DRAFT_UNIT_ID = "fd_draft_unit_id";

    public static final String COL_FD_DRAFT_ID = "fd_draft_id";

    public static final String COL_FD_SIGNATURE_ID = "fd_signature_id";

    public static final String COL_FD_DISTRIBUTER_ID = "fd_distributer_id";

    public static final String COL_FD_REPORTER_ID = "fd_reporter_id";

    public static final String COL_FD_CHECK_ID = "fd_check_id";

    public static final String COL_FD_FILINGER_ID = "fd_filinger_id";

    public static final String COL_DOC_CREATE_ID = "doc_create_id";

    public static final String COL_FD_SECRET_GRADE = "fd_secret_grade";

    public static final String COL_FD_EMERGENCY_GRADE = "fd_emergency_grade";

    public static final String COL_FD_DOC_TYPE = "fd_doc_type";

    public static final String COL_FD_SECRET_GRADE_STR = "fd_secret_grade_str";

    public static final String COL_FD_EMERGENCY_GRADE_STR = "fd_emergency_grade_str";

    public static final String COL_FD_DOC_TYPE_STR = "fd_doc_type_str";

    public static final String COL_FD_SENDTO_UNIT = "fd_sendto_unit";

    public static final String COL_DOC_ALTEROR_ID = "doc_alteror_id";

    public static final String COL_AUTH_AREA_ID = "auth_area_id";

    public static KmImissiveSendMain build(EdocSummary edocSummary) {
        return KmImissiveSendMain.builder()
                .fdId(IdUtil.fastSimpleUUID())
                .docSubject(edocSummary.getSubject())
                .fdDocNum(edocSummary.getDocMark())

                .docCreateTime(edocSummary.getCreateTime())
                .fdLastModifiedTime(edocSummary.getUpdateTime())
                .build();
    }

}