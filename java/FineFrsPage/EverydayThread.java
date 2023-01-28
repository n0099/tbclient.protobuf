package tbclient.FineFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class EverydayThread extends Message {
  public static final List<FineThreadInfo> DEFAULT_FINE_THREAD_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_SHOW_TIME = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FineThreadInfo> fine_thread_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer show_time;
  
  public EverydayThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<FineThreadInfo> list = paramBuilder.fine_thread_list;
      if (list == null) {
        this.fine_thread_list = DEFAULT_FINE_THREAD_LIST;
      } else {
        this.fine_thread_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.show_time;
      if (integer == null) {
        this.show_time = DEFAULT_SHOW_TIME;
      } else {
        this.show_time = integer;
      } 
    } else {
      this.fine_thread_list = Message.immutableCopyOf(((Builder)integer).fine_thread_list);
      this.show_time = ((Builder)integer).show_time;
    } 
  }
  
  public EverydayThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<EverydayThread> {
    public List<FineThreadInfo> fine_thread_list;
    
    public Integer show_time;
    
    public Builder() {}
    
    public Builder(EverydayThread param1EverydayThread) {
      super(param1EverydayThread);
      if (param1EverydayThread == null)
        return; 
      this.fine_thread_list = Message.copyOf(param1EverydayThread.fine_thread_list);
      this.show_time = param1EverydayThread.show_time;
    }
    
    public EverydayThread build(boolean param1Boolean) {
      return new EverydayThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
