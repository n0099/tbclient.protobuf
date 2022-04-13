import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.HotTWThreadInfo;
import tbclient.User;

public final class HotTWThreadInfo extends Message {
  public static final Integer DEFAULT_FANS_COUNT;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer fans_count;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> user_list;
  
  static {
    DEFAULT_FANS_COUNT = Integer.valueOf(0);
  }
  
  public HotTWThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.fans_count;
      if (integer == null) {
        this.fans_count = DEFAULT_FANS_COUNT;
      } else {
        this.fans_count = integer;
      } 
    } else {
      this.user_list = Message.immutableCopyOf(((Builder)integer).user_list);
      this.fans_count = ((Builder)integer).fans_count;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1610613603, "Ltbclient/HotTWThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1610613603, "Ltbclient/HotTWThreadInfo;");
          return;
        } 
      } 
    } 
  }
}
