import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AvatarFrame;

public final class AvatarFrame extends Message {
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_PROPS_ID;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer props_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1468994833, "Ltbclient/AvatarFrame;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1468994833, "Ltbclient/AvatarFrame;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_END_TIME = integer;
  }
  
  public AvatarFrame(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.props_id;
      if (integer1 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer1;
      } 
      integer = paramBuilder.end_time;
      if (integer == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer;
      } 
    } else {
      this.props_id = ((Builder)integer).props_id;
      this.end_time = ((Builder)integer).end_time;
    } 
  }
}
