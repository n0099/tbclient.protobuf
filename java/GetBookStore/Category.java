package tbclient.GetBookStore;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Category extends Message {
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String category_text;
  
  public Category(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
      str = paramBuilder.category_text;
      if (str == null) {
        this.category_text = "";
      } else {
        this.category_text = str;
      } 
    } else {
      this.category_id = ((Builder)str).category_id;
      this.category_text = ((Builder)str).category_text;
    } 
  }
  
  public Category(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Category> {
    public Integer category_id;
    
    public String category_text;
    
    public Builder() {}
    
    public Builder(Category param1Category) {
      super(param1Category);
      if (param1Category == null)
        return; 
      this.category_id = param1Category.category_id;
      this.category_text = param1Category.category_text;
    }
    
    public Category build(boolean param1Boolean) {
      return new Category(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
