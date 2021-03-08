package cn.biuaxia.data.migration.generate.orcl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "MV_FORMSET_INST")
public class MvFormsetInst implements Serializable {
    @TableId(value = "FORMSET_INST_ID", type = IdType.INPUT)
    private Long formsetInstId;

    @TableField(value = "PROC_ID")
    private Long procId;

    @TableField(value = "FORM_ID")
    private Long formId;

    @TableField(value = "FOLDER_ID")
    private Long folderId;

    @TableField(value = "FORMSET_ID")
    private Long formsetId;

    @TableField(value = "\"NAME\"")
    private String name;

    @TableField(value = "\"STATUS\"")
    private Integer status;

    @TableField(value = "TO_PIGEONHOLE")
    private Integer toPigeonhole;

    @TableField(value = "TO_REPOSITORY")
    private Integer toRepository;

    @TableField(value = "LOCKING_ACTIVITY")
    private String lockingActivity;

    @TableField(value = "FORMSET_NAME")
    private String formsetName;

    @TableField(value = "TEXT_MODE")
    private String textMode;

    @TableField(value = "FOLDER_NAME")
    private String folderName;

    @TableField(value = "CREATOR_ID")
    private Long creatorId;

    @TableField(value = "CREATOR")
    private String creator;

    @TableField(value = "CREATE_TIME")
    private Date createTime;

    @TableField(value = "LOCKER_ID")
    private Long lockerId;

    @TableField(value = "LOCKER")
    private String locker;

    @TableField(value = "LOCK_TIME")
    private Date lockTime;

    @TableField(value = "EXT1")
    private String ext1;

    @TableField(value = "EXT2")
    private String ext2;

    @TableField(value = "EXT3")
    private String ext3;

    @TableField(value = "EXT4")
    private String ext4;

    @TableField(value = "EXT5")
    private String ext5;

    @TableField(value = "EXT6")
    private String ext6;

    @TableField(value = "EXT7")
    private String ext7;

    @TableField(value = "EXT8")
    private String ext8;

    @TableField(value = "EXT9")
    private String ext9;

    @TableField(value = "EXT10")
    private String ext10;

    @TableField(value = "EXT11")
    private String ext11;

    @TableField(value = "EXT12")
    private String ext12;

    @TableField(value = "EXT13")
    private String ext13;

    @TableField(value = "EXT14")
    private String ext14;

    @TableField(value = "EXT15")
    private String ext15;

    @TableField(value = "EXT16")
    private String ext16;

    @TableField(value = "EXT17")
    private String ext17;

    @TableField(value = "EXT18")
    private String ext18;

    @TableField(value = "EXT19")
    private String ext19;

    @TableField(value = "EXT20")
    private String ext20;

    @TableField(value = "EXT21")
    private String ext21;

    @TableField(value = "EXT22")
    private String ext22;

    @TableField(value = "EXT23")
    private Long ext23;

    @TableField(value = "EXT24")
    private Long ext24;

    @TableField(value = "EXT25")
    private Long ext25;

    @TableField(value = "EXT26")
    private Long ext26;

    @TableField(value = "EXT27")
    private Date ext27;

    @TableField(value = "EXT28")
    private Date ext28;

    @TableField(value = "EXT29")
    private Date ext29;

    @TableField(value = "EXT30")
    private Date ext30;

    @TableField(value = "SYS_TYPE")
    private Integer sysType;

    @TableField(value = "GUID")
    private String guid;

    @TableField(value = "CREATOR_DEPT")
    private String creatorDept;

    @TableField(value = "CREATOR_DEPT_ID")
    private Long creatorDeptId;

    @TableField(value = "FORMSET_GUID")
    private String formsetGuid;

    @TableField(value = "CREATOR_UNIT")
    private String creatorUnit;

    @TableField(value = "CREATOR_UNIT_ID")
    private Long creatorUnitId;

    @TableField(value = "URGENT")
    private Long urgent;

    @TableField(value = "NEEDSEND")
    private BigDecimal needsend;

    private static final long serialVersionUID = 1L;

    public static final String COL_FORMSET_INST_ID = "FORMSET_INST_ID";

    public static final String COL_PROC_ID = "PROC_ID";

    public static final String COL_FORM_ID = "FORM_ID";

    public static final String COL_FOLDER_ID = "FOLDER_ID";

    public static final String COL_FORMSET_ID = "FORMSET_ID";

    public static final String COL_NAME = "NAME";

    public static final String COL_STATUS = "STATUS";

    public static final String COL_TO_PIGEONHOLE = "TO_PIGEONHOLE";

    public static final String COL_TO_REPOSITORY = "TO_REPOSITORY";

    public static final String COL_LOCKING_ACTIVITY = "LOCKING_ACTIVITY";

    public static final String COL_FORMSET_NAME = "FORMSET_NAME";

    public static final String COL_TEXT_MODE = "TEXT_MODE";

    public static final String COL_FOLDER_NAME = "FOLDER_NAME";

    public static final String COL_CREATOR_ID = "CREATOR_ID";

    public static final String COL_CREATOR = "CREATOR";

    public static final String COL_CREATE_TIME = "CREATE_TIME";

    public static final String COL_LOCKER_ID = "LOCKER_ID";

    public static final String COL_LOCKER = "LOCKER";

    public static final String COL_LOCK_TIME = "LOCK_TIME";

    public static final String COL_EXT1 = "EXT1";

    public static final String COL_EXT2 = "EXT2";

    public static final String COL_EXT3 = "EXT3";

    public static final String COL_EXT4 = "EXT4";

    public static final String COL_EXT5 = "EXT5";

    public static final String COL_EXT6 = "EXT6";

    public static final String COL_EXT7 = "EXT7";

    public static final String COL_EXT8 = "EXT8";

    public static final String COL_EXT9 = "EXT9";

    public static final String COL_EXT10 = "EXT10";

    public static final String COL_EXT11 = "EXT11";

    public static final String COL_EXT12 = "EXT12";

    public static final String COL_EXT13 = "EXT13";

    public static final String COL_EXT14 = "EXT14";

    public static final String COL_EXT15 = "EXT15";

    public static final String COL_EXT16 = "EXT16";

    public static final String COL_EXT17 = "EXT17";

    public static final String COL_EXT18 = "EXT18";

    public static final String COL_EXT19 = "EXT19";

    public static final String COL_EXT20 = "EXT20";

    public static final String COL_EXT21 = "EXT21";

    public static final String COL_EXT22 = "EXT22";

    public static final String COL_EXT23 = "EXT23";

    public static final String COL_EXT24 = "EXT24";

    public static final String COL_EXT25 = "EXT25";

    public static final String COL_EXT26 = "EXT26";

    public static final String COL_EXT27 = "EXT27";

    public static final String COL_EXT28 = "EXT28";

    public static final String COL_EXT29 = "EXT29";

    public static final String COL_EXT30 = "EXT30";

    public static final String COL_SYS_TYPE = "SYS_TYPE";

    public static final String COL_GUID = "GUID";

    public static final String COL_CREATOR_DEPT = "CREATOR_DEPT";

    public static final String COL_CREATOR_DEPT_ID = "CREATOR_DEPT_ID";

    public static final String COL_FORMSET_GUID = "FORMSET_GUID";

    public static final String COL_CREATOR_UNIT = "CREATOR_UNIT";

    public static final String COL_CREATOR_UNIT_ID = "CREATOR_UNIT_ID";

    public static final String COL_URGENT = "URGENT";

    public static final String COL_NEEDSEND = "NEEDSEND";
}