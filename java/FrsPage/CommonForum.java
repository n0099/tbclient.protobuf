package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonForum extends Message {
  public static final String DEFAULT_COMMON_FORUM = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String common_forum;
  
  public CommonForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.common_forum;
      if (str == null) {
        this.common_forum = "";
      } else {
        this.common_forum = str;
      } 
    } else {
      this.common_forum = ((Builder)str).common_forum;
    } 
  }
  
  public CommonForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommonForum> {
    public String common_forum;
    
    public Builder() {}
    
    public Builder(CommonForum param1CommonForum) {
      super(param1CommonForum);
      if (param1CommonForum == null)
        return; 
      this.common_forum = param1CommonForum.common_forum;
    }
    
    public CommonForum build(boolean param1Boolean) {
      return new CommonForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
