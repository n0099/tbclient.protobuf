package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PbPresent extends Message {
  public static final List<PbPresentList> DEFAULT_LIST;
  
  public static final Integer DEFAULT_TOTAL = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PbPresentList> list;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer total;
  
  static {
    DEFAULT_LIST = Collections.emptyList();
  }
  
  public PbPresent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PbPresentList> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.total;
      if (integer == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer;
      } 
      list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
    } else {
      this.total = ((Builder)list).total;
      this.list = Message.immutableCopyOf(((Builder)list).list);
    } 
  }
  
  public PbPresent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbPresent> {
    public List<PbPresentList> list;
    
    public Integer total;
    
    public Builder() {}
    
    public Builder(PbPresent param1PbPresent) {
      super(param1PbPresent);
      if (param1PbPresent == null)
        return; 
      this.total = param1PbPresent.total;
      this.list = Message.copyOf(param1PbPresent.list);
    }
    
    public PbPresent build(boolean param1Boolean) {
      return new PbPresent(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
