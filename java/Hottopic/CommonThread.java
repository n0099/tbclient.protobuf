package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class CommonThread extends Message {
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final List<GoodThread> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GoodThread> thread_list;
  
  public CommonThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<GoodThread> list;
    if (paramBoolean == true) {
      String str = paramBuilder.module_name;
      if (str == null) {
        this.module_name = "";
      } else {
        this.module_name = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.module_name = ((Builder)list).module_name;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public CommonThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CommonThread> {
    public String module_name;
    
    public List<GoodThread> thread_list;
    
    public Builder() {}
    
    public Builder(CommonThread param1CommonThread) {
      super(param1CommonThread);
      if (param1CommonThread == null)
        return; 
      this.module_name = param1CommonThread.module_name;
      this.thread_list = Message.copyOf(param1CommonThread.thread_list);
    }
    
    public CommonThread build(boolean param1Boolean) {
      return new CommonThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
