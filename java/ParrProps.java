import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Level;
import tbclient.ParrProps;
import tbclient.Props;

public final class ParrProps extends Message {
  public static final Integer DEFAULT_PORTRAIT_TIME = Integer.valueOf(0);
  
  public static final List<Props> DEFAULT_PROPS = Collections.emptyList();
  
  @ProtoField(tag = 2)
  public final Level level;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer portrait_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Props> props;
  
  public ParrProps(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.portrait_time;
      if (integer == null) {
        this.portrait_time = DEFAULT_PORTRAIT_TIME;
      } else {
        this.portrait_time = integer;
      } 
      this.level = paramBuilder.level;
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.portrait_time = ((Builder)list).portrait_time;
      this.level = ((Builder)list).level;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1152993146, "Ltbclient/ParrProps;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1152993146, "Ltbclient/ParrProps;");
          return;
        } 
      } 
    } 
  }
}
