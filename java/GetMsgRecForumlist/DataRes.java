package GetMsgRecForumlist;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.RecommendForumInfo;

public final class DataRes extends Message {
  public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RecommendForumInfo> forum_list;
  
  @ProtoField(tag = 2)
  public final Page page_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      this.page_info = paramBuilder.page_info;
    } else {
      this.forum_list = Message.immutableCopyOf(paramBuilder.forum_list);
      this.page_info = paramBuilder.page_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(385157968, "Ltbclient/GetMsgRecForumlist/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(385157968, "Ltbclient/GetMsgRecForumlist/DataRes;");
          return;
        } 
      } 
    } 
  }
}
