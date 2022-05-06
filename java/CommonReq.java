import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class CommonReq extends Message {
  public static final Long DEFAULT_ACTIVE_TIMESTAMP;
  
  public static final String DEFAULT_AFDI = "";
  
  public static final String DEFAULT_ANDROID_ID = "";
  
  public static final String DEFAULT_APID = "";
  
  public static final String DEFAULT_APPLIST = "";
  
  public static final String DEFAULT_BDUSS = "";
  
  public static final String DEFAULT_BRAND = "";
  
  public static final String DEFAULT_BRAND_TYPE = "";
  
  public static final String DEFAULT_C3_AID = "";
  
  public static final String DEFAULT_CAID = "";
  
  public static final String DEFAULT_CAM = "";
  
  public static final Integer DEFAULT_CMODE;
  
  public static final String DEFAULT_CUID = "";
  
  public static final String DEFAULT_CUID_GALAXY2 = "";
  
  public static final String DEFAULT_CUID_GID = "";
  
  public static final String DEFAULT_DI_DIORDNA = "";
  
  public static final String DEFAULT_EVENT_DAY = "";
  
  public static final String DEFAULT_EXTRA = "";
  
  public static final Long DEFAULT_FIRST_INSTALL_TIME;
  
  public static final String DEFAULT_FRAMEWORK_VER = "";
  
  public static final String DEFAULT_FROM = "";
  
  public static final String DEFAULT_IDFA = "";
  
  public static final String DEFAULT_IDFV = "";
  
  public static final String DEFAULT_IEMI = "";
  
  public static final String DEFAULT_IEMIWEN = "";
  
  public static final Integer DEFAULT_IS_TEENAGER;
  
  public static final String DEFAULT_KA = "";
  
  public static final Long DEFAULT_LAST_UPDATE_TIME;
  
  public static final String DEFAULT_LEGO_LIB_VERSION = "";
  
  public static final String DEFAULT_MAC = "";
  
  public static final String DEFAULT_MODEL = "";
  
  public static final String DEFAULT_M_API = "";
  
  public static final String DEFAULT_M_COST = "";
  
  public static final String DEFAULT_M_LOGID = "";
  
  public static final String DEFAULT_M_RESULT = "";
  
  public static final String DEFAULT_M_SIZE_D = "";
  
  public static final String DEFAULT_M_SIZE_U = "";
  
  public static final Integer DEFAULT_NET_TYPE;
  
  public static final String DEFAULT_OAID = "";
  
  public static final Integer DEFAULT_PERSONALIZED_REC_SWITCH;
  
  public static final String DEFAULT_PVERSION = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final String DEFAULT_SAMPLE_ID = "";
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_SDK_VER = "";
  
  public static final String DEFAULT_SHOUBAI_CUID = "";
  
  public static final String DEFAULT_SIGN = "";
  
  public static final String DEFAULT_SMALLFLOW = "";
  
  public static final String DEFAULT_START_SCHEME = "";
  
  public static final Integer DEFAULT_START_TYPE;
  
  public static final String DEFAULT_STOKEN = "";
  
  public static final String DEFAULT_SUBAPP_TYPE = "";
  
  public static final String DEFAULT_SWAN_GAME_VER = "";
  
  public static final String DEFAULT_TBS = "";
  
  public static final String DEFAULT_USER_AGENT = "";
  
  public static final String DEFAULT_VFDI = "";
  
  public static final String DEFAULT_Z_ID = "";
  
  public static final String DEFAULT__CLIENT_ID = "";
  
  public static final Integer DEFAULT__CLIENT_TYPE;
  
  public static final String DEFAULT__CLIENT_VERSION = "";
  
  public static final String DEFAULT__OS_VERSION = "";
  
  public static final String DEFAULT__PHONE_IMEI = "";
  
  public static final String DEFAULT__PHONE_NEWIMEI = "";
  
  public static final Long DEFAULT__TIMESTAMP;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String BDUSS;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String _client_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer _client_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String _client_version;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String _os_version;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String _phone_imei;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String _phone_newimei;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT64)
  public final Long _timestamp;
  
  @ProtoField(tag = 49, type = Message.Datatype.INT64)
  public final Long active_timestamp;
  
  @ProtoField(tag = 67, type = Message.Datatype.STRING)
  public final String afdi;
  
  @ProtoField(tag = 54, type = Message.Datatype.STRING)
  public final String android_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String apid;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String applist;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String brand;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String brand_type;
  
  @ProtoField(tag = 35, type = Message.Datatype.STRING)
  public final String c3_aid;
  
  @ProtoField(tag = 46, type = Message.Datatype.STRING)
  public final String caid;
  
  @ProtoField(tag = 66, type = Message.Datatype.STRING)
  public final String cam;
  
  @ProtoField(tag = 55, type = Message.Datatype.INT32)
  public final Integer cmode;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String cuid;
  
  @ProtoField(tag = 32, type = Message.Datatype.STRING)
  public final String cuid_galaxy2;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String cuid_gid;
  
  @ProtoField(tag = 68, type = Message.Datatype.STRING)
  public final String di_diordna;
  
  @ProtoField(tag = 53, type = Message.Datatype.STRING)
  public final String event_day;
  
  @ProtoField(tag = 61, type = Message.Datatype.STRING)
  public final String extra;
  
  @ProtoField(tag = 50, type = Message.Datatype.INT64)
  public final Long first_install_time;
  
  @ProtoField(tag = 43, type = Message.Datatype.STRING)
  public final String framework_ver;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String from;
  
  @ProtoField(tag = 45, type = Message.Datatype.STRING)
  public final String idfa;
  
  @ProtoField(tag = 60, type = Message.Datatype.STRING)
  public final String idfv;
  
  @ProtoField(tag = 64, type = Message.Datatype.STRING)
  public final String iemi;
  
  @ProtoField(tag = 65, type = Message.Datatype.STRING)
  public final String iemiwen;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer is_teenager;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String ka;
  
  @ProtoField(tag = 51, type = Message.Datatype.INT64)
  public final Long last_update_time;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String lego_lib_version;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String m_api;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String m_cost;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String m_logid;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String m_result;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String m_size_d;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String m_size_u;
  
  @ProtoField(tag = 59, type = Message.Datatype.STRING)
  public final String mac;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String model;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT32)
  public final Integer net_type;
  
  @ProtoField(tag = 34, type = Message.Datatype.STRING)
  public final String oaid;
  
  @ProtoField(tag = 63, type = Message.Datatype.INT32)
  public final Integer personalized_rec_switch;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String pversion;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String sample_id;
  
  @ProtoField(tag = 39, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 38, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 37, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String sdk_ver;
  
  @ProtoField(tag = 58, type = Message.Datatype.STRING)
  public final String shoubai_cuid;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String sign;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String smallflow;
  
  @ProtoField(tag = 56, type = Message.Datatype.STRING)
  public final String start_scheme;
  
  @ProtoField(tag = 57, type = Message.Datatype.INT32)
  public final Integer start_type;
  
  @ProtoField(tag = 30, type = Message.Datatype.STRING)
  public final String stoken;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String subapp_type;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String swan_game_ver;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String tbs;
  
  @ProtoField(tag = 62, type = Message.Datatype.STRING)
  public final String user_agent;
  
  @ProtoField(tag = 69, type = Message.Datatype.STRING)
  public final String vfdi;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String z_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1811576750, "Ltbclient/CommonReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1811576750, "Ltbclient/CommonReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT__CLIENT_TYPE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT__TIMESTAMP = long_;
    DEFAULT_NET_TYPE = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_IS_TEENAGER = integer;
    DEFAULT_ACTIVE_TIMESTAMP = long_;
    DEFAULT_FIRST_INSTALL_TIME = long_;
    DEFAULT_LAST_UPDATE_TIME = long_;
    DEFAULT_CMODE = integer;
    DEFAULT_START_TYPE = integer;
    DEFAULT_PERSONALIZED_REC_SWITCH = integer;
  }
  
  public CommonReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer7 = paramBuilder._client_type;
      if (integer7 == null) {
        this._client_type = DEFAULT__CLIENT_TYPE;
      } else {
        this._client_type = integer7;
      } 
      String str8 = paramBuilder._client_version;
      if (str8 == null) {
        this._client_version = "";
      } else {
        this._client_version = str8;
      } 
      str8 = paramBuilder._client_id;
      if (str8 == null) {
        this._client_id = "";
      } else {
        this._client_id = str8;
      } 
      str8 = paramBuilder.apid;
      if (str8 == null) {
        this.apid = "";
      } else {
        this.apid = str8;
      } 
      str8 = paramBuilder._phone_imei;
      if (str8 == null) {
        this._phone_imei = "";
      } else {
        this._phone_imei = str8;
      } 
      str8 = paramBuilder.from;
      if (str8 == null) {
        this.from = "";
      } else {
        this.from = str8;
      } 
      str8 = paramBuilder.cuid;
      if (str8 == null) {
        this.cuid = "";
      } else {
        this.cuid = str8;
      } 
      Long long_2 = paramBuilder._timestamp;
      if (long_2 == null) {
        this._timestamp = DEFAULT__TIMESTAMP;
      } else {
        this._timestamp = long_2;
      } 
      String str7 = paramBuilder.model;
      if (str7 == null) {
        this.model = "";
      } else {
        this.model = str7;
      } 
      str7 = paramBuilder.BDUSS;
      if (str7 == null) {
        this.BDUSS = "";
      } else {
        this.BDUSS = str7;
      } 
      str7 = paramBuilder.tbs;
      if (str7 == null) {
        this.tbs = "";
      } else {
        this.tbs = str7;
      } 
      Integer integer6 = paramBuilder.net_type;
      if (integer6 == null) {
        this.net_type = DEFAULT_NET_TYPE;
      } else {
        this.net_type = integer6;
      } 
      String str6 = paramBuilder.subapp_type;
      if (str6 == null) {
        this.subapp_type = "";
      } else {
        this.subapp_type = str6;
      } 
      str6 = paramBuilder._phone_newimei;
      if (str6 == null) {
        this._phone_newimei = "";
      } else {
        this._phone_newimei = str6;
      } 
      str6 = paramBuilder.ka;
      if (str6 == null) {
        this.ka = "";
      } else {
        this.ka = str6;
      } 
      str6 = paramBuilder.m_api;
      if (str6 == null) {
        this.m_api = "";
      } else {
        this.m_api = str6;
      } 
      str6 = paramBuilder.m_logid;
      if (str6 == null) {
        this.m_logid = "";
      } else {
        this.m_logid = str6;
      } 
      str6 = paramBuilder.m_cost;
      if (str6 == null) {
        this.m_cost = "";
      } else {
        this.m_cost = str6;
      } 
      str6 = paramBuilder.m_result;
      if (str6 == null) {
        this.m_result = "";
      } else {
        this.m_result = str6;
      } 
      str6 = paramBuilder.m_size_u;
      if (str6 == null) {
        this.m_size_u = "";
      } else {
        this.m_size_u = str6;
      } 
      str6 = paramBuilder.m_size_d;
      if (str6 == null) {
        this.m_size_d = "";
      } else {
        this.m_size_d = str6;
      } 
      str6 = paramBuilder.smallflow;
      if (str6 == null) {
        this.smallflow = "";
      } else {
        this.smallflow = str6;
      } 
      str6 = paramBuilder.sign;
      if (str6 == null) {
        this.sign = "";
      } else {
        this.sign = str6;
      } 
      str6 = paramBuilder.pversion;
      if (str6 == null) {
        this.pversion = "";
      } else {
        this.pversion = str6;
      } 
      str6 = paramBuilder._os_version;
      if (str6 == null) {
        this._os_version = "";
      } else {
        this._os_version = str6;
      } 
      str6 = paramBuilder.brand;
      if (str6 == null) {
        this.brand = "";
      } else {
        this.brand = str6;
      } 
      str6 = paramBuilder.brand_type;
      if (str6 == null) {
        this.brand_type = "";
      } else {
        this.brand_type = str6;
      } 
      str6 = paramBuilder.lego_lib_version;
      if (str6 == null) {
        this.lego_lib_version = "";
      } else {
        this.lego_lib_version = str6;
      } 
      str6 = paramBuilder.applist;
      if (str6 == null) {
        this.applist = "";
      } else {
        this.applist = str6;
      } 
      str6 = paramBuilder.stoken;
      if (str6 == null) {
        this.stoken = "";
      } else {
        this.stoken = str6;
      } 
      str6 = paramBuilder.z_id;
      if (str6 == null) {
        this.z_id = "";
      } else {
        this.z_id = str6;
      } 
      str6 = paramBuilder.cuid_galaxy2;
      if (str6 == null) {
        this.cuid_galaxy2 = "";
      } else {
        this.cuid_galaxy2 = str6;
      } 
      str6 = paramBuilder.cuid_gid;
      if (str6 == null) {
        this.cuid_gid = "";
      } else {
        this.cuid_gid = str6;
      } 
      str6 = paramBuilder.oaid;
      if (str6 == null) {
        this.oaid = "";
      } else {
        this.oaid = str6;
      } 
      str6 = paramBuilder.c3_aid;
      if (str6 == null) {
        this.c3_aid = "";
      } else {
        this.c3_aid = str6;
      } 
      str6 = paramBuilder.sample_id;
      if (str6 == null) {
        this.sample_id = "";
      } else {
        this.sample_id = str6;
      } 
      Integer integer5 = paramBuilder.scr_w;
      if (integer5 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer5;
      } 
      integer5 = paramBuilder.scr_h;
      if (integer5 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer5;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer4 = paramBuilder.q_type;
      if (integer4 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer4;
      } 
      integer4 = paramBuilder.is_teenager;
      if (integer4 == null) {
        this.is_teenager = DEFAULT_IS_TEENAGER;
      } else {
        this.is_teenager = integer4;
      } 
      String str5 = paramBuilder.sdk_ver;
      if (str5 == null) {
        this.sdk_ver = "";
      } else {
        this.sdk_ver = str5;
      } 
      str5 = paramBuilder.framework_ver;
      if (str5 == null) {
        this.framework_ver = "";
      } else {
        this.framework_ver = str5;
      } 
      str5 = paramBuilder.swan_game_ver;
      if (str5 == null) {
        this.swan_game_ver = "";
      } else {
        this.swan_game_ver = str5;
      } 
      str5 = paramBuilder.idfa;
      if (str5 == null) {
        this.idfa = "";
      } else {
        this.idfa = str5;
      } 
      str5 = paramBuilder.caid;
      if (str5 == null) {
        this.caid = "";
      } else {
        this.caid = str5;
      } 
      Long long_1 = paramBuilder.active_timestamp;
      if (long_1 == null) {
        this.active_timestamp = DEFAULT_ACTIVE_TIMESTAMP;
      } else {
        this.active_timestamp = long_1;
      } 
      long_1 = paramBuilder.first_install_time;
      if (long_1 == null) {
        this.first_install_time = DEFAULT_FIRST_INSTALL_TIME;
      } else {
        this.first_install_time = long_1;
      } 
      long_1 = paramBuilder.last_update_time;
      if (long_1 == null) {
        this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
      } else {
        this.last_update_time = long_1;
      } 
      String str4 = paramBuilder.event_day;
      if (str4 == null) {
        this.event_day = "";
      } else {
        this.event_day = str4;
      } 
      str4 = paramBuilder.android_id;
      if (str4 == null) {
        this.android_id = "";
      } else {
        this.android_id = str4;
      } 
      Integer integer3 = paramBuilder.cmode;
      if (integer3 == null) {
        this.cmode = DEFAULT_CMODE;
      } else {
        this.cmode = integer3;
      } 
      String str3 = paramBuilder.start_scheme;
      if (str3 == null) {
        this.start_scheme = "";
      } else {
        this.start_scheme = str3;
      } 
      Integer integer2 = paramBuilder.start_type;
      if (integer2 == null) {
        this.start_type = DEFAULT_START_TYPE;
      } else {
        this.start_type = integer2;
      } 
      String str2 = paramBuilder.shoubai_cuid;
      if (str2 == null) {
        this.shoubai_cuid = "";
      } else {
        this.shoubai_cuid = str2;
      } 
      str2 = paramBuilder.mac;
      if (str2 == null) {
        this.mac = "";
      } else {
        this.mac = str2;
      } 
      str2 = paramBuilder.idfv;
      if (str2 == null) {
        this.idfv = "";
      } else {
        this.idfv = str2;
      } 
      str2 = paramBuilder.extra;
      if (str2 == null) {
        this.extra = "";
      } else {
        this.extra = str2;
      } 
      str2 = paramBuilder.user_agent;
      if (str2 == null) {
        this.user_agent = "";
      } else {
        this.user_agent = str2;
      } 
      Integer integer1 = paramBuilder.personalized_rec_switch;
      if (integer1 == null) {
        this.personalized_rec_switch = DEFAULT_PERSONALIZED_REC_SWITCH;
      } else {
        this.personalized_rec_switch = integer1;
      } 
      String str1 = paramBuilder.iemi;
      if (str1 == null) {
        this.iemi = "";
      } else {
        this.iemi = str1;
      } 
      str1 = paramBuilder.iemiwen;
      if (str1 == null) {
        this.iemiwen = "";
      } else {
        this.iemiwen = str1;
      } 
      str1 = paramBuilder.cam;
      if (str1 == null) {
        this.cam = "";
      } else {
        this.cam = str1;
      } 
      str1 = paramBuilder.afdi;
      if (str1 == null) {
        this.afdi = "";
      } else {
        this.afdi = str1;
      } 
      str1 = paramBuilder.di_diordna;
      if (str1 == null) {
        this.di_diordna = "";
      } else {
        this.di_diordna = str1;
      } 
      str = paramBuilder.vfdi;
      if (str == null) {
        this.vfdi = "";
      } else {
        this.vfdi = str;
      } 
    } else {
      this._client_type = ((Builder)str)._client_type;
      this._client_version = ((Builder)str)._client_version;
      this._client_id = ((Builder)str)._client_id;
      this.apid = ((Builder)str).apid;
      this._phone_imei = ((Builder)str)._phone_imei;
      this.from = ((Builder)str).from;
      this.cuid = ((Builder)str).cuid;
      this._timestamp = ((Builder)str)._timestamp;
      this.model = ((Builder)str).model;
      this.BDUSS = ((Builder)str).BDUSS;
      this.tbs = ((Builder)str).tbs;
      this.net_type = ((Builder)str).net_type;
      this.subapp_type = ((Builder)str).subapp_type;
      this._phone_newimei = ((Builder)str)._phone_newimei;
      this.ka = ((Builder)str).ka;
      this.m_api = ((Builder)str).m_api;
      this.m_logid = ((Builder)str).m_logid;
      this.m_cost = ((Builder)str).m_cost;
      this.m_result = ((Builder)str).m_result;
      this.m_size_u = ((Builder)str).m_size_u;
      this.m_size_d = ((Builder)str).m_size_d;
      this.smallflow = ((Builder)str).smallflow;
      this.sign = ((Builder)str).sign;
      this.pversion = ((Builder)str).pversion;
      this._os_version = ((Builder)str)._os_version;
      this.brand = ((Builder)str).brand;
      this.brand_type = ((Builder)str).brand_type;
      this.lego_lib_version = ((Builder)str).lego_lib_version;
      this.applist = ((Builder)str).applist;
      this.stoken = ((Builder)str).stoken;
      this.z_id = ((Builder)str).z_id;
      this.cuid_galaxy2 = ((Builder)str).cuid_galaxy2;
      this.cuid_gid = ((Builder)str).cuid_gid;
      this.oaid = ((Builder)str).oaid;
      this.c3_aid = ((Builder)str).c3_aid;
      this.sample_id = ((Builder)str).sample_id;
      this.scr_w = ((Builder)str).scr_w;
      this.scr_h = ((Builder)str).scr_h;
      this.scr_dip = ((Builder)str).scr_dip;
      this.q_type = ((Builder)str).q_type;
      this.is_teenager = ((Builder)str).is_teenager;
      this.sdk_ver = ((Builder)str).sdk_ver;
      this.framework_ver = ((Builder)str).framework_ver;
      this.swan_game_ver = ((Builder)str).swan_game_ver;
      this.idfa = ((Builder)str).idfa;
      this.caid = ((Builder)str).caid;
      this.active_timestamp = ((Builder)str).active_timestamp;
      this.first_install_time = ((Builder)str).first_install_time;
      this.last_update_time = ((Builder)str).last_update_time;
      this.event_day = ((Builder)str).event_day;
      this.android_id = ((Builder)str).android_id;
      this.cmode = ((Builder)str).cmode;
      this.start_scheme = ((Builder)str).start_scheme;
      this.start_type = ((Builder)str).start_type;
      this.shoubai_cuid = ((Builder)str).shoubai_cuid;
      this.mac = ((Builder)str).mac;
      this.idfv = ((Builder)str).idfv;
      this.extra = ((Builder)str).extra;
      this.user_agent = ((Builder)str).user_agent;
      this.personalized_rec_switch = ((Builder)str).personalized_rec_switch;
      this.iemi = ((Builder)str).iemi;
      this.iemiwen = ((Builder)str).iemiwen;
      this.cam = ((Builder)str).cam;
      this.afdi = ((Builder)str).afdi;
      this.di_diordna = ((Builder)str).di_diordna;
      this.vfdi = ((Builder)str).vfdi;
    } 
  }
}
