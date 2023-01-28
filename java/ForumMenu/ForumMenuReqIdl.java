package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumMenuReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ForumMenuReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumMenuReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumMenuReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ForumMenuReqIdl param1ForumMenuReqIdl) {
      super(param1ForumMenuReqIdl);
      if (param1ForumMenuReqIdl == null)
        return; 
      this.data = param1ForumMenuReqIdl.data;
    }
    
    public ForumMenuReqIdl build(boolean param1Boolean) {
      return new ForumMenuReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
