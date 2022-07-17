package tbclient.ActiveConfig;

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
  
  public static final Integer DEFAULT_IS_FIRST_UP;
  
  public static final Integer DEFAULT_IS_SCHEMA_UP;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_first_up;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_schema_up;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-314789916, "Ltbclient/ActiveConfig/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-314789916, "Ltbclient/ActiveConfig/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_SCHEMA_UP = integer;
    DEFAULT_IS_FIRST_UP = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer1 = paramBuilder.is_schema_up;
      if (integer1 == null) {
        this.is_schema_up = DEFAULT_IS_SCHEMA_UP;
      } else {
        this.is_schema_up = integer1;
      } 
      integer = paramBuilder.is_first_up;
      if (integer == null) {
        this.is_first_up = DEFAULT_IS_FIRST_UP;
      } else {
        this.is_first_up = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.is_schema_up = ((Builder)integer).is_schema_up;
      this.is_first_up = ((Builder)integer).is_first_up;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Integer is_first_up;
    
    public Integer is_schema_up;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.is_schema_up = param1DataReq.is_schema_up;
      this.is_first_up = param1DataReq.is_first_up;
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
