import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ItemPoint;

public final class ItemPoint extends Message {
  public static final Double DEFAULT_POINT = Double.valueOf(0.0D);
  
  public static final String DEFAULT_TIME_INTVAL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double point;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String time_intval;
  
  public ItemPoint(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      String str = paramBuilder.time_intval;
      if (str == null) {
        this.time_intval = "";
      } else {
        this.time_intval = str;
      } 
      double_ = paramBuilder.point;
      if (double_ == null) {
        this.point = DEFAULT_POINT;
      } else {
        this.point = double_;
      } 
    } else {
      this.time_intval = ((Builder)double_).time_intval;
      this.point = ((Builder)double_).point;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1086495224, "Ltbclient/ItemPoint;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1086495224, "Ltbclient/ItemPoint;");
          return;
        } 
      } 
    } 
  }
}
