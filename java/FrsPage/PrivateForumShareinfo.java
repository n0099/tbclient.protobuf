package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PrivateForumShareinfo extends Message {
  public static final Integer DEFAULT_CREATE_TIME = Integer.valueOf(0);
  
  public static final String DEFAULT_MANAGER_PORTRAIT = "";
  
  public static final String DEFAULT_MANAGER_USER_NAME = "";
  
  public static final String DEFAULT_SHARE_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String manager_portrait;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String manager_user_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String share_url;
  
  public PrivateForumShareinfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
      String str1 = paramBuilder.share_url;
      if (str1 == null) {
        this.share_url = "";
      } else {
        this.share_url = str1;
      } 
      str1 = paramBuilder.manager_user_name;
      if (str1 == null) {
        this.manager_user_name = "";
      } else {
        this.manager_user_name = str1;
      } 
      str = paramBuilder.manager_portrait;
      if (str == null) {
        this.manager_portrait = "";
      } else {
        this.manager_portrait = str;
      } 
    } else {
      this.create_time = ((Builder)str).create_time;
      this.share_url = ((Builder)str).share_url;
      this.manager_user_name = ((Builder)str).manager_user_name;
      this.manager_portrait = ((Builder)str).manager_portrait;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2042487249, "Ltbclient/FrsPage/PrivateForumShareinfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2042487249, "Ltbclient/FrsPage/PrivateForumShareinfo;");
          return;
        } 
      } 
    } 
  }
}
