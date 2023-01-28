package tbclient.GetBarrageList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BarrageItem extends Message {
  public static final List<Barrage> DEFAULT_LIST;
  
  public static final Double DEFAULT_TIME = Double.valueOf(0.0D);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<Barrage> list;
  
  @ProtoField(tag = 1, type = Message.Datatype.DOUBLE)
  public final Double time;
  
  static {
    DEFAULT_LIST = Collections.emptyList();
  }
  
  public BarrageItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Barrage> list;
    if (paramBoolean == true) {
      Double double_ = paramBuilder.time;
      if (double_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = double_;
      } 
      list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
    } else {
      this.time = ((Builder)list).time;
      this.list = Message.immutableCopyOf(((Builder)list).list);
    } 
  }
  
  public BarrageItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BarrageItem> {
    public List<Barrage> list;
    
    public Double time;
    
    public Builder() {}
    
    public Builder(BarrageItem param1BarrageItem) {
      super(param1BarrageItem);
      if (param1BarrageItem == null)
        return; 
      this.time = param1BarrageItem.time;
      this.list = Message.copyOf(param1BarrageItem.list);
    }
    
    public BarrageItem build(boolean param1Boolean) {
      return new BarrageItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
