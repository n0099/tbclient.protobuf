package UserMuteQuery;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MuteUser extends Message {
  public static final Integer DEFAULT_MUTE_TIME;
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer mute_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    DEFAULT_MUTE_TIME = Integer.valueOf(0);
  }
  
  public MuteUser(Builder paramBuilder, boolean paramBoolean) {
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
      Integer integer = paramBuilder.mute_time;
      if (integer == null) {
        this.mute_time = DEFAULT_MUTE_TIME;
      } else {
        this.mute_time = integer;
      } 
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str = paramBuilder.name_show;
      if (str == null) {
        this.name_show = "";
      } else {
        this.name_show = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.mute_time = ((Builder)str).mute_time;
      this.portrait = ((Builder)str).portrait;
      this.name_show = ((Builder)str).name_show;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1369071294, "Ltbclient/UserMuteQuery/MuteUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1369071294, "Ltbclient/UserMuteQuery/MuteUser;");
          return;
        } 
      } 
    } 
  }
}
