package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Equipment extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  public Equipment(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public Equipment(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Equipment> {
    public String name;
    
    public String portrait;
    
    public Builder() {}
    
    public Builder(Equipment param1Equipment) {
      super(param1Equipment);
      if (param1Equipment == null)
        return; 
      this.name = param1Equipment.name;
      this.portrait = param1Equipment.portrait;
    }
    
    public Equipment build(boolean param1Boolean) {
      return new Equipment(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
