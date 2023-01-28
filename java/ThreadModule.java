package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ThreadModule extends Message {
  public static final Long DEFAULT_MODULE_ID;
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Long DEFAULT_SHOW_NUM;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_INFO = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long module_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long show_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ThreadInfo> thread_info;
  
  static {
    DEFAULT_SHOW_NUM = long_;
  }
  
  public ThreadModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.module_id;
      if (long_1 == null) {
        this.module_id = DEFAULT_MODULE_ID;
      } else {
        this.module_id = long_1;
      } 
      String str = paramBuilder.module_name;
      if (str == null) {
        this.module_name = "";
      } else {
        this.module_name = str;
      } 
      List<ThreadInfo> list = paramBuilder.thread_info;
      if (list == null) {
        this.thread_info = DEFAULT_THREAD_INFO;
      } else {
        this.thread_info = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.show_num;
      if (long_ == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = long_;
      } 
    } else {
      this.module_id = ((Builder)long_).module_id;
      this.module_name = ((Builder)long_).module_name;
      this.thread_info = Message.immutableCopyOf(((Builder)long_).thread_info);
      this.show_num = ((Builder)long_).show_num;
    } 
  }
  
  public ThreadModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_MODULE_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<ThreadModule> {
    public Long module_id;
    
    public String module_name;
    
    public Long show_num;
    
    public List<ThreadInfo> thread_info;
    
    public Builder() {}
    
    public Builder(ThreadModule param1ThreadModule) {
      super(param1ThreadModule);
      if (param1ThreadModule == null)
        return; 
      this.module_id = param1ThreadModule.module_id;
      this.module_name = param1ThreadModule.module_name;
      this.thread_info = Message.copyOf(param1ThreadModule.thread_info);
      this.show_num = param1ThreadModule.show_num;
    }
    
    public ThreadModule build(boolean param1Boolean) {
      return new ThreadModule(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
