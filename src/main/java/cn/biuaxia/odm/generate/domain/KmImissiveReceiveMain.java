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
@TableName(value = "km_imissive_receive_main")
public class KmImissiveReceiveMain implements Serializable {
    @TableId(value = "fd_id", type = IdType.INPUT)
    private String fdId;

    @TableField(value = "fd_is_topiced")
    private Boolean fdIsTopiced;

    @TableField(value = "fd_is_supervised")
    private Boolean fdIsSupervised;

    @TableField(value = "fd_supervise_flag")
    private Boolean fdSuperviseFlag;

    @TableField(value = "fd_reserve_one")
    private String fdReserveOne;

    @TableField(value = "fd_reserve_two")
    private String fdReserveTwo;

    @TableField(value = "doc_delete_flag")
    private Integer docDeleteFlag;

    @TableField(value = "doc_delete_time")
    private Date docDeleteTime;

    @TableField(value = "doc_delete_by")
    private String docDeleteBy;

    @TableField(value = "fd_reserve_three")
    private String fdReserveThree;

    @TableField(value = "fd_reserve_four")
    private String fdReserveFour;

    @TableField(value = "fd_reserve_five")
    private String fdReserveFive;

    @TableField(value = "fd_isfrom_out")
    private Boolean fdIsfromOut;

    @TableField(value = "fd_is_change_pdf")
    private String fdIsChangePdf;

    @TableField(value = "fd_old_data")
    private Boolean fdOldData;

    @TableField(value = "fd_main_id")
    private String fdMainId;

    @TableField(value = "fd_need_content")
    private String fdNeedContent;

    @TableField(value = "fd_detail_id")
    private String fdDetailId;

    @TableField(value = "fd_third_id")
    private String fdThirdId;

    @TableField(value = "fd_is_advice")
    private Boolean fdIsAdvice;

    @TableField(value = "fd_is_return")
    private Boolean fdIsReturn;

    @TableField(value = "fd_is_writesignopinion")
    private Boolean fdIsWritesignopinion;

    @TableField(value = "fd_readsend_opinion")
    private Boolean fdReadsendOpinion;

    @TableField(value = "fd_deliver_type")
    private String fdDeliverType;

    @TableField(value = "fd_receive_time")
    private Date fdReceiveTime;

    @TableField(value = "fd_receive_num")
    private String fdReceiveNum;

    @TableField(value = "fd_doc_flow")
    private String fdDocFlow;

    @TableField(value = "fd_flow_no")
    private String fdFlowNo;

    @TableField(value = "fd_no_rule")
    private String fdNoRule;

    @TableField(value = "fd_record_time")
    private Date fdRecordTime;

    @TableField(value = "fd_sign_time")
    private Date fdSignTime;

    @TableField(value = "fd_out_sendto")
    private String fdOutSendto;

    @TableField(value = "fd_share_num")
    private Integer fdShareNum;

    @TableField(value = "fd_last_modified_time")
    private Date fdLastModifiedTime;

    @TableField(value = "fd_recorder")
    private String fdRecorder;

    @TableField(value = "fd_signer")
    private String fdSigner;

    @TableField(value = "fd_receive_unit")
    private String fdReceiveUnit;

    @TableField(value = "auth_area_id")
    private String authAreaId;

    @TableField(value = "doc_subject")
    private String docSubject;

    @TableField(value = "fd_template_id")
    private String fdTemplateId;

    @TableField(value = "fd_number_main_id")
    private String fdNumberMainId;

    @TableField(value = "fd_table_head")
    private String fdTableHead;

    @TableField(value = "fd_doc_num")
    private String fdDocNum;

    @TableField(value = "fd_content")
    private String fdContent;

    @TableField(value = "fd_handle_result")
    private String fdHandleResult;

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

    @TableField(value = "fd_filinger_id")
    private String fdFilingerId;

    @TableField(value = "doc_create_id")
    private String docCreateId;

    @TableField(value = "fd_secret_grade")
    private String fdSecretGrade;

    @TableField(value = "fd_emergency_grade")
    private String fdEmergencyGrade;

    @TableField(value = "fd_sendto_unit")
    private String fdSendtoUnit;

    @TableField(value = "fd_secret_grade_str")
    private String fdSecretGradeStr;

    @TableField(value = "fd_emergency_grade_str")
    private String fdEmergencyGradeStr;

    @TableField(value = "fd_doc_type_str")
    private String fdDocTypeStr;

    @TableField(value = "fd_doc_type")
    private String fdDocType;

