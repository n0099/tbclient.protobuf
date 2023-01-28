package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class VoiceRoomListPageResIdl extends Message {
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
      return new VoiceRoomListPageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
