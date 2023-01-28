package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FloatingIcon extends Message {
  @ProtoField(tag = 1)
  public final FloatingIconItem pbpage;
  
  public FloatingIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.pbpage = paramBuilder.pbpage;
    } else {
      this.pbpage = paramBuilder.pbpage;
    } 
  }
  
  public FloatingIcon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FloatingIcon> {
    public FloatingIconItem pbpage;
    
    public Builder() {}
    
    public Builder(FloatingIcon param1FloatingIcon) {
      super(param1FloatingIcon);
      if (param1FloatingIcon == null)
        return; 
      this.pbpage = param1FloatingIcon.pbpage;
    }
    
    public FloatingIcon build(boolean param1Boolean) {
      return new FloatingIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
