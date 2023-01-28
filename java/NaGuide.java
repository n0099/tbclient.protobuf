package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class NaGuide extends Message {
  public static final String DEFAULT_DWNL_URL = "";
  
  public static final List<RecGuide> DEFAULT_REC_INFO = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dwnl_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecGuide> rec_info;
  
  public NaGuide(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RecGuide> list;
    if (paramBoolean == true) {
      String str = paramBuilder.dwnl_url;
      if (str == null) {
        this.dwnl_url = "";
      } else {
        this.dwnl_url = str;
      } 
      list = paramBuilder.rec_info;
      if (list == null) {
        this.rec_info = DEFAULT_REC_INFO;
      } else {
        this.rec_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.dwnl_url = ((Builder)list).dwnl_url;
      this.rec_info = Message.immutableCopyOf(((Builder)list).rec_info);
    } 
  }
  
  public NaGuide(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NaGuide> {
    public String dwnl_url;
    
    public List<RecGuide> rec_info;
    
    public Builder() {}
    
    public Builder(NaGuide param1NaGuide) {
      super(param1NaGuide);
      if (param1NaGuide == null)
        return; 
      this.dwnl_url = param1NaGuide.dwnl_url;
      this.rec_info = Message.copyOf(param1NaGuide.rec_info);
    }
    
    public NaGuide build(boolean param1Boolean) {
      return new NaGuide(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
