package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeatureCardHotSubNode extends Message {
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public FeatureCardHotSubNode(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.title = ((Builder)str).title;
    } 
  }
  
  public FeatureCardHotSubNode(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardHotSubNode> {
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(FeatureCardHotSubNode param1FeatureCardHotSubNode) {
      super(param1FeatureCardHotSubNode);
      if (param1FeatureCardHotSubNode == null)
        return; 
      this.url = param1FeatureCardHotSubNode.url;
      this.title = param1FeatureCardHotSubNode.title;
    }
    
    public FeatureCardHotSubNode build(boolean param1Boolean) {
      return new FeatureCardHotSubNode(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
