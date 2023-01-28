package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NewTopicListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public NewTopicListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public NewTopicListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewTopicListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(NewTopicListReqIdl param1NewTopicListReqIdl) {
      super(param1NewTopicListReqIdl);
      if (param1NewTopicListReqIdl == null)
        return; 
      this.data = param1NewTopicListReqIdl.data;
    }
    
    public NewTopicListReqIdl build(boolean param1Boolean) {
      return new NewTopicListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
