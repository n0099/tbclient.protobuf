package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.ForumDynamic;
import tbclient.ThreadInfo;
import tbclient.User;

public final class DataRes extends Message {
  public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST;
  
  public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_PN;
  
  public static final List<ThreadInfo> DEFAULT_VIDEO_PAGE = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ForumDynamic> concerned_forum_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<DynamicInfo> dynamic_list;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 1)
  public final User user;
  
  @ProtoField(tag = 7)
  public final UserGodInfo user_god_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> video_page;
  
  @ProtoField(tag = 8)
  public final DealWindow window;
  
  static {
    DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_HAS_MORE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      List<ThreadInfo> list2 = paramBuilder.video_page;
      if (list2 == null) {
        this.video_page = DEFAULT_VIDEO_PAGE;
      } else {
        this.video_page = Message.immutableCopyOf(list2);
      } 
      List<DynamicInfo> list1 = paramBuilder.dynamic_list;
      if (list1 == null) {
        this.dynamic_list = DEFAULT_DYNAMIC_LIST;
      } else {
        this.dynamic_list = Message.immutableCopyOf(list1);
      } 
      List<ForumDynamic> list = paramBuilder.concerned_forum_list;
      if (list == null) {
        this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
      } else {
        this.concerned_forum_list = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
      this.user_god_info = paramBuilder.user_god_info;
      this.window = paramBuilder.window;
    } else {
      this.user = paramBuilder.user;
      this.video_page = Message.immutableCopyOf(paramBuilder.video_page);
      this.dynamic_list = Message.immutableCopyOf(paramBuilder.dynamic_list);
      this.concerned_forum_list = Message.immutableCopyOf(paramBuilder.concerned_forum_list);
      this.pn = paramBuilder.pn;
      this.has_more = paramBuilder.has_more;
      this.user_god_info = paramBuilder.user_god_info;
      this.window = paramBuilder.window;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ForumDynamic> concerned_forum_list;
    
    public List<DynamicInfo> dynamic_list;
    
    public Integer has_more;
    
    public Integer pn;
    
    public User user;
    
    public UserGodInfo user_god_info;
    
    public List<ThreadInfo> video_page;
    
    public DealWindow window;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user = param1DataRes.user;
      this.video_page = Message.copyOf(param1DataRes.video_page);
      this.dynamic_list = Message.copyOf(param1DataRes.dynamic_list);
      this.concerned_forum_list = Message.copyOf(param1DataRes.concerned_forum_list);
      this.pn = param1DataRes.pn;
      this.has_more = param1DataRes.has_more;
      this.user_god_info = param1DataRes.user_god_info;
      this.window = param1DataRes.window;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
