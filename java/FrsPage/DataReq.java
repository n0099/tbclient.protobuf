package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.AppTransmitData;
import tbclient.CommonReq;
import tbclient.FrsPage.AdParam;

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
  
  public static final Integer DEFAULT_Q_TYPE;
  
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
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1238029110, "Ltbclient/FrsPage/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1238029110, "Ltbclient/FrsPage/DataReq;");
          return;
        } 
      } 
    } 
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
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      String str15 = paramBuilder.kw;
      if (str15 == null) {
        this.kw = "";
      } else {
        this.kw = str15;
      } 
      Integer integer15 = paramBuilder.rn;
      if (integer15 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer15;
      } 
      integer15 = paramBuilder.rn_need;
      if (integer15 == null) {
        this.rn_need = DEFAULT_RN_NEED;
      } else {
        this.rn_need = integer15;
      } 
      integer15 = paramBuilder.is_good;
      if (integer15 == null) {
        this.is_good = DEFAULT_IS_GOOD;
      } else {
        this.is_good = integer15;
      } 
      integer15 = paramBuilder.cid;
      if (integer15 == null) {
        this.cid = DEFAULT_CID;
      } else {
        this.cid = integer15;
      } 
      integer15 = paramBuilder.withcal;
      if (integer15 == null) {
        this.withcal = DEFAULT_WITHCAL;
      } else {
        this.withcal = integer15;
      } 
      integer15 = paramBuilder.noval;
      if (integer15 == null) {
        this.noval = DEFAULT_NOVAL;
      } else {
        this.noval = integer15;
      } 
      integer15 = paramBuilder.with_group;
      if (integer15 == null) {
        this.with_group = DEFAULT_WITH_GROUP;
      } else {
        this.with_group = integer15;
      } 
      integer15 = paramBuilder.need_badge;
      if (integer15 == null) {
        this.need_badge = DEFAULT_NEED_BADGE;
      } else {
        this.need_badge = integer15;
      } 
      integer15 = paramBuilder.frs_rn;
      if (integer15 == null) {
        this.frs_rn = DEFAULT_FRS_RN;
      } else {
        this.frs_rn = integer15;
      } 
      integer15 = paramBuilder.scr_w;
      if (integer15 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer15;
      } 
      integer15 = paramBuilder.scr_h;
      if (integer15 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer15;
      } 
      Double double_1 = paramBuilder.scr_dip;
      if (double_1 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_1;
      } 
      Integer integer14 = paramBuilder.q_type;
      if (integer14 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer14;
      } 
      integer14 = paramBuilder.pn;
      if (integer14 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer14;
      } 
      String str14 = paramBuilder.st_type;
      if (str14 == null) {
        this.st_type = "";
      } else {
        this.st_type = str14;
      } 
      Integer integer13 = paramBuilder.ctime;
      if (integer13 == null) {
        this.ctime = DEFAULT_CTIME;
      } else {
        this.ctime = integer13;
      } 
      integer13 = paramBuilder.data_size;
      if (integer13 == null) {
        this.data_size = DEFAULT_DATA_SIZE;
      } else {
        this.data_size = integer13;
      } 
      integer13 = paramBuilder.net_error;
      if (integer13 == null) {
        this.net_error = DEFAULT_NET_ERROR;
      } else {
        this.net_error = integer13;
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
      Integer integer12 = paramBuilder.result_num;
      if (integer12 == null) {
        this.result_num = DEFAULT_RESULT_NUM;
      } else {
        this.result_num = integer12;
      } 
      integer12 = paramBuilder.class_id;
      if (integer12 == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer12;
      } 
      String str12 = paramBuilder.ip_str;
      if (str12 == null) {
        this.ip_str = "";
      } else {
        this.ip_str = str12;
      } 
      Integer integer11 = paramBuilder.ip_int;
      if (integer11 == null) {
        this.ip_int = DEFAULT_IP_INT;
      } else {
        this.ip_int = integer11;
      } 
      String str11 = paramBuilder.module_name;
      if (str11 == null) {
        this.module_name = "";
      } else {
        this.module_name = str11;
      } 
      Integer integer10 = paramBuilder.st_param;
      if (integer10 == null) {
        this.st_param = DEFAULT_ST_PARAM;
      } else {
        this.st_param = integer10;
      } 
      integer10 = paramBuilder.smile_grade;
      if (integer10 == null) {
        this.smile_grade = DEFAULT_SMILE_GRADE;
      } else {
        this.smile_grade = integer10;
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
      Integer integer9 = paramBuilder.no_un;
      if (integer9 == null) {
        this.no_un = DEFAULT_NO_UN;
      } else {
        this.no_un = integer9;
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
      Integer integer8 = paramBuilder.issdk;
      if (integer8 == null) {
        this.issdk = DEFAULT_ISSDK;
      } else {
        this.issdk = integer8;
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
      Integer integer7 = paramBuilder.category_id;
      if (integer7 == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer7;
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
      Integer integer6 = paramBuilder.sort_type;
      if (integer6 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer6;
      } 
      Long long_2 = paramBuilder.last_click_tid;
      if (long_2 == null) {
        this.last_click_tid = DEFAULT_LAST_CLICK_TID;
      } else {
        this.last_click_tid = long_2;
      } 
      Integer integer5 = paramBuilder.load_type;
      if (integer5 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer5;
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
      Integer integer4 = paramBuilder.is_selection;
      if (integer4 == null) {
        this.is_selection = DEFAULT_IS_SELECTION;
      } else {
        this.is_selection = integer4;
      } 
      integer4 = paramBuilder.call_from;
      if (integer4 == null) {
        this.call_from = DEFAULT_CALL_FROM;
      } else {
        this.call_from = integer4;
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
      Integer integer3 = paramBuilder.is_default_navtab;
      if (integer3 == null) {
        this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
      } else {
        this.is_default_navtab = integer3;
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
      Integer integer2 = paramBuilder.default_sort_type;
      if (integer2 == null) {
        this.default_sort_type = DEFAULT_DEFAULT_SORT_TYPE;
      } else {
        this.default_sort_type = integer2;
      } 
      this.app_transmit_data = paramBuilder.app_transmit_data;
      String str2 = paramBuilder.ad_bear_context;
      if (str2 == null) {
        this.ad_bear_context = "";
      } else {
        this.ad_bear_context = str2;
      } 
      Integer integer1 = paramBuilder.has_ad_bear;
      if (integer1 == null) {
        this.has_ad_bear = DEFAULT_HAS_AD_BEAR;
      } else {
        this.has_ad_bear = integer1;
      } 
      String str1 = paramBuilder.ad_bear_sid;
      if (str1 == null) {
        this.ad_bear_sid = "";
      } else {
        this.ad_bear_sid = str1;
      } 
      double_ = paramBuilder.ad_bear_sid_price;
      if (double_ == null) {
        this.ad_bear_sid_price = DEFAULT_AD_BEAR_SID_PRICE;
      } else {
        this.ad_bear_sid_price = double_;
      } 
    } else {
      this.kw = ((Builder)double_).kw;
      this.rn = ((Builder)double_).rn;
      this.rn_need = ((Builder)double_).rn_need;
      this.is_good = ((Builder)double_).is_good;
      this.cid = ((Builder)double_).cid;
      this.withcal = ((Builder)double_).withcal;
      this.noval = ((Builder)double_).noval;
      this.with_group = ((Builder)double_).with_group;
      this.need_badge = ((Builder)double_).need_badge;
      this.frs_rn = ((Builder)double_).frs_rn;
      this.scr_w = ((Builder)double_).scr_w;
      this.scr_h = ((Builder)double_).scr_h;
      this.scr_dip = ((Builder)double_).scr_dip;
      this.q_type = ((Builder)double_).q_type;
      this.pn = ((Builder)double_).pn;
      this.st_type = ((Builder)double_).st_type;
      this.ctime = ((Builder)double_).ctime;
      this.data_size = ((Builder)double_).data_size;
      this.net_error = ((Builder)double_).net_error;
      this.check_login = ((Builder)double_).check_login;
      this.forum_name = ((Builder)double_).forum_name;
      this.result_num = ((Builder)double_).result_num;
      this.class_id = ((Builder)double_).class_id;
      this.ip_str = ((Builder)double_).ip_str;
      this.ip_int = ((Builder)double_).ip_int;
      this.module_name = ((Builder)double_).module_name;
      this.st_param = ((Builder)double_).st_param;
      this.smile_grade = ((Builder)double_).smile_grade;
      this.support_noun = ((Builder)double_).support_noun;
      this.login = ((Builder)double_).login;
      this.user_id = ((Builder)double_).user_id;
      this.user_name = ((Builder)double_).user_name;
      this.no_un = ((Builder)double_).no_un;
      this.portrait = ((Builder)double_).portrait;
      this.mobile = ((Builder)double_).mobile;
      this.email = ((Builder)double_).email;
      this.debug = ((Builder)double_).debug;
      this.cookie = ((Builder)double_).cookie;
      this.common = ((Builder)double_).common;
      this.lastids = ((Builder)double_).lastids;
      this.issdk = ((Builder)double_).issdk;
      this.da_idfa = ((Builder)double_).da_idfa;
      this.platform = ((Builder)double_).platform;
      this.category_id = ((Builder)double_).category_id;
      this.yuelaou_locate = ((Builder)double_).yuelaou_locate;
      this.yuelaou_params = ((Builder)double_).yuelaou_params;
      this.sort_type = ((Builder)double_).sort_type;
      this.last_click_tid = ((Builder)double_).last_click_tid;
      this.load_type = ((Builder)double_).load_type;
      this.app_pos = ((Builder)double_).app_pos;
      this.ad_param = ((Builder)double_).ad_param;
      this.obj_locate = ((Builder)double_).obj_locate;
      this.obj_source = ((Builder)double_).obj_source;
      this.call_url = ((Builder)double_).call_url;
      this.is_selection = ((Builder)double_).is_selection;
      this.call_from = ((Builder)double_).call_from;
      this.shoubai_cuid = ((Builder)double_).shoubai_cuid;
      this.hot_thread_id = ((Builder)double_).hot_thread_id;
      this.is_default_navtab = ((Builder)double_).is_default_navtab;
      this.ad_context_list = ((Builder)double_).ad_context_list;
      this.up_schema = ((Builder)double_).up_schema;
      this.ad_ext_params = ((Builder)double_).ad_ext_params;
      this.default_sort_type = ((Builder)double_).default_sort_type;
      this.app_transmit_data = ((Builder)double_).app_transmit_data;
      this.ad_bear_context = ((Builder)double_).ad_bear_context;
      this.has_ad_bear = ((Builder)double_).has_ad_bear;
      this.ad_bear_sid = ((Builder)double_).ad_bear_sid;
      this.ad_bear_sid_price = ((Builder)double_).ad_bear_sid_price;
    } 
  }
}
