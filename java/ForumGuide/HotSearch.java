package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotSearch extends Message {
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_SEARCH_TITLE = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String search_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String slogan;
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str1 = paramBuilder.slogan;
      if (str1 == null) {
        this.slogan = "";
      } else {
        this.slogan = str1;
      } 
      str = paramBuilder.search_title;
      if (str == null) {
        this.search_title = "";
      } else {
        this.search_title = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.forum_name = ((Builder)str).forum_name;
      this.slogan = ((Builder)str).slogan;
      this.search_title = ((Builder)str).search_title;
    } 
  }
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotSearch> {
    public Long forum_id;
    
    public String forum_name;
    
    public String search_title;
    
    public String slogan;
    
    public Builder() {}
    
    public Builder(HotSearch param1HotSearch) {
      super(param1HotSearch);
      if (param1HotSearch == null)
        return; 
      this.forum_id = param1HotSearch.forum_id;
      this.forum_name = param1HotSearch.forum_name;
      this.slogan = param1HotSearch.slogan;
      this.search_title = param1HotSearch.search_title;
    }
    
    public HotSearch build(boolean param1Boolean) {
      return new HotSearch(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
