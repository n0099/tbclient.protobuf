import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.UserManChannelInfo;

public final class UserManChannelInfo extends Message {
  public static final Integer DEFAULT_FOLLOW_CHANNEL;
  
  public static final Integer DEFAULT_MAN_CHANNEL;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer follow_channel;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer man_channel;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1941596175, "Ltbclient/UserManChannelInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1941596175, "Ltbclient/UserManChannelInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_MAN_CHANNEL = integer;
    DEFAULT_FOLLOW_CHANNEL = integer;
  }
  
  public UserManChannelInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.man_channel;
      if (integer1 == null) {
        this.man_channel = DEFAULT_MAN_CHANNEL;
      } else {
        this.man_channel = integer1;
      } 
      integer = paramBuilder.follow_channel;
      if (integer == null) {
        this.follow_channel = DEFAULT_FOLLOW_CHANNEL;
      } else {
        this.follow_channel = integer;
      } 
    } else {
      this.man_channel = ((Builder)integer).man_channel;
      this.follow_channel = ((Builder)integer).follow_channel;
    } 
  }
}
