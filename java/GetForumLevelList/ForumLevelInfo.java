package tbclient.GetForumLevelList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumLevelInfo extends Message {
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  public ForumLevelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
    } 
  }
  
  public ForumLevelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumLevelInfo> {
    public Integer id;
    
    public String name;
    
    public Builder() {}
    
    public Builder(ForumLevelInfo param1ForumLevelInfo) {
      super(param1ForumLevelInfo);
      if (param1ForumLevelInfo == null)
        return; 
      this.id = param1ForumLevelInfo.id;
      this.name = param1ForumLevelInfo.name;
    }
    
    public ForumLevelInfo build(boolean param1Boolean) {
      return new ForumLevelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
