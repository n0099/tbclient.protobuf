import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PbPostZan;

public final class PbPostZan extends Message {
  public static final Integer DEFAULT_HAS_ZAN;
  
  public static final Long DEFAULT_ZAN_NUM = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_zan;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long zan_num;
  
  static {
    DEFAULT_HAS_ZAN = Integer.valueOf(0);
  }
  
  public PbPostZan(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.zan_num;
      if (long_ == null) {
        this.zan_num = DEFAULT_ZAN_NUM;
      } else {
        this.zan_num = long_;
      } 
      integer = paramBuilder.has_zan;
      if (integer == null) {
        this.has_zan = DEFAULT_HAS_ZAN;
      } else {
        this.has_zan = integer;
      } 
    } else {
      this.zan_num = ((Builder)integer).zan_num;
      this.has_zan = ((Builder)integer).has_zan;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(549226544, "Ltbclient/PbPostZan;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(549226544, "Ltbclient/PbPostZan;");
          return;
        } 
      } 
    } 
  }
}
