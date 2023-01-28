package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeatureCardGame extends Message {
  public static final Integer DEFAULT_FLOOR;
  
  public static final List<FeatureCardGameSubNode> DEFAULT_SUB_NODES = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeatureCardGameSubNode> sub_nodes;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_FLOOR = integer;
  }
  
  public FeatureCardGame(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<FeatureCardGameSubNode> list = paramBuilder.sub_nodes;
      if (list == null) {
        this.sub_nodes = DEFAULT_SUB_NODES;
      } else {
        this.sub_nodes = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
    } else {
      this.sub_nodes = Message.immutableCopyOf(((Builder)str).sub_nodes);
      this.type = ((Builder)str).type;
      this.floor = ((Builder)str).floor;
      this.title = ((Builder)str).title;
    } 
  }
  
  public FeatureCardGame(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardGame> {
    public Integer floor;
    
    public List<FeatureCardGameSubNode> sub_nodes;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeatureCardGame param1FeatureCardGame) {
      super(param1FeatureCardGame);
      if (param1FeatureCardGame == null)
        return; 
      this.sub_nodes = Message.copyOf(param1FeatureCardGame.sub_nodes);
      this.type = param1FeatureCardGame.type;
      this.floor = param1FeatureCardGame.floor;
      this.title = param1FeatureCardGame.title;
    }
    
    public FeatureCardGame build(boolean param1Boolean) {
      return new FeatureCardGame(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
