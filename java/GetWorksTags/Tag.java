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

public final class Tag extends Message {
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final String DEFAULT_SECOND_CLASS = "";
  
  public static final List<String> DEFAULT_TAGS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String second_class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> tags;
  
  public Tag(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.first_class;
      if (str == null) {
        this.first_class = "";
      } else {
        this.first_class = str;
      } 
      str = paramBuilder.second_class;
      if (str == null) {
        this.second_class = "";
      } else {
        this.second_class = str;
      } 
      list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
    } else {
      this.first_class = ((Builder)list).first_class;
      this.second_class = ((Builder)list).second_class;
      this.tags = Message.immutableCopyOf(((Builder)list).tags);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-442456031, "Ltbclient/GetWorksTags/Tag;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-442456031, "Ltbclient/GetWorksTags/Tag;");
          return;
        } 
      } 
    } 
  }
}
