package tbclient;

import com.squareup.wire.Message;

public final class FeatureCardToutiao extends Message {
  public FeatureCardToutiao(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public FeatureCardToutiao(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardToutiao> {
    public Builder() {}
    
    public Builder(FeatureCardToutiao param1FeatureCardToutiao) {
      super(param1FeatureCardToutiao);
    }
    
    public FeatureCardToutiao build(boolean param1Boolean) {
      return new FeatureCardToutiao(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
