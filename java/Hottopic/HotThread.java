package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;

public final class HotThread extends Message {
  public static final String DEFAULT_HOT_TITLE = "";
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String hot_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 3)
  public final Page page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  static {
    DEFAULT_IS_NEW_URL = Integer.valueOf(0);
  }
  
  public HotThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.hot_title;
      if (str == null) {
        this.hot_title = "";
      } else {
        this.hot_title = str;
      } 
      List<ThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
      integer = paramBuilder.is_new_url;
      if (integer == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer;
      } 
    } else {
      this.hot_title = ((Builder)integer).hot_title;
      this.thread_list = Message.immutableCopyOf(((Builder)integer).thread_list);
      this.page = ((Builder)integer).page;
      this.is_new_url = ((Builder)integer).is_new_url;
    } 
  }
  
  public HotThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotThread> {
    public String hot_title;
    
    public Integer is_new_url;
    
    public Page page;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(HotThread param1HotThread) {
      super(param1HotThread);
      if (param1HotThread == null)
        return; 
      this.hot_title = param1HotThread.hot_title;
      this.thread_list = Message.copyOf(param1HotThread.thread_list);
      this.page = param1HotThread.page;
      this.is_new_url = param1HotThread.is_new_url;
    }
    
    public HotThread build(boolean param1Boolean) {
      return new HotThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
