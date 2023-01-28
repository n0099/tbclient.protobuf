package tbclient.GetHistoryForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
import tbclient.HistoryForumInfo;

public final class DataRes extends Message {
  public static final List<HistoryForumInfo> DEFAULT_HISTORY_FORUM = Collections.emptyList();
  
  public static final List<FrsTabInfo> DEFAULT_NAV_TAB_INFO = Collections.emptyList();
  
  public static final List<HistoryForumInfo> DEFAULT_THIS_WEEK_FORUMS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<HistoryForumInfo> history_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FrsTabInfo> nav_tab_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<HistoryForumInfo> this_week_forums;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<HistoryForumInfo> list;
    if (paramBoolean == true) {
      List<HistoryForumInfo> list2 = paramBuilder.history_forum;
      if (list2 == null) {
        this.history_forum = DEFAULT_HISTORY_FORUM;
      } else {
        this.history_forum = Message.immutableCopyOf(list2);
      } 
      List<FrsTabInfo> list1 = paramBuilder.nav_tab_info;
      if (list1 == null) {
        this.nav_tab_info = DEFAULT_NAV_TAB_INFO;
      } else {
        this.nav_tab_info = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.this_week_forums;
      if (list == null) {
        this.this_week_forums = DEFAULT_THIS_WEEK_FORUMS;
      } else {
        this.this_week_forums = Message.immutableCopyOf(list);
      } 
    } else {
      this.history_forum = Message.immutableCopyOf(((Builder)list).history_forum);
      this.nav_tab_info = Message.immutableCopyOf(((Builder)list).nav_tab_info);
      this.this_week_forums = Message.immutableCopyOf(((Builder)list).this_week_forums);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<HistoryForumInfo> history_forum;
    
    public List<FrsTabInfo> nav_tab_info;
    
    public List<HistoryForumInfo> this_week_forums;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.history_forum = Message.copyOf(param1DataRes.history_forum);
      this.nav_tab_info = Message.copyOf(param1DataRes.nav_tab_info);
      this.this_week_forums = Message.copyOf(param1DataRes.this_week_forums);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
