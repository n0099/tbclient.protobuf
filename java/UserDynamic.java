import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
import tbclient.UserDynamic;

public final class UserDynamic extends Message {
  public static final List<User> DEFAULT_CONCERNED_USER_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> concerned_user_list;
  
  public UserDynamic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.concerned_user_list;
      if (list == null) {
        this.concerned_user_list = DEFAULT_CONCERNED_USER_LIST;
      } else {
        this.concerned_user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.concerned_user_list = Message.immutableCopyOf(((Builder)list).concerned_user_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-864024911, "Ltbclient/UserDynamic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-864024911, "Ltbclient/UserDynamic;");
          return;
        } 
      } 
    } 
  }
}
