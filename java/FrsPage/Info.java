package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Info extends Message {
  public static final Integer DEFAULT_POST_NUM;
  
  public static final List<RecmForumInfo> DEFAULT_RECM_FORUM_LIST;
  
  public static final Integer DEFAULT_USER_NUM;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<RecmForumInfo> recm_forum_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer user_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_RECM_FORUM_LIST = Collections.emptyList();
  }
  
  public Info(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RecmForumInfo> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.user_num;
      if (integer == null) {
        this.user_num = DEFAULT_USER_NUM;
      } else {
        this.user_num = integer;
      } 
      integer = paramBuilder.post_num;
      if (integer == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer;
      } 
      list = paramBuilder.recm_forum_list;
      if (list == null) {
        this.recm_forum_list = DEFAULT_RECM_FORUM_LIST;
      } else {
        this.recm_forum_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.user_num = ((Builder)list).user_num;
      this.post_num = ((Builder)list).post_num;
      this.recm_forum_list = Message.immutableCopyOf(((Builder)list).recm_forum_list);
    } 
  }
  
  public Info(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Info> {
    public Integer post_num;
    
    public List<RecmForumInfo> recm_forum_list;
    
    public Integer user_num;
    
    public Builder() {}
    
    public Builder(Info param1Info) {
      super(param1Info);
      if (param1Info == null)
        return; 
      this.user_num = param1Info.user_num;
      this.post_num = param1Info.post_num;
      this.recm_forum_list = Message.copyOf(param1Info.recm_forum_list);
    }
    
    public Info build(boolean param1Boolean) {
      return new Info(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
