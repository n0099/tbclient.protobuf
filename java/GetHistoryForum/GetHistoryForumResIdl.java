package tbclient.GetHistoryForum;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetHistoryForumResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetHistoryForumResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetHistoryForumResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetHistoryForumResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetHistoryForumResIdl param1GetHistoryForumResIdl) {
      super(param1GetHistoryForumResIdl);
      if (param1GetHistoryForumResIdl == null)
        return; 
      this.error = param1GetHistoryForumResIdl.error;
      this.data = param1GetHistoryForumResIdl.data;
    }
    
    public GetHistoryForumResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GetHistoryForumResIdl)interceptResult.objValue; 
      } 
      return new GetHistoryForumResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
