package tbclient.GameForumRecomTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FeatureCardHotSubNode;

public final class FeatureCardHot extends Message {
  public static final Integer DEFAULT_FLOOR;
  
  public static final List<FeatureCardHotSubNode> DEFAULT_SUB_NODES = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<FeatureCardHotSubNode> sub_nodes;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String type;
  
  static {
    DEFAULT_FLOOR = Integer.valueOf(0);
  }
  
  public FeatureCardHot(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<FeatureCardHotSubNode> list = paramBuilder.sub_nodes;
      if (list == null) {
        this.sub_nodes = DEFAULT_SUB_NODES;
      } else {
        this.sub_nodes = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
    } else {
      this.sub_nodes = Message.immutableCopyOf(((Builder)integer).sub_nodes);
      this.type = ((Builder)integer).type;
      this.title = ((Builder)integer).title;
      this.floor = ((Builder)integer).floor;
    } 
  }
  
  public FeatureCardHot(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardHot> {
    public Integer floor;
    
    public List<FeatureCardHotSubNode> sub_nodes;
    
    public String title;
    
    public String type;
    
    public Builder() {}
    
    public Builder(FeatureCardHot param1FeatureCardHot) {
      super(param1FeatureCardHot);
      if (param1FeatureCardHot == null)
        return; 
      this.sub_nodes = Message.copyOf(param1FeatureCardHot.sub_nodes);
      this.type = param1FeatureCardHot.type;
      this.title = param1FeatureCardHot.title;
      this.floor = param1FeatureCardHot.floor;
    }
    
    public FeatureCardHot build(boolean param1Boolean) {
      return new FeatureCardHot(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
