package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShareReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ShareReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ShareReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ShareReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ShareReqIdl param1ShareReqIdl) {
      super(param1ShareReqIdl);
      if (param1ShareReqIdl == null)
        return; 
      this.data = param1ShareReqIdl.data;
    }
    
    public ShareReqIdl build(boolean param1Boolean) {
      return new ShareReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
