package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TagStruct extends Message {
  public static final Integer DEFAULT_SELECTED = Integer.valueOf(0);
  
  public static final String DEFAULT_TAG_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer selected;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tag_name;
  
  public TagStruct(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
      integer = paramBuilder.selected;
      if (integer == null) {
        this.selected = DEFAULT_SELECTED;
      } else {
        this.selected = integer;
      } 
    } else {
      this.tag_name = ((Builder)integer).tag_name;
      this.selected = ((Builder)integer).selected;
    } 
  }
  
  public TagStruct(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TagStruct> {
    public Integer selected;
    
    public String tag_name;
    
    public Builder() {}
    
    public Builder(TagStruct param1TagStruct) {
      super(param1TagStruct);
      if (param1TagStruct == null)
        return; 
      this.tag_name = param1TagStruct.tag_name;
      this.selected = param1TagStruct.selected;
    }
    
    public TagStruct build(boolean param1Boolean) {
      return new TagStruct(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
