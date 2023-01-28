package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Category extends Message {
  public static final String DEFAULT_FIRST_CLASS = "";
  
  public static final List<String> DEFAULT_SECOND_CLASS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String first_class;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> second_class;
  
  public Category(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.first_class;
      if (str == null) {
        this.first_class = "";
      } else {
        this.first_class = str;
      } 
      list = paramBuilder.second_class;
      if (list == null) {
        this.second_class = DEFAULT_SECOND_CLASS;
      } else {
        this.second_class = Message.immutableCopyOf(list);
      } 
    } else {
      this.first_class = ((Builder)list).first_class;
      this.second_class = Message.immutableCopyOf(((Builder)list).second_class);
    } 
  }
  
  public Category(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Category> {
    public String first_class;
    
    public List<String> second_class;
    
    public Builder() {}
    
    public Builder(Category param1Category) {
      super(param1Category);
      if (param1Category == null)
        return; 
      this.first_class = param1Category.first_class;
      this.second_class = Message.copyOf(param1Category.second_class);
    }
    
    public Category build(boolean param1Boolean) {
      return new Category(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
