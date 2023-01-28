package tbclient.GetSticker;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetStickerReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetStickerReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetStickerReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetStickerReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetStickerReqIdl param1GetStickerReqIdl) {
      super(param1GetStickerReqIdl);
      if (param1GetStickerReqIdl == null)
        return; 
      this.data = param1GetStickerReqIdl.data;
    }
    
    public GetStickerReqIdl build(boolean param1Boolean) {
      return new GetStickerReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
