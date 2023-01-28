package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DelThreadText extends Message {
  public static final Integer DEFAULT_TEXT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TEXT_INFO = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer text_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text_info;
  
  public DelThreadText(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.text_id;
      if (integer == null) {
        this.text_id = DEFAULT_TEXT_ID;
      } else {
        this.text_id = integer;
      } 
      str = paramBuilder.text_info;
      if (str == null) {
        this.text_info = "";
      } else {
        this.text_info = str;
      } 
    } else {
      this.text_id = ((Builder)str).text_id;
      this.text_info = ((Builder)str).text_info;
    } 
  }
  
  public DelThreadText(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DelThreadText> {
    public Integer text_id;
    
    public String text_info;
    
    public Builder() {}
    
    public Builder(DelThreadText param1DelThreadText) {
      super(param1DelThreadText);
      if (param1DelThreadText == null)
        return; 
      this.text_id = param1DelThreadText.text_id;
      this.text_info = param1DelThreadText.text_info;
    }
    
    public DelThreadText build(boolean param1Boolean) {
      return new DelThreadText(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
