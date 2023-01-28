package tbclient.Acrossforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AcrossForum extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_name;
  
  public AcrossForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
    } else {
      this.forum_name = ((Builder)str).forum_name;
      this.desc = ((Builder)str).desc;
    } 
  }
  
  public AcrossForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AcrossForum> {
    public String desc;
    
    public String forum_name;
    
    public Builder() {}
    
    public Builder(AcrossForum param1AcrossForum) {
      super(param1AcrossForum);
      if (param1AcrossForum == null)
        return; 
      this.forum_name = param1AcrossForum.forum_name;
      this.desc = param1AcrossForum.desc;
    }
    
    public AcrossForum build(boolean param1Boolean) {
      return new AcrossForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
