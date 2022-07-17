package tbclient.GetLockWindowMsg;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_TASK_ID;
  
  public static final Long DEFAULT_TID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long task_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long tid;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1060919556, "Ltbclient/GetLockWindowMsg/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1060919556, "Ltbclient/GetLockWindowMsg/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    DEFAULT_TASK_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.tid;
      if (long_1 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_1;
      } 
      long_ = paramBuilder.task_id;
      if (long_ == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.tid = ((Builder)long_).tid;
      this.task_id = ((Builder)long_).task_id;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Long task_id;
    
    public Long tid;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tid = param1DataReq.tid;
      this.task_id = param1DataReq.task_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
