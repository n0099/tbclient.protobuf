package GetWorksTags;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetWorksTags.Category;
import tbclient.GetWorksTags.Tag;

public final class DataRes extends Message {
  public static final List<Category> DEFAULT_CATEGORY = Collections.emptyList();
  
  public static final List<Tag> DEFAULT_TAGS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Category> category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Tag> tags;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.category;
      if (list1 == null) {
        this.category = DEFAULT_CATEGORY;
      } else {
        this.category = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
    } else {
      this.category = Message.immutableCopyOf(((Builder)list).category);
      this.tags = Message.immutableCopyOf(((Builder)list).tags);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-247976283, "Ltbclient/GetWorksTags/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-247976283, "Ltbclient/GetWorksTags/DataRes;");
          return;
        } 
      } 
    } 
  }
}
