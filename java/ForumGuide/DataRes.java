package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumCreateInfo;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<HotSearch> DEFAULT_HOT_SEARCH = Collections.emptyList();
  
  public static final Integer DEFAULT_IS_LOGIN;
  
  public static final List<LikeForum> DEFAULT_LIKE_FORUM = Collections.emptyList();
  
  public static final Integer DEFAULT_MSIGN_LEVEL;
  
  public static final String DEFAULT_MSIGN_TEXT = "";
  
  public static final Integer DEFAULT_MSIGN_VALID;
  
  public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST;
  
  @ProtoField(tag = 3)
  public final ForumCreateInfo forum_create_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<HotSearch> hot_search;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_login;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<LikeForum> like_forum;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer msign_level;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String msign_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer msign_valid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<ThreadInfo> voice_room_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LOGIN = integer;
    DEFAULT_MSIGN_VALID = integer;
    DEFAULT_MSIGN_LEVEL = integer;
    DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      List<HotSearch> list2 = paramBuilder.hot_search;
      if (list2 == null) {
        this.hot_search = DEFAULT_HOT_SEARCH;
      } else {
        this.hot_search = Message.immutableCopyOf(list2);
      } 
      List<LikeForum> list1 = paramBuilder.like_forum;
      if (list1 == null) {
        this.like_forum = DEFAULT_LIKE_FORUM;
      } else {
        this.like_forum = Message.immutableCopyOf(list1);
      } 
      this.forum_create_info = paramBuilder.forum_create_info;
      Integer integer2 = paramBuilder.is_login;
      if (integer2 == null) {
        this.is_login = DEFAULT_IS_LOGIN;
      } else {
        this.is_login = integer2;
      } 
      integer2 = paramBuilder.msign_valid;
      if (integer2 == null) {
        this.msign_valid = DEFAULT_MSIGN_VALID;
      } else {
        this.msign_valid = integer2;
      } 
      String str = paramBuilder.msign_text;
      if (str == null) {
        this.msign_text = "";
      } else {
        this.msign_text = str;
      } 
      Integer integer1 = paramBuilder.msign_level;
      if (integer1 == null) {
        this.msign_level = DEFAULT_MSIGN_LEVEL;
      } else {
        this.msign_level = integer1;
      } 
      list = paramBuilder.voice_room_list;
      if (list == null) {
        this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
      } else {
        this.voice_room_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.hot_search = Message.immutableCopyOf(((Builder)list).hot_search);
      this.like_forum = Message.immutableCopyOf(((Builder)list).like_forum);
      this.forum_create_info = ((Builder)list).forum_create_info;
      this.is_login = ((Builder)list).is_login;
      this.msign_valid = ((Builder)list).msign_valid;
      this.msign_text = ((Builder)list).msign_text;
      this.msign_level = ((Builder)list).msign_level;
      this.voice_room_list = Message.immutableCopyOf(((Builder)list).voice_room_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ForumCreateInfo forum_create_info;
    
    public List<HotSearch> hot_search;
    
    public Integer is_login;
    
    public List<LikeForum> like_forum;
    
    public Integer msign_level;
    
    public String msign_text;
    
    public Integer msign_valid;
    
    public List<ThreadInfo> voice_room_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.hot_search = Message.copyOf(param1DataRes.hot_search);
      this.like_forum = Message.copyOf(param1DataRes.like_forum);
      this.forum_create_info = param1DataRes.forum_create_info;
      this.is_login = param1DataRes.is_login;
      this.msign_valid = param1DataRes.msign_valid;
      this.msign_text = param1DataRes.msign_text;
      this.msign_level = param1DataRes.msign_level;
      this.voice_room_list = Message.copyOf(param1DataRes.voice_room_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
