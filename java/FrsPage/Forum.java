package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Forum extends Message {
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_LEVEL1_DIR_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String level1_dir_name;
  
  public Forum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      str = paramBuilder.level1_dir_name;
      if (str == null) {
        this.level1_dir_name = "";
      } else {
        this.level1_dir_name = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.level1_dir_name = ((Builder)str).level1_dir_name;
    } 
  }
  
  public Forum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Forum> {
    public Long forum_id;
    
    public String level1_dir_name;
    
    public Builder() {}
    
    public Builder(Forum param1Forum) {
      super(param1Forum);
      if (param1Forum == null)
        return; 
      this.forum_id = param1Forum.forum_id;
      this.level1_dir_name = param1Forum.level1_dir_name;
    }
    
    public Forum build(boolean param1Boolean) {
      return new Forum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
