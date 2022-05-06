package GetVerticalForumList;

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
import tbclient.Page;

public final class DataRes extends Message {
  public static final List<ClassForumInfo> DEFAULT_CLASS_FORUMINFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ClassForumInfo> class_foruminfo;
  
  @ProtoField(tag = 2)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.class_foruminfo;
      if (list == null) {
        this.class_foruminfo = DEFAULT_CLASS_FORUMINFO;
      } else {
        this.class_foruminfo = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.class_foruminfo = Message.immutableCopyOf(paramBuilder.class_foruminfo);
      this.page = paramBuilder.page;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1229076841, "Ltbclient/GetVerticalForumList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1229076841, "Ltbclient/GetVerticalForumList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
