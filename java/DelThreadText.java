import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.DelThreadText;

public final class DelThreadText extends Message {
  public static final Integer DEFAULT_TEXT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT_INFO = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer text_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text_info;
  
  public DelThreadText(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.text_id;
      if (integer == null) {
        this.text_id = DEFAULT_TEXT_ID;
      } else {
        this.text_id = integer;
      } 
      str = paramBuilder.text_info;
      if (str == null) {
        this.text_info = "";
      } else {
        this.text_info = str;
      } 
    } else {
      this.text_id = ((Builder)str).text_id;
      this.text_info = ((Builder)str).text_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-104100061, "Ltbclient/DelThreadText;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-104100061, "Ltbclient/DelThreadText;");
          return;
        } 
      } 
    } 
  }
}
