package UserPost;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_BEGIN_THREAD_ID;
  
  public static final Integer DEFAULT_BEGIN_TIME;
  
  public static final Integer DEFAULT_CHECK_LOGIN;
  
  public static final String DEFAULT_COOKIE = "";
  
  public static final String DEFAULT_EMAIL = "";
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_FROM_TYPE;
  
  public static final Integer DEFAULT_IP_INT;
  
  public static final String DEFAULT_IP_STR = "";
  
  public static final Integer DEFAULT_IS_THREAD;
  
  public static final Integer DEFAULT_IS_TWZHIBO;
  
  public static final Integer DEFAULT_IS_VIEW_CARD;
  
  public static final Integer DEFAULT_LAST_THREAD_TIME;
  
  public static final Integer DEFAULT_LOGIN;
  
  public static final String DEFAULT_MOBILE = "";
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Integer DEFAULT_NEED_CONTENT;
  
  public static final Integer DEFAULT_NO_UN;
  
  public static final Integer DEFAULT_OFFSET;
  
  public static final Integer DEFAULT_PN;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_SMILE_GRADE;
  
  public static final Integer DEFAULT_ST_PARAM;
  
  public static final Integer DEFAULT_ST_TYPE;
  
  public static final Integer DEFAULT_SUBTYPE;
  
  public static final Integer DEFAULT_SUPPORT_NOUN;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final Long DEFAULT_UID;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_WORK_TAB_ID;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT64)
  public final Long begin_thread_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer begin_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer check_login;
  
  @ProtoField(tag = 27)
  public final CommonReq common;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String cookie;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String email;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer end_time;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 37, type = Message.Datatype.UINT32)
  public final Integer from_type;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer ip_int;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String ip_str;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_thread;
  
  @ProtoField(tag = 28, type = Message.Datatype.UINT32)
  public final Integer is_twzhibo;
  
  @ProtoField(tag = 33, type = Message.Datatype.INT32)
  public final Integer is_view_card;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer last_thread_time;
  
  @ProtoField(tag = 18, type = Message.Datatype.UINT32)
  public final Integer login;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String mobile;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer need_content;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer no_un;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer offset;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 32, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 31, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer smile_grade;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer st_param;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer st_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer subtype;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer support_noun;
  
  @ProtoField(tag = 36, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 35, type = Message.Datatype.UINT32)
  public final Integer work_tab_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1788041505, "Ltbclient/UserPost/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1788041505, "Ltbclient/UserPost/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_RN = integer;
    DEFAULT_OFFSET = integer;
    DEFAULT_IS_THREAD = integer;
    DEFAULT_NEED_CONTENT = integer;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_BEGIN_TIME = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_SUBTYPE = integer;
    DEFAULT_CHECK_LOGIN = integer;
    DEFAULT_IP_INT = integer;
    DEFAULT_ST_TYPE = integer;
    DEFAULT_ST_PARAM = integer;
    DEFAULT_SMILE_GRADE = integer;
    DEFAULT_SUPPORT_NOUN = integer;
    DEFAULT_LOGIN = integer;
    DEFAULT_USER_ID = long_;
    DEFAULT_NO_UN = integer;
    DEFAULT_PN = integer;
    DEFAULT_IS_TWZHIBO = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    DEFAULT_IS_VIEW_CARD = integer;
    DEFAULT_LAST_THREAD_TIME = integer;
    DEFAULT_WORK_TAB_ID = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_FROM_TYPE = integer;
    DEFAULT_BEGIN_THREAD_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.uid;
      if (long_3 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_3;
      } 
      Integer integer7 = paramBuilder.rn;
      if (integer7 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer7;
      } 
      integer7 = paramBuilder.offset;
      if (integer7 == null) {
        this.offset = DEFAULT_OFFSET;
      } else {
        this.offset = integer7;
      } 
      integer7 = paramBuilder.is_thread;
      if (integer7 == null) {
        this.is_thread = DEFAULT_IS_THREAD;
      } else {
        this.is_thread = integer7;
      } 
      integer7 = paramBuilder.need_content;
      if (integer7 == null) {
        this.need_content = DEFAULT_NEED_CONTENT;
      } else {
        this.need_content = integer7;
      } 
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      Integer integer6 = paramBuilder.begin_time;
      if (integer6 == null) {
        this.begin_time = DEFAULT_BEGIN_TIME;
      } else {
        this.begin_time = integer6;
      } 
      integer6 = paramBuilder.end_time;
      if (integer6 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer6;
      } 
      integer6 = paramBuilder.subtype;
      if (integer6 == null) {
        this.subtype = DEFAULT_SUBTYPE;
      } else {
        this.subtype = integer6;
      } 
      integer6 = paramBuilder.check_login;
      if (integer6 == null) {
        this.check_login = DEFAULT_CHECK_LOGIN;
      } else {
        this.check_login = integer6;
      } 
      String str4 = paramBuilder.ip_str;
      if (str4 == null) {
        this.ip_str = "";
      } else {
        this.ip_str = str4;
      } 
      Integer integer5 = paramBuilder.ip_int;
      if (integer5 == null) {
        this.ip_int = DEFAULT_IP_INT;
      } else {
        this.ip_int = integer5;
      } 
      String str3 = paramBuilder.module_name;
      if (str3 == null) {
        this.module_name = "";
      } else {
        this.module_name = str3;
      } 
      Integer integer4 = paramBuilder.st_type;
      if (integer4 == null) {
        this.st_type = DEFAULT_ST_TYPE;
      } else {
        this.st_type = integer4;
      } 
      integer4 = paramBuilder.st_param;
      if (integer4 == null) {
        this.st_param = DEFAULT_ST_PARAM;
      } else {
        this.st_param = integer4;
      } 
      integer4 = paramBuilder.smile_grade;
      if (integer4 == null) {
        this.smile_grade = DEFAULT_SMILE_GRADE;
      } else {
        this.smile_grade = integer4;
      } 
      integer4 = paramBuilder.support_noun;
      if (integer4 == null) {
        this.support_noun = DEFAULT_SUPPORT_NOUN;
      } else {
        this.support_noun = integer4;
      } 
      integer4 = paramBuilder.login;
      if (integer4 == null) {
        this.login = DEFAULT_LOGIN;
      } else {
        this.login = integer4;
      } 
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Integer integer3 = paramBuilder.no_un;
      if (integer3 == null) {
        this.no_un = DEFAULT_NO_UN;
      } else {
        this.no_un = integer3;
      } 
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str1 = paramBuilder.mobile;
      if (str1 == null) {
        this.mobile = "";
      } else {
        this.mobile = str1;
      } 
      str1 = paramBuilder.email;
      if (str1 == null) {
        this.email = "";
      } else {
        this.email = str1;
      } 
      str1 = paramBuilder.cookie;
      if (str1 == null) {
        this.cookie = "";
      } else {
        this.cookie = str1;
      } 
      Integer integer2 = paramBuilder.pn;
      if (integer2 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer2;
      } 
      this.common = paramBuilder.common;
      integer2 = paramBuilder.is_twzhibo;
      if (integer2 == null) {
        this.is_twzhibo = DEFAULT_IS_TWZHIBO;
      } else {
        this.is_twzhibo = integer2;
      } 
      integer2 = paramBuilder.scr_w;
      if (integer2 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer2;
      } 
      integer2 = paramBuilder.scr_h;
      if (integer2 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer2;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer1 = paramBuilder.q_type;
      if (integer1 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer1;
      } 
      integer1 = paramBuilder.is_view_card;
      if (integer1 == null) {
        this.is_view_card = DEFAULT_IS_VIEW_CARD;
      } else {
        this.is_view_card = integer1;
      } 
      integer1 = paramBuilder.last_thread_time;
      if (integer1 == null) {
        this.last_thread_time = DEFAULT_LAST_THREAD_TIME;
      } else {
        this.last_thread_time = integer1;
      } 
      integer1 = paramBuilder.work_tab_id;
      if (integer1 == null) {
        this.work_tab_id = DEFAULT_WORK_TAB_ID;
      } else {
        this.work_tab_id = integer1;
      } 
      integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      integer1 = paramBuilder.from_type;
      if (integer1 == null) {
        this.from_type = DEFAULT_FROM_TYPE;
      } else {
        this.from_type = integer1;
      } 
      long_ = paramBuilder.begin_thread_id;
      if (long_ == null) {
        this.begin_thread_id = DEFAULT_BEGIN_THREAD_ID;
      } else {
        this.begin_thread_id = long_;
      } 
    } else {
      this.uid = ((Builder)long_).uid;
      this.rn = ((Builder)long_).rn;
      this.offset = ((Builder)long_).offset;
      this.is_thread = ((Builder)long_).is_thread;
      this.need_content = ((Builder)long_).need_content;
      this.forum_id = ((Builder)long_).forum_id;
      this.begin_time = ((Builder)long_).begin_time;
      this.end_time = ((Builder)long_).end_time;
      this.subtype = ((Builder)long_).subtype;
      this.check_login = ((Builder)long_).check_login;
      this.ip_str = ((Builder)long_).ip_str;
      this.ip_int = ((Builder)long_).ip_int;
      this.module_name = ((Builder)long_).module_name;
      this.st_type = ((Builder)long_).st_type;
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
      this.cookie = ((Builder)long_).cookie;
      this.pn = ((Builder)long_).pn;
      this.common = ((Builder)long_).common;
      this.is_twzhibo = ((Builder)long_).is_twzhibo;
      this.scr_w = ((Builder)long_).scr_w;
      this.scr_h = ((Builder)long_).scr_h;
      this.scr_dip = ((Builder)long_).scr_dip;
      this.q_type = ((Builder)long_).q_type;
      this.is_view_card = ((Builder)long_).is_view_card;
      this.last_thread_time = ((Builder)long_).last_thread_time;
      this.work_tab_id = ((Builder)long_).work_tab_id;
      this.type = ((Builder)long_).type;
      this.from_type = ((Builder)long_).from_type;
      this.begin_thread_id = ((Builder)long_).begin_thread_id;
    } 
  }
}
