package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ModuleItem extends Message {
  public static final Long DEFAULT_MID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long mid;
  
  public ModuleItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      long_ = paramBuilder.mid;
      if (long_ == null) {
        this.mid = DEFAULT_MID;
      } else {
        this.mid = long_;
      } 
    } else {
      this.mid = ((Builder)long_).mid;
    } 
  }
  
  public ModuleItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ModuleItem> {
    public Long mid;
    
    public Builder() {}
    
    public Builder(ModuleItem param1ModuleItem) {
      super(param1ModuleItem);
      if (param1ModuleItem == null)
        return; 
      this.mid = param1ModuleItem.mid;
    }
    
    public ModuleItem build(boolean param1Boolean) {
      return new ModuleItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
