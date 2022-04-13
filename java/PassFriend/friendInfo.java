package PassFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class friendInfo extends Message {
  public static final String DEFAULT_KEY = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_QUANPIN = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String key;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String quanpin;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  public friendInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.quanpin;
      if (str1 == null) {
        this.quanpin = "";
      } else {
        this.quanpin = str1;
      } 
      str = paramBuilder.key;
      if (str == null) {
        this.key = "";
      } else {
        this.key = str;
      } 
    } else {
      this.portrait = ((Builder)str).portrait;
      this.user_name = ((Builder)str).user_name;
      this.user_id = ((Builder)str).user_id;
      this.quanpin = ((Builder)str).quanpin;
      this.key = ((Builder)str).key;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1846763193, "Ltbclient/PassFriend/friendInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1846763193, "Ltbclient/PassFriend/friendInfo;");
          return;
        } 
      } 
    } 
  }
}
