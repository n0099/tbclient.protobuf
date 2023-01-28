package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Esport extends Message {
  public static final List<EsportRank> DEFAULT_BILLBOARD;
  
  public static final Integer DEFAULT_FLOOR_NO = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final EsportStatic _static;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<EsportRank> billboard;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer floor_no;
  
  static {
    DEFAULT_BILLBOARD = Collections.emptyList();
  }
  
  public Esport(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<EsportRank> list;
    if (paramBoolean == true) {
      this._static = paramBuilder._static;
      Integer integer = paramBuilder.floor_no;
      if (integer == null) {
        this.floor_no = DEFAULT_FLOOR_NO;
      } else {
        this.floor_no = integer;
      } 
      list = paramBuilder.billboard;
      if (list == null) {
        this.billboard = DEFAULT_BILLBOARD;
      } else {
        this.billboard = Message.immutableCopyOf(list);
      } 
    } else {
      this._static = ((Builder)list)._static;
      this.floor_no = ((Builder)list).floor_no;
      this.billboard = Message.immutableCopyOf(((Builder)list).billboard);
    } 
  }
  
  public Esport(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Esport> {
    public EsportStatic _static;
    
    public List<EsportRank> billboard;
    
    public Integer floor_no;
    
    public Builder() {}
    
    public Builder(Esport param1Esport) {
      super(param1Esport);
      if (param1Esport == null)
        return; 
      this._static = param1Esport._static;
      this.floor_no = param1Esport.floor_no;
      this.billboard = Message.copyOf(param1Esport.billboard);
    }
    
    public Esport build(boolean param1Boolean) {
      return new Esport(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
