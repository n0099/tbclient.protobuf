package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NewHottopicReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public NewHottopicReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public NewHottopicReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewHottopicReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(NewHottopicReqIdl param1NewHottopicReqIdl) {
      super(param1NewHottopicReqIdl);
      if (param1NewHottopicReqIdl == null)
        return; 
      this.data = param1NewHottopicReqIdl.data;
    }
    
    public NewHottopicReqIdl build(boolean param1Boolean) {
      return new NewHottopicReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
