package Hottopic;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Hottopic.CommonThread;

public final class ThreadModule extends Message {
  @ProtoField(tag = 1)
  public final CommonThread thread_module_1;
  
  @ProtoField(tag = 2)
  public final CommonThread thread_module_2;
  
  @ProtoField(tag = 3)
  public final CommonThread thread_module_3;
  
  public ThreadModule(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.thread_module_1 = paramBuilder.thread_module_1;
      this.thread_module_2 = paramBuilder.thread_module_2;
      this.thread_module_3 = paramBuilder.thread_module_3;
    } else {
      this.thread_module_1 = paramBuilder.thread_module_1;
      this.thread_module_2 = paramBuilder.thread_module_2;
      this.thread_module_3 = paramBuilder.thread_module_3;
    } 
  }
}
