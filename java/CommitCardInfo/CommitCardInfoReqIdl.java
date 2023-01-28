package tbclient.CommitCardInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommitCardInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public CommitCardInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public CommitCardInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommitCardInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(CommitCardInfoReqIdl param1CommitCardInfoReqIdl) {
      super(param1CommitCardInfoReqIdl);
      if (param1CommitCardInfoReqIdl == null)
        return; 
      this.data = param1CommitCardInfoReqIdl.data;
    }
    
    public CommitCardInfoReqIdl build(boolean param1Boolean) {
      return new CommitCardInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
