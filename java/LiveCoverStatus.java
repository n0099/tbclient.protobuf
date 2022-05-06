import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.LiveCoverStatus;

public final class LiveCoverStatus extends Message {
  public static final String DEFAULT_STATUS = "";
  
  public static final Integer DEFAULT_STATUS_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String status;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer status_num;
  
  public LiveCoverStatus(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.status_num;
      if (integer == null) {
        this.status_num = DEFAULT_STATUS_NUM;
      } else {
        this.status_num = integer;
      } 
      str = paramBuilder.status;
      if (str == null) {
        this.status = "";
      } else {
        this.status = str;
      } 
    } else {
      this.status_num = ((Builder)str).status_num;
      this.status = ((Builder)str).status;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(315961032, "Ltbclient/LiveCoverStatus;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(315961032, "Ltbclient/LiveCoverStatus;");
          return;
        } 
      } 
    } 
  }
}
