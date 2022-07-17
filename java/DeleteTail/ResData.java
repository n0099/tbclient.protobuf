package tbclient.DeleteTail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResData extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_TAILID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tailId;
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.tailId;
      if (long_ == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = long_;
      } 
    } else {
      this.tailId = ((Builder)long_).tailId;
    } 
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-145916165, "Ltbclient/DeleteTail/ResData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-145916165, "Ltbclient/DeleteTail/ResData;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ResData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long tailId;
    
    public Builder() {}
    
    public Builder(ResData param1ResData) {
      super(param1ResData);
      if (param1ResData == null)
        return; 
      this.tailId = param1ResData.tailId;
    }
    
    public ResData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ResData)interceptResult.objValue; 
      } 
      return new ResData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
