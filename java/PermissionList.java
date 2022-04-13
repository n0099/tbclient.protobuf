import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PermissionList;

public final class PermissionList extends Message {
  public static final Integer DEFAULT_CHAT;
  
  public static final Integer DEFAULT_FOLLOW;
  
  public static final Integer DEFAULT_INTERACT;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer chat;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer follow;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer interact;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(573287588, "Ltbclient/PermissionList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(573287588, "Ltbclient/PermissionList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FOLLOW = integer;
    DEFAULT_INTERACT = integer;
    DEFAULT_CHAT = integer;
  }
  
  public PermissionList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.follow;
      if (integer1 == null) {
        this.follow = DEFAULT_FOLLOW;
      } else {
        this.follow = integer1;
      } 
      integer1 = paramBuilder.interact;
      if (integer1 == null) {
        this.interact = DEFAULT_INTERACT;
      } else {
        this.interact = integer1;
      } 
      integer = paramBuilder.chat;
      if (integer == null) {
        this.chat = DEFAULT_CHAT;
      } else {
        this.chat = integer;
      } 
    } else {
      this.follow = ((Builder)integer).follow;
      this.interact = ((Builder)integer).interact;
      this.chat = ((Builder)integer).chat;
    } 
  }
}
