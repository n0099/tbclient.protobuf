package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumSubLabel extends Message {
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_SUB_LABEL_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_label_name;
  
  public ForumSubLabel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      str = paramBuilder.sub_label_name;
      if (str == null) {
        this.sub_label_name = "";
      } else {
        this.sub_label_name = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.sub_label_name = ((Builder)str).sub_label_name;
    } 
  }
  
  public ForumSubLabel(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumSubLabel> {
    public Integer id;
    
    public String sub_label_name;
    
    public Builder() {}
    
    public Builder(ForumSubLabel param1ForumSubLabel) {
      super(param1ForumSubLabel);
      if (param1ForumSubLabel == null)
        return; 
      this.id = param1ForumSubLabel.id;
      this.sub_label_name = param1ForumSubLabel.sub_label_name;
    }
    
    public ForumSubLabel build(boolean param1Boolean) {
      return new ForumSubLabel(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
