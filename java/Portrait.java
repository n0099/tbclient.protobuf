import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Portrait;

public final class Portrait extends Message {
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1035798102, "Ltbclient/Portrait;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1035798102, "Ltbclient/Portrait;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_END_TIME = integer;
  }
  
  public Portrait(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.props_id;
      if (integer == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer;
      } 
      integer = paramBuilder.end_time;
      if (integer == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.props_id = ((Builder)str).props_id;
      this.end_time = ((Builder)str).end_time;
      this.url = ((Builder)str).url;
    } 
  }
}
