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
import tbclient.RecommendForumInfo;

public final class RecommendForumList extends Message {
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final Integer DEFAULT_FLOOR_POSITION = Integer.valueOf(0);
  
  public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer floor_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<RecommendForumInfo> forum_list;
  
  public RecommendForumList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.floor_position;
      if (integer == null) {
        this.floor_position = DEFAULT_FLOOR_POSITION;
      } else {
        this.floor_position = integer;
      } 
      String str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
      list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.floor_position = ((Builder)list).floor_position;
      this.class_name = ((Builder)list).class_name;
      this.forum_list = Message.immutableCopyOf(((Builder)list).forum_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-461940719, "Ltbclient/ActivityPage/RecommendForumList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-461940719, "Ltbclient/ActivityPage/RecommendForumList;");
          return;
        } 
      } 
    } 
  }
}
