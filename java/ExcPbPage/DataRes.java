package ExcPbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ExcPbPage.ExcellentPbThreadInfo;
import tbclient.ExcPbPage.UserInfo;
import tbclient.Post;
import tbclient.User;

public final class DataRes extends Message {
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Post> post_list;
  
  @ProtoField(tag = 1)
  public final ExcellentPbThreadInfo thread_info;
  
  @ProtoField(tag = 4)
  public final UserInfo user_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> user_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      List list = paramBuilder.post_list;
      if (list == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      this.user_info = paramBuilder.user_info;
    } else {
      this.thread_info = paramBuilder.thread_info;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.user_list = Message.immutableCopyOf(paramBuilder.user_list);
      this.user_info = paramBuilder.user_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(853657453, "Ltbclient/ExcPbPage/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(853657453, "Ltbclient/ExcPbPage/DataRes;");
          return;
        } 
      } 
    } 
  }
}
