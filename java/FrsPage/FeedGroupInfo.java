package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FeedGroupInfo extends Message {
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public FeedGroupInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public FeedGroupInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeedGroupInfo> {
    public String jump_url;
    
    public String name;
    
    public Builder() {}
    
    public Builder(FeedGroupInfo param1FeedGroupInfo) {
      super(param1FeedGroupInfo);
      if (param1FeedGroupInfo == null)
        return; 
      this.name = param1FeedGroupInfo.name;
      this.jump_url = param1FeedGroupInfo.jump_url;
    }
    
    public FeedGroupInfo build(boolean param1Boolean) {
      return new FeedGroupInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
