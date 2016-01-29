package tbclient.FrsPage;

import com.baidu.location.a0;
import com.baidu.tbadk.TbConfig;
import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_COOKIE = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_EMAIL = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_IP_STR = "";
    public static final String DEFAULT_KW = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_MODULE_NAME = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_YUELAOU_LOCATE = "";
    public static final String DEFAULT_YUELAOU_PARAMS = "";
    @ProtoField(tag = 44, type = Message.Datatype.INT32)
    public final Integer category_id;
    @ProtoField(tag = 20, type = Message.Datatype.BOOL)
    public final Boolean check_login;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cid;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 39)
    public final CommonReq common;
    @ProtoField(tag = 38, type = Message.Datatype.STRING)
    public final String cookie;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer ctime;
    @ProtoField(tag = a0.e, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer data_size;
    @ProtoField(tag = 37, type = Message.Datatype.BOOL)
    public final Boolean debug;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String email;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer frs_rn;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer ip_int;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String ip_str;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_good;
    @ProtoField(tag = a0.x, type = Message.Datatype.INT32)
    public final Integer issdk;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String kw;
    @ProtoField(tag = 40, type = Message.Datatype.STRING)
    public final String lastids;
    @ProtoField(tag = 30, type = Message.Datatype.BOOL)
    public final Boolean login;
    @ProtoField(tag = TbConfig.FRS_NOABSTRACT_ITEM_NUMBER, type = Message.Datatype.STRING)
    public final String mobile;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer need_badge;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer net_error;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_MY_COLLECT_UPDATE, type = Message.Datatype.INT32)
    public final Integer no_un;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer noval;
    @ProtoField(tag = a0.f29case, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer result_num;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rn_need;
    @ProtoField(tag = 13, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer smile_grade;
    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer st_param;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_PUSH_RECOMMEND_PB, type = Message.Datatype.BOOL)
    public final Boolean support_noun;
    @ProtoField(tag = 31, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer with_group;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer withcal;
    @ProtoField(tag = 45, type = Message.Datatype.STRING)
    public final String yuelaou_locate;
    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String yuelaou_params;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_RN_NEED = 0;
    public static final Integer DEFAULT_IS_GOOD = 0;
    public static final Integer DEFAULT_CID = 0;
    public static final Integer DEFAULT_WITHCAL = 0;
    public static final Integer DEFAULT_NOVAL = 0;
    public static final Integer DEFAULT_WITH_GROUP = 0;
    public static final Integer DEFAULT_NEED_BADGE = 0;
    public static final Integer DEFAULT_FRS_RN = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_CTIME = 0;
    public static final Integer DEFAULT_DATA_SIZE = 0;
    public static final Integer DEFAULT_NET_ERROR = 0;
    public static final Boolean DEFAULT_CHECK_LOGIN = false;
    public static final Integer DEFAULT_RESULT_NUM = 0;
    public static final Integer DEFAULT_CLASS_ID = 0;
    public static final Integer DEFAULT_IP_INT = 0;
    public static final Integer DEFAULT_ST_PARAM = 0;
    public static final Integer DEFAULT_SMILE_GRADE = 0;
    public static final Boolean DEFAULT_SUPPORT_NOUN = false;
    public static final Boolean DEFAULT_LOGIN = false;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_NO_UN = 0;
    public static final Boolean DEFAULT_DEBUG = false;
    public static final Integer DEFAULT_ISSDK = 0;
    public static final Integer DEFAULT_CATEGORY_ID = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.kw == null) {
                this.kw = "";
            } else {
                this.kw = builder.kw;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.rn_need == null) {
                this.rn_need = DEFAULT_RN_NEED;
            } else {
                this.rn_need = builder.rn_need;
            }
            if (builder.is_good == null) {
                this.is_good = DEFAULT_IS_GOOD;
            } else {
                this.is_good = builder.is_good;
            }
            if (builder.cid == null) {
                this.cid = DEFAULT_CID;
            } else {
                this.cid = builder.cid;
            }
            if (builder.withcal == null) {
                this.withcal = DEFAULT_WITHCAL;
            } else {
                this.withcal = builder.withcal;
            }
            if (builder.noval == null) {
                this.noval = DEFAULT_NOVAL;
            } else {
                this.noval = builder.noval;
            }
            if (builder.with_group == null) {
                this.with_group = DEFAULT_WITH_GROUP;
            } else {
                this.with_group = builder.with_group;
            }
            if (builder.need_badge == null) {
                this.need_badge = DEFAULT_NEED_BADGE;
            } else {
                this.need_badge = builder.need_badge;
            }
            if (builder.frs_rn == null) {
                this.frs_rn = DEFAULT_FRS_RN;
            } else {
                this.frs_rn = builder.frs_rn;
            }
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = builder.scr_h;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.st_type == null) {
                this.st_type = "";
            } else {
                this.st_type = builder.st_type;
            }
            if (builder.ctime == null) {
                this.ctime = DEFAULT_CTIME;
            } else {
                this.ctime = builder.ctime;
            }
            if (builder.data_size == null) {
                this.data_size = DEFAULT_DATA_SIZE;
            } else {
                this.data_size = builder.data_size;
            }
            if (builder.net_error == null) {
                this.net_error = DEFAULT_NET_ERROR;
            } else {
                this.net_error = builder.net_error;
            }
            if (builder.check_login == null) {
                this.check_login = DEFAULT_CHECK_LOGIN;
            } else {
                this.check_login = builder.check_login;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.result_num == null) {
                this.result_num = DEFAULT_RESULT_NUM;
            } else {
                this.result_num = builder.result_num;
            }
            if (builder.class_id == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = builder.class_id;
            }
            if (builder.ip_str == null) {
                this.ip_str = "";
            } else {
                this.ip_str = builder.ip_str;
            }
            if (builder.ip_int == null) {
                this.ip_int = DEFAULT_IP_INT;
            } else {
                this.ip_int = builder.ip_int;
            }
            if (builder.module_name == null) {
                this.module_name = "";
            } else {
                this.module_name = builder.module_name;
            }
            if (builder.st_param == null) {
                this.st_param = DEFAULT_ST_PARAM;
            } else {
                this.st_param = builder.st_param;
            }
            if (builder.smile_grade == null) {
                this.smile_grade = DEFAULT_SMILE_GRADE;
            } else {
                this.smile_grade = builder.smile_grade;
            }
            if (builder.support_noun == null) {
                this.support_noun = DEFAULT_SUPPORT_NOUN;
            } else {
                this.support_noun = builder.support_noun;
            }
            if (builder.login == null) {
                this.login = DEFAULT_LOGIN;
            } else {
                this.login = builder.login;
            }
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.no_un == null) {
                this.no_un = DEFAULT_NO_UN;
            } else {
                this.no_un = builder.no_un;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.mobile == null) {
                this.mobile = "";
            } else {
                this.mobile = builder.mobile;
            }
            if (builder.email == null) {
                this.email = "";
            } else {
                this.email = builder.email;
            }
            if (builder.debug == null) {
                this.debug = DEFAULT_DEBUG;
            } else {
                this.debug = builder.debug;
            }
            if (builder.cookie == null) {
                this.cookie = "";
            } else {
                this.cookie = builder.cookie;
            }
            this.common = builder.common;
            if (builder.lastids == null) {
                this.lastids = "";
            } else {
                this.lastids = builder.lastids;
            }
            if (builder.issdk == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = builder.issdk;
            }
            if (builder.da_idfa == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = builder.da_idfa;
            }
            if (builder.platform == null) {
                this.platform = "";
            } else {
                this.platform = builder.platform;
            }
            if (builder.category_id == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = builder.category_id;
            }
            if (builder.yuelaou_locate == null) {
                this.yuelaou_locate = "";
            } else {
                this.yuelaou_locate = builder.yuelaou_locate;
            }
            if (builder.yuelaou_params == null) {
                this.yuelaou_params = "";
                return;
            } else {
                this.yuelaou_params = builder.yuelaou_params;
                return;
            }
        }
        this.kw = builder.kw;
        this.rn = builder.rn;
        this.rn_need = builder.rn_need;
        this.is_good = builder.is_good;
        this.cid = builder.cid;
        this.withcal = builder.withcal;
        this.noval = builder.noval;
        this.with_group = builder.with_group;
        this.need_badge = builder.need_badge;
        this.frs_rn = builder.frs_rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.pn = builder.pn;
        this.st_type = builder.st_type;
        this.ctime = builder.ctime;
        this.data_size = builder.data_size;
        this.net_error = builder.net_error;
        this.check_login = builder.check_login;
        this.forum_name = builder.forum_name;
        this.result_num = builder.result_num;
        this.class_id = builder.class_id;
        this.ip_str = builder.ip_str;
        this.ip_int = builder.ip_int;
        this.module_name = builder.module_name;
        this.st_param = builder.st_param;
        this.smile_grade = builder.smile_grade;
        this.support_noun = builder.support_noun;
        this.login = builder.login;
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.no_un = builder.no_un;
        this.portrait = builder.portrait;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.debug = builder.debug;
        this.cookie = builder.cookie;
        this.common = builder.common;
        this.lastids = builder.lastids;
        this.issdk = builder.issdk;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.category_id = builder.category_id;
        this.yuelaou_locate = builder.yuelaou_locate;
        this.yuelaou_params = builder.yuelaou_params;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public Integer category_id;
        public Boolean check_login;
        public Integer cid;
        public Integer class_id;
        public CommonReq common;
        public String cookie;
        public Integer ctime;
        public String da_idfa;
        public Integer data_size;
        public Boolean debug;
        public String email;
        public String forum_name;
        public Integer frs_rn;
        public Integer ip_int;
        public String ip_str;
        public Integer is_good;
        public Integer issdk;
        public String kw;
        public String lastids;
        public Boolean login;
        public String mobile;
        public String module_name;
        public Integer need_badge;
        public Integer net_error;
        public Integer no_un;
        public Integer noval;
        public String platform;
        public Integer pn;
        public String portrait;
        public Integer q_type;
        public Integer result_num;
        public Integer rn;
        public Integer rn_need;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer smile_grade;
        public Integer st_param;
        public String st_type;
        public Boolean support_noun;
        public Long user_id;
        public String user_name;
        public Integer with_group;
        public Integer withcal;
        public String yuelaou_locate;
        public String yuelaou_params;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.kw = dataReq.kw;
                this.rn = dataReq.rn;
                this.rn_need = dataReq.rn_need;
                this.is_good = dataReq.is_good;
                this.cid = dataReq.cid;
                this.withcal = dataReq.withcal;
                this.noval = dataReq.noval;
                this.with_group = dataReq.with_group;
                this.need_badge = dataReq.need_badge;
                this.frs_rn = dataReq.frs_rn;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.scr_dip = dataReq.scr_dip;
                this.q_type = dataReq.q_type;
                this.pn = dataReq.pn;
                this.st_type = dataReq.st_type;
                this.ctime = dataReq.ctime;
                this.data_size = dataReq.data_size;
                this.net_error = dataReq.net_error;
                this.check_login = dataReq.check_login;
                this.forum_name = dataReq.forum_name;
                this.result_num = dataReq.result_num;
                this.class_id = dataReq.class_id;
                this.ip_str = dataReq.ip_str;
                this.ip_int = dataReq.ip_int;
                this.module_name = dataReq.module_name;
                this.st_param = dataReq.st_param;
                this.smile_grade = dataReq.smile_grade;
                this.support_noun = dataReq.support_noun;
                this.login = dataReq.login;
                this.user_id = dataReq.user_id;
                this.user_name = dataReq.user_name;
                this.no_un = dataReq.no_un;
                this.portrait = dataReq.portrait;
                this.mobile = dataReq.mobile;
                this.email = dataReq.email;
                this.debug = dataReq.debug;
                this.cookie = dataReq.cookie;
                this.common = dataReq.common;
                this.lastids = dataReq.lastids;
                this.issdk = dataReq.issdk;
                this.da_idfa = dataReq.da_idfa;
                this.platform = dataReq.platform;
                this.category_id = dataReq.category_id;
                this.yuelaou_locate = dataReq.yuelaou_locate;
                this.yuelaou_params = dataReq.yuelaou_params;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
