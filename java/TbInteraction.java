package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TbInteraction extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  public TbInteraction(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.content = ((Builder)str).content;
    } 
  }
  
  public TbInteraction(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TbInteraction> {
    public String content;
    
    public Builder() {}
    
    public Builder(TbInteraction param1TbInteraction) {
      super(param1TbInteraction);
      if (param1TbInteraction == null)
        return; 
      this.content = param1TbInteraction.content;
    }
    
    public TbInteraction build(boolean param1Boolean) {
      return new TbInteraction(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
