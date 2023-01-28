package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HeadItem extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer type;
  
  public HeadItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.content = ((Builder)integer).content;
      this.type = ((Builder)integer).type;
    } 
  }
  
  public HeadItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HeadItem> {
    public String content;
    
    public String name;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(HeadItem param1HeadItem) {
      super(param1HeadItem);
      if (param1HeadItem == null)
        return; 
      this.name = param1HeadItem.name;
      this.content = param1HeadItem.content;
      this.type = param1HeadItem.type;
    }
    
    public HeadItem build(boolean param1Boolean) {
      return new HeadItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
