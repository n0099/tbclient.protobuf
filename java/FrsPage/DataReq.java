package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_CALL_URL = "";
    public static final String DEFAULT_COOKIE = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_EMAIL = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_IP_STR = "";
    public static final String DEFAULT_KW = "";
    public static final String DEFAULT_LASTIDS = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_MODULE_NAME = "";
    public static final String DEFAULT_OBJ_LOCATE = "";
    public static final String DEFAULT_OBJ_SOURCE = "";
    public static final String DEFAULT_PLATFORM = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_UP_SCHEMA = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_YUELAOU_LOCATE = "";
    public static final String DEFAULT_YUELAOU_PARAMS = "";
    @ProtoField(tag = 60, type = Message.Datatype.STRING)
    public final String ad_context_list;
    @ProtoField(tag = 62, type = Message.Datatype.STRING)
    public final String ad_ext_params;
    @ProtoField(tag = 51)
    public final AdParam ad_param;
    @ProtoField(tag = 50)
    public final AppPosInfo app_pos;
    @ProtoField(tag = 56, type = Message.Datatype.INT32)
    public final Integer call_from;
    @ProtoField(tag = 54, type = Message.Datatype.STRING)
    public final String call_url;
    @ProtoField(tag = 44, type = Message.Datatype.INT32)
    public final Integer category_id;
    @ProtoField(tag = 20, type = Message.Datatype.BOOL)
    public final Boolean check_login;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cid;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 39)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14753common;
    @ProtoField(tag = 38, type = Message.Datatype.STRING)
    public final String cookie;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer ctime;
    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer data_size;
    @ProtoField(tag = 37, type = Message.Datatype.BOOL)
    public final Boolean debug;
    @ProtoField(tag = 63, type = Message.Datatype.INT32)
    public final Integer default_sort_type;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String email;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer frs_rn;
    @ProtoField(tag = 58, type = Message.Datatype.INT64)
    public final Long hot_thread_id;
    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer ip_int;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String ip_str;
    @ProtoField(tag = 59, type = Message.Datatype.INT32)
    public final Integer is_default_navtab;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_good;
    @ProtoField(tag = 55, type = Message.Datatype.INT32)
    public final Integer is_selection;
    @ProtoField(tag = 41, type = Message.Datatype.INT32)
    public final Integer issdk;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String kw;
    @ProtoField(tag = 48, type = Message.Datatype.UINT64)
    public final Long last_click_tid;
    @ProtoField(tag = 40, type = Message.Datatype.STRING)
    public final String lastids;
    @ProtoField(tag = 49, type = Message.Datatype.INT32)
    public final Integer load_type;
    @ProtoField(tag = 30, type = Message.Datatype.BOOL)
    public final Boolean login;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String mobile;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer need_badge;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer net_error;
    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer no_un;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer noval;
    @ProtoField(tag = 52, type = Message.Datatype.STRING)
    public final String obj_locate;
    @ProtoField(tag = 53, type = Message.Datatype.STRING)
    public final String obj_source;
    @ProtoField(tag = 43, type = Message.Datatype.STRING)
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
    @ProtoField(tag = 57, type = Message.Datatype.STRING)
    public final String shoubai_cuid;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer smile_grade;
    @ProtoField(tag = 47, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer st_param;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 29, type = Message.Datatype.BOOL)
    public final Boolean support_noun;
    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String up_schema;
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
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final Long DEFAULT_LAST_CLICK_TID = 0L;
    public static final Integer DEFAULT_LOAD_TYPE = 0;
    public static final Integer DEFAULT_IS_SELECTION = 0;
    public static final Integer DEFAULT_CALL_FROM = 0;
    public static final Long DEFAULT_HOT_THREAD_ID = 0L;
    public static final Integer DEFAULT_IS_DEFAULT_NAVTAB = 0;
    public static final Integer DEFAULT_DEFAULT_SORT_TYPE = 0;

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
            this.f14753common = builder.f14754common;
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
            } else {
                this.yuelaou_params = builder.yuelaou_params;
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = builder.sort_type;
            }
            if (builder.last_click_tid == null) {
                this.last_click_tid = DEFAULT_LAST_CLICK_TID;
            } else {
                this.last_click_tid = builder.last_click_tid;
            }
            if (builder.load_type == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = builder.load_type;
            }
            this.app_pos = builder.app_pos;
            this.ad_param = builder.ad_param;
            if (builder.obj_locate == null) {
                this.obj_locate = "";
            } else {
                this.obj_locate = builder.obj_locate;
            }
            if (builder.obj_source == null) {
                this.obj_source = "";
            } else {
                this.obj_source = builder.obj_source;
            }
            if (builder.call_url == null) {
                this.call_url = "";
            } else {
                this.call_url = builder.call_url;
            }
            if (builder.is_selection == null) {
                this.is_selection = DEFAULT_IS_SELECTION;
            } else {
                this.is_selection = builder.is_selection;
            }
            if (builder.call_from == null) {
                this.call_from = DEFAULT_CALL_FROM;
            } else {
                this.call_from = builder.call_from;
            }
            if (builder.shoubai_cuid == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = builder.shoubai_cuid;
            }
            if (builder.hot_thread_id == null) {
                this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
            } else {
                this.hot_thread_id = builder.hot_thread_id;
            }
            if (builder.is_default_navtab == null) {
                this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
            } else {
                this.is_default_navtab = builder.is_default_navtab;
            }
            if (builder.ad_context_list == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = builder.ad_context_list;
            }
            if (builder.up_schema == null) {
                this.up_schema = "";
            } else {
                this.up_schema = builder.up_schema;
            }
            if (builder.ad_ext_params == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = builder.ad_ext_params;
            }
            if (builder.default_sort_type == null) {
                this.default_sort_type = DEFAULT_DEFAULT_SORT_TYPE;
                return;
            } else {
                this.default_sort_type = builder.default_sort_type;
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
        this.f14753common = builder.f14754common;
        this.lastids = builder.lastids;
        this.issdk = builder.issdk;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.category_id = builder.category_id;
        this.yuelaou_locate = builder.yuelaou_locate;
        this.yuelaou_params = builder.yuelaou_params;
        this.sort_type = builder.sort_type;
        this.last_click_tid = builder.last_click_tid;
        this.load_type = builder.load_type;
        this.app_pos = builder.app_pos;
        this.ad_param = builder.ad_param;
        this.obj_locate = builder.obj_locate;
        this.obj_source = builder.obj_source;
        this.call_url = builder.call_url;
        this.is_selection = builder.is_selection;
        this.call_from = builder.call_from;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.hot_thread_id = builder.hot_thread_id;
        this.is_default_navtab = builder.is_default_navtab;
        this.ad_context_list = builder.ad_context_list;
        this.up_schema = builder.up_schema;
        this.ad_ext_params = builder.ad_ext_params;
        this.default_sort_type = builder.default_sort_type;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_context_list;
        public String ad_ext_params;
        public AdParam ad_param;
        public AppPosInfo app_pos;
        public Integer call_from;
        public String call_url;
        public Integer category_id;
        public Boolean check_login;
        public Integer cid;
        public Integer class_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14754common;
        public String cookie;
        public Integer ctime;
        public String da_idfa;
        public Integer data_size;
        public Boolean debug;
        public Integer default_sort_type;
        public String email;
        public String forum_name;
        public Integer frs_rn;
        public Long hot_thread_id;
        public Integer ip_int;
        public String ip_str;
        public Integer is_default_navtab;
        public Integer is_good;
        public Integer is_selection;
        public Integer issdk;
        public String kw;
        public Long last_click_tid;
        public String lastids;
        public Integer load_type;
        public Boolean login;
        public String mobile;
        public String module_name;
        public Integer need_badge;
        public Integer net_error;
        public Integer no_un;
        public Integer noval;
        public String obj_locate;
        public String obj_source;
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
        public String shoubai_cuid;
        public Integer smile_grade;
        public Integer sort_type;
        public Integer st_param;
        public String st_type;
        public Boolean support_noun;
        public String up_schema;
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
                this.f14754common = dataReq.f14753common;
                this.lastids = dataReq.lastids;
                this.issdk = dataReq.issdk;
                this.da_idfa = dataReq.da_idfa;
                this.platform = dataReq.platform;
                this.category_id = dataReq.category_id;
                this.yuelaou_locate = dataReq.yuelaou_locate;
                this.yuelaou_params = dataReq.yuelaou_params;
                this.sort_type = dataReq.sort_type;
                this.last_click_tid = dataReq.last_click_tid;
                this.load_type = dataReq.load_type;
                this.app_pos = dataReq.app_pos;
                this.ad_param = dataReq.ad_param;
                this.obj_locate = dataReq.obj_locate;
                this.obj_source = dataReq.obj_source;
                this.call_url = dataReq.call_url;
                this.is_selection = dataReq.is_selection;
                this.call_from = dataReq.call_from;
                this.shoubai_cuid = dataReq.shoubai_cuid;
                this.hot_thread_id = dataReq.hot_thread_id;
                this.is_default_navtab = dataReq.is_default_navtab;
                this.ad_context_list = dataReq.ad_context_list;
                this.up_schema = dataReq.up_schema;
                this.ad_ext_params = dataReq.ad_ext_params;
                this.default_sort_type = dataReq.default_sort_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
