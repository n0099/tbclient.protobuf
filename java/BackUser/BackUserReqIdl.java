package tbclient.BackUser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BackUserReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public BackUserReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public BackUserReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BackUserReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(BackUserReqIdl param1BackUserReqIdl) {
      super(param1BackUserReqIdl);
      if (param1BackUserReqIdl == null)
        return; 
      this.data = param1BackUserReqIdl.data;
    }
    
    public BackUserReqIdl build(boolean param1Boolean) {
      return new BackUserReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
