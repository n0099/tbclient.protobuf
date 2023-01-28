package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Highlist extends Message {
  public static final Boolean DEFAULT_HAS_MORE;
  
  public static final List<High> DEFAULT_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<High> list;
  
  static {
    DEFAULT_HAS_MORE = Boolean.FALSE;
  }
  
  public Highlist(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      List<High> list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
      bool = paramBuilder.has_more;
      if (bool == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = bool;
      } 
    } else {
      this.list = Message.immutableCopyOf(((Builder)bool).list);
      this.has_more = ((Builder)bool).has_more;
    } 
  }
  
  public Highlist(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Highlist> {
    public Boolean has_more;
    
    public List<High> list;
    
    public Builder() {}
    
    public Builder(Highlist param1Highlist) {
      super(param1Highlist);
      if (param1Highlist == null)
        return; 
      this.list = Message.copyOf(param1Highlist.list);
      this.has_more = param1Highlist.has_more;
    }
    
    public Highlist build(boolean param1Boolean) {
      return new Highlist(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
