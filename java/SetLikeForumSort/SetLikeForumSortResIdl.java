package tbclient.SetLikeForumSort;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class SetLikeForumSortResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public SetLikeForumSortResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public SetLikeForumSortResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetLikeForumSortResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(SetLikeForumSortResIdl param1SetLikeForumSortResIdl) {
      super(param1SetLikeForumSortResIdl);
      if (param1SetLikeForumSortResIdl == null)
        return; 
      this.error = param1SetLikeForumSortResIdl.error;
      this.data = param1SetLikeForumSortResIdl.data;
    }
    
    public SetLikeForumSortResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SetLikeForumSortResIdl)interceptResult.objValue; 
      } 
      return new SetLikeForumSortResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}