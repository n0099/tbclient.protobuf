package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;

public final class MemberGodInfo extends Message {
  public static final List<User> DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_FORUM_GOD_NUM = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> forum_god_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer forum_god_num;
  
  public MemberGodInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<User> list = paramBuilder.forum_god_list;
      if (list == null) {
        this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
      } else {
        this.forum_god_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.forum_god_num;
      if (integer == null) {
        this.forum_god_num = DEFAULT_FORUM_GOD_NUM;
      } else {
        this.forum_god_num = integer;
      } 
    } else {
      this.forum_god_list = Message.immutableCopyOf(((Builder)integer).forum_god_list);
      this.forum_god_num = ((Builder)integer).forum_god_num;
    } 
  }
  
  public MemberGodInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MemberGodInfo> {
    public List<User> forum_god_list;
    
    public Integer forum_god_num;
    
    public Builder() {}
    
    public Builder(MemberGodInfo param1MemberGodInfo) {
      super(param1MemberGodInfo);
      if (param1MemberGodInfo == null)
        return; 
      this.forum_god_list = Message.copyOf(param1MemberGodInfo.forum_god_list);
      this.forum_god_num = param1MemberGodInfo.forum_god_num;
    }
    
    public MemberGodInfo build(boolean param1Boolean) {
      return new MemberGodInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
