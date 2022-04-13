package ReplyFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResData extends Message {
  public static final Long DEFAULT_FRIEND_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_MESSAGE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long friend_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String message;
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.friend_id;
      if (long_ == null) {
        this.friend_id = DEFAULT_FRIEND_ID;
      } else {
        this.friend_id = long_;
      } 
      str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
    } else {
      this.friend_id = ((Builder)str).friend_id;
      this.message = ((Builder)str).message;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1671905570, "Ltbclient/ReplyFriend/ResData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1671905570, "Ltbclient/ReplyFriend/ResData;");
          return;
        } 
      } 
    } 
  }
}
