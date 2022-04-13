package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadIdListInfo extends Message {
  public static final Integer DEFAULT_IS_PARTIAL_VISIBLE;
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_partial_visible;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long tid;
  
  static {
    DEFAULT_IS_PARTIAL_VISIBLE = Integer.valueOf(0);
  }
  
  public ThreadIdListInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      integer = paramBuilder.is_partial_visible;
      if (integer == null) {
        this.is_partial_visible = DEFAULT_IS_PARTIAL_VISIBLE;
      } else {
        this.is_partial_visible = integer;
      } 
    } else {
      this.tid = ((Builder)integer).tid;
      this.is_partial_visible = ((Builder)integer).is_partial_visible;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-613340985, "Ltbclient/FrsPage/ThreadIdListInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-613340985, "Ltbclient/FrsPage/ThreadIdListInfo;");
          return;
        } 
      } 
    } 
  }
}
