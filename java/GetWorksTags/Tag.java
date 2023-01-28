package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Tag extends Message {
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final String DEFAULT_SECOND_CLASS = "";
  
  public static final List<String> DEFAULT_TAGS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String second_class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> tags;
  
  public Tag(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.first_class;
      if (str == null) {
        this.first_class = "";
      } else {
        this.first_class = str;
      } 
      str = paramBuilder.second_class;
      if (str == null) {
        this.second_class = "";
      } else {
        this.second_class = str;
      } 
      list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
    } else {
      this.first_class = ((Builder)list).first_class;
      this.second_class = ((Builder)list).second_class;
      this.tags = Message.immutableCopyOf(((Builder)list).tags);
    } 
  }
  
  public Tag(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Tag> {
    public String first_class;
    
    public String second_class;
    
    public List<String> tags;
    
    public Builder() {}
    
    public Builder(Tag param1Tag) {
      super(param1Tag);
      if (param1Tag == null)
        return; 
      this.first_class = param1Tag.first_class;
      this.second_class = param1Tag.second_class;
      this.tags = Message.copyOf(param1Tag.tags);
    }
    
    public Tag build(boolean param1Boolean) {
      return new Tag(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
