package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabPic extends Message {
  @ProtoField(tag = 2)
  public final TabPicDesc dark;
  
  @ProtoField(tag = 1)
  public final TabPicDesc normal;
  
  public TabPic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.normal = paramBuilder.normal;
      this.dark = paramBuilder.dark;
    } else {
      this.normal = paramBuilder.normal;
      this.dark = paramBuilder.dark;
    } 
  }
  
  public TabPic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TabPic> {
    public TabPicDesc dark;
    
    public TabPicDesc normal;
    
    public Builder() {}
    
    public Builder(TabPic param1TabPic) {
      super(param1TabPic);
      if (param1TabPic == null)
        return; 
      this.normal = param1TabPic.normal;
      this.dark = param1TabPic.dark;
    }
    
    public TabPic build(boolean param1Boolean) {
      return new TabPic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
