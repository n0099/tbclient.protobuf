package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotSearch extends Message {
  public static final String DEFAULT_SEARCH_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String search_title;
  
  @ProtoField(tag = 2)
  public final SearchValue search_value;
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.search_title;
      if (str == null) {
        this.search_title = "";
      } else {
        this.search_title = str;
      } 
      this.search_value = paramBuilder.search_value;
    } else {
      this.search_title = paramBuilder.search_title;
      this.search_value = paramBuilder.search_value;
    } 
  }
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotSearch> {
    public String search_title;
    
    public SearchValue search_value;
    
    public Builder() {}
    
    public Builder(HotSearch param1HotSearch) {
      super(param1HotSearch);
      if (param1HotSearch == null)
        return; 
      this.search_title = param1HotSearch.search_title;
      this.search_value = param1HotSearch.search_value;
    }
    
    public HotSearch build(boolean param1Boolean) {
      return new HotSearch(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
