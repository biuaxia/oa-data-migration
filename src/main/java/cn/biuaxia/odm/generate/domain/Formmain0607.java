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
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "formmain_0607")
public class Formmain0607 implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private BigDecimal id;

    @TableField(value = "`state`")
    private Integer state;

    @TableField(value = "start_member_id")
    private String startMemberId;

    @TableField(value = "start_date")
    private Date startDate;

    @TableField(value = "approve_member_id")
    private String approveMemberId;

    @TableField(value = "approve_date")
    private Date approveDate;

    @TableField(value = "finishedflag")
    private Integer finishedflag;

    @TableField(value = "ratifyflag")
    private Integer ratifyflag;

    @TableField(value = "ratify_member_id")
    private String ratifyMemberId;

    @TableField(value = "ratify_date")
    private Date ratifyDate;

    @TableField(value = "sort")
    private Integer sort;

    @TableField(value = "modify_member_id")
    private String modifyMemberId;

    @TableField(value = "modify_date")
    private Date modifyDate;

    @TableField(value = "receive_unit")
    private String receiveUnit;

    @TableField(value = "field0001")
    private String field0001;

    @TableField(value = "field0002")
    private String field0002;

    @TableField(value = "field0003")
    private Date field0003;

    @TableField(value = "field0004")
    private Date field0004;

    @TableField(value = "field0005")
    private String field0005;

    @TableField(value = "field0006")
    private String field0006;

    @TableField(value = "field0007")
    private String field0007;

    @TableField(value = "field0008")
    private String field0008;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_STATE = "state";

    public static final String COL_START_MEMBER_ID = "start_member_id";

    public static final String COL_START_DATE = "start_date";

    public static final String COL_APPROVE_MEMBER_ID = "approve_member_id";

    public static final String COL_APPROVE_DATE = "approve_date";

    public static final String COL_FINISHEDFLAG = "finishedflag";

    public static final String COL_RATIFYFLAG = "ratifyflag";

    public static final String COL_RATIFY_MEMBER_ID = "ratify_member_id";

    public static final String COL_RATIFY_DATE = "ratify_date";

    public static final String COL_SORT = "sort";

    public static final String COL_MODIFY_MEMBER_ID = "modify_member_id";

    public static final String COL_MODIFY_DATE = "modify_date";

    public static final String COL_RECEIVE_UNIT = "receive_unit";

    public static final String COL_FIELD0001 = "field0001";

    public static final String COL_FIELD0002 = "field0002";

    public static final String COL_FIELD0003 = "field0003";

    public static final String COL_FIELD0004 = "field0004";

    public static final String COL_FIELD0005 = "field0005";

    public static final String COL_FIELD0006 = "field0006";

    public static final String COL_FIELD0007 = "field0007";

    public static final String COL_FIELD0008 = "field0008";
}