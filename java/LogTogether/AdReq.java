package LogTogether;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdReq extends Message {
  public static final String DEFAULT_DA_CPID = "";
  
  public static final String DEFAULT_DA_EXT_INFO = "";
  
  public static final Integer DEFAULT_DA_FID;
  
  public static final String DEFAULT_DA_GOOD_ID = "";
  
  public static final Boolean DEFAULT_DA_ISCACHE;
  
  public static final String DEFAULT_DA_LOCATE = "";
  
  public static final String DEFAULT_DA_OBJ_ID = "";
  
  public static final String DEFAULT_DA_PAGE = "";
  
  public static final String DEFAULT_DA_PLAN_ID = "";
  
  public static final Integer DEFAULT_DA_PN;
  
  public static final String DEFAULT_DA_PRICE = "";
  
  public static final String DEFAULT_DA_TASK = "";
  
  public static final Long DEFAULT_DA_THREADID;
  
  public static final Integer DEFAULT_DA_TID;
  
  public static final String DEFAULT_DA_TYPE = "";
  
  public static final String DEFAULT_DA_USER_ID = "";
  
  public static final Long DEFAULT_DA_UTIME;
  
  public static final String DEFAULT_DA_VERIFY = "";
  
  public static final String DEFAULT_EXT = "";
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String da_cpid;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String da_ext_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer da_fid;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String da_good_id;
  
  @ProtoField(tag = 19, type = Message.Datatype.BOOL)
  public final Boolean da_iscache;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String da_locate;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String da_obj_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String da_page;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String da_plan_id;
  
  @ProtoField(tag = 18, type = Message.Datatype.INT32)
  public final Integer da_pn;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String da_price;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String da_task;
  
  @ProtoField(tag = 16, type = Message.Datatype.INT64)
  public final Long da_threadid;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer da_tid;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String da_type;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String da_user_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.INT64)
  public final Long da_utime;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String da_verify;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String ext;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1626676795, "Ltbclient/LogTogether/AdReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1626676795, "Ltbclient/LogTogether/AdReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_DA_FID = integer;
    DEFAULT_DA_TID = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_DA_THREADID = long_;
    DEFAULT_DA_UTIME = long_;
    DEFAULT_DA_PN = integer;
    DEFAULT_DA_ISCACHE = Boolean.FALSE;
  }
  
  public AdReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      String str2 = paramBuilder.da_page;
      if (str2 == null) {
        this.da_page = "";
      } else {
        this.da_page = str2;
      } 
      str2 = paramBuilder.da_locate;
      if (str2 == null) {
        this.da_locate = "";
      } else {
        this.da_locate = str2;
      } 
      str2 = paramBuilder.da_obj_id;
      if (str2 == null) {
        this.da_obj_id = "";
      } else {
        this.da_obj_id = str2;
      } 
      Integer integer2 = paramBuilder.da_fid;
      if (integer2 == null) {
        this.da_fid = DEFAULT_DA_FID;
      } else {
        this.da_fid = integer2;
      } 
      integer2 = paramBuilder.da_tid;
      if (integer2 == null) {
        this.da_tid = DEFAULT_DA_TID;
      } else {
        this.da_tid = integer2;
      } 
      String str1 = paramBuilder.da_good_id;
      if (str1 == null) {
        this.da_good_id = "";
      } else {
        this.da_good_id = str1;
      } 
      str1 = paramBuilder.da_ext_info;
      if (str1 == null) {
        this.da_ext_info = "";
      } else {
        this.da_ext_info = str1;
      } 
      str1 = paramBuilder.da_plan_id;
      if (str1 == null) {
        this.da_plan_id = "";
      } else {
        this.da_plan_id = str1;
      } 
      str1 = paramBuilder.da_user_id;
      if (str1 == null) {
        this.da_user_id = "";
      } else {
        this.da_user_id = str1;
      } 
      str1 = paramBuilder.da_price;
      if (str1 == null) {
        this.da_price = "";
      } else {
        this.da_price = str1;
      } 
      str1 = paramBuilder.da_verify;
      if (str1 == null) {
        this.da_verify = "";
      } else {
        this.da_verify = str1;
      } 
      str1 = paramBuilder.da_cpid;
      if (str1 == null) {
        this.da_cpid = "";
      } else {
        this.da_cpid = str1;
      } 
      str1 = paramBuilder.ext;
      if (str1 == null) {
        this.ext = "";
      } else {
        this.ext = str1;
      } 
      str1 = paramBuilder.da_task;
      if (str1 == null) {
        this.da_task = "";
      } else {
        this.da_task = str1;
      } 
      str1 = paramBuilder.da_type;
      if (str1 == null) {
        this.da_type = "";
      } else {
        this.da_type = str1;
      } 
      Long long_ = paramBuilder.da_threadid;
      if (long_ == null) {
        this.da_threadid = DEFAULT_DA_THREADID;
      } else {
        this.da_threadid = long_;
      } 
      long_ = paramBuilder.da_utime;
      if (long_ == null) {
        this.da_utime = DEFAULT_DA_UTIME;
      } else {
        this.da_utime = long_;
      } 
      Integer integer1 = paramBuilder.da_pn;
      if (integer1 == null) {
        this.da_pn = DEFAULT_DA_PN;
      } else {
        this.da_pn = integer1;
      } 
      bool = paramBuilder.da_iscache;
      if (bool == null) {
        this.da_iscache = DEFAULT_DA_ISCACHE;
      } else {
        this.da_iscache = bool;
      } 
    } else {
      this.da_page = ((Builder)bool).da_page;
      this.da_locate = ((Builder)bool).da_locate;
      this.da_obj_id = ((Builder)bool).da_obj_id;
      this.da_fid = ((Builder)bool).da_fid;
      this.da_tid = ((Builder)bool).da_tid;
      this.da_good_id = ((Builder)bool).da_good_id;
      this.da_ext_info = ((Builder)bool).da_ext_info;
      this.da_plan_id = ((Builder)bool).da_plan_id;
      this.da_user_id = ((Builder)bool).da_user_id;
      this.da_price = ((Builder)bool).da_price;
      this.da_verify = ((Builder)bool).da_verify;
      this.da_cpid = ((Builder)bool).da_cpid;
      this.ext = ((Builder)bool).ext;
      this.da_task = ((Builder)bool).da_task;
      this.da_type = ((Builder)bool).da_type;
      this.da_threadid = ((Builder)bool).da_threadid;
      this.da_utime = ((Builder)bool).da_utime;
      this.da_pn = ((Builder)bool).da_pn;
      this.da_iscache = ((Builder)bool).da_iscache;
    } 
  }
}
