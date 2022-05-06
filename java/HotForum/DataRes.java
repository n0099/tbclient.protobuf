package HotForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.HotForum.ForumInfo;
import tbclient.HotForum.HotSearch;
import tbclient.HotForum.HotTopic;

public final class DataRes extends Message {
  public static final List<ForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ForumInfo> forum_info;
  
  @ProtoField(tag = 2)
  public final HotSearch hot_search;
  
  @ProtoField(tag = 3)
  public final HotTopic hot_topic;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.forum_info;
      if (list == null) {
        this.forum_info = DEFAULT_FORUM_INFO;
      } else {
        this.forum_info = Message.immutableCopyOf(list);
      } 
      this.hot_search = paramBuilder.hot_search;
      this.hot_topic = paramBuilder.hot_topic;
    } else {
      this.forum_info = Message.immutableCopyOf(paramBuilder.forum_info);
      this.hot_search = paramBuilder.hot_search;
      this.hot_topic = paramBuilder.hot_topic;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1306380874, "Ltbclient/HotForum/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1306380874, "Ltbclient/HotForum/DataRes;");
          return;
        } 
      } 
    } 
  }
}
