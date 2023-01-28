package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;

public final class RecommendUserList extends Message {
  public static final Integer DEFAULT_FLOOR_POSITION = Integer.valueOf(0);
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer floor_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<User> user_list;
  
  public RecommendUserList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<User> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.floor_position;
      if (integer == null) {
        this.floor_position = DEFAULT_FLOOR_POSITION;
      } else {
        this.floor_position = integer;
      } 
      list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.floor_position = ((Builder)list).floor_position;
      this.user_list = Message.immutableCopyOf(((Builder)list).user_list);
    } 
  }
  
  public RecommendUserList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendUserList> {
    public Integer floor_position;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(RecommendUserList param1RecommendUserList) {
      super(param1RecommendUserList);
      if (param1RecommendUserList == null)
        return; 
      this.floor_position = param1RecommendUserList.floor_position;
      this.user_list = Message.copyOf(param1RecommendUserList.user_list);
    }
    
    public RecommendUserList build(boolean param1Boolean) {
      return new RecommendUserList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
