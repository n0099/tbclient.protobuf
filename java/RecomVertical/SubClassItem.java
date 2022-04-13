package RecomVertical;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SubClassItem extends Message {
  public static final Integer DEFAULT_ENABLE;
  
  public static final String DEFAULT_SUB_CLASS_ICON = "";
  
  public static final Integer DEFAULT_SUB_CLASS_ID;
  
  public static final String DEFAULT_SUB_CLASS_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer enable;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sub_class_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer sub_class_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_class_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1752769851, "Ltbclient/RecomVertical/SubClassItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1752769851, "Ltbclient/RecomVertical/SubClassItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SUB_CLASS_ID = integer;
    DEFAULT_ENABLE = integer;
  }
  
  public SubClassItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.sub_class_id;
      if (integer1 == null) {
        this.sub_class_id = DEFAULT_SUB_CLASS_ID;
      } else {
        this.sub_class_id = integer1;
      } 
      String str = paramBuilder.sub_class_name;
      if (str == null) {
        this.sub_class_name = "";
      } else {
        this.sub_class_name = str;
      } 
      str = paramBuilder.sub_class_icon;
      if (str == null) {
        this.sub_class_icon = "";
      } else {
        this.sub_class_icon = str;
      } 
      integer = paramBuilder.enable;
      if (integer == null) {
        this.enable = DEFAULT_ENABLE;
      } else {
        this.enable = integer;
      } 
    } else {
      this.sub_class_id = ((Builder)integer).sub_class_id;
      this.sub_class_name = ((Builder)integer).sub_class_name;
      this.sub_class_icon = ((Builder)integer).sub_class_icon;
      this.enable = ((Builder)integer).enable;
    } 
  }
}
