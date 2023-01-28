package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconRes extends Message {
  @ProtoField(tag = 1)
  public final IconPop pop;
  
  public IconRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.pop = paramBuilder.pop;
    } else {
      this.pop = paramBuilder.pop;
    } 
  }
  
  public IconRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<IconRes> {
    public IconPop pop;
    
    public Builder() {}
    
    public Builder(IconRes param1IconRes) {
      super(param1IconRes);
      if (param1IconRes == null)
        return; 
      this.pop = param1IconRes.pop;
    }
    
    public IconRes build(boolean param1Boolean) {
      return new IconRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
