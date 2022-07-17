package tbclient.GetStoreRemindTime;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetStoreRemindTimeResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetStoreRemindTimeResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetStoreRemindTimeResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetStoreRemindTimeResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetStoreRemindTimeResIdl param1GetStoreRemindTimeResIdl) {
      super(param1GetStoreRemindTimeResIdl);
      if (param1GetStoreRemindTimeResIdl == null)
        return; 
      this.data = param1GetStoreRemindTimeResIdl.data;
      this.error = param1GetStoreRemindTimeResIdl.error;
    }
    
    public GetStoreRemindTimeResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GetStoreRemindTimeResIdl)interceptResult.objValue; 
      } 
      return new GetStoreRemindTimeResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
