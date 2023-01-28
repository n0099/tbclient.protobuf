package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecommendTip extends Message {
  public static final String DEFAULT_IS_FOLLOW = "";
  
  public static final String DEFAULT_REASON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String is_follow;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String reason;
  
  public RecommendTip(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.reason;
      if (str1 == null) {
        this.reason = "";
      } else {
        this.reason = str1;
      } 
      str = paramBuilder.is_follow;
      if (str == null) {
        this.is_follow = "";
      } else {
        this.is_follow = str;
      } 
    } else {
      this.reason = ((Builder)str).reason;
      this.is_follow = ((Builder)str).is_follow;
    } 
  }
  
  public RecommendTip(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendTip> {
    public String is_follow;
    
    public String reason;
    
    public Builder() {}
    
    public Builder(RecommendTip param1RecommendTip) {
      super(param1RecommendTip);
      if (param1RecommendTip == null)
        return; 
      this.reason = param1RecommendTip.reason;
      this.is_follow = param1RecommendTip.is_follow;
    }
    
    public RecommendTip build(boolean param1Boolean) {
      return new RecommendTip(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
