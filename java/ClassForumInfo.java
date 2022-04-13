import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ClassForumInfo;
import tbclient.RecommendForumInfo;

public final class ClassForumInfo extends Message {
  public static final String DEFAULT_CLASS_ICON = "";
  
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final List<RecommendForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String class_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RecommendForumInfo> forum_info;
  
  static {
    DEFAULT_CLASS_ID = Integer.valueOf(0);
  }
  
  public ClassForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      List list = paramBuilder.forum_info;
      if (list == null) {
        this.forum_info = DEFAULT_FORUM_INFO;
      } else {
        this.forum_info = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.class_id;
      if (integer == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer;
      } 
      String str1 = paramBuilder.class_name;
      if (str1 == null) {
        this.class_name = "";
      } else {
        this.class_name = str1;
      } 
      str = paramBuilder.class_icon;
      if (str == null) {
        this.class_icon = "";
      } else {
        this.class_icon = str;
      } 
    } else {
      this.forum_info = Message.immutableCopyOf(((Builder)str).forum_info);
      this.class_id = ((Builder)str).class_id;
      this.class_name = ((Builder)str).class_name;
      this.class_icon = ((Builder)str).class_icon;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2013952486, "Ltbclient/ClassForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2013952486, "Ltbclient/ClassForumInfo;");
          return;
        } 
      } 
    } 
  }
}
