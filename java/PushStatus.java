package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PushStatus extends Message {
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  public static final List<PushType> DEFAULT_TYPES = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PushType> types;
  
  public PushStatus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PushType> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
      list = paramBuilder.types;
      if (list == null) {
        this.types = DEFAULT_TYPES;
      } else {
        this.types = Message.immutableCopyOf(list);
      } 
    } else {
      this.status = ((Builder)list).status;
      this.types = Message.immutableCopyOf(((Builder)list).types);
    } 
  }
  
  public PushStatus(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PushStatus> {
    public Integer status;
    
    public List<PushType> types;
    
    public Builder() {}
    
    public Builder(PushStatus param1PushStatus) {
      super(param1PushStatus);
      if (param1PushStatus == null)
        return; 
      this.status = param1PushStatus.status;
      this.types = Message.copyOf(param1PushStatus.types);
    }
    
    public PushStatus build(boolean param1Boolean) {
      return new PushStatus(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
