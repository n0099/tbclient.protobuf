package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumToolPerm extends Message {
  public static final Long DEFAULT_PERM = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long perm;
  
  public ForumToolPerm(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.perm;
      if (long_ == null) {
        this.perm = DEFAULT_PERM;
      } else {
        this.perm = long_;
      } 
    } else {
      this.perm = ((Builder)long_).perm;
    } 
  }
  
  public ForumToolPerm(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumToolPerm> {
    public Long perm;
    
    public Builder() {}
    
    public Builder(ForumToolPerm param1ForumToolPerm) {
      super(param1ForumToolPerm);
      if (param1ForumToolPerm == null)
        return; 
      this.perm = param1ForumToolPerm.perm;
    }
    
    public ForumToolPerm build(boolean param1Boolean) {
      return new ForumToolPerm(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
