import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.MediaNum;

public final class MediaNum extends Message {
  public static final Integer DEFAULT_PIC = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pic;
  
  public MediaNum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.pic;
      if (integer == null) {
        this.pic = DEFAULT_PIC;
      } else {
        this.pic = integer;
      } 
    } else {
      this.pic = ((Builder)integer).pic;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2043635151, "Ltbclient/MediaNum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2043635151, "Ltbclient/MediaNum;");
          return;
        } 
      } 
    } 
  }
}
