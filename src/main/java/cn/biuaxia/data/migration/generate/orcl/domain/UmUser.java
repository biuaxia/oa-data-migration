package cn.biuaxia.data.migration.generate.orcl.domain;

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
@TableName(value = "UM_USER")
public class UmUser implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "ACCOUNT")
    private String account;

    /**
     * 存在已经进行过加密过的登陆系统的口令
     */
    @TableField(value = "\"PASSWORD\"")
    private String password;

    @TableField(value = "CERTIFICATE")
    private String certificate;

    @TableField(value = "SIGNATURE")
    private String signature;

    @TableField(value = "PWD_LIMIT_DATE")
    private Date pwdLimitDate;

    @TableField(value = "ACCOUNT_LMT_DATE")
    private Date accountLmtDate;

    /**
     * 如口令登陆
证书登陆
指纹登陆

     */
    @TableField(value = "LOGIN_MODE")
    private Integer loginMode;

    @TableField(value = "\"STATUS\"")
    private Long status;

    @TableField(value = "PWD_ERR_NUM")
    private Integer pwdErrNum;

    @TableField(value = "PWD_ERR_LOCK")
    private Integer pwdErrLock;

    @TableField(value = "NICKNAME")
    private String nickname;

    @TableField(value = "PHONE")
    private String phone;

    @TableField(value = "FAX")
    private String fax;

    @TableField(value = "URL")
    private String url;

    @TableField(value = "EMAIL")
    private String email;

    @TableField(value = "GENDER")
    private Integer gender;

    @TableField(value = "BIRTHDAY")
    private Date birthday;

    @TableField(value = "\"STYLE\"")
    private String style;

    @TableField(value = "IDENTITY_NUM")
    private String identityNum;

    @TableField(value = "NATION")
    private String nation;

    @TableField(value = "NATIVE_PLACE")
    private String nativePlace;

    @TableField(value = "MOBILE")
    private String mobile;

    @TableField(value = "GRADUATE_SCHOOL")
    private String graduateSchool;

    @TableField(value = "DEGREE_LEVEL")
    private Integer degreeLevel;

    @TableField(value = "INTEREST")
    private String interest;

    @TableField(value = "EDUCATE_EXPERIENCE")
    private String educateExperience;

    @TableField(value = "WORK_EXPERIENCE")
    private String workExperience;

    /**
     * 微信号
     */
    @TableField(value = "WE_CHAT")
    private String weChat;

    @TableField(value = "SCRETTYPE")
    private Short screttype;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_ACCOUNT = "ACCOUNT";

    public static final String COL_PASSWORD = "PASSWORD";

    public static final String COL_CERTIFICATE = "CERTIFICATE";

    public static final String COL_SIGNATURE = "SIGNATURE";

    public static final String COL_PWD_LIMIT_DATE = "PWD_LIMIT_DATE";

    public static final String COL_ACCOUNT_LMT_DATE = "ACCOUNT_LMT_DATE";

    public static final String COL_LOGIN_MODE = "LOGIN_MODE";

    public static final String COL_STATUS = "STATUS";

    public static final String COL_PWD_ERR_NUM = "PWD_ERR_NUM";

    public static final String COL_PWD_ERR_LOCK = "PWD_ERR_LOCK";

    public static final String COL_NICKNAME = "NICKNAME";

    public static final String COL_PHONE = "PHONE";

    public static final String COL_FAX = "FAX";

    public static final String COL_URL = "URL";

    public static final String COL_EMAIL = "EMAIL";

    public static final String COL_GENDER = "GENDER";

    public static final String COL_BIRTHDAY = "BIRTHDAY";

    public static final String COL_STYLE = "STYLE";

    public static final String COL_IDENTITY_NUM = "IDENTITY_NUM";

    public static final String COL_NATION = "NATION";

    public static final String COL_NATIVE_PLACE = "NATIVE_PLACE";

    public static final String COL_MOBILE = "MOBILE";

    public static final String COL_GRADUATE_SCHOOL = "GRADUATE_SCHOOL";

    public static final String COL_DEGREE_LEVEL = "DEGREE_LEVEL";

    public static final String COL_INTEREST = "INTEREST";

    public static final String COL_EDUCATE_EXPERIENCE = "EDUCATE_EXPERIENCE";

    public static final String COL_WORK_EXPERIENCE = "WORK_EXPERIENCE";

    public static final String COL_WE_CHAT = "WE_CHAT";

    public static final String COL_SCRETTYPE = "SCRETTYPE";
}