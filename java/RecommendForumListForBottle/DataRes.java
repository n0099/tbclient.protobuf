package RecommendForumListForBottle;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecommendForumListForBottle.ForumInfo;

public final class DataRes extends Message {
  public static final List<ForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ForumInfo> forum_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      list = paramBuilder.forum_info;
      if (list == null) {
        this.forum_info = DEFAULT_FORUM_INFO;
      } else {
        this.forum_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.forum_info = Message.immutableCopyOf(((Builder)list).forum_info);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-972345870, "Ltbclient/RecommendForumListForBottle/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-972345870, "Ltbclient/RecommendForumListForBottle/DataRes;");
          return;
        } 
      } 
    } 
  }
}
