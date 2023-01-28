package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
import tbclient.RecomTopicList;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<FrsTabInfo> DEFAULT_HOT_THREAD_TAB_INFO;
  
  public static final List<InnerTabInfo> DEFAULT_INNER_TABS;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_INFO;
  
  public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FrsTabInfo> hot_thread_tab_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<InnerTabInfo> inner_tabs;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RecomTopicList> topic_list;
  
  static {
    DEFAULT_THREAD_INFO = Collections.emptyList();
    DEFAULT_HOT_THREAD_TAB_INFO = Collections.emptyList();
    DEFAULT_INNER_TABS = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<InnerTabInfo> list;
    if (paramBoolean == true) {
      List<RecomTopicList> list3 = paramBuilder.topic_list;
      if (list3 == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list3);
      } 
      List<ThreadInfo> list2 = paramBuilder.thread_info;
      if (list2 == null) {
        this.thread_info = DEFAULT_THREAD_INFO;
      } else {
        this.thread_info = Message.immutableCopyOf(list2);
      } 
      List<FrsTabInfo> list1 = paramBuilder.hot_thread_tab_info;
      if (list1 == null) {
        this.hot_thread_tab_info = DEFAULT_HOT_THREAD_TAB_INFO;
      } else {
        this.hot_thread_tab_info = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.inner_tabs;
      if (list == null) {
        this.inner_tabs = DEFAULT_INNER_TABS;
      } else {
        this.inner_tabs = Message.immutableCopyOf(list);
      } 
    } else {
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
      this.thread_info = Message.immutableCopyOf(((Builder)list).thread_info);
      this.hot_thread_tab_info = Message.immutableCopyOf(((Builder)list).hot_thread_tab_info);
      this.inner_tabs = Message.immutableCopyOf(((Builder)list).inner_tabs);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<FrsTabInfo> hot_thread_tab_info;
    
    public List<InnerTabInfo> inner_tabs;
    
    public List<ThreadInfo> thread_info;
    
    public List<RecomTopicList> topic_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.topic_list = Message.copyOf(param1DataRes.topic_list);
      this.thread_info = Message.copyOf(param1DataRes.thread_info);
      this.hot_thread_tab_info = Message.copyOf(param1DataRes.hot_thread_tab_info);
      this.inner_tabs = Message.copyOf(param1DataRes.inner_tabs);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
