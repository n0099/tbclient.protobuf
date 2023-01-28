package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotSearch extends Message {
  public static final Integer DEFAULT_JUMP_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_SEARCH_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer jump_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String search_title;
  
  @ProtoField(tag = 2)
  public final SearchValue search_value;
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.search_title;
      if (str == null) {
        this.search_title = "";
      } else {
        this.search_title = str;
      } 
      this.search_value = paramBuilder.search_value;
      integer = paramBuilder.jump_type;
      if (integer == null) {
        this.jump_type = DEFAULT_JUMP_TYPE;
      } else {
        this.jump_type = integer;
      } 
    } else {
      this.search_title = ((Builder)integer).search_title;
      this.search_value = ((Builder)integer).search_value;
      this.jump_type = ((Builder)integer).jump_type;
    } 
  }
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotSearch> {
    public Integer jump_type;
    
    public String search_title;
    
    public SearchValue search_value;
    
    public Builder() {}
    
    public Builder(HotSearch param1HotSearch) {
      super(param1HotSearch);
      if (param1HotSearch == null)
        return; 
      this.search_title = param1HotSearch.search_title;
      this.search_value = param1HotSearch.search_value;
      this.jump_type = param1HotSearch.jump_type;
    }
    
    public HotSearch build(boolean param1Boolean) {
      return new HotSearch(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
