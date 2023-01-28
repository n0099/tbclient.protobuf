package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SubTagListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SubTagListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SubTagListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SubTagListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SubTagListReqIdl param1SubTagListReqIdl) {
      super(param1SubTagListReqIdl);
      if (param1SubTagListReqIdl == null)
        return; 
      this.data = param1SubTagListReqIdl.data;
    }
    
    public SubTagListReqIdl build(boolean param1Boolean) {
      return new SubTagListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
