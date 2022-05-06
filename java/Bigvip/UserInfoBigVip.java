package Bigvip;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserInfoBigVip extends Message {
  public static final Integer DEFAULT_MESSAGE_ACCEPT;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_PORTRAITH = "";
  
  public static final String DEFAULT_USER_DETAIL = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_TYPE = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer message_accept;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String portraith;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_detail;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_type;
  
  static {
    DEFAULT_MESSAGE_ACCEPT = Integer.valueOf(0);
  }
  
  public UserInfoBigVip(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      str2 = paramBuilder.user_type;
      if (str2 == null) {
        this.user_type = "";
      } else {
        this.user_type = str2;
      } 
      str2 = paramBuilder.user_detail;
      if (str2 == null) {
        this.user_detail = "";
      } else {
        this.user_detail = str2;
      } 
      Integer integer = paramBuilder.message_accept;
      if (integer == null) {
        this.message_accept = DEFAULT_MESSAGE_ACCEPT;
      } else {
        this.message_accept = integer;
      } 
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str = paramBuilder.portraith;
      if (str == null) {
        this.portraith = "";
      } else {
        this.portraith = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.user_type = ((Builder)str).user_type;
      this.user_detail = ((Builder)str).user_detail;
      this.message_accept = ((Builder)str).message_accept;
      this.portrait = ((Builder)str).portrait;
      this.portraith = ((Builder)str).portraith;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2074595805, "Ltbclient/Bigvip/UserInfoBigVip;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2074595805, "Ltbclient/Bigvip/UserInfoBigVip;");
          return;
        } 
      } 
    } 
  }
}
