package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NebulaHotThreads extends Message {
  public static final List<NebulaHotThread> DEFAULT_THREADS = Collections.emptyList();
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<NebulaHotThread> threads;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public NebulaHotThreads(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<NebulaHotThread> list;
    if (paramBoolean == true) {
      String str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      list = paramBuilder.threads;
      if (list == null) {
        this.threads = DEFAULT_THREADS;
      } else {
        this.threads = Message.immutableCopyOf(list);
      } 
    } else {
      this.url = ((Builder)list).url;
      this.threads = Message.immutableCopyOf(((Builder)list).threads);
    } 
  }
  
  public NebulaHotThreads(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NebulaHotThreads> {
    public List<NebulaHotThread> threads;
    
    public String url;
    
    public Builder() {}
    
    public Builder(NebulaHotThreads param1NebulaHotThreads) {
      super(param1NebulaHotThreads);
      if (param1NebulaHotThreads == null)
        return; 
      this.url = param1NebulaHotThreads.url;
      this.threads = Message.copyOf(param1NebulaHotThreads.threads);
    }
    
    public NebulaHotThreads build(boolean param1Boolean) {
      return new NebulaHotThreads(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
