package tbclient.VoiceRoomListPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class VoiceRoomListPageResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public VoiceRoomListPageResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public VoiceRoomListPageResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VoiceRoomListPageResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(VoiceRoomListPageResIdl param1VoiceRoomListPageResIdl) {
      super(param1VoiceRoomListPageResIdl);
      if (param1VoiceRoomListPageResIdl == null)
        return; 
      this.error = param1VoiceRoomListPageResIdl.error;
      this.data = param1VoiceRoomListPageResIdl.data;
    }
    
    public VoiceRoomListPageResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VoiceRoomListPageResIdl)interceptResult.objValue; 
      } 
      return new VoiceRoomListPageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
