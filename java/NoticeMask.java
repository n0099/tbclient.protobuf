import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NoticeMask;

public final class NoticeMask extends Message {
  public static final Integer DEFAULT_ATTR_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_ATTR_VALUE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer attr_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String attr_value;
  
  public NoticeMask(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.attr_type;
      if (integer == null) {
        this.attr_type = DEFAULT_ATTR_TYPE;
      } else {
        this.attr_type = integer;
      } 
      str = paramBuilder.attr_value;
      if (str == null) {
        this.attr_value = "";
      } else {
        this.attr_value = str;
      } 
    } else {
      this.attr_type = ((Builder)str).attr_type;
      this.attr_value = ((Builder)str).attr_value;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(912975789, "Ltbclient/NoticeMask;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(912975789, "Ltbclient/NoticeMask;");
          return;
        } 
      } 
    } 
  }
}
