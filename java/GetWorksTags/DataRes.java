package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<Category> DEFAULT_CATEGORY = Collections.emptyList();
  
  public static final List<Tag> DEFAULT_TAGS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Category> category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Tag> tags;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Tag> list;
    if (paramBoolean == true) {
      List<Category> list1 = paramBuilder.category;
      if (list1 == null) {
        this.category = DEFAULT_CATEGORY;
      } else {
        this.category = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
    } else {
      this.category = Message.immutableCopyOf(((Builder)list).category);
      this.tags = Message.immutableCopyOf(((Builder)list).tags);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<Category> category;
    
    public List<Tag> tags;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.category = Message.copyOf(param1DataRes.category);
      this.tags = Message.copyOf(param1DataRes.tags);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
