package GetMemberInfo;

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

public final class MemberGodInfo extends Message {
  public static final List<User> DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_FORUM_GOD_NUM = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> forum_god_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer forum_god_num;
  
  public MemberGodInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.forum_god_list;
      if (list == null) {
        this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
      } else {
        this.forum_god_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.forum_god_num;
      if (integer == null) {
        this.forum_god_num = DEFAULT_FORUM_GOD_NUM;
      } else {
        this.forum_god_num = integer;
      } 
    } else {
      this.forum_god_list = Message.immutableCopyOf(((Builder)integer).forum_god_list);
      this.forum_god_num = ((Builder)integer).forum_god_num;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1751716038, "Ltbclient/GetMemberInfo/MemberGodInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1751716038, "Ltbclient/GetMemberInfo/MemberGodInfo;");
          return;
        } 
      } 
    } 
  }
}
