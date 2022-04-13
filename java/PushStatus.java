import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PushStatus;
import tbclient.PushType;

public final class PushStatus extends Message {
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  public static final List<PushType> DEFAULT_TYPES = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PushType> types;
  
  public PushStatus(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
      list = paramBuilder.types;
      if (list == null) {
        this.types = DEFAULT_TYPES;
      } else {
        this.types = Message.immutableCopyOf(list);
      } 
    } else {
      this.status = ((Builder)list).status;
      this.types = Message.immutableCopyOf(((Builder)list).types);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-367077659, "Ltbclient/PushStatus;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-367077659, "Ltbclient/PushStatus;");
          return;
        } 
      } 
    } 
  }
}
