package cn.biuaxia.odm.generate.domain;

import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName(value = "formmain_0002")
public class Formmain0002 implements Serializable {
    @TableField(value = "ID")
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
    private Date field0002;

    @TableField(value = "field0003")
    private String field0003;

    @TableField(value = "field0004")
    private String field0004;

    @TableField(value = "field0005")
    private String field0005;

    @TableField(value = "field0006")
    private String field0006;

    @TableField(value = "field0007")
    private String field0007;

    @TableField(value = "field0008")
    private String field0008;

    @TableField(value = "field0009")
    private String field0009;

    @TableField(value = "field0010")
    private String field0010;

    @TableField(value = "field0011")
    private String field0011;

    @TableField(value = "field0012")
    private String field0012;

    @TableField(value = "field0013")
    private String field0013;

    @TableField(value = "field0014")
    private String field0014;

    @TableField(value = "field0015")
    private String field0015;

    @TableField(value = "field0016")
    private Date field0016;

    @TableField(value = "field0017")
    private Date field0017;

    @TableField(value = "field0018")
    private Date field0018;

    @TableField(value = "field0019")
    private String field0019;

    @TableField(value = "field0020")
    private String field0020;

    @TableField(value = "field0021")
    private String field0021;

    @TableField(value = "field0022")
    private String field0022;

    @TableField(value = "field0023")
    private String field0023;

    @TableField(value = "field0024")
    private String field0024;

    @TableField(value = "field0025")
    private String field0025;

    @TableField(value = "field0026")
    private String field0026;

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

    public static final String COL_FIELD0009 = "field0009";

    public static final String COL_FIELD0010 = "field0010";

    public static final String COL_FIELD0011 = "field0011";

    public static final String COL_FIELD0012 = "field0012";

    public static final String COL_FIELD0013 = "field0013";

    public static final String COL_FIELD0014 = "field0014";

    public static final String COL_FIELD0015 = "field0015";

    public static final String COL_FIELD0016 = "field0016";

    public static final String COL_FIELD0017 = "field0017";

    public static final String COL_FIELD0018 = "field0018";

    public static final String COL_FIELD0019 = "field0019";

    public static final String COL_FIELD0020 = "field0020";

    public static final String COL_FIELD0021 = "field0021";

    public static final String COL_FIELD0022 = "field0022";

    public static final String COL_FIELD0023 = "field0023";

    public static final String COL_FIELD0024 = "field0024";

    public static final String COL_FIELD0025 = "field0025";

    public static final String COL_FIELD0026 = "field0026";
}