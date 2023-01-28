package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DealWindow extends Message {
  public static final List<DisplayWindowInfo> DEFAULT_LIST = Collections.emptyList();
  
  public static final Long DEFAULT_TOTAL = Long.valueOf(0L);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<DisplayWindowInfo> list;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long total;
  
  public DealWindow(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      List<DisplayWindowInfo> list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.total;
      if (long_ == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = long_;
      } 
    } else {
      this.list = Message.immutableCopyOf(((Builder)long_).list);
      this.total = ((Builder)long_).total;
    } 
  }
  
  public DealWindow(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DealWindow> {
    public List<DisplayWindowInfo> list;
    
    public Long total;
    
    public Builder() {}
    
    public Builder(DealWindow param1DealWindow) {
      super(param1DealWindow);
      if (param1DealWindow == null)
        return; 
      this.list = Message.copyOf(param1DealWindow.list);
      this.total = param1DealWindow.total;
    }
    
    public DealWindow build(boolean param1Boolean) {
      return new DealWindow(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
