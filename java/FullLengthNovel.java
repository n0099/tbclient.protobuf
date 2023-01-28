package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FullLengthNovel extends Message {
  public static final Integer DEFAULT_BUTTON_HEIGH = Integer.valueOf(0);
  
  public static final String DEFAULT_HAS_TRUNCATE = "";
  
  public static final String DEFAULT_SCHEMA = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer button_heigh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String has_truncate;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String schema;
  
  public FullLengthNovel(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.schema;
      if (str == null) {
        this.schema = "";
      } else {
        this.schema = str;
      } 
      str = paramBuilder.has_truncate;
      if (str == null) {
        this.has_truncate = "";
      } else {
        this.has_truncate = str;
      } 
      integer = paramBuilder.button_heigh;
      if (integer == null) {
        this.button_heigh = DEFAULT_BUTTON_HEIGH;
      } else {
        this.button_heigh = integer;
      } 
    } else {
      this.schema = ((Builder)integer).schema;
      this.has_truncate = ((Builder)integer).has_truncate;
      this.button_heigh = ((Builder)integer).button_heigh;
    } 
  }
  
  public FullLengthNovel(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FullLengthNovel> {
    public Integer button_heigh;
    
    public String has_truncate;
    
    public String schema;
    
    public Builder() {}
    
    public Builder(FullLengthNovel param1FullLengthNovel) {
      super(param1FullLengthNovel);
      if (param1FullLengthNovel == null)
        return; 
      this.schema = param1FullLengthNovel.schema;
      this.has_truncate = param1FullLengthNovel.has_truncate;
      this.button_heigh = param1FullLengthNovel.button_heigh;
    }
    
    public FullLengthNovel build(boolean param1Boolean) {
      return new FullLengthNovel(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
