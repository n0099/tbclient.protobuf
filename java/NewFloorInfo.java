package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NewFloorInfo extends Message {
  public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
  
  public static final Integer DEFAULT_IS_FLOOR = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PbContent> content;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_floor;
  
  public NewFloorInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<PbContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.is_floor;
      if (integer == null) {
        this.is_floor = DEFAULT_IS_FLOOR;
      } else {
        this.is_floor = integer;
      } 
    } else {
      this.content = Message.immutableCopyOf(((Builder)integer).content);
      this.is_floor = ((Builder)integer).is_floor;
    } 
  }
  
  public NewFloorInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewFloorInfo> {
    public List<PbContent> content;
    
    public Integer is_floor;
    
    public Builder() {}
    
    public Builder(NewFloorInfo param1NewFloorInfo) {
      super(param1NewFloorInfo);
      if (param1NewFloorInfo == null)
        return; 
      this.content = Message.copyOf(param1NewFloorInfo.content);
      this.is_floor = param1NewFloorInfo.is_floor;
    }
    
    public NewFloorInfo build(boolean param1Boolean) {
      return new NewFloorInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
