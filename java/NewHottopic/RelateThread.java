package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RelateThread extends Message {
  public static final Integer DEFAULT_HAS_MORE = Integer.valueOf(0);
  
  public static final List<TopicThread> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<TopicThread> thread_list;
  
  public RelateThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<TopicThread> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.has_more = ((Builder)list).has_more;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public RelateThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RelateThread> {
    public Integer has_more;
    
    public List<TopicThread> thread_list;
    
    public Builder() {}
    
    public Builder(RelateThread param1RelateThread) {
      super(param1RelateThread);
      if (param1RelateThread == null)
        return; 
      this.has_more = param1RelateThread.has_more;
      this.thread_list = Message.copyOf(param1RelateThread.thread_list);
    }
    
    public RelateThread build(boolean param1Boolean) {
      return new RelateThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
