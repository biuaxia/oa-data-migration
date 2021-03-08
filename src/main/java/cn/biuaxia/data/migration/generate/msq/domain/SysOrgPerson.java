package cn.biuaxia.data.migration.generate.msq.domain;

import cn.biuaxia.data.migration.generate.orcl.domain.UmCommon;
import cn.biuaxia.data.migration.generate.orcl.domain.UmUser;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
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
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_org_person")
public class SysOrgPerson implements Serializable {
    @TableId(value = "fd_id", type = IdType.INPUT)
    private String fdId;

    @TableField(value = "fd_mobile_no")
    private String fdMobileNo;

    @TableField(value = "fd_email")
    private String fdEmail;

    @TableField(value = "fd_login_name")
    private String fdLoginName;

    @TableField(value = "fd_password")
    private String fdPassword;

    @TableField(value = "fd_init_password")
    private String fdInitPassword;

    @TableField(value = "fd_rtx_no")
    private String fdRtxNo;

    @TableField(value = "fd_wechat_no")
    private String fdWechatNo;

    @TableField(value = "fd_card_no")
    private String fdCardNo;

    @TableField(value = "fd_attendance_card_number")
    private String fdAttendanceCardNumber;

    @TableField(value = "fd_work_phone")
    private String fdWorkPhone;

    @TableField(value = "fd_default_lang")
    private String fdDefaultLang;

    @TableField(value = "fd_sex")
    private String fdSex;

    @TableField(value = "fd_last_change_pwd")
    private Date fdLastChangePwd;

    @TableField(value = "fd_lock_time")
    private Date fdLockTime;

    @TableField(value = "fd_short_no")
    private String fdShortNo;

    @TableField(value = "fd_double_validation")
    private String fdDoubleValidation;

    @TableField(value = "fd_user_type")
    private String fdUserType;

    @TableField(value = "fd_nick_name")
    private String fdNickName;

    @TableField(value = "fd_is_activated")
    private Boolean fdIsActivated;

    @TableField(value = "fd_hiredate")
    private Date fdHiredate;

    @TableField(value = "fd_leave_date")
    private Date fdLeaveDate;

    @TableField(value = "fd_staffing_level_id")
    private String fdStaffingLevelId;

    private static final long serialVersionUID = 1L;

    public static final String COL_FD_ID = "fd_id";

    public static final String COL_FD_MOBILE_NO = "fd_mobile_no";

    public static final String COL_FD_EMAIL = "fd_email";

    public static final String COL_FD_LOGIN_NAME = "fd_login_name";

    public static final String COL_FD_PASSWORD = "fd_password";

    public static final String COL_FD_INIT_PASSWORD = "fd_init_password";

    public static final String COL_FD_RTX_NO = "fd_rtx_no";

    public static final String COL_FD_WECHAT_NO = "fd_wechat_no";

    public static final String COL_FD_CARD_NO = "fd_card_no";

    public static final String COL_FD_ATTENDANCE_CARD_NUMBER = "fd_attendance_card_number";

    public static final String COL_FD_WORK_PHONE = "fd_work_phone";

    public static final String COL_FD_DEFAULT_LANG = "fd_default_lang";

    public static final String COL_FD_SEX = "fd_sex";

    public static final String COL_FD_LAST_CHANGE_PWD = "fd_last_change_pwd";

    public static final String COL_FD_LOCK_TIME = "fd_lock_time";

    public static final String COL_FD_SHORT_NO = "fd_short_no";

    public static final String COL_FD_DOUBLE_VALIDATION = "fd_double_validation";

    public static final String COL_FD_USER_TYPE = "fd_user_type";

    public static final String COL_FD_NICK_NAME = "fd_nick_name";

    public static final String COL_FD_IS_ACTIVATED = "fd_is_activated";

    public static final String COL_FD_HIREDATE = "fd_hiredate";

    public static final String COL_FD_LEAVE_DATE = "fd_leave_date";

    public static final String COL_FD_STAFFING_LEVEL_ID = "fd_staffing_level_id";

    public static SysOrgPerson build(String fdId, UmUser umUser, UmCommon umCommon) {
        String fdLoginName = StrUtil.format("{}_generate", umUser.getAccount());
        String fdMobileNo = null;
        List<String> strings = StrUtil.splitTrim(umUser.getMobile(), ",");
        if (CollUtil.isNotEmpty(strings)) {
            fdMobileNo = strings.get(0);
        }
        return SysOrgPerson.builder()
                .fdId(fdId)
                .fdMobileNo(fdMobileNo)
                .fdEmail(umUser.getEmail())
                .fdLoginName(fdLoginName)
                .fdPassword("e10adc3949ba59abbe56e057f20f883e")
                .fdInitPassword("edlR+Pow/ew=")
                .fdWorkPhone(umUser.getPhone())
                .fdSex("M")
                .fdDoubleValidation("disable")
                .fdUserType("0")
                .fdNickName(StrUtil.upperFirst(fdLoginName))
                .build();
    }
}