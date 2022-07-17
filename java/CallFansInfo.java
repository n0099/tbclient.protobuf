package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CallFansInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CAN_CALL = Integer.valueOf(0);
  
  public static final Long DEFAULT_THREAD_ID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer can_call;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  public CallFansInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.can_call;
      if (integer == null) {
        this.can_call = DEFAULT_CAN_CALL;
      } else {
        this.can_call = integer;
      } 
      long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
    } else {
      this.can_call = ((Builder)long_).can_call;
      this.thread_id = ((Builder)long_).thread_id;
    } 
  }
  
  public CallFansInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1417667589, "Ltbclient/CallFansInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1417667589, "Ltbclient/CallFansInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<CallFansInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer can_call;
    
    public Long thread_id;
    
    public Builder() {}
    
    public Builder(CallFansInfo param1CallFansInfo) {
      super(param1CallFansInfo);
      if (param1CallFansInfo == null)
        return; 
      this.can_call = param1CallFansInfo.can_call;
      this.thread_id = param1CallFansInfo.thread_id;
    }
    
    public CallFansInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (CallFansInfo)interceptResult.objValue; 
      } 
      return new CallFansInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
