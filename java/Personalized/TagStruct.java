package Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TagStruct extends Message {
  public static final Integer DEFAULT_SELECTED = Integer.valueOf(0);
  
  public static final String DEFAULT_TAG_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer selected;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tag_name;
  
  public TagStruct(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
      integer = paramBuilder.selected;
      if (integer == null) {
        this.selected = DEFAULT_SELECTED;
      } else {
        this.selected = integer;
      } 
    } else {
      this.tag_name = ((Builder)integer).tag_name;
      this.selected = ((Builder)integer).selected;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1774680481, "Ltbclient/Personalized/TagStruct;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1774680481, "Ltbclient/Personalized/TagStruct;");
          return;
        } 
      } 
    } 
  }
}
