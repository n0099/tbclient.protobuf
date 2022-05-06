package Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FRIEND_UID;
  
  public static final String DEFAULT_FRIEND_UID_PORTRAIT = "";
  
  public static final Integer DEFAULT_HAS_PLIST;
  
  public static final Integer DEFAULT_IS_FROM_USERCENTER;
  
  public static final Integer DEFAULT_IS_GUEST;
  
  public static final Integer DEFAULT_NEED_POST_COUNT;
  
  public static final Integer DEFAULT_PAGE;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public static final Long DEFAULT_UID;
  
  @ProtoField(tag = 9)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long friend_uid;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String friend_uid_portrait;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer has_plist;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_from_usercenter;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_guest;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer need_post_count;
  
  @ProtoField(tag = 15, type = Message.Datatype.INT32)
  public final Integer page;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer q_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 13, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String st_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1548228393, "Ltbclient/Profile/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1548228393, "Ltbclient/Profile/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_NEED_POST_COUNT = integer;
    DEFAULT_FRIEND_UID = long_;
    DEFAULT_IS_GUEST = integer;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_HAS_PLIST = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_Q_TYPE = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_IS_FROM_USERCENTER = integer;
    DEFAULT_PAGE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.uid;
      if (long_2 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_2;
      } 
      Integer integer4 = paramBuilder.need_post_count;
      if (integer4 == null) {
        this.need_post_count = DEFAULT_NEED_POST_COUNT;
      } else {
        this.need_post_count = integer4;
      } 
      Long long_1 = paramBuilder.friend_uid;
      if (long_1 == null) {
        this.friend_uid = DEFAULT_FRIEND_UID;
      } else {
        this.friend_uid = long_1;
      } 
      Integer integer3 = paramBuilder.is_guest;
      if (integer3 == null) {
        this.is_guest = DEFAULT_IS_GUEST;
      } else {
        this.is_guest = integer3;
      } 
      String str1 = paramBuilder.st_type;
      if (str1 == null) {
        this.st_type = "";
      } else {
        this.st_type = str1;
      } 
      Integer integer2 = paramBuilder.pn;
      if (integer2 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer2;
      } 
      integer2 = paramBuilder.rn;
      if (integer2 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer2;
      } 
      integer2 = paramBuilder.has_plist;
      if (integer2 == null) {
        this.has_plist = DEFAULT_HAS_PLIST;
      } else {
        this.has_plist = integer2;
      } 
      this.common = paramBuilder.common;
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
      integer2 = paramBuilder.q_type;
      if (integer2 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer2;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer1 = paramBuilder.is_from_usercenter;
      if (integer1 == null) {
        this.is_from_usercenter = DEFAULT_IS_FROM_USERCENTER;
      } else {
        this.is_from_usercenter = integer1;
      } 
      integer1 = paramBuilder.page;
      if (integer1 == null) {
        this.page = DEFAULT_PAGE;
      } else {
        this.page = integer1;
      } 
      str = paramBuilder.friend_uid_portrait;
      if (str == null) {
        this.friend_uid_portrait = "";
      } else {
        this.friend_uid_portrait = str;
      } 
    } else {
      this.uid = ((Builder)str).uid;
      this.need_post_count = ((Builder)str).need_post_count;
      this.friend_uid = ((Builder)str).friend_uid;
      this.is_guest = ((Builder)str).is_guest;
      this.st_type = ((Builder)str).st_type;
      this.pn = ((Builder)str).pn;
      this.rn = ((Builder)str).rn;
      this.has_plist = ((Builder)str).has_plist;
      this.common = ((Builder)str).common;
      this.scr_w = ((Builder)str).scr_w;
      this.scr_h = ((Builder)str).scr_h;
      this.q_type = ((Builder)str).q_type;
      this.scr_dip = ((Builder)str).scr_dip;
      this.is_from_usercenter = ((Builder)str).is_from_usercenter;
      this.page = ((Builder)str).page;
      this.friend_uid_portrait = ((Builder)str).friend_uid_portrait;
    } 
  }
}
