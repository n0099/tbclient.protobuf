import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.WapRn;

public final class WapRn extends Message {
  public static final Integer DEFAULT_FRSRN;
  
  public static final Integer DEFAULT_PBRN;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer frsrn;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pbrn;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(733677091, "Ltbclient/WapRn;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(733677091, "Ltbclient/WapRn;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FRSRN = integer;
    DEFAULT_PBRN = integer;
  }
  
  public WapRn(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.frsrn;
      if (integer1 == null) {
        this.frsrn = DEFAULT_FRSRN;
      } else {
        this.frsrn = integer1;
      } 
      integer = paramBuilder.pbrn;
      if (integer == null) {
        this.pbrn = DEFAULT_PBRN;
      } else {
        this.pbrn = integer;
      } 
    } else {
      this.frsrn = ((Builder)integer).frsrn;
      this.pbrn = ((Builder)integer).pbrn;
    } 
  }
}
