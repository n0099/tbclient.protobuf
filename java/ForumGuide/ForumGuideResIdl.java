package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ForumGuideResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ForumGuideResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ForumGuideResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumGuideResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ForumGuideResIdl param1ForumGuideResIdl) {
      super(param1ForumGuideResIdl);
      if (param1ForumGuideResIdl == null)
        return; 
      this.error = param1ForumGuideResIdl.error;
      this.data = param1ForumGuideResIdl.data;
    }
    
    public ForumGuideResIdl build(boolean param1Boolean) {
      return new ForumGuideResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
