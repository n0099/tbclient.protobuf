package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomGuide extends Message {
  public static final Integer DEFAULT_HOT_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 2)
  public final ChatroomGuideConfig hot_config;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer hot_num;
  
  @ProtoField(tag = 3)
  public final ChatroomGuideConfig manual_config;
  
  public ChatroomGuide(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.hot_num;
      if (integer == null) {
        this.hot_num = DEFAULT_HOT_NUM;
      } else {
        this.hot_num = integer;
      } 
      this.hot_config = paramBuilder.hot_config;
      this.manual_config = paramBuilder.manual_config;
    } else {
      this.hot_num = paramBuilder.hot_num;
      this.hot_config = paramBuilder.hot_config;
      this.manual_config = paramBuilder.manual_config;
    } 
  }
  
  public ChatroomGuide(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChatroomGuide> {
    public ChatroomGuideConfig hot_config;
    
    public Integer hot_num;
    
    public ChatroomGuideConfig manual_config;
    
    public Builder() {}
    
    public Builder(ChatroomGuide param1ChatroomGuide) {
      super(param1ChatroomGuide);
      if (param1ChatroomGuide == null)
        return; 
      this.hot_num = param1ChatroomGuide.hot_num;
      this.hot_config = param1ChatroomGuide.hot_config;
      this.manual_config = param1ChatroomGuide.manual_config;
    }
    
    public ChatroomGuide build(boolean param1Boolean) {
      return new ChatroomGuide(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
