package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddPostReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AddPostReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AddPostReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddPostReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AddPostReqIdl param1AddPostReqIdl) {
      super(param1AddPostReqIdl);
      if (param1AddPostReqIdl == null)
        return; 
      this.data = param1AddPostReqIdl.data;
    }
    
    public AddPostReqIdl build(boolean param1Boolean) {
      return new AddPostReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
