package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CoverImageColor extends Message {
  public static final Integer DEFAULT_MODEL = Integer.valueOf(0);
  
  public static final String DEFAULT_VALUE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer model;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String value;
  
  public CoverImageColor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.value;
      if (str == null) {
        this.value = "";
      } else {
        this.value = str;
      } 
      integer = paramBuilder.model;
      if (integer == null) {
        this.model = DEFAULT_MODEL;
      } else {
        this.model = integer;
      } 
    } else {
      this.value = ((Builder)integer).value;
      this.model = ((Builder)integer).model;
    } 
  }
  
  public CoverImageColor(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CoverImageColor> {
    public Integer model;
    
    public String value;
    
    public Builder() {}
    
    public Builder(CoverImageColor param1CoverImageColor) {
      super(param1CoverImageColor);
      if (param1CoverImageColor == null)
        return; 
      this.value = param1CoverImageColor.value;
      this.model = param1CoverImageColor.model;
    }
    
    public CoverImageColor build(boolean param1Boolean) {
      return new CoverImageColor(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
