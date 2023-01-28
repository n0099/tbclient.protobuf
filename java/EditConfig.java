package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class EditConfig extends Message {
  public static final Integer DEFAULT_IS_FIRST_EDIT;
  
  public static final Integer DEFAULT_SHOW_EDIT;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_first_edit;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer show_edit;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHOW_EDIT = integer;
    DEFAULT_IS_FIRST_EDIT = integer;
  }
  
  public EditConfig(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.show_edit;
      if (integer1 == null) {
        this.show_edit = DEFAULT_SHOW_EDIT;
      } else {
        this.show_edit = integer1;
      } 
      integer = paramBuilder.is_first_edit;
      if (integer == null) {
        this.is_first_edit = DEFAULT_IS_FIRST_EDIT;
      } else {
        this.is_first_edit = integer;
      } 
    } else {
      this.show_edit = ((Builder)integer).show_edit;
      this.is_first_edit = ((Builder)integer).is_first_edit;
    } 
  }
  
  public EditConfig(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EditConfig> {
    public Integer is_first_edit;
    
    public Integer show_edit;
    
    public Builder() {}
    
    public Builder(EditConfig param1EditConfig) {
      super(param1EditConfig);
      if (param1EditConfig == null)
        return; 
      this.show_edit = param1EditConfig.show_edit;
      this.is_first_edit = param1EditConfig.is_first_edit;
    }
    
    public EditConfig build(boolean param1Boolean) {
      return new EditConfig(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
