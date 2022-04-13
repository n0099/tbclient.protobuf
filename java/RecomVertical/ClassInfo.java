package RecomVertical;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomVertical.SubClassItem;

public final class ClassInfo extends Message {
  public static final Integer DEFAULT_CLASS_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final List<SubClassItem> DEFAULT_SUB_CLASS_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer class_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<SubClassItem> sub_class_list;
  
  public ClassInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.class_id;
      if (integer == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer;
      } 
      String str = paramBuilder.class_name;
      if (str == null) {
        this.class_name = "";
      } else {
        this.class_name = str;
      } 
      list = paramBuilder.sub_class_list;
      if (list == null) {
        this.sub_class_list = DEFAULT_SUB_CLASS_LIST;
      } else {
        this.sub_class_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.class_id = ((Builder)list).class_id;
      this.class_name = ((Builder)list).class_name;
      this.sub_class_list = Message.immutableCopyOf(((Builder)list).sub_class_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-903995222, "Ltbclient/RecomVertical/ClassInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-903995222, "Ltbclient/RecomVertical/ClassInfo;");
          return;
        } 
      } 
    } 
  }
}
