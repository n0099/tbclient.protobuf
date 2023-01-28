package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AtMsgBase extends Message {
  public static final Long DEFAULT_MSG_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_MSG_KEY = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long msg_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String msg_key;
  
  public AtMsgBase(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.msg_id;
      if (long_ == null) {
        this.msg_id = DEFAULT_MSG_ID;
      } else {
        this.msg_id = long_;
      } 
      str = paramBuilder.msg_key;
      if (str == null) {
        this.msg_key = "";
      } else {
        this.msg_key = str;
      } 
    } else {
      this.msg_id = ((Builder)str).msg_id;
      this.msg_key = ((Builder)str).msg_key;
    } 
  }
  
  public AtMsgBase(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AtMsgBase> {
    public Long msg_id;
    
    public String msg_key;
    
    public Builder() {}
    
    public Builder(AtMsgBase param1AtMsgBase) {
      super(param1AtMsgBase);
      if (param1AtMsgBase == null)
        return; 
      this.msg_id = param1AtMsgBase.msg_id;
      this.msg_key = param1AtMsgBase.msg_key;
    }
    
    public AtMsgBase build(boolean param1Boolean) {
      return new AtMsgBase(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
