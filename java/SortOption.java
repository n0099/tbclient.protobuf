package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SortOption extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_SORT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  public SortOption(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      integer = paramBuilder.sort_type;
      if (integer == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.sort_type = ((Builder)integer).sort_type;
    } 
  }
  
  public SortOption(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SortOption> {
    public String name;
    
    public Integer sort_type;
    
    public Builder() {}
    
    public Builder(SortOption param1SortOption) {
      super(param1SortOption);
      if (param1SortOption == null)
        return; 
      this.name = param1SortOption.name;
      this.sort_type = param1SortOption.sort_type;
    }
    
    public SortOption build(boolean param1Boolean) {
      return new SortOption(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
