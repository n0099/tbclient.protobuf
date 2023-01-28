package tbclient.GetForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumDataItem extends Message {
  public static final List<ForumDataGroup> DEFAULT_GROUP;
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ForumDataGroup> group;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    DEFAULT_GROUP = Collections.emptyList();
  }
  
  public ForumDataItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ForumDataGroup> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      list = paramBuilder.group;
      if (list == null) {
        this.group = DEFAULT_GROUP;
      } else {
        this.group = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.group = Message.immutableCopyOf(((Builder)list).group);
    } 
  }
  
  public ForumDataItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumDataItem> {
    public List<ForumDataGroup> group;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(ForumDataItem param1ForumDataItem) {
      super(param1ForumDataItem);
      if (param1ForumDataItem == null)
        return; 
      this.type = param1ForumDataItem.type;
      this.group = Message.copyOf(param1ForumDataItem.group);
    }
    
    public ForumDataItem build(boolean param1Boolean) {
      return new ForumDataItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
