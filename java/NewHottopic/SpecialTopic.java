package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class SpecialTopic extends Message {
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public SpecialTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public SpecialTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SpecialTopic> {
    public List<ThreadInfo> thread_list;
    
    public String title;
    
    public Builder() {}
    
    public Builder(SpecialTopic param1SpecialTopic) {
      super(param1SpecialTopic);
      if (param1SpecialTopic == null)
        return; 
      this.title = param1SpecialTopic.title;
      this.thread_list = Message.copyOf(param1SpecialTopic.thread_list);
    }
    
    public SpecialTopic build(boolean param1Boolean) {
      return new SpecialTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
