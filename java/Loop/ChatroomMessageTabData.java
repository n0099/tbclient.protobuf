package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ChatroomMessageTabData extends Message {
  public static final Boolean DEFAULT_HAVE_NEW_MSG = Boolean.FALSE;
  
  @ProtoField(tag = 1, type = Message.Datatype.BOOL)
  public final Boolean have_new_msg;
  
  public ChatroomMessageTabData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      bool = paramBuilder.have_new_msg;
      if (bool == null) {
        this.have_new_msg = DEFAULT_HAVE_NEW_MSG;
      } else {
        this.have_new_msg = bool;
      } 
    } else {
      this.have_new_msg = ((Builder)bool).have_new_msg;
    } 
  }
  
  public ChatroomMessageTabData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChatroomMessageTabData> {
    public Boolean have_new_msg;
    
    public Builder() {}
    
    public Builder(ChatroomMessageTabData param1ChatroomMessageTabData) {
      super(param1ChatroomMessageTabData);
      if (param1ChatroomMessageTabData == null)
        return; 
      this.have_new_msg = param1ChatroomMessageTabData.have_new_msg;
    }
    
    public ChatroomMessageTabData build(boolean param1Boolean) {
      return new ChatroomMessageTabData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