    @TableField(value = "doc_alteror_id")
    private String docAlterorId;

    private static final long serialVersionUID = 1L;

    public static final String COL_FD_ID = "fd_id";

    public static final String COL_FD_IS_TOPICED = "fd_is_topiced";

    public static final String COL_FD_IS_SUPERVISED = "fd_is_supervised";

    public static final String COL_FD_SUPERVISE_FLAG = "fd_supervise_flag";

    public static final String COL_FD_RESERVE_ONE = "fd_reserve_one";

    public static final String COL_FD_RESERVE_TWO = "fd_reserve_two";

    public static final String COL_DOC_DELETE_FLAG = "doc_delete_flag";

    public static final String COL_DOC_DELETE_TIME = "doc_delete_time";

    public static final String COL_DOC_DELETE_BY = "doc_delete_by";

    public static final String COL_FD_RESERVE_THREE = "fd_reserve_three";

    public static final String COL_FD_RESERVE_FOUR = "fd_reserve_four";

    public static final String COL_FD_RESERVE_FIVE = "fd_reserve_five";

    public static final String COL_FD_ISFROM_OUT = "fd_isfrom_out";

    public static final String COL_FD_IS_CHANGE_PDF = "fd_is_change_pdf";

    public static final String COL_FD_OLD_DATA = "fd_old_data";

    public static final String COL_FD_MAIN_ID = "fd_main_id";

    public static final String COL_FD_NEED_CONTENT = "fd_need_content";

    public static final String COL_FD_DETAIL_ID = "fd_detail_id";

    public static final String COL_FD_THIRD_ID = "fd_third_id";

    public static final String COL_FD_IS_ADVICE = "fd_is_advice";

    public static final String COL_FD_IS_RETURN = "fd_is_return";

    public static final String COL_FD_IS_WRITESIGNOPINION = "fd_is_writesignopinion";

    public static final String COL_FD_READSEND_OPINION = "fd_readsend_opinion";

    public static final String COL_FD_DELIVER_TYPE = "fd_deliver_type";

    public static final String COL_FD_RECEIVE_TIME = "fd_receive_time";

    public static final String COL_FD_RECEIVE_NUM = "fd_receive_num";

    public static final String COL_FD_DOC_FLOW = "fd_doc_flow";

    public static final String COL_FD_FLOW_NO = "fd_flow_no";

    public static final String COL_FD_NO_RULE = "fd_no_rule";

    public static final String COL_FD_RECORD_TIME = "fd_record_time";

    public static final String COL_FD_SIGN_TIME = "fd_sign_time";

    public static final String COL_FD_OUT_SENDTO = "fd_out_sendto";

    public static final String COL_FD_SHARE_NUM = "fd_share_num";

    public static final String COL_FD_LAST_MODIFIED_TIME = "fd_last_modified_time";

    public static final String COL_FD_RECORDER = "fd_recorder";

    public static final String COL_FD_SIGNER = "fd_signer";

    public static final String COL_FD_RECEIVE_UNIT = "fd_receive_unit";

    public static final String COL_AUTH_AREA_ID = "auth_area_id";

    public static final String COL_DOC_SUBJECT = "doc_subject";

    public static final String COL_FD_TEMPLATE_ID = "fd_template_id";

    public static final String COL_FD_NUMBER_MAIN_ID = "fd_number_main_id";

    public static final String COL_FD_TABLE_HEAD = "fd_table_head";

    public static final String COL_FD_DOC_NUM = "fd_doc_num";

    public static final String COL_FD_CONTENT = "fd_content";

    public static final String COL_FD_HANDLE_RESULT = "fd_handle_result";

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

    public static final String COL_FD_FILINGER_ID = "fd_filinger_id";

    public static final String COL_DOC_CREATE_ID = "doc_create_id";

    public static final String COL_FD_SECRET_GRADE = "fd_secret_grade";

    public static final String COL_FD_EMERGENCY_GRADE = "fd_emergency_grade";

    public static final String COL_FD_SENDTO_UNIT = "fd_sendto_unit";

    public static final String COL_FD_SECRET_GRADE_STR = "fd_secret_grade_str";

    public static final String COL_FD_EMERGENCY_GRADE_STR = "fd_emergency_grade_str";

    public static final String COL_FD_DOC_TYPE_STR = "fd_doc_type_str";

    public static final String COL_FD_DOC_TYPE = "fd_doc_type";

    public static final String COL_DOC_ALTEROR_ID = "doc_alteror_id";
}