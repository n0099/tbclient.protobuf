package ActivityPage;

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

public final class RecommendUserList extends Message {
  public static final Integer DEFAULT_FLOOR_POSITION = Integer.valueOf(0);
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer floor_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<User> user_list;
  
  public RecommendUserList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.floor_position;
      if (integer == null) {
        this.floor_position = DEFAULT_FLOOR_POSITION;
      } else {
        this.floor_position = integer;
      } 
      list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.floor_position = ((Builder)list).floor_position;
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-219723171, "Ltbclient/ActivityPage/RecommendUserList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-219723171, "Ltbclient/ActivityPage/RecommendUserList;");
          return;
        } 
      } 
    } 
  }
}
