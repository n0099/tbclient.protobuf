package RecomVideo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DislikeReason extends Message {
  public static final Integer DEFAULT_DISLIKE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_DISLIKE_REASON = "";
  
  public static final String DEFAULT_EXTRA = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer dislike_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dislike_reason;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String extra;
  
  public DislikeReason(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.dislike_reason;
      if (str1 == null) {
        this.dislike_reason = "";
      } else {
        this.dislike_reason = str1;
      } 
      Integer integer = paramBuilder.dislike_id;
      if (integer == null) {
        this.dislike_id = DEFAULT_DISLIKE_ID;
      } else {
        this.dislike_id = integer;
      } 
      str = paramBuilder.extra;
      if (str == null) {
        this.extra = "";
      } else {
        this.extra = str;
      } 
    } else {
      this.dislike_reason = ((Builder)str).dislike_reason;
      this.dislike_id = ((Builder)str).dislike_id;
      this.extra = ((Builder)str).extra;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1581954986, "Ltbclient/RecomVideo/DislikeReason;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1581954986, "Ltbclient/RecomVideo/DislikeReason;");
          return;
        } 
      } 
    } 
  }
}
