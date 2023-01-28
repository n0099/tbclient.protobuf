package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ParrProps extends Message {
  public static final Integer DEFAULT_PORTRAIT_TIME = Integer.valueOf(0);
  
  public static final List<Props> DEFAULT_PROPS = Collections.emptyList();
  
  @ProtoField(tag = 2)
  public final Level level;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer portrait_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<Props> props;
  
  public ParrProps(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Props> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.portrait_time;
      if (integer == null) {
        this.portrait_time = DEFAULT_PORTRAIT_TIME;
      } else {
        this.portrait_time = integer;
      } 
      this.level = paramBuilder.level;
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.portrait_time = ((Builder)list).portrait_time;
      this.level = ((Builder)list).level;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public ParrProps(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ParrProps> {
    public Level level;
    
    public Integer portrait_time;
    
    public List<Props> props;
    
    public Builder() {}
    
    public Builder(ParrProps param1ParrProps) {
      super(param1ParrProps);
      if (param1ParrProps == null)
        return; 
      this.portrait_time = param1ParrProps.portrait_time;
      this.level = param1ParrProps.level;
      this.props = Message.copyOf(param1ParrProps.props);
    }
    
    public ParrProps build(boolean param1Boolean) {
      return new ParrProps(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
