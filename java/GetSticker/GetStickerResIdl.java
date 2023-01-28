package tbclient.GetSticker;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetStickerResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetStickerResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetStickerResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetStickerResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetStickerResIdl param1GetStickerResIdl) {
      super(param1GetStickerResIdl);
      if (param1GetStickerResIdl == null)
        return; 
      this.error = param1GetStickerResIdl.error;
      this.data = param1GetStickerResIdl.data;
    }
    
    public GetStickerResIdl build(boolean param1Boolean) {
      return new GetStickerResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
