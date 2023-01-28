package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class MparrProps extends Message {
  public static final List<Props> DEFAULT_PROPS = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final AvatarFrame avatarframe;
  
  @ProtoField(tag = 3)
  public final Level level;
  
  @ProtoField(tag = 2)
  public final Portrait portrait;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<Props> props;
  
  public MparrProps(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Props> list;
    if (paramBoolean == true) {
      this.avatarframe = paramBuilder.avatarframe;
      this.portrait = paramBuilder.portrait;
      this.level = paramBuilder.level;
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.avatarframe = ((Builder)list).avatarframe;
      this.portrait = ((Builder)list).portrait;
      this.level = ((Builder)list).level;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public MparrProps(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MparrProps> {
    public AvatarFrame avatarframe;
    
    public Level level;
    
    public Portrait portrait;
    
    public List<Props> props;
    
    public Builder() {}
    
    public Builder(MparrProps param1MparrProps) {
      super(param1MparrProps);
      if (param1MparrProps == null)
        return; 
      this.avatarframe = param1MparrProps.avatarframe;
      this.portrait = param1MparrProps.portrait;
      this.level = param1MparrProps.level;
      this.props = Message.copyOf(param1MparrProps.props);
    }
    
    public MparrProps build(boolean param1Boolean) {
      return new MparrProps(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
