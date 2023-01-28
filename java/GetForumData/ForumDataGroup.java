package tbclient.GetForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumDataGroup extends Message {
  public static final Double DEFAULT_TOTAL = Double.valueOf(0.0D);
  
  public static final List<ForumDataValue> DEFAULT_VALUES = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
  public final Double total;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ForumDataValue> values;
  
  public ForumDataGroup(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ForumDataValue> list;
    if (paramBoolean == true) {
      Double double_ = paramBuilder.total;
      if (double_ == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = double_;
      } 
      list = paramBuilder.values;
      if (list == null) {
        this.values = DEFAULT_VALUES;
      } else {
        this.values = Message.immutableCopyOf(list);
      } 
    } else {
      this.total = ((Builder)list).total;
      this.values = Message.immutableCopyOf(((Builder)list).values);
    } 
  }
  
  public ForumDataGroup(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumDataGroup> {
    public Double total;
    
    public List<ForumDataValue> values;
    
    public Builder() {}
    
    public Builder(ForumDataGroup param1ForumDataGroup) {
      super(param1ForumDataGroup);
      if (param1ForumDataGroup == null)
        return; 
      this.total = param1ForumDataGroup.total;
      this.values = Message.copyOf(param1ForumDataGroup.values);
    }
    
    public ForumDataGroup build(boolean param1Boolean) {
      return new ForumDataGroup(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
