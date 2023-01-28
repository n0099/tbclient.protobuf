package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BubbleInfo extends Message {
  public static final Integer DEFAULT_BUBBLE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_BUBBLE_PIC = "";
  
  public static final String DEFAULT_BUBBLE_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer bubble_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bubble_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bubble_text;
  
  public BubbleInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.bubble_id;
      if (integer == null) {
        this.bubble_id = DEFAULT_BUBBLE_ID;
      } else {
        this.bubble_id = integer;
      } 
      String str1 = paramBuilder.bubble_text;
      if (str1 == null) {
        this.bubble_text = "";
      } else {
        this.bubble_text = str1;
      } 
      str = paramBuilder.bubble_pic;
      if (str == null) {
        this.bubble_pic = "";
      } else {
        this.bubble_pic = str;
      } 
    } else {
      this.bubble_id = ((Builder)str).bubble_id;
      this.bubble_text = ((Builder)str).bubble_text;
      this.bubble_pic = ((Builder)str).bubble_pic;
    } 
  }
  
  public BubbleInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BubbleInfo> {
    public Integer bubble_id;
    
    public String bubble_pic;
    
    public String bubble_text;
    
    public Builder() {}
    
    public Builder(BubbleInfo param1BubbleInfo) {
      super(param1BubbleInfo);
      if (param1BubbleInfo == null)
        return; 
      this.bubble_id = param1BubbleInfo.bubble_id;
      this.bubble_text = param1BubbleInfo.bubble_text;
      this.bubble_pic = param1BubbleInfo.bubble_pic;
    }
    
    public BubbleInfo build(boolean param1Boolean) {
      return new BubbleInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
