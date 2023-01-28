package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemOptions extends Message {
  public static final String DEFAULT_KEY = "";
  
  public static final String DEFAULT_VALUE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String key;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String value;
  
  public ItemOptions(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.key;
      if (str1 == null) {
        this.key = "";
      } else {
        this.key = str1;
      } 
      str = paramBuilder.value;
      if (str == null) {
        this.value = "";
      } else {
        this.value = str;
      } 
    } else {
      this.key = ((Builder)str).key;
      this.value = ((Builder)str).value;
    } 
  }
  
  public ItemOptions(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemOptions> {
    public String key;
    
    public String value;
    
    public Builder() {}
    
    public Builder(ItemOptions param1ItemOptions) {
      super(param1ItemOptions);
      if (param1ItemOptions == null)
        return; 
      this.key = param1ItemOptions.key;
      this.value = param1ItemOptions.value;
    }
    
    public ItemOptions build(boolean param1Boolean) {
      return new ItemOptions(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
