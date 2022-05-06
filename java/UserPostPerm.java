import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.UserPostPerm;

public final class UserPostPerm extends Message {
  public static final Integer DEFAULT_NOT_SHOW_HIDE_THREAD = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer not_show_hide_thread;
  
  public UserPostPerm(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.not_show_hide_thread;
      if (integer == null) {
        this.not_show_hide_thread = DEFAULT_NOT_SHOW_HIDE_THREAD;
      } else {
        this.not_show_hide_thread = integer;
      } 
    } else {
      this.not_show_hide_thread = ((Builder)integer).not_show_hide_thread;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-818199978, "Ltbclient/UserPostPerm;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-818199978, "Ltbclient/UserPostPerm;");
          return;
        } 
      } 
    } 
  }
}
