package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ItemDetail extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_VALUE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String value;
  
  public ItemDetail(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.value;
      if (str == null) {
        this.value = "";
      } else {
        this.value = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.value = ((Builder)str).value;
    } 
  }
  
  public ItemDetail(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ItemDetail> {
    public String name;
    
    public String value;
    
    public Builder() {}
    
    public Builder(ItemDetail param1ItemDetail) {
      super(param1ItemDetail);
      if (param1ItemDetail == null)
        return; 
      this.name = param1ItemDetail.name;
      this.value = param1ItemDetail.value;
    }
    
    public ItemDetail build(boolean param1Boolean) {
      return new ItemDetail(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
