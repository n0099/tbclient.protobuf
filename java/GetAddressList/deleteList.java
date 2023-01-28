package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class deleteList extends Message {
  public static final List<friendList> DEFAULT_FRIEND_LIST = Collections.emptyList();
  
  public static final String DEFAULT_KEY = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<friendList> friend_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String key;
  
  public deleteList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<friendList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.key;
      if (str == null) {
        this.key = "";
      } else {
        this.key = str;
      } 
      list = paramBuilder.friend_list;
      if (list == null) {
        this.friend_list = DEFAULT_FRIEND_LIST;
      } else {
        this.friend_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.key = ((Builder)list).key;
      this.friend_list = Message.immutableCopyOf(((Builder)list).friend_list);
    } 
  }
  
  public deleteList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<deleteList> {
    public List<friendList> friend_list;
    
    public String key;
    
    public Builder() {}
    
    public Builder(deleteList param1deleteList) {
      super(param1deleteList);
      if (param1deleteList == null)
        return; 
      this.key = param1deleteList.key;
      this.friend_list = Message.copyOf(param1deleteList.friend_list);
    }
    
    public deleteList build(boolean param1Boolean) {
      return new deleteList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
