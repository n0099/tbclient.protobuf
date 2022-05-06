package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ColorEgg extends Message {
  public static final List<String> DEFAULT_HOLIDAY_WORDS = Collections.emptyList();
  
  public static final Integer DEFAULT_STYLE_FLAG = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> holiday_words;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer style_flag;
  
  public ColorEgg(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.holiday_words;
      if (list == null) {
        this.holiday_words = DEFAULT_HOLIDAY_WORDS;
      } else {
        this.holiday_words = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.style_flag;
      if (integer == null) {
        this.style_flag = DEFAULT_STYLE_FLAG;
      } else {
        this.style_flag = integer;
      } 
    } else {
      this.holiday_words = Message.immutableCopyOf(((Builder)integer).holiday_words);
      this.style_flag = ((Builder)integer).style_flag;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1662864234, "Ltbclient/FrsPage/ColorEgg;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1662864234, "Ltbclient/FrsPage/ColorEgg;");
          return;
        } 
      } 
    } 
  }
}
