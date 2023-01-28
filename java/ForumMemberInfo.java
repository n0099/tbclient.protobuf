package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumMemberInfo extends Message {
  public static final List<User> DEFAULT_MEMBER_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TOTAL = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> member_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String total;
  
  public ForumMemberInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      String str = paramBuilder.total;
      if (str == null) {
        this.total = "";
      } else {
        this.total = str;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.member_list;
      if (list == null) {
        this.member_list = DEFAULT_MEMBER_LIST;
      } else {
        this.member_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.total = ((Builder)list).total;
      this.title = ((Builder)list).title;
      this.member_list = Message.immutableCopyOf(((Builder)list).member_list);
    } 
  }
  
  public ForumMemberInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumMemberInfo> {
    public List<User> member_list;
    
    public String title;
    
    public String total;
    
    public Builder() {}
    
    public Builder(ForumMemberInfo param1ForumMemberInfo) {
      super(param1ForumMemberInfo);
      if (param1ForumMemberInfo == null)
        return; 
      this.total = param1ForumMemberInfo.total;
      this.title = param1ForumMemberInfo.title;
      this.member_list = Message.copyOf(param1ForumMemberInfo.member_list);
    }
    
    public ForumMemberInfo build(boolean param1Boolean) {
      return new ForumMemberInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
