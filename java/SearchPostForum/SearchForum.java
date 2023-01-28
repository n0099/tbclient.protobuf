package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;

public final class SearchForum extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_CONCERN_NUM = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_HAS_CONCERNED = Integer.valueOf(0);
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_POST_NUM = "";
  
  public static final String DEFAULT_SLOGAN = "";
  
  public static final List<FrsTabInfo> DEFAULT_TAB_INFO = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String concern_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer has_concerned;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String post_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String slogan;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<FrsTabInfo> tab_info;
  
  public SearchForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FrsTabInfo> list;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder.post_num;
      if (str == null) {
        this.post_num = "";
      } else {
        this.post_num = str;
      } 
      str = paramBuilder.concern_num;
      if (str == null) {
        this.concern_num = "";
      } else {
        this.concern_num = str;
      } 
      str = paramBuilder.slogan;
      if (str == null) {
        this.slogan = "";
      } else {
        this.slogan = str;
      } 
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
      Integer integer = paramBuilder.has_concerned;
      if (integer == null) {
        this.has_concerned = DEFAULT_HAS_CONCERNED;
      } else {
        this.has_concerned = integer;
      } 
      list = paramBuilder.tab_info;
      if (list == null) {
        this.tab_info = DEFAULT_TAB_INFO;
      } else {
        this.tab_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.forum_id = ((Builder)list).forum_id;
      this.forum_name = ((Builder)list).forum_name;
      this.avatar = ((Builder)list).avatar;
      this.post_num = ((Builder)list).post_num;
      this.concern_num = ((Builder)list).concern_num;
      this.slogan = ((Builder)list).slogan;
      this.intro = ((Builder)list).intro;
      this.has_concerned = ((Builder)list).has_concerned;
      this.tab_info = Message.immutableCopyOf(((Builder)list).tab_info);
    } 
  }
  
  public SearchForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SearchForum> {
    public String avatar;
    
    public String concern_num;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer has_concerned;
    
    public String intro;
    
    public String post_num;
    
    public String slogan;
    
    public List<FrsTabInfo> tab_info;
    
    public Builder() {}
    
    public Builder(SearchForum param1SearchForum) {
      super(param1SearchForum);
      if (param1SearchForum == null)
        return; 
      this.forum_id = param1SearchForum.forum_id;
      this.forum_name = param1SearchForum.forum_name;
      this.avatar = param1SearchForum.avatar;
      this.post_num = param1SearchForum.post_num;
      this.concern_num = param1SearchForum.concern_num;
      this.slogan = param1SearchForum.slogan;
      this.intro = param1SearchForum.intro;
      this.has_concerned = param1SearchForum.has_concerned;
      this.tab_info = Message.copyOf(param1SearchForum.tab_info);
    }
    
    public SearchForum build(boolean param1Boolean) {
      return new SearchForum(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
