package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_AD_BEAR_CONTEXT = "";
  
  public static final String DEFAULT_AD_BEAR_SID = "";
  
  public static final Double DEFAULT_AD_BEAR_SID_PRICE;
  
  public static final String DEFAULT_AD_CONTEXT_LIST = "";
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Integer DEFAULT_CALL_FROM;
  
  public static final String DEFAULT_CALL_URL = "";
  
  public static final Integer DEFAULT_CATEGORY_ID;
  
  public static final Boolean DEFAULT_CHECK_LOGIN;
  
  public static final Integer DEFAULT_CID;
  
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final String DEFAULT_COOKIE = "";
  
  public static final Integer DEFAULT_CTIME;
  
  public static final Integer DEFAULT_DATA_SIZE;
  
  public static final String DEFAULT_DA_IDFA = "";
  
  public static final Boolean DEFAULT_DEBUG;
  
  public static final Integer DEFAULT_DEFAULT_SORT_TYPE;
  
  public static final String DEFAULT_EMAIL = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FRS_RN;
  
  public static final Integer DEFAULT_HAS_AD_BEAR;
  
  public static final Long DEFAULT_HOT_THREAD_ID;
  
  public static final Integer DEFAULT_IP_INT;
  
  public static final String DEFAULT_IP_STR = "";
  
  public static final Integer DEFAULT_ISSDK;
  
  public static final Integer DEFAULT_IS_DEFAULT_NAVTAB;
  
  public static final Integer DEFAULT_IS_GOOD;
  
  public static final Integer DEFAULT_IS_SELECTION;
  
  public static final String DEFAULT_KW = "";
  
  public static final String DEFAULT_LASTIDS = "";
  
  public static final Long DEFAULT_LAST_CLICK_TID;
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final Boolean DEFAULT_LOGIN;
  
  public static final String DEFAULT_MOBILE = "";
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Integer DEFAULT_NEED_BADGE;
  
  public static final Integer DEFAULT_NET_ERROR;
  
  public static final Integer DEFAULT_NOVAL;
  
  public static final Integer DEFAULT_NO_UN;
  
  public static final String DEFAULT_OBJ_LOCATE = "";
  
  public static final String DEFAULT_OBJ_SOURCE = "";
  
  public static final String DEFAULT_PLATFORM = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_PUSH_TID;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_REQUEST_TIMES;
  
  public static final Integer DEFAULT_RESULT_NUM;
  
  public static final Integer DEFAULT_RN;
  
  public static final Integer DEFAULT_RN_NEED;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final Integer DEFAULT_SMILE_GRADE;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_ST_PARAM;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Boolean DEFAULT_SUPPORT_NOUN;
  
  public static final String DEFAULT_UP_SCHEMA = "";
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_WITHCAL;
  
  public static final Integer DEFAULT_WITH_GROUP;
  
  public static final String DEFAULT_YUELAOU_LOCATE = "";
  
  public static final String DEFAULT_YUELAOU_PARAMS = "";
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String ad_bear_context;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String ad_bear_sid;
  
  @ProtoField(tag = 68, type = Message.Datatype.DOUBLE)
  public final Double ad_bear_sid_price;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String ad_context_list;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 51)
  public final AdParam ad_param;
  
  @ProtoField(tag = 50)
  public final AppPosInfo app_pos;
  
  @ProtoField(tag = 64)
  public final AppTransmitData app_transmit_data;
  
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
  public final CommonReq common;
  
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
  
  @ProtoField(tag = 66, type = Message.Datatype.INT32)
  public final Integer has_ad_bear;
  
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
  
  @ProtoField(tag = 70, type = Message.Datatype.INT64)
  public final Long push_tid;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 69, type = Message.Datatype.INT32)
  public final Integer request_times;
  
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
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_RN_NEED = integer;
    DEFAULT_IS_GOOD = integer;
    DEFAULT_CID = integer;
    DEFAULT_WITHCAL = integer;
    DEFAULT_NOVAL = integer;
    DEFAULT_WITH_GROUP = integer;
    DEFAULT_NEED_BADGE = integer;
    DEFAULT_FRS_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    Double double_ = Double.valueOf(0.0D);
    DEFAULT_SCR_DIP = double_;
    DEFAULT_Q_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_CTIME = integer;
    DEFAULT_DATA_SIZE = integer;
    DEFAULT_NET_ERROR = integer;
    DEFAULT_CHECK_LOGIN = Boolean.FALSE;
    DEFAULT_RESULT_NUM = integer;
    DEFAULT_CLASS_ID = integer;
    DEFAULT_IP_INT = integer;
    DEFAULT_ST_PARAM = integer;
    DEFAULT_SMILE_GRADE = integer;
    Boolean bool = Boolean.FALSE;
    DEFAULT_SUPPORT_NOUN = bool;
    DEFAULT_LOGIN = bool;
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_NO_UN = integer;
    DEFAULT_DEBUG = Boolean.FALSE;
    DEFAULT_ISSDK = integer;
    DEFAULT_CATEGORY_ID = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_LAST_CLICK_TID = long_;
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_IS_SELECTION = integer;
    DEFAULT_CALL_FROM = integer;
    DEFAULT_HOT_THREAD_ID = long_;
    DEFAULT_IS_DEFAULT_NAVTAB = integer;
    DEFAULT_DEFAULT_SORT_TYPE = integer;
    DEFAULT_HAS_AD_BEAR = integer;
    DEFAULT_AD_BEAR_SID_PRICE = double_;
    DEFAULT_REQUEST_TIMES = integer;
    DEFAULT_PUSH_TID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str15 = paramBuilder.kw;
      if (str15 == null) {
        this.kw = "";
      } else {
        this.kw = str15;
      } 
      Integer integer16 = paramBuilder.rn;
      if (integer16 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer16;
      } 
      integer16 = paramBuilder.rn_need;
      if (integer16 == null) {
        this.rn_need = DEFAULT_RN_NEED;
      } else {
        this.rn_need = integer16;
      } 
      integer16 = paramBuilder.is_good;
      if (integer16 == null) {
        this.is_good = DEFAULT_IS_GOOD;
      } else {
        this.is_good = integer16;
      } 
      integer16 = paramBuilder.cid;
      if (integer16 == null) {
        this.cid = DEFAULT_CID;
      } else {
        this.cid = integer16;
      } 
      integer16 = paramBuilder.withcal;
      if (integer16 == null) {
        this.withcal = DEFAULT_WITHCAL;
      } else {
        this.withcal = integer16;
      } 
      integer16 = paramBuilder.noval;
      if (integer16 == null) {
        this.noval = DEFAULT_NOVAL;
      } else {
        this.noval = integer16;
      } 
      integer16 = paramBuilder.with_group;
      if (integer16 == null) {
        this.with_group = DEFAULT_WITH_GROUP;
      } else {
        this.with_group = integer16;
      } 
      integer16 = paramBuilder.need_badge;
      if (integer16 == null) {
        this.need_badge = DEFAULT_NEED_BADGE;
      } else {
        this.need_badge = integer16;
      } 
      integer16 = paramBuilder.frs_rn;
      if (integer16 == null) {
        this.frs_rn = DEFAULT_FRS_RN;
      } else {
        this.frs_rn = integer16;
      } 
      integer16 = paramBuilder.scr_w;
      if (integer16 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer16;
      } 
      integer16 = paramBuilder.scr_h;
      if (integer16 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer16;
      } 
      Double double_2 = paramBuilder.scr_dip;
      if (double_2 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_2;
      } 
      Integer integer15 = paramBuilder.q_type;
      if (integer15 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer15;
      } 
      integer15 = paramBuilder.pn;
      if (integer15 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer15;
      } 
      String str14 = paramBuilder.st_type;
      if (str14 == null) {
        this.st_type = "";
      } else {
        this.st_type = str14;
      } 
      Integer integer14 = paramBuilder.ctime;
      if (integer14 == null) {
        this.ctime = DEFAULT_CTIME;
      } else {
        this.ctime = integer14;
      } 
      integer14 = paramBuilder.data_size;
      if (integer14 == null) {
        this.data_size = DEFAULT_DATA_SIZE;
      } else {
        this.data_size = integer14;
      } 
      integer14 = paramBuilder.net_error;
      if (integer14 == null) {
        this.net_error = DEFAULT_NET_ERROR;
      } else {
        this.net_error = integer14;
      } 
      Boolean bool3 = paramBuilder.check_login;
      if (bool3 == null) {
        this.check_login = DEFAULT_CHECK_LOGIN;
      } else {
        this.check_login = bool3;
      } 
      String str13 = paramBuilder.forum_name;
      if (str13 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str13;
      } 
      Integer integer13 = paramBuilder.result_num;
      if (integer13 == null) {
        this.result_num = DEFAULT_RESULT_NUM;
      } else {
        this.result_num = integer13;
      } 
      integer13 = paramBuilder.class_id;
      if (integer13 == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer13;
      } 
      String str12 = paramBuilder.ip_str;
      if (str12 == null) {
        this.ip_str = "";
      } else {
        this.ip_str = str12;
      } 
      Integer integer12 = paramBuilder.ip_int;
      if (integer12 == null) {
        this.ip_int = DEFAULT_IP_INT;
      } else {
        this.ip_int = integer12;
      } 
      String str11 = paramBuilder.module_name;
      if (str11 == null) {
        this.module_name = "";
      } else {
        this.module_name = str11;
      } 
      Integer integer11 = paramBuilder.st_param;
      if (integer11 == null) {
        this.st_param = DEFAULT_ST_PARAM;
      } else {
        this.st_param = integer11;
      } 
      integer11 = paramBuilder.smile_grade;
      if (integer11 == null) {
        this.smile_grade = DEFAULT_SMILE_GRADE;
      } else {
        this.smile_grade = integer11;
      } 
      Boolean bool2 = paramBuilder.support_noun;
      if (bool2 == null) {
        this.support_noun = DEFAULT_SUPPORT_NOUN;
      } else {
        this.support_noun = bool2;
      } 
      bool2 = paramBuilder.login;
      if (bool2 == null) {
        this.login = DEFAULT_LOGIN;
      } else {
        this.login = bool2;
      } 
      Long long_3 = paramBuilder.user_id;
      if (long_3 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_3;
      } 
      String str10 = paramBuilder.user_name;
      if (str10 == null) {
        this.user_name = "";
      } else {
        this.user_name = str10;
      } 
      Integer integer10 = paramBuilder.no_un;
      if (integer10 == null) {
        this.no_un = DEFAULT_NO_UN;
      } else {
        this.no_un = integer10;
      } 
      String str9 = paramBuilder.portrait;
      if (str9 == null) {
        this.portrait = "";
      } else {
        this.portrait = str9;
      } 
      str9 = paramBuilder.mobile;
      if (str9 == null) {
        this.mobile = "";
      } else {
        this.mobile = str9;
      } 
      str9 = paramBuilder.email;
      if (str9 == null) {
        this.email = "";
      } else {
        this.email = str9;
      } 
      Boolean bool1 = paramBuilder.debug;
      if (bool1 == null) {
        this.debug = DEFAULT_DEBUG;
      } else {
        this.debug = bool1;
      } 
      String str8 = paramBuilder.cookie;
      if (str8 == null) {
        this.cookie = "";
      } else {
        this.cookie = str8;
      } 
      this.common = paramBuilder.common;
      str8 = paramBuilder.lastids;
      if (str8 == null) {
        this.lastids = "";
      } else {
        this.lastids = str8;
      } 
      Integer integer9 = paramBuilder.issdk;
      if (integer9 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer9;
      } 
      String str7 = paramBuilder.da_idfa;
      if (str7 == null) {
        this.da_idfa = "";
      } else {
        this.da_idfa = str7;
      } 
      str7 = paramBuilder.platform;
      if (str7 == null) {
        this.platform = "";
      } else {
        this.platform = str7;
      } 
      Integer integer8 = paramBuilder.category_id;
      if (integer8 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer8;
      } 
      String str6 = paramBuilder.yuelaou_locate;
      if (str6 == null) {
        this.yuelaou_locate = "";
      } else {
        this.yuelaou_locate = str6;
      } 
      str6 = paramBuilder.yuelaou_params;
      if (str6 == null) {
        this.yuelaou_params = "";
      } else {
        this.yuelaou_params = str6;
      } 
      Integer integer7 = paramBuilder.sort_type;
      if (integer7 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer7;
      } 
      Long long_2 = paramBuilder.last_click_tid;
      if (long_2 == null) {
        this.last_click_tid = DEFAULT_LAST_CLICK_TID;
      } else {
        this.last_click_tid = long_2;
      } 
      Integer integer6 = paramBuilder.load_type;
      if (integer6 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer6;
      } 
      this.app_pos = paramBuilder.app_pos;
      this.ad_param = paramBuilder.ad_param;
      String str5 = paramBuilder.obj_locate;
      if (str5 == null) {
        this.obj_locate = "";
      } else {
        this.obj_locate = str5;
      } 
      str5 = paramBuilder.obj_source;
      if (str5 == null) {
        this.obj_source = "";
      } else {
        this.obj_source = str5;
      } 
      str5 = paramBuilder.call_url;
      if (str5 == null) {
        this.call_url = "";
      } else {
        this.call_url = str5;
      } 
      Integer integer5 = paramBuilder.is_selection;
      if (integer5 == null) {
        this.is_selection = DEFAULT_IS_SELECTION;
      } else {
        this.is_selection = integer5;
      } 
      integer5 = paramBuilder.call_from;
      if (integer5 == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = integer5;
      } 
      String str4 = paramBuilder.shoubai_cuid;
      if (str4 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str4;
      } 
      Long long_1 = paramBuilder.hot_thread_id;
      if (long_1 == null) {
        this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
      } else {
        this.hot_thread_id = long_1;
      } 
      Integer integer4 = paramBuilder.is_default_navtab;
      if (integer4 == null) {
        this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
      } else {
        this.is_default_navtab = integer4;
      } 
      String str3 = paramBuilder.ad_context_list;
      if (str3 == null) {
        this.ad_context_list = "";
      } else {
        this.ad_context_list = str3;
      } 
      str3 = paramBuilder.up_schema;
      if (str3 == null) {
        this.up_schema = "";
      } else {
        this.up_schema = str3;
      } 
      str3 = paramBuilder.ad_ext_params;
      if (str3 == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str3;
      } 
      Integer integer3 = paramBuilder.default_sort_type;
      if (integer3 == null) {
        this.default_sort_type = DEFAULT_DEFAULT_SORT_TYPE;
      } else {
        this.default_sort_type = integer3;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      String str2 = paramBuilder.ad_bear_context;
      if (str2 == null) {
        this.ad_bear_context = "";
      } else {
        this.ad_bear_context = str2;
      } 
      Integer integer2 = paramBuilder.has_ad_bear;
      if (integer2 == null) {
        this.has_ad_bear = DEFAULT_HAS_AD_BEAR;
      } else {
        this.has_ad_bear = integer2;
      } 
      String str1 = paramBuilder.ad_bear_sid;
      if (str1 == null) {
        this.ad_bear_sid = "";
      } else {
        this.ad_bear_sid = str1;
      } 
      Double double_1 = paramBuilder.ad_bear_sid_price;
      if (double_1 == null) {
        this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
      } else {
        this.ad_bear_sid_price = double_1;
      } 
      Integer integer1 = paramBuilder.request_times;
      if (integer1 == null) {
        this.request_times = DEFAULT_REQUEST_TIMES;
      } else {
        this.request_times = integer1;
      } 
      long_ = paramBuilder.push_tid;
      if (long_ == null) {
        this.push_tid = DEFAULT_PUSH_TID;
      } else {
        this.push_tid = long_;
      } 
    } else {
      this.kw = ((Builder)long_).kw;
      this.rn = ((Builder)long_).rn;
      this.rn_need = ((Builder)long_).rn_need;
      this.is_good = ((Builder)long_).is_good;
      this.cid = ((Builder)long_).cid;
      this.withcal = ((Builder)long_).withcal;
      this.noval = ((Builder)long_).noval;
      this.with_group = ((Builder)long_).with_group;
      this.need_badge = ((Builder)long_).need_badge;
      this.frs_rn = ((Builder)long_).frs_rn;
      this.scr_w = ((Builder)long_).scr_w;
      this.scr_h = ((Builder)long_).scr_h;
      this.scr_dip = ((Builder)long_).scr_dip;
      this.q_type = ((Builder)long_).q_type;
      this.pn = ((Builder)long_).pn;
      this.st_type = ((Builder)long_).st_type;
      this.ctime = ((Builder)long_).ctime;
      this.data_size = ((Builder)long_).data_size;
      this.net_error = ((Builder)long_).net_error;
      this.check_login = ((Builder)long_).check_login;
      this.forum_name = ((Builder)long_).forum_name;
      this.result_num = ((Builder)long_).result_num;
      this.class_id = ((Builder)long_).class_id;
      this.ip_str = ((Builder)long_).ip_str;
      this.ip_int = ((Builder)long_).ip_int;
      this.module_name = ((Builder)long_).module_name;
      this.st_param = ((Builder)long_).st_param;
      this.smile_grade = ((Builder)long_).smile_grade;
      this.support_noun = ((Builder)long_).support_noun;
      this.login = ((Builder)long_).login;
      this.user_id = ((Builder)long_).user_id;
      this.user_name = ((Builder)long_).user_name;
      this.no_un = ((Builder)long_).no_un;
      this.portrait = ((Builder)long_).portrait;
      this.mobile = ((Builder)long_).mobile;
      this.email = ((Builder)long_).email;
      this.debug = ((Builder)long_).debug;
      this.cookie = ((Builder)long_).cookie;
      this.common = ((Builder)long_).common;
      this.lastids = ((Builder)long_).lastids;
      this.issdk = ((Builder)long_).issdk;
      this.da_idfa = ((Builder)long_).da_idfa;
      this.platform = ((Builder)long_).platform;
      this.category_id = ((Builder)long_).category_id;
      this.yuelaou_locate = ((Builder)long_).yuelaou_locate;
      this.yuelaou_params = ((Builder)long_).yuelaou_params;
      this.sort_type = ((Builder)long_).sort_type;
      this.last_click_tid = ((Builder)long_).last_click_tid;
      this.load_type = ((Builder)long_).load_type;
      this.app_pos = ((Builder)long_).app_pos;
      this.ad_param = ((Builder)long_).ad_param;
      this.obj_locate = ((Builder)long_).obj_locate;
      this.obj_source = ((Builder)long_).obj_source;
      this.call_url = ((Builder)long_).call_url;
      this.is_selection = ((Builder)long_).is_selection;
      this.call_from = ((Builder)long_).call_from;
      this.shoubai_cuid = ((Builder)long_).shoubai_cuid;
      this.hot_thread_id = ((Builder)long_).hot_thread_id;
      this.is_default_navtab = ((Builder)long_).is_default_navtab;
      this.ad_context_list = ((Builder)long_).ad_context_list;
      this.up_schema = ((Builder)long_).up_schema;
      this.ad_ext_params = ((Builder)long_).ad_ext_params;
      this.default_sort_type = ((Builder)long_).default_sort_type;
      this.app_transmit_data = ((Builder)long_).app_transmit_data;
      this.ad_bear_context = ((Builder)long_).ad_bear_context;
      this.has_ad_bear = ((Builder)long_).has_ad_bear;
      this.ad_bear_sid = ((Builder)long_).ad_bear_sid;
      this.ad_bear_sid_price = ((Builder)long_).ad_bear_sid_price;
      this.request_times = ((Builder)long_).request_times;
      this.push_tid = ((Builder)long_).push_tid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String ad_bear_context;
    
    public String ad_bear_sid;
    
    public Double ad_bear_sid_price;
    
    public String ad_context_list;
    
    public String ad_ext_params;
    
    public AdParam ad_param;
    
    public AppPosInfo app_pos;
    
    public AppTransmitData app_transmit_data;
    
    public Integer call_from;
    
    public String call_url;
    
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
    
    public Integer default_sort_type;
    
    public String email;
    
    public String forum_name;
    
    public Integer frs_rn;
    
    public Integer has_ad_bear;
    
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
    
    public Long push_tid;
    
    public Integer q_type;
    
    public Integer request_times;
    
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
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.kw = param1DataReq.kw;
      this.rn = param1DataReq.rn;
      this.rn_need = param1DataReq.rn_need;
      this.is_good = param1DataReq.is_good;
      this.cid = param1DataReq.cid;
      this.withcal = param1DataReq.withcal;
      this.noval = param1DataReq.noval;
      this.with_group = param1DataReq.with_group;
      this.need_badge = param1DataReq.need_badge;
      this.frs_rn = param1DataReq.frs_rn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.pn = param1DataReq.pn;
      this.st_type = param1DataReq.st_type;
      this.ctime = param1DataReq.ctime;
      this.data_size = param1DataReq.data_size;
      this.net_error = param1DataReq.net_error;
      this.check_login = param1DataReq.check_login;
      this.forum_name = param1DataReq.forum_name;
      this.result_num = param1DataReq.result_num;
      this.class_id = param1DataReq.class_id;
      this.ip_str = param1DataReq.ip_str;
      this.ip_int = param1DataReq.ip_int;
      this.module_name = param1DataReq.module_name;
      this.st_param = param1DataReq.st_param;
      this.smile_grade = param1DataReq.smile_grade;
      this.support_noun = param1DataReq.support_noun;
      this.login = param1DataReq.login;
      this.user_id = param1DataReq.user_id;
      this.user_name = param1DataReq.user_name;
      this.no_un = param1DataReq.no_un;
      this.portrait = param1DataReq.portrait;
      this.mobile = param1DataReq.mobile;
      this.email = param1DataReq.email;
      this.debug = param1DataReq.debug;
      this.cookie = param1DataReq.cookie;
      this.common = param1DataReq.common;
      this.lastids = param1DataReq.lastids;
      this.issdk = param1DataReq.issdk;
      this.da_idfa = param1DataReq.da_idfa;
      this.platform = param1DataReq.platform;
      this.category_id = param1DataReq.category_id;
      this.yuelaou_locate = param1DataReq.yuelaou_locate;
      this.yuelaou_params = param1DataReq.yuelaou_params;
      this.sort_type = param1DataReq.sort_type;
      this.last_click_tid = param1DataReq.last_click_tid;
      this.load_type = param1DataReq.load_type;
      this.app_pos = param1DataReq.app_pos;
      this.ad_param = param1DataReq.ad_param;
      this.obj_locate = param1DataReq.obj_locate;
      this.obj_source = param1DataReq.obj_source;
      this.call_url = param1DataReq.call_url;
      this.is_selection = param1DataReq.is_selection;
      this.call_from = param1DataReq.call_from;
      this.shoubai_cuid = param1DataReq.shoubai_cuid;
      this.hot_thread_id = param1DataReq.hot_thread_id;
      this.is_default_navtab = param1DataReq.is_default_navtab;
      this.ad_context_list = param1DataReq.ad_context_list;
      this.up_schema = param1DataReq.up_schema;
      this.ad_ext_params = param1DataReq.ad_ext_params;
      this.default_sort_type = param1DataReq.default_sort_type;
      this.app_transmit_data = param1DataReq.app_transmit_data;
      this.ad_bear_context = param1DataReq.ad_bear_context;
      this.has_ad_bear = param1DataReq.has_ad_bear;
      this.ad_bear_sid = param1DataReq.ad_bear_sid;
      this.ad_bear_sid_price = param1DataReq.ad_bear_sid_price;
      this.request_times = param1DataReq.request_times;
      this.push_tid = param1DataReq.push_tid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
