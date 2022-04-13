import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Ecom;

public final class Ecom extends Message {
  public static final Integer DEFAULT_IS_SELLER = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_seller;
  
  public Ecom(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.is_seller;
      if (integer == null) {
        this.is_seller = DEFAULT_IS_SELLER;
      } else {
        this.is_seller = integer;
      } 
    } else {
      this.is_seller = ((Builder)integer).is_seller;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1101275627, "Ltbclient/Ecom;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1101275627, "Ltbclient/Ecom;");
          return;
        } 
      } 
    } 
  }
}
