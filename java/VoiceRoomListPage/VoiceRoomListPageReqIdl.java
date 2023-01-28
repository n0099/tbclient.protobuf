package tbclient.VoiceRoomListPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VoiceRoomListPageReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public VoiceRoomListPageReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public VoiceRoomListPageReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VoiceRoomListPageReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(VoiceRoomListPageReqIdl param1VoiceRoomListPageReqIdl) {
      super(param1VoiceRoomListPageReqIdl);
      if (param1VoiceRoomListPageReqIdl == null)
        return; 
      this.data = param1VoiceRoomListPageReqIdl.data;
    }
    
    public VoiceRoomListPageReqIdl build(boolean param1Boolean) {
      return new VoiceRoomListPageReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
