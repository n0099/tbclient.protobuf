import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ItemPlot;

public final class ItemPlot extends Message {
  public static final Integer DEFAULT_LEVEL;
  
  public static final Integer DEFAULT_NUM;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer level;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2043078269, "Ltbclient/ItemPlot;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2043078269, "Ltbclient/ItemPlot;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_LEVEL = integer;
    DEFAULT_NUM = integer;
  }
  
  public ItemPlot(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.level;
      if (integer1 == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer1;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.level = ((Builder)integer).level;
      this.num = ((Builder)integer).num;
    } 
  }
}
