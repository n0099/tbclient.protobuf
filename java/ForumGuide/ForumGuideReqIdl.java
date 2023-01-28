package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumGuideReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ForumGuideReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumGuideReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumGuideReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ForumGuideReqIdl param1ForumGuideReqIdl) {
      super(param1ForumGuideReqIdl);
      if (param1ForumGuideReqIdl == null)
        return; 
      this.data = param1ForumGuideReqIdl.data;
    }
    
    public ForumGuideReqIdl build(boolean param1Boolean) {
      return new ForumGuideReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
